package ui;

import model.*;

import java.util.Scanner;

public class Pirate {

    private static Ship elPirata;

    public static void main(String[] args) {

        elPirata = new Ship();
        Scanner r = new Scanner(System.in);

        int opt = -1;

        System.out.println("Por favor agrege los 5 clientes: \n");
        Client clients[] = new Client[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre del cliente " + i);
            String name = r.nextLine();
            System.out.println("Ingrese el numero de registro mercantil " + i);
            String commercialRNumber = r.nextLine();
            System.out.println("Ingrese la fecha de registro (dd-mm-aaaa)");
            String dateCR = r.nextLine();

            clients[i] = new Client(name, commercialRNumber, dateCR);
        }

        elPirata.setClients(clients);

        do {
            System.out.println(
                    "Escoja la opcion que desee:\n\n(1) Cargar el barco\n(2) (2) Descargar el barco para iniciar un nuevo viaje\n(3) Mostrar peso total de la carga que transporta el barco\n(4) Verificar si se puede zarpar\n");

            opt = r.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Escoja el cliente:");

                    Client owner;

                    for (int i = 0; i < clients.length; i++) {
                        
                    }

                    break;

                default:
                    break;
            }

        } while (opt != 10);

    }
}