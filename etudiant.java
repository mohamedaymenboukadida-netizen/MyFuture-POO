import java.util.Scanner;
public class etudiant {
    String nom;
    String prenom;
    int age;
    String ville;
    public etudiant(String n, String p, int a, String c) {
        nom = n;
        prenom = p;
        age = a;
        ville = c;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setNom(String n) {
        nom = n;
    }
    public void setPrenom(String p) {
        prenom = p;
    }
    public void saisir() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nom de l'étudiant : ");
        nom = sc.nextLine();
        System.out.print("Entrez le prénom de l'étudiant : ");
        prenom = sc.nextLine();
        System.out.print("Entrez l'âge de l'étudiant : ");
        age = sc.nextInt();
        System.out.print("Entrez la ville de l'étudiant : ");
        ville = sc.nextLine();
        System.out.println();

    }
    public void afficher() {
        System.out.print("Nom : " + nom+"|");
        System.out.print("Prénom : " + prenom +"|");
        System.out.print("Âge : " + age+"|");
        System.out.print("Ville : " + ville);
    }
    public float grand(float[] t) {
        float max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        etudiant e = new etudiant("", "", 0, "");
        e.saisir();
        System.out.println();
        etudiant e2 = new etudiant("", "", 0, "");
        e2.saisir();
        System.out.println();
        etudiant e3 = new etudiant("", "", 0, "");
        e3.saisir();
        System.out.println();
        float[] t = new float[3];
        t[0] = 10;
        t[1] = 13.5f;
        t[2] = 11;
        e.afficher();
        System.out.println();
        e2.afficher();
        System.out.println();
        e3.afficher();
        System.out.println();

        System.out.println("La valeur maximale du tableau est : " + e.grand(t));
    }



}
