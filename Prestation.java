/*
 * Lavielle Thibaud
 * Brogné Aël
 * Groupe FB
 * 24/11/2026
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
    public char getCategorie(){
        return categorie;
    }
    public double lavage(double [][] tabTarifs){
        return tabTarifs[0][categorie - 'A'];
    }
    public double sechage(double [][] tabTarifs){
        return tabTarifs[1][categorie - 'A'];
    }
    public double detachage(double [][] tabTarifs){
        return 0;
    }
    public double nettoyage(double [][] tabTarifs){
        return lavage(tabTarifs) + sechage(tabTarifs) + detachage(tabTarifs);
    }
}
