package org.example.StateDesign.States;

import org.example.StateDesign.vendingmachine.VendingMachine;

public class NoCoinInsertedState implements State {

    VendingMachine vendingMachine;

    public NoCoinInsertedState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {
        vendingMachine.setAmount(amount);
        vendingMachine.setCurrVendingMachineState(vendingMachine.getCoinInsertedState());
    }

    @Override
    public void pressButton(int aisleNumber) {
        throw new IllegalStateException("Please insert coin first");
    }

    @Override
    public void dispense(int aisleNumber) {
        throw new IllegalStateException("Please insert coin first");
    }
}
