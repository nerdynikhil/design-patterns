package org.example.StateDesign.States;

import org.example.StateDesign.Inventory.Inventory;
import org.example.StateDesign.Inventory.Product;
import org.example.StateDesign.vendingmachine.VendingMachine;

public class CoinInsertedState implements State {

    VendingMachine  vendingMachine;

    public CoinInsertedState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void insertCoin(double amount) {
        vendingMachine.setAmount(vendingMachine.getAmount() + amount);
    }

    @Override
    public void pressButton(int aisleNumber) {
        Inventory inventory = vendingMachine.getInventory();
        Product product = inventory.getProductAt(aisleNumber);

        if(!vendingMachine.hasSufficientAmount(product.getPrice())){
            throw new IllegalStateException("Insufficient amount to buy this product");
        }

        if(!inventory.checkIfProductAvailable(product.getId())){
            throw new IllegalStateException("Product is not available");
        }

        vendingMachine.setCurrVendingMachineState(vendingMachine.getCurrVendingMachineState());
    }

    @Override
    public void dispense(int aisleNumber) {
        throw new IllegalStateException("Product not chosen");
    }
}
