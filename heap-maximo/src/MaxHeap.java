public class MaxHeap {
    private int[] A;
    private int heapSize;

    public MaxHeap(int[] array) {
        this.A = array;
        this.heapSize = array.length;
    }

    public void constroiMaxHeap() {
        heapSize = A.length;
        for (int i = (heapSize / 2) - 1; i >= 0; i--) {
            maximizaHeap(i);
        }
    }

    private void maximizaHeap(int i) {
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;
        int maior = i;

        if (esquerda < heapSize && A[esquerda] > A[maior]) {
            maior = esquerda;
        }

        if (direita < heapSize && A[direita] > A[maior]) {
            maior = direita;
        }

        if (maior != i) {
            int temp = A[i];
            A[i] = A[maior];
            A[maior] = temp;

            maximizaHeap(maior);
        }
    }

    public void printHeap() {
        for (int i = 0; i < heapSize; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
