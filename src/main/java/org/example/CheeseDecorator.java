package org.example;

public class CheeseDecorator extends AddonDecorator {
    private int cost= 150;
    private int callories = 200;

    public CheeseDecorator(Food food) {
        super(food);
    }
    @Override
    public int getCost() {
        return super.getCost() + this.cost;
    }

    @Override
    public int getCallories() {
        return super.getCallories() + this.callories;
    }



}
