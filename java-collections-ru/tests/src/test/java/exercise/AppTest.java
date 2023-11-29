package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6));
        List<Integer> actual = List.of(1, 2);
        assertThat(App.take(expected, 2)).isEqualTo(actual);
        // END
    }
    @Test
    void testTake2() {
        List<Integer> expected2 = List.of(7, 3, 10);
        List<Integer> actual2 = List.of(7, 3, 10);
        assertThat(App.take(expected2, 8)).isEqualTo(actual2);
    }
}
