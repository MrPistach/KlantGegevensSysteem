import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReparateurTest {
    @Test
    public void testGeefBeschikbareReparateur() {
        Reparateur reparateur1 = new Reparateur("John", 3);
        Reparateur reparateur2 = new Reparateur("Alice", 5);
        List<Reparateur> reparateurs = new ArrayList<Reparateur>();
        reparateurs.add(reparateur1);
        reparateurs.add(reparateur2);


        Reparateur beschikbaar = Reparateur.geefBeschikbareReparateur(reparateurs);
        assertNotNull(beschikbaar);
        assertTrue(beschikbaar == reparateur1 || beschikbaar == reparateur2);


        Klant klant1 = new Klant("lol", "lol@gmail.com", 123456789, "iPhone X" );
        reparateur1.toewijzenReparatie(klant1);
        beschikbaar = Reparateur.geefBeschikbareReparateur(reparateurs);
        assertNotNull(beschikbaar);
        assertEquals(reparateur2, beschikbaar);


        Klant klant2 = new Klant("bob", "bob@gmail.com", 987654321, "iPhone 8" );
        reparateur2.toewijzenReparatie(klant2);
        beschikbaar = Reparateur.geefBeschikbareReparateur(reparateurs);
        assertNull(beschikbaar);
    }
}