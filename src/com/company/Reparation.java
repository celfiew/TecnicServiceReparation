package com.company;

public class Reparation {
    //variable that keep the state
    private ReparationState state;
    //varaible with the name of the article
    private String articleName;
    //variable with the value of budget
    private double budgetValue;
    //variable with the delivery
    private String deliveryAdress;

    //constructor that set budget as an initial state (throw FactoryStateReparation)
    public Reparation(String articleName) {

        this.articleName = articleName;
        setState(FactoryStateReparation.getInstance().getState("EnPresupuesto", this));
    }

    public void setState(ReparationState state) {
        this.state = state;
    }

    public void setBudgetValue(double budgetValue) {
        this.budgetValue = budgetValue;
    }

    public double getBudgetValue() {
        return budgetValue;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public void changeAdress(String newAdress) throws Exception {
        this.state.changeAdress(newAdress);
    }
    public void GiveValueBudget(double budgetValue) throws Exception {
        this.state.giveValueBudget(budgetValue);
    }

    public void addSpareParts(double costSpareParts) throws Exception {
        this.state.addSpareParts(costSpareParts);
    }

    public void nextStep() throws Exception {
        this.state.nextStep();
    }

    //show the state of the reparation
    @Override
    public String toString() {
        return "Reparation{" +
                "state=" + state +
                ", ArticleName='" + articleName + '\'' +
                ", BudgetValue=" + budgetValue +
                ", DeliveryAdress='" + deliveryAdress + '\'' +
                '}';
    }
}
