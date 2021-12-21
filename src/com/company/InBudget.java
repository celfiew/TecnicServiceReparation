package com.company;

public  class InBudget implements ReparationState {

    //variable to reference the reparation

    Reparation t;

    //constructor and show the state:
    public InBudget(Reparation t) {
        this.t = t;
        System.out.println("En presupuesto");
        t.toString();
    }

    @Override
    public void changeAdress(String newAdress) throws Exception {
        throw new Exception("it is change only in ForShipping");
    }
    //change the budget value
    @Override
    public void giveValueBudget(double budgetValue) {
        t.setBudgetValue(budgetValue);
    }

    @Override
    public void addSpareParts(double costSpareParts) throws Exception {
        throw new Exception("it is added only in inReparation");

    }
// go to next state
    @Override
    public void nextStep() {
        this.t.setState(FactoryStateReparation.getInstance().getState("EnProceso",t));

    }
}
