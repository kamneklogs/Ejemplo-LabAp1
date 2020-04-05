package model;

public class Ship {

    private final static double MAXIMUMLOAD=2800;

    private String name;

    private String captain;

    private boolean setSail;

    private int numLoad;

    private Client client1;
    private Client client2;
    private Client client3;
    private Client client4;
    private Client client5;

    public Ship(String captain, boolean setSail, int numLoad) {

        name = "pirate ";

        this.captain= captain;

        this.setSail=setSail;

        this.numLoad=numLoad;

        client1 = new Client();
        client2 = new Client();
        client3 = new Client();
        client4 = new Client();
        client5 = new Client();

       

    }

    public void setNombre(String nombre) {

        this.name = name;

    }

    public String getNombre() {

        return name;

    }

    public void setCaptain(String captain) {

        this.captain = captain;

    }

    public String getCaptai() {

        return captain;

    }

     public void setSetSail(boolean setSail) {

        this.setSail = setSail;

        if (getWeight()==12000 && getNumLoad()){

            setSail=true;

            System.out.println("el barco puede sarpar");


        }else { setSail=false;
        
        }

    }

     public void setNumLoad(int numLoad) {

        this.numLoad = numLoad;


    }

    public int getNumLoad() {

        return numLoad;


    }



}