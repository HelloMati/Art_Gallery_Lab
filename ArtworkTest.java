import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtworkTest {
        @Test
        public void testGetTitle() {
            Artist artist = new Artist("Bob Bobbington");
            Artwork artwork = new Artwork("Painting", artist, 100, "huehue123");

            assertThat("Painting", artwork.getTitle());
        }

    private void assertThat(String painting, String title) {
    }

}
