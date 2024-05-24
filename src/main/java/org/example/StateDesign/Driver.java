package org.example.StateDesign;

import org.example.StateDesign.Inventory.Product;
import org.example.StateDesign.vendingmachine.VendingMachine;

public class Driver {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        //inserting 3 hersheys
        Product hersheys = new Product("hersheys", 1, 5.0);
        for (int i = 1; i <= 3; i++)
            vendingMachine.addProduct(hersheys);

        //inserting 3 biskfarms
        Product biskfarm = new Product("biskfarm", 2, 2.0);
        for (int i = 1; i<=3; i++)
            vendingMachine.addProduct(biskfarm);

        vendingMachine.insertCoin(8.0);
        vendingMachine.pressButton(1);

        vendingMachine.insertCoin(5.0);
        vendingMachine.pressButton(1);

        vendingMachine.insertCoin(3.0);
        vendingMachine.pressButton(2);
    }
}
