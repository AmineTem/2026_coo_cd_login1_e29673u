import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class TriCDTest {

    @Test
    public void testChargementValide()
            throws Exception {

        ChargeurMagasin chargeur =
                new ChargeurMagasin(
                        "musicbrainzSimple"
                );

        Magasin magasin =
                chargeur.chargerMagasin();

        assertNotNull(magasin);
    }

    @Test
    public void testChargementInvalide() {

        ChargeurMagasin chargeur =
                new ChargeurMagasin(
                        "repertoire_inexistant"
                );

        assertThrows(
                FileNotFoundException.class,
                () -> {
                    chargeur.chargerMagasin();
                }
        );
    }

    @Test
    public void testTriParTitre()
            throws Exception {

        ChargeurMagasin chargeur =
                new ChargeurMagasin(
                        "musicbrainzSimple"
                );

        Magasin magasin =
                chargeur.chargerMagasin();

        assertNotNull(
                magasin.triParTitre()
        );
    }
}