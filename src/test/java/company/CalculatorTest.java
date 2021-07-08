package company;

import com.company.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTests {




    @Test
    void plus() {
        Calculator calc = new Calculator();


        int value = calc.plus(3,5);


        assertEquals(8,value);

    }
    @Test
    void div() throws IOException {
        Calculator calc = new Calculator();

        double value = calc.division(3,6);


        assertEquals(0.5, value);
    }

    @Test
    void vichitanie() {
        Calculator calc = new Calculator();


        int value = calc.minus(0,-5);


        assertEquals(5,value);

    }

    @Test
    void ymnoj() {
        Calculator calc = new Calculator();


        int value = calc.multiply(0,-5);


        assertEquals(0,value);

    }

    @Test
    void range() {
        Calculator calc = new Calculator();

        calc.setA(5555555);

        int value = calc.getA();


        assertEquals(5555555,value);          //бросил ошибку так как превысиили значение в тесте

    }

    @Test
    void zeroDivizion() throws IOException {
        Calculator calc = new Calculator();


        Executable executable = ()->{
            calc.division(20,0);
        };


        Throwable thrown = assertThrows(IOException.class,executable);

    }


}