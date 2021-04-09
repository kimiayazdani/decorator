import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerTests {

    @Test
    void PowerRec_MultRec_standard(){
        Power test = new Power(new PowerRec(), new Multiply(new MultRec()));
        assertEquals(36, test.calculate(6, 2));

    }

    @Test
    void PowerRec_MultLoop_standard(){
        Power test = new Power(new PowerRec(), new Multiply(new MultLoop()));
        assertEquals(36, test.calculate(6, 2));

    }


    @Test
    void PowerLoop_MultRec_standard(){
        Power test = new Power(new PowerLoop(), new Multiply(new MultRec()));
        assertEquals(36, test.calculate(6, 2));

    }

    @Test
    void PowerLoop_MultLoop_standard(){
        Power test = new Power(new PowerLoop(), new Multiply(new MultLoop()));
        assertEquals(36, test.calculate(6, 2));

    }
    @Test
    void PowerRec_MultRec_SecondZero(){
        Power test = new Power(new PowerRec(), new Multiply(new MultRec()));
        assertEquals(1, test.calculate(6, 0));

    }

    @Test
    void PowerRec_MultLoop_SecondZero(){
        Power test = new Power(new PowerRec(), new Multiply(new MultLoop()));
        assertEquals(1, test.calculate(6, 0));

    }


    @Test
    void PowerLoop_MultRec_SecondZero(){
        Power test = new Power(new PowerLoop(), new Multiply(new MultRec()));
        assertEquals(1, test.calculate(6, 0));

    }

    @Test
    void PowerLoop_MultLoop_SecondZero(){
        Power test = new Power(new PowerLoop(), new Multiply(new MultLoop()));
        assertEquals(1, test.calculate(6, 0));

    }

}
