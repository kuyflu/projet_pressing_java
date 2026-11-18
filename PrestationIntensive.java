/*
 * Lavielle Thibaud
 * Brogné Aël
 * Groupe FB
 * 16/11/2026
 * encapsulation, héritage, polymorphisme, constantes
 */
package tppressing;

public class PrestationIntensive extends PrestationStandard{
    private int typeTache;
    private static final double[] MAJORATIONS = {0.1, 0.2, 0.3, 0.4};
    public PrestationIntensive(char categorie, int typeTache){
        super(categorie);
        this.typeTache = typeTache;
    }
    public String toString(){
        return super.toString() + ", Type de tache : " + typeTache;
    }
}