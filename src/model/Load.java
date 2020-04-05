package model;

public class Load {

    private final static String DANGEROUS="390000"

    private final static String PERISHABLE="250000"

    private final static String NOTPERISHABLE="80000"

    private String typeLoad;

    private double weight;
    
    private int numBoxes;
    

    public Load() {

        this.typeLoad=typeLoad;

        this.weight=weight;

        this.numBoxes=numBoxes;

       

    }

    public void settypeLoad(String typeLoad) {

        this.typeLoad=typeLoad;

    }

    public String gettypeLoad() {

        return typeLoad;

    }

    public void setweight(double weight) {

        this.weight=weight;

    }

    public double getweight() {

        return weight;

    }

    public void numBoxes(int numBoxes) {

        this.numBoxes=numBoxes;

    }

    public int numBoxes() {

        return numBoxes;

    }




}