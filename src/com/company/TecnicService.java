package com.company;

public class TecnicService {

    public static void main(String[] args) {
	    Reparation firstRepa = new Reparation("Computer");
    try {
        firstRepa.toString();
        firstRepa.GiveValueBudget(100);
        System.out.println(firstRepa.getBudgetValue());
        firstRepa.nextStep();
        firstRepa.toString();
        firstRepa.addSpareParts(30);
        firstRepa.addSpareParts(10);
        System.out.println(firstRepa.getBudgetValue());
        firstRepa.nextStep();
        firstRepa.toString();
        firstRepa.changeAdress("street nomber 9");
        firstRepa.nextStep();
        firstRepa.toString();
        firstRepa.nextStep();
        firstRepa.toString();

    }catch (Exception e){
        System.out.println(e.getMessage());
    }

    }
}
