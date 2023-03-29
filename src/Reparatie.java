import java.util.Date;
import java.util.Scanner;

public class Reparatie {
    private static int counter = 0;
    private Klant klant;
    private int id;
    private Date datum;
    private String status;
    private String omschrijving;

    public Reparatie() {
        this.id = ++counter;
    }

    public Reparatie(Klant klant, Date datum, String status, String omschrijving) {
        this.klant = klant;
        this.datum = datum;
        this.status = status;
        this.omschrijving = omschrijving;
        this.id = ++counter;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public int getId() {
        return id;
    }
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public void zetOmschrijving(Reparatie reparatie) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een omschrijving van de reparatie:");
        String omschrijving = scanner.nextLine();
        reparatie.setOmschrijving(omschrijving);
    }
    public void bewerkStatus(Reparatie reparatie) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de nieuwe status van de reparatie:");
        String status = scanner.nextLine();
        reparatie.setStatus(status);
    }

    public Reparatie getReparatie(int reparatieNummer) {
        if (reparatieNummer == id) {
            return this;
        }
        else {
            return null;
        }
    }

    public void printReparatie() {
        System.out.println("Reparatie nummer: " + id);
        System.out.println("Klant: " + klant.getNaam());
        System.out.println("Telefoonmodel: " + klant.getTelefoonModel());
        System.out.println("Datum: " + datum);
        System.out.println("Status: " + status);
        System.out.println("Omschrijving: " + omschrijving);
    }
}
