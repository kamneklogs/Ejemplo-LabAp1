package model;

public class Client {

    static Scanner entrada = new Scanner(System.in);

    private final static double NORMAL=0.0;

    private final static String SILVER=0.015;

    private final static String GLOD=0.03;

    private final static String PLATINUM=0.05;

    private String typeClient;

    private String registryNumber;
    
    private int quantityTransported;

    private int totalValuePaid;

    
    

    public Client() {

        this.typeClient=typeClient;

        this.registryNumber=registryNumber;

        this.quantityTransported=quantityTransported;

       

    }

    public void setTypeClient(String typeClient) {



        this.typeClient=typeClient;

    }

    public String getTypeClient() {

        if(getQuantityTransported()<35000 && getTotalValuePaid()<2000000){

            typeClient="normal";

            
        }

        if (getQuantityTransported()>=35000 && getQuantityTransported()<55000{

            typeClient="silver";
        }

        if (getQuantityTransported()>=55000 | getTotalValuePaid()>=2000000){

            typeClient="gold";
        }

        if (getTotalValuePaid()>=2000000){

            typeClient="platinum";


        }



        return typeClient;

    }

    public void setRegistryNumber(String registryNumber) {

        this.registryNumber=registryNumber;

    }

    public String getRegistryNumber() {

        System.out.println("Ingrese numero de registro");

        registryNumber=entrada.nextLine();



        return registryNumber;

    }

    public void  setQuantityTransported(int quantityTranspoted) {

        this.quantityTransported=quantityTransported;

    }

    public int getQuantityTransported() {

        return quantityTransported;

    }

    public void setTotalValuePaid(int totalValuePaid) {

        if (typeClient().equalsIgnoreCase("normal") && typeLoad()){

            totalValuePaid=
        }

        this.totalValuePaid=totalValuePaid;

    }

    public String getTotalValuePaid() {

        return totalValuePaid;

    }




}