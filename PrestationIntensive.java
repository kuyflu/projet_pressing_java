/*
 * Lavielle Thibaud
 * Brogné Aël
 * Groupe FB
 * 24/11/2026
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
    public double lavage(double[][] tabTarifs){
        return super.lavage(tabTarifs)*(1 + MAJORATIONS[typeTache - 1]);
    }
    public double detachage(double[][] tabTarifs){
        return super.detachage(tabTarifs)*(1 + MAJORATIONS[typeTache - 1]);
    }
}