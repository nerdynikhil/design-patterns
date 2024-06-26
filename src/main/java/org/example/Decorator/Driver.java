package org.example.Decorator;

public class Driver {
    public static void main(String[] args) {
        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription());
        System.out.println(burger.getCost());

        burger= new ExtraCheeseBurger(burger);
        System.out.println(burger.getDescription());
        System.out.println(burger.getCost());

        burger= new ExtraMayoBurger(burger);
        System.out.println(burger.getDescription());
        System.out.println(burger.getCost());
    }
}
