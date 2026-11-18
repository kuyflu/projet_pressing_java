/*
 * Lavielle Thibaud
 * Brogné Aël
 * Groupe FB
 * 16/11/2026
 * encapsulation, héritage, polymorphisme, constantes
 */
package tppressing;

public class Prestation {
    private char categorie;
    public Prestation(char categorie){
        this.categorie = categorie;
    }
    public String toString(){
        return "Categorie : " + categorie;
    }
}
