package org.example;

public class Burger extends Food{
    private int cost = 500;
    private int callories = 700;

    public Burger(){}

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public int getCallories() {
        return this.callories;
    }
}
