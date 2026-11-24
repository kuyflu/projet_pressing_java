 /*
 * Lavielle Thibaud
 * Brogné Aël
 * Groupe FB
 * 24/11/2026
 * encapsulation, héritage, polymorphisme, constantes
 */
package tppressing;

import java.time.LocalDateTime;

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
        this.tabClients = new Client[MAX_CLIENTS];
        this.tabDepots = new Depot[MAX_DEPOTS];
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
    
    public Client ajouter(String nom, String tel, String email){
        if(nbreClients >= MAX_CLIENTS){
            return null;
        }
        Client c = new Client(nom, tel, email);
        int i = nbreClients;
        while(i>0 && tabClients[i-1].placerApres(c)){
            tabClients[i] = tabClients[i-1];
            i--;
        }
        tabClients[i] = c;
        nbreClients++;
        return c;
    }
    
    public Client ajouter(String nom, String tel){
        return ajouter(nom, tel, null);
    }
    
    public Client rechercher(String nom, String tel) {
        Client modele = new Client(nom, tel);
        for (int i = 0; i < nbreClients; i++) {
            if (!tabClients[i].placerApres(modele) && !modele.placerApres(tabClients[i])) {
                return tabClients[i];
            }
        }
        return null;
    }
    public double ajouter(Client client, char categorie, boolean repassage){
        if(nbreDepots >= MAX_DEPOTS){
            return -1;
        }
        Prestation p = new PrestationExpress(categorie, repassage);
        double prix = p.nettoyage(tabTarifs);
        tabDepots[nbreDepots] = new Depot(nbreDepots + 1, client, p, prix, LocalDateTime.now());
        nbreDepots++;
        return prix;
    }
    public double ajouter(Client client, char categorie){
        if(nbreDepots >= MAX_DEPOTS){
            return -1;
        }
        Prestation p = new PrestationStandard(categorie);
        double prix = p.nettoyage(tabTarifs);
        tabDepots[nbreDepots] = new Depot(nbreDepots + 1, client, p, prix, LocalDateTime.now());
        nbreDepots++;
        return prix;
    }
    public double ajouter(Client client, char categorie, int typeTache){
        if(nbreDepots >= MAX_DEPOTS){
            return -1;
        }
        Prestation p = new PrestationIntensive(categorie, typeTache);
        double prix = p.nettoyage(tabTarifs);
        tabDepots[nbreDepots] = new Depot(nbreDepots + 1, client, p, prix, LocalDateTime.now());
        nbreDepots++;
        return prix;
    }
}
