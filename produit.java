public class produit {

    String reference;
    String designation;
    double prixHT;
    int quantitestock;

    // Constructeur
    public produit(String ref, String des, double prix, int qte) {
        reference = ref;
        designation = des;
        prixHT = prix;
        quantitestock = qte;
    }

    // Getters et Setters
    public String getref() {
        return reference;
    }

    public void setref(String ref) {
        reference = ref;
    }

    public String getdes() {
        return designation;
    }

    public void setdes(String des) {
        designation = des;
    }

    public double getprix() {
        return prixHT;
    }

    public void setprix(double prix) {
        prixHT = prix;
    }

    public int getqte() {
        return quantitestock;
    }

    public void setqte(int qte) {
        quantitestock = qte;
    }

    // Méthode de calcul du montant total du stock
    public double calculer() {
        return quantitestock * prixHT;
    }
}