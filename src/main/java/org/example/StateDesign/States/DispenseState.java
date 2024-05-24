package org.example.StateDesign.States;

import org.example.StateDesign.Inventory.Inventory;
import org.example.StateDesign.Inventory.Product;
import org.example.StateDesign.vendingmachine.VendingMachine;

public class DispenseState implements State{

    VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void insertCoin(double amount) {
        throw new IllegalStateException("Product is getting dispensed");
    }
    @Override
    public void pressButton(int aisleNumber) {
        throw new IllegalStateException("Product is getting dispensed");
    }
    @Override
    public void dispense(int aisleNumber) {
        Inventory inventory = vendingMachine.getInventory();
        Product product = inventory.getProductAt(aisleNumber);

        inventory.deductProductCount(aisleNumber);
        double change = vendingMachine.getAmount() - product.getPrice();
        vendingMachine.setAmount(0);
        vendingMachine.setCurrVendingMachineState(vendingMachine.getNoCoinInsertedState());
        System.out.println("Product " + product.getName() + " has been dispensed");

    }
}
