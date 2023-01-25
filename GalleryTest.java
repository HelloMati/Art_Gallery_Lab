import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GalleryTest {
     @Test
        public void testAddArtwork() {
            Gallery gallery = new Gallery("Test Gallery");
            Artist artist = new Artist("Bob Bobbington");
            Artwork artwork = new Artwork("Painting", artist, 100, "huehue123");

            gallery.addArtwork(artwork);

            assertEquals(1, gallery.getStock().size());
            assertEquals(artwork, gallery.getStock().get(0));
        }
        @Test
        public void testSellArtwork() {
            Gallery gallery = new Gallery("Test Gallery");
            Artist artist = new Artist("Bob Bobbington");
            Artwork artwork = new Artwork("Painting", artist, 100, "huehue123");
            Customer customer = new Customer("Bobbina Bobbington", 200);

            gallery.addArtwork(artwork);
            gallery.sellArtwork(artwork, customer);

            assertEquals(0, gallery.getStock().size());
            assertEquals(100, gallery.getTill(), 0);
            assertEquals(100, customer.getWallet(), 0);
        }
    }
    
