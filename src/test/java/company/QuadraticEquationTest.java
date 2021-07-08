package company;

import com.company.QuadraticEquation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {


    @Test
    void podschetroot() {
        QuadraticEquation root = new QuadraticEquation();

        double[] corni = root.searchRoot(1,-4,-5);
        double[] otvet = new double[]{5,-1} ;                      //заносим получившиеся корни которые должны быть при расчете уравнения

        assertArrayEquals(otvet,corni);
    }

    @Test
    void podschetroot2() {
        QuadraticEquation root = new QuadraticEquation();

        double[] corni = root.searchRoot(1,-6,9);
        double[] otvet = new double[]{3,0} ;                      //заносим получившиеся корни которые должны быть при расчете уравнения

        assertArrayEquals(otvet,corni);
    }

    @Test
    void podschetroot3() {
        QuadraticEquation root = new QuadraticEquation();

        double[] corni = root.searchRoot(3,-4,2);
        double[] otvet = new double[]{0,0} ;                      //заносим получившиеся корни которые должны быть при расчете уравнения

        assertArrayEquals(otvet,corni);
    }



}



