package com.company;

public class ForShipping implements ReparationState{

    //variable to reference the reparation

    Reparation t;

    //constructor and show the state:
    public ForShipping(Reparation t) {
        this.t = t;
        System.out.println("En envío");
        t.toString();
    }

    @Override
    public void changeAdress(String newAdress) {
        this.t.setDeliveryAdress(newAdress);
    }

    @Override
    public void giveValueBudget(double budgetValue) throws Exception {
        throw new Exception("it is added only in inBudget");
    }

    @Override
    public void addSpareParts(double costSpareParts) throws Exception {
        throw new Exception("it is added only in inReparation");
    }

    @Override
    public void nextStep() {
        this.t.setState(FactoryStateReparation.getInstance().getState("Finalizado",t));
    }
}
