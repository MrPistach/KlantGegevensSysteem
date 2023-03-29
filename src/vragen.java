import java.util.Scanner;
public class vragen {
    Scanner scanner = new Scanner(System.in);

    Registratie registratie = new Registratie();
    KlantenBeheer klantenBeheer = new KlantenBeheer();
    public void start() {
        boolean doorgaan = true;
        while (doorgaan) {
            System.out.println("Welkom bij de klantenbeheer applicatie.");
            System.out.println("Kies een optie:");
            System.out.println("1. Nieuwe klant registreren");
            System.out.println("2. Bestaande klant verwijderen");
            System.out.println("3. Bestaande klant wijzigen");
            System.out.println("4. Bestaande klant zoeken");
            System.out.println("5. Stoppen");

            int keuze = scanner.nextInt();
            scanner.nextLine();

            switch (keuze) {
                case 1:
                    registratie.nieuweKlantRegistreren();
                    break;
                case 2:
                    klantenBeheer.verwijderKlant();
                    break;
                case 3:
                    klantenBeheer.bewerkKlantgegevens( klantenBeheer.getKlant());
                    break;
                case 4:
                    klantenBeheer.getKlant();
                    break;
                case 5:
                    doorgaan = false;
                    break;
                default:
                    System.out.println("Ongeldige keuze, probeer opnieuw.");
            }
        }
    }
}
