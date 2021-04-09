import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplierTests {

    @Test
    void MultRec_twoPosNum() {
        Multiply ml = new Multiply(new MultRec());
        assertEquals(28, ml.calculate(4, 7));
    }

    @Test
     void MultRec_Zero() {

        Multiply ml = new Multiply(new MultRec());
        assertEquals(0, ml.calculate(0, 7));
    }

    @Test
    void MultRec_Negative() {

        Multiply ml = new Multiply(new MultRec());
        assertEquals(-18, ml.calculate(-3, 6));
    }

    @Test
    void MultLoop_twoPosNum() {

        Multiply ml = new Multiply(new MultLoop());
        assertEquals(28, ml.calculate(4, 7));
    }

    @Test
    void MultLoop_Zero() {

        Multiply ml = new Multiply(new MultLoop());
        assertEquals(0, ml.calculate(0, 7));
    }

    @Test
    void MultLoop_Negative() {

        Multiply ml = new Multiply(new MultLoop());
        assertEquals(-18, ml.calculate(-3, 6));
    }


}