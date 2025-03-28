import com.oxd.website.WebsiteHistoryManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean keep = true;
        WebsiteHistoryManager websiteHistoryManager = new WebsiteHistoryManager();

        while (keep) {
            websiteHistoryManager.printMenu();
            int opcao = sc.nextInt();
            switch(opcao) {
                case 1 -> {
                    System.out.println("Digite a URL do novo site: ");
                    String url = sc.next();
                    websiteHistoryManager.generateWebsite(url);
                }
                case 2 -> websiteHistoryManager.goToPreviousWebsite();
                case 3 -> websiteHistoryManager.goToNextWebsite();
                case 4 -> keep = false;
            }
        }
        sc.close();
    }
}