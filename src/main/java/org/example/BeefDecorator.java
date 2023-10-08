package org.example;

public class BeefDecorator extends AddonDecorator{
    private int cost= 100;
    private int callories = 290;

    public BeefDecorator(Food food) {
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
