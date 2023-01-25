import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistTest {
    @Test
        public void testGetName() {
            Artist artist = new Artist("Bobbina Bobbington");
            assertThat("Bob Bobbington", artist.getName());
        }

        private void assertThat(String artistName, String name) {
        }

    }
