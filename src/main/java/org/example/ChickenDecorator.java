package org.example;

public class ChickenDecorator extends AddonDecorator{
    private int cost= 0;
    private int callories = 220;
    public ChickenDecorator(Food food) {
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
