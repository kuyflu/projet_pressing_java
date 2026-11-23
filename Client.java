/*
 * Lavielle Thibaud
 * Brogné Aël
 * Groupe FB
 * 16/11/2026
 * encapsulation, héritage, polymorphisme, constantes
 */
package tppressing;

public class Client {
    private String nom, tel, email;
    public Client(String nom, String tel){
        this.nom = nom;
        this.tel = tel;
    }
    public Client(String nom, String tel, String email){
        this.nom = nom;
        this.tel = tel;
        this.email = email;
    }
    public String toString(){
        return "Nom : " + nom + ", Telephone : " + tel + ", Mail : " + email;
    }
    
    public boolean placerAprès(Client autre){
        int t = this.nom.compareTo(autre.nom);
        if (t!=0){
            return t>0;
        }
        return this.tel.compareTo(autre.tel)>0;
    }
}