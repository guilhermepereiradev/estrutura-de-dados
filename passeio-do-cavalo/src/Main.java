import java.util.Arrays;

public class Main {
    private static final int N = 6;
    private static int[][] tabuleiro = new int[N][N];
    private static boolean solucaoEncontrada = false;

    private static int[] movH = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] movV = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            Arrays.fill(tabuleiro[i], 0);
        }

        tabuleiro[0][0] = 1;

        tentarMovimento(2, 0, 0);

        if (solucaoEncontrada) {
            System.out.println("Solução encontrada:");
            imprimirTabuleiro();
        } else {
            System.out.println("Não há solução para este problema.");
        }
    }

    private static void tentarMovimento(int passo, int x, int y) {
        if (solucaoEncontrada) {
            return;
        }

        if (passo > N * N) {
            solucaoEncontrada = true;
            return;
        }

        for (int k = 0; k < 8; k++) {
            int novoX = x + movH[k];
            int novoY = y + movV[k];

            if (novoX >= 0 && novoX < N && novoY >= 0 && novoY < N && tabuleiro[novoX][novoY] == 0) {
                tabuleiro[novoX][novoY] = passo;
                tentarMovimento(passo + 1, novoX, novoY);

                if (!solucaoEncontrada) {
                    tabuleiro[novoX][novoY] = 0;
                } else {
                    return;
                }
            }
        }
    }

    private static void imprimirTabuleiro() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%2d ", tabuleiro[i][j]);
            }
            System.out.println();
        }
    }
}