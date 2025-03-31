package com.oxd.website;

import com.oxd.stack.Stack;

import java.util.Random;

public class WebsiteHistoryManager {

    private Stack<Website> backStack = new Stack<>();
    private Stack<Website> nextStack = new Stack<>();
    private Website currentWebsite = null;
    private Random random = new Random();

    public void generateWebsite(String url) {
        Website website = new Website(random.nextLong(), url);
        if(getCurrentWebsite() != null) {
            getBackStack().stack(getCurrentWebsite());
        }
        getNextStack().deflate();
        setCurrentWebsite(website);
    }

    public void goToPreviousWebsite() {
        getNextStack().stack(getCurrentWebsite());
        setCurrentWebsite(getBackStack().unstack());
    }

    public void goToNextWebsite() {
        getBackStack().stack(getCurrentWebsite());
        setCurrentWebsite(getNextStack().unstack());
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
            if (!getBackStack().isEmpty() && !getBackStack().isBase(getCurrentWebsite())) {
                menu.append("+            2 - Ir para anterior                                *\n");
            }
            if (!getNextStack().isEmpty() && !getNextStack().isTop(getCurrentWebsite())) {
                menu.append("+            3 - Ir para o próximo                               *\n");
            }
        }

        menu.append("+            4 - Sair                                            *\n")
                .append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(menu);
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Stack<Website> getNextStack() {
        return nextStack;
    }

    public void setNextStack(Stack<Website> nextStack) {
        this.nextStack = nextStack;
    }

    public Stack<Website> getBackStack() {
        return backStack;
    }

    public void setBackStack(Stack<Website> backStack) {
        this.backStack = backStack;
    }

    public Website getCurrentWebsite() {
        return currentWebsite;
    }

    public void setCurrentWebsite(Website currentWebsite) {
        this.currentWebsite = currentWebsite;
    }
}
