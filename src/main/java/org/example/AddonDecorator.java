package org.example;

public abstract class  AddonDecorator extends Food {
    Food food;
    public AddonDecorator(Food food) {
        this.food = food;
    }

    @Override
    public int getCost() {
        return food.getCost();
    }

    @Override
    public int getCallories() {
        return food.getCallories();
    }
}
