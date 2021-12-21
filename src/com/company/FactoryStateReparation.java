package com.company;

public class FactoryStateReparation {
    // attribute that stores the only instance that will be created
    private static FactoryStateReparation instance;

    //private constructor because it can't be instanced from outside.
    private FactoryStateReparation() {
    }

    //SINGLENTON
    // get instance return the only instance that can be created.

    public static FactoryStateReparation getInstance() {
        if (instance == null)
                instance = new FactoryStateReparation();

            return instance;
    }

    //the constructor method get a string that determines the particular objet to instance

    public ReparationState getState(String type, Reparation r){

        //identify the received parameter with a switch

        switch (type){
            case "EnPresupuesto":
                return new InBudget(r);
            case "EnProceso":
                return new InReparation(r);
            case "ParaEnvio":
                return new ForShipping(r);
            case "Finalizado":
                return new Finalized(r);
            default:
                System.out.println("Ups, we can't find this object to built");
                return null;
        }

    }

}
