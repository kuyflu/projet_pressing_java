 /*
 * Lavielle Thibaud
 * Brogné Aël
 * Groupe FB
 * 18/11/2026
 * encapsulation, héritage, polymorphisme, constantes
 */
package tppressing;

public class Etablissement {
    private String nom;
    private int nbreClients, nbreDepots;
    private Client[] tabClients;
    private Depot[] tabDepots;
    private double[][] tabTarifs;
    private static final int MAX_CLIENTS = 10, MAX_DEPOTS = 50;
    
    public Etablissement(String nom, double[][] tabTarifs){
        this.nom = nom;
        this.tabTarifs = tabTarifs;
    }
    
    public void afficher(){
        String[] phases= {"lavage   ", "sechage  ", "detachage", "repassage"};
        System.out.println("Etablissement : " + nom);
        System.out.println("Nombre de clients : " + nbreClients + ", Nombre de depots : " + nbreDepots);
        System.out.println("\t\tA\tB\tC");
        for (int i=0; i<tabTarifs.length; i++){
            System.out.print(phases[i] + "\t");
            for (int j=0; j<tabTarifs[i].length; j++){
                System.out.print(tabTarifs[i][j] + "\t");
            }
            System.out.println();
        }    
    }
}
