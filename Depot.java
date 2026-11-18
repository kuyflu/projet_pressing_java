/*
 * Lavielle Thibaud
 * Brogné Aël
 * Groupe FB
 * 16/11/2026
 * encapsulation, héritage, polymorphisme, constantes
 */
package tppressing;

import java.time.LocalDateTime;

public class Depot {
    private int num;
    private Client client;
    private Prestation prest;
    private double prix;
    private LocalDateTime dateD;
    private LocalDateTime dateR;
    public Depot(int num, Client client, Prestation prest, double prix, LocalDateTime dateD){
        this.num = num;
        this.client = client;
        this.prest = prest;
        this.prix = prix;
        this.dateD = dateD;
    }
    public String toString(){
        return "Depot " + num + " : " + client + ", " + prest + ", prix : " + prix + "euros, depose le " + dateD
    }
}
