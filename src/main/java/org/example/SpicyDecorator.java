package org.example;

public class SpicyDecorator extends AddonDecorator{
    private int cost= 200;
    private int callories = 110;
    public SpicyDecorator(Food food) {
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
