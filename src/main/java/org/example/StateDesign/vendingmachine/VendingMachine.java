package org.example.StateDesign.vendingmachine;

import org.example.StateDesign.Inventory.Inventory;
import org.example.StateDesign.Inventory.Product;
import org.example.StateDesign.States.CoinInsertedState;
import org.example.StateDesign.States.DispenseState;
import org.example.StateDesign.States.NoCoinInsertedState;
import org.example.StateDesign.States.State;

public class VendingMachine {

    private NoCoinInsertedState noCoinInsertedState;
    private CoinInsertedState coinInsertedState;
    private DispenseState dispenseState;
    private State currVendingMachineState;
    private Inventory inventory;
    private double amount;
    private static final int AISLE_COUNT = 2;


    public VendingMachine() {
        noCoinInsertedState = new NoCoinInsertedState(this);
        coinInsertedState = new CoinInsertedState(this);
        dispenseState = new DispenseState(this);

        currVendingMachineState = noCoinInsertedState;
        amount = 0.0;
        inventory = new Inventory(AISLE_COUNT);
    }

    public boolean hasSufficientAmount(double expectedAmount) {
        return expectedAmount <= this.amount;
    }

    public NoCoinInsertedState getNoCoinInsertedState() {
        return noCoinInsertedState;
    }

    public void setNoCoinInsertedState(NoCoinInsertedState noCoinInsertedState) {
        this.noCoinInsertedState = noCoinInsertedState;
    }

    public CoinInsertedState getCoinInsertedState() {
        return coinInsertedState;
    }

    public void setCoinInsertedState(CoinInsertedState coinInsertedState) {
        this.coinInsertedState = coinInsertedState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getCurrVendingMachineState() {
        return currVendingMachineState;
    }

    public void setCurrVendingMachineState(State currVendingMachineState) {
        this.currVendingMachineState = currVendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void insertCoin(double amount) {
        this.currVendingMachineState.insertCoin(amount);
        System.out.println(amount + " Coin is inserted.");
    }

    public void pressButton(int aisleNumber) {
        this.currVendingMachineState.pressButton(aisleNumber);
        currVendingMachineState = dispenseState; // i'm not sure about this, added this to change the state
        this.currVendingMachineState.dispense(aisleNumber);
    }

    public void addProduct(Product product) {
        try {
            this.getInventory().addProduct(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
