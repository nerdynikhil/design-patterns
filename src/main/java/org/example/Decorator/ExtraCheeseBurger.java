package org.example.Decorator;

public class ExtraCheeseBurger extends BurgerDecorator{

    private Burger burger;

    public ExtraCheeseBurger(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription(){
        return burger.getDescription() + " with extra cheese";
    }

    @Override
    public double getCost(){
        return burger.getCost() + 50.0;
    }
}
