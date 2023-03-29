public class Klant {
    private String naam;
    private String email;
    private int telefoonnummer;
    private String telefoonmodel;

    public Klant(String naam, String email, int telefoonnummer, String telefoonmodel) {
        this.naam = naam;
        this.email = email;
        this.telefoonnummer = telefoonnummer;
        this.telefoonmodel = telefoonmodel;
    }

    public Klant() {

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(int telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getTelefoonModel() {
        return telefoonmodel;
    }

    public void setTelefoonModel(String telefoonmodel) {
        this.telefoonmodel = telefoonmodel;
    }

    public void printKlant() {
        System.out.println("Naam: " + naam);
        System.out.println("Email: " + email);
        System.out.println("Telefoonnummer: " + telefoonnummer);
        System.out.println("Telefoonmodel: " + telefoonmodel);
    }
}