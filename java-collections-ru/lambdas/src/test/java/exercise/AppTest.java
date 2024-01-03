package exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
public class AppTest {
    @Test
    public void testEnlargeArrayImage() {
        String[][] test = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"}
        };
        String[][] expected = new String[][]{
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"}
        };
        String[][] actual = App.enlargeArrayImage(test);
        assertThat(actual).isDeepEqualTo(expected);

        String[][] test2 = {
                {"@", "@"},
                {"@", "|"},
                {"—", "|"},
                {"@", "|"},
                {"@", "@"},
        };

        String[][] expected2 = {
                {"@", "@", "@", "@"},
                {"@", "@", "@", "@"},
                {"@", "@", "|", "|"},
                {"@", "@", "|", "|"},
                {"—", "—", "|", "|"},
                {"—", "—", "|", "|"},
                {"@", "@", "|", "|"},
                {"@", "@", "|", "|"},
                {"@", "@", "@", "@"},
                {"@", "@", "@", "@"},
        };

        String[][] actual2 = App.enlargeArrayImage(test2);
        assertThat(actual2).isDeepEqualTo(expected2);
    }
    @Test
    public void testEmptyArray() {
        String[][] test = new String[][]{};
        String[][] actual = App.enlargeArrayImage(test);
        assertThat(actual).isDeepEqualTo(test);
    }
}
// END
