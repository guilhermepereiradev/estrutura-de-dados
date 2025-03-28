package com.oxd.website;

import com.oxd.stack.Stack;

import java.util.Random;

public class WebsiteHistoryManager {

    private Stack<Website> history = new Stack<>();
    private Website currentWebsite = null;
    private Random random = new Random();

    public void generateWebsite(String url) {
        Website website = new Website(random.nextLong(), url);
        getHistory().stack(website);
        setCurrentWebsite(website);
    }

    public void goToPreviousWebsite() {
        setCurrentWebsite(getHistory().getPrevious(getCurrentWebsite()));
    }

    public void goToNextWebsite() {
        setCurrentWebsite(getHistory().getNext(getCurrentWebsite()));
    }

    public void printMenu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        StringBuilder menu = new StringBuilder();
        menu.append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        if (getCurrentWebsite() != null) {
            menu.append("+      Site atual: ").append(getCurrentWebsite().getUrl()).append("\n");
        }

        menu.append("+      Escolha uma opção:                                        *\n")
                .append("+            1 - Digitar novo site                               *\n");

        if (getCurrentWebsite() != null) {
            if (!getHistory().isBase(getCurrentWebsite())) {
                menu.append("+            2 - Ir para anterior                                *\n");
            }
            if (!getHistory().isTop(getCurrentWebsite())) {
                menu.append("+            3 - Ir para o próximo                               *\n");
            }
        }

        menu.append("+            4 - Sair                                            *\n")
                .append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(menu);
    }

    public Stack<Website> getHistory() {
        return history;
    }

    public void setHistory(Stack<Website> history) {
        this.history = history;
    }

    public Website getCurrentWebsite() {
        return currentWebsite;
    }

    public void setCurrentWebsite(Website currentWebsite) {
        this.currentWebsite = currentWebsite;
    }
}
