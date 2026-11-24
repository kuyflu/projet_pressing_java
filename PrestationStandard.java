/*
 * Lavielle Thibaud
 * Brogné Aël
 * Groupe FB
 * 24/11/2026
 * encapsulation, héritage, polymorphisme, constantes
 */
package tppressing;

public class PrestationStandard extends Prestation{
    public PrestationStandard(char categorie){
        super(categorie);
    }
    public String toString(){
        return super.toString();
    }
    public double detachage(double[][] tabTarifs){
        return tabTarifs[2][getCategorie() - 'A'];
    }
    public double nettoyage(double[][] tabTarifs){
        return super.nettoyage(tabTarifs) + tabTarifs[3][getCategorie() - 'A'];
    }
}
