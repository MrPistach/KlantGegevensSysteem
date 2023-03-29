public class ZakelijkeKlant extends Klant {
    private String bedrijfsNaam;

    public ZakelijkeKlant(String naam, String email, int telefoonnummer, String telefoonmodel, String bedrijfsNaam) {
        super(naam, email, telefoonnummer, telefoonmodel);
        this.bedrijfsNaam = bedrijfsNaam;
    }

    public String getBedrijfsNaam() {
        return bedrijfsNaam;
    }

    public void setBedrijfsNaam(String bedrijfsNaam) {
        this.bedrijfsNaam = bedrijfsNaam;
    }

    @Override
    public void printKlant() {
        super.printKlant();
        System.out.println("Bedrijfsnaam: " + bedrijfsNaam);
    }
}