import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KlantTest {
    @Test
    public void testKlant() {
        Klant klant = new Klant("John Doe", "johndoe@example.com", 123456789, "iPhone X");
        assertEquals("John Doe", klant.getNaam());
        assertEquals("johndoe@example.com", klant.getEmail());
        assertEquals(123456789, klant.getTelefoonnummer());
        assertEquals("iPhone X", klant.getTelefoonModel());
    }
}

