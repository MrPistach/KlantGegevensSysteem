public class Klant {
    private String naam;
    private String email;
    private int telefoonnummer;

    private String telefoon;

    public Klant(String naam, String email, int telefoonnummer, String telefoon) {
        this.naam = naam;
        this.email = email;
        this.telefoonnummer = telefoonnummer;
        this.telefoon = telefoon;
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

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }
}