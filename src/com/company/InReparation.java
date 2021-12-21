package com.company;

public class InReparation implements ReparationState{

    //variable to reference the reparation

    Reparation t;
    //constructor and show the state
    public InReparation(Reparation t) {
        this.t = t;
        System.out.println("En Reparación");
        t.toString();
    }

    @Override
    public void changeAdress(String newAdress) throws Exception {
        throw new Exception("it is change only in ForShipping");
    }

    @Override
    public void giveValueBudget(double budgetValue) throws Exception {
        throw new Exception("it is added only in inBudget");
    }

    @Override
    public void addSpareParts(double costSpareParts) {
        t.setBudgetValue(t.getBudgetValue() + costSpareParts);
    }

    @Override
    public void nextStep() {
        t.setState(FactoryStateReparation.getInstance().getState("ParaEnvio", t));
    }
}
