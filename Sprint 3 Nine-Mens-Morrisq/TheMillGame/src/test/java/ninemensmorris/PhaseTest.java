package ninemensmorris;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhaseTest {

    Phase p1 = new Phase();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getCurrentGamePhase() {
        p1.setCurrentGamePhase(0);
        Assertions.assertEquals(0,p1.getCurrentGamePhase());
    }

    @Test
    void setCurrentGamePhase() {
        p1.setCurrentGamePhase(1);
        p1.setCurrentGamePhase(2);
        Assertions.assertEquals(2,p1.getCurrentGamePhase());
    }
}