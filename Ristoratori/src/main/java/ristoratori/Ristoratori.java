/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristoratori;

import java.util.Scanner;

/**
 *
 * @author luqmanasghar
 * @author Andrea Basilico
 * @author crist
 */
public class Ristoratori {

    //fields 
    static boolean isLogged = false;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Credenziali accesso ristoratore");
        
        while (!isLogged) {
            
            System.out.print("Nickname: ");
            String nick = sc.nextLine();

            System.out.print("Password: ");
            String pwd = sc.nextLine();
            
            if ("ristadmin".equals(nick) && "defaultpwd".equals(pwd)) {
                isLogged = true;

                System.out.println("Vuoi registrare il tuo ristorante? (s/n)");
                String insertion = sc.nextLine();

                if (insertion.charAt(0) == 's') {

                    System.out.print("Nome ristorante: ");
                    String nomeR = sc.nextLine();

                    System.out.print("Indirizzo: ");
                    String indirizzo = sc.nextLine();

                    System.out.print("Sito web: ");
                    String urlWeb = sc.nextLine();

                    System.out.print("Tipologia (italiano, etnico, fusion): ");
                    String tipologia = sc.nextLine();

                    System.out.print("Numero telefonico: ");
                    String num = sc.nextLine();

                    //Ristorante r = new Ristorante(nomeR, indirizzo, urlWeb, tipologia, num);
                    
                    //RICHIAMO ALLA FUNZIONE DI INSERIMIENTO

                } else if (insertion.charAt(0) == 'n') {
                    System.out.println("Premi invio per terminare");
                    sc.nextLine();
                }
            } else {
                System.out.println("Credenziali sbagliate, riprovare");
            }
        }
    }
}
