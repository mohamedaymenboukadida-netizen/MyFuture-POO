import java.util.Scanner;

public class testproduit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciation initiale d'un produit
        produit p = new produit("01", "Clavier", 50.0, 10);

        int choix = 0;

        do {
            System.out.println("\n--- MENU PRODUIT ---");
            System.out.println("1. Afficher les informations du produit");
            System.out.println("2. Calculer la valeur totale du stock");
            System.out.println("3. Appliquer une remise");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option : ");
            
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("\nRéférence : " + p.getref());
                    System.out.println("Désignation : " + p.getdes());
                    System.out.println("Prix HT : " + p.getprix());
                    System.out.println("Quantité en stock : " + p.getqte());
                    break;

                case 2:
                    System.out.println("\nMontant total du stock : " + p.calculer());
                    break;

                case 3:
                    System.out.print("Donner le pourcentage de remise : ");
                    double remise = sc.nextDouble();

                    double nouveauPrix = p.getprix() - (p.getprix() * remise / 100);
                    p.setprix(nouveauPrix);

                    System.out.println("Nouveau prix HT : " + p.getprix());
                    System.out.println("Nouveau montant du stock : " + p.calculer());
                    break;

                case 4:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Option invalide, veuillez réessayer.");
                    break;
            }
        } while (choix != 4);

        sc.close();
    }
}