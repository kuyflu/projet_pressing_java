/*
 * Lavielle Thibaud
 * Brogné Aël
 * Groupe FB
 * 16/11/2026
 * encapsulation, héritage, polymorphisme, constantes
 */
package tppressing;

import java.time.LocalDateTime;

public class TPPressing {

    public static void main(String[] args) {
        Client c1 = new Client("tt","06");
        System.out.println(c1);
        Client c2 = new Client("ot","07","gd@hfht.com");
        System.out.println(c2);
        Prestation p1 = new Prestation('A');
        System.out.println(p1);
        Prestation pe1 = new PrestationExpress('A', true);
        System.out.println(pe1);
        Prestation ps1 = new Prestation('B');
        System.out.println(ps1);
        Prestation pi1 = new PrestationIntensive('A', 1);
        System.out.println(pi1);
        Depot d1 = new Depot(1, c1, pe1, 17.0, LocalDateTime.now());
        System.out.println(d1);
        double[][] tabTarifs = {{1,5,3},
                {4.3,4.25,3.5},
                {3.4,5.2,3.5},
                {5,5,8}
                };
        Etablissement e1 = new Etablissement("tt", tabTarifs);
        e1.afficher();
    }
    
}
