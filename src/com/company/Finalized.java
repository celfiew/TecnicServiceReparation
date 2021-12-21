package com.company;

public class Finalized implements ReparationState{

    //variable to reference the reparation

    Reparation t;

    //constructor and show the state:


    public Finalized(Reparation t) {
        this.t = t;
        System.out.println("Finalizado");
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
    public void addSpareParts(double costSpareParts) throws Exception {
        throw new Exception("it is added only in inReparation");
    }

    @Override
    public void nextStep() throws Exception {
        throw new Exception("ya está finalizado");
    }
}
