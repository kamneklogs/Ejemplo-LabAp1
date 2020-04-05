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

    public String recibirCarga(Load newLoad) {

        String msg = "";

        if (totalWeight < MAXVALUE) {

            myLoads.add(newLoad);

            msg = "Se puede cargar";

        } else {

            msg = "No se pudo cargar";
        }

        return msg;

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