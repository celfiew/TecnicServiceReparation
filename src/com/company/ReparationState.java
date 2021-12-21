package com.company;
//interface for all functionalities of a reparation
    public interface ReparationState {
    void changeAdress(String newAdress) throws Exception;
    void giveValueBudget(double budgetValue) throws Exception;
    void addSpareParts(double costSpareParts) throws Exception;
    void nextStep() throws Exception;
}
