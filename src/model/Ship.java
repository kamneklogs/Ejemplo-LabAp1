package model;

import java.util.ArrayList;

public class Ship {

    private final static double MAXVALUE = 2800;

    private String captain;

    private Client[] clients;

    private ArrayList<Load> myLoads;

    private double totalWeight;

    public Ship() {

        captain = "Barba Negra";

        totalWeight = 0;

        myLoads = new ArrayList<Load>();

    }

    public String addLoad(Load newLoad) {

        String msg = "";

        if (totalWeight < MAXVALUE) {

            msg = "Se puede cargar y su valor incluyendo un posible descuento es: $" + costOfLoad(newLoad);

            myLoads.add(newLoad);

        } else {

            msg = "No se pudo cargar";
        }

        return msg;

    }

    public double costOfLoad(Load newLoad) {
        double cost = 0;
        double totalWeightOfBoxes = newLoad.getWeightByLoad() * newLoad.getNumBoxes();

        if (newLoad.getTypeLoad().equals(Load.TYPELOAD[0])) {
            cost = totalWeightOfBoxes * 390000;
        } else if (newLoad.getTypeLoad().equals(Load.TYPELOAD[1])) {
            cost = totalWeightOfBoxes * 250000;
        } else {
            cost = totalWeightOfBoxes * 80000;
        }

        if (newLoad.getOwner().getTypeClient().equals(Client.TYPESCLIENT[1])
                && newLoad.getTypeLoad().equals(Load.TYPELOAD[1])) {
            cost = cost - (cost * 0.015);
        }

        if (newLoad.getOwner().getTypeClient().equals(Client.TYPESCLIENT[2])
                && (newLoad.getTypeLoad().equals(Load.TYPELOAD[1]) || newLoad.getTypeLoad().equals(Load.TYPELOAD[2]))) {
            cost = cost - (cost * 0.03);
        }

        if (newLoad.getOwner().getTypeClient().equals(Client.TYPESCLIENT[3])) {
            cost = cost - (cost * 0.05);
        }

        return cost;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public ArrayList<Load> getMyLoads() {
        return myLoads;
    }

    public void setMyLoads(ArrayList<Load> myLoads) {
        this.myLoads = myLoads;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

}