import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplierTests {

    @test
    void MultRec_twoPosNum() {

        ml = new Multiply(new MultRec());
        assertEquals(28, ml.calculate(4, 7))
    }

    @test
    void MultRec_Zero() {

        ml = new Multiply(new MultRec());
        assertEquals(0, ml.calculate(0, 7))
    }

    @test
    void MultRec_Negative() {

        ml = new Multiply(new MultRec());
        assertEquals(-18, ml.calculate(-3, 6))
    }

    @test
    void MultRec_twoPosNum() {

        ml = new Multiply(new MultLoop());
        assertEquals(28, ml.calculate(4, 7))
    }

    @test
    void MultLoop_Zero() {

        ml = new Multiply(new MultLoop());
        assertEquals(0, ml.calculate(0, 7))
    }

    @test
    void MultRec_Negative() {

        ml = new Multiply(new MultLoop());
        assertEquals(-18, ml.calculate(-3, 6))
    }


}