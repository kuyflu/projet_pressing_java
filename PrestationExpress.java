/*
 * Lavielle Thibaud
 * Brogné Aël
 * Groupe FB
 * 16/11/2026
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
}
