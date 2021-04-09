import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerTests {

    @Test
    void PowerRec_standard(){
        Power test = new Power(new PowerRec());
        assertEquals(36, test.calculate(6, 2));

    }

    @Test
    void PowerRec_Firstzero(){
        Power test = new Power(new PowerRec());
        assertEquals(0, test.calculate(0, 2));
    }

    @Test
    void PowerRec_SecondZero(){
        Power test = new Power(new PowerRec());
        assertEquals(1, test.calculate(6, 0));
    }

    @Test
    void PowerLoop_standard(){
        Power test = new Power(new PowerLoop());
        assertEquals(36, test.calculate(6, 2));

    }

    @Test
    void PowerLoop_Firstzero(){
        Power test = new Power(new PowerLoop());
        assertEquals(0, test.calculate(0, 2));
    }

    @Test
    void PowerLoop_SecondZero(){
        Power test = new Power(new PowerLoop());
        assertEquals(1, test.calculate(6, 0));
    }
}
