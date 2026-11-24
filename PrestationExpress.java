/*
 * Lavielle Thibaud
 * Brogné Aël
 * Groupe FB
 * 24/11/2026
 * encapsulation, héritage, polymorphisme, constantes
 */
package tppressing;

public class PrestationExpress extends Prestation{
    private boolean repassage;
    public PrestationExpress(char categorie, boolean repassage){
        super(categorie);
        this.repassage = repassage;
    }
    public String toString(){
        return super.toString() + ", Repassage : " + repassage;
    }
    public double nettoyage(double[][] tabTarifs){
        double prix = super.nettoyage(tabTarifs);
        if (repassage){
            prix += tabTarifs[3][getCategorie() - 'A'];
        }
        return prix;
    }
}
