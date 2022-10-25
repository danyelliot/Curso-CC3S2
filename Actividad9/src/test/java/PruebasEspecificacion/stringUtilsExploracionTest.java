package PruebasEspecificacion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class stringUtilsExploracionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void simpleCase(){
        assertThat(
                Stringutils.substringsBetween("abcd", "a", "d")
        ).isEqualTo(new String[] { "bc" });
    }
    @Test
    void manyStrings(){
        assertThat(
                Stringutils.substringsBetween("abcdabcdab", "a", "d")
        ).isEqualTo(new String[] { "bc", "bc" });
    }
    @Test
    void openAndCloseTagsThatAreLongerThan1Char(){
        assertThat(
                Stringutils.substringsBetween("aabcddaabfddaab", "aa", "dd")
        ).isEqualTo(new String[] { "bc", "bf" });
    }
}
