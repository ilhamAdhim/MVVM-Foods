package com.example.miniproject.models;

public class Food {
    private int quantityBeefSteak, quantityChickenChop ;

    public Food(int quantityBeefSteak, int quantityChickenChop) {
        this.quantityBeefSteak = quantityBeefSteak;
        this.quantityChickenChop = quantityChickenChop;
    }

    public int getQuantityBeefSteak() {
        return quantityBeefSteak;
    }

    public void setQuantityBeefSteak(int quantityBeefSteak) {
        this.quantityBeefSteak = quantityBeefSteak;
    }

    public int getQuantityChickenChop() {
        return quantityChickenChop;
    }

    public void setQuantityChickenChop(int quantityChickenChop) {
        this.quantityChickenChop = quantityChickenChop;
    }

    public Food() {}


}
