package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatTest {

    @Test
    void statistikCounter() {
        Pizza pizza = new Pizza("0", "hej", "40", "1");
        int a = Integer.parseInt(pizza.getPizzacount());
        int Antalpizzakøbt =   a + 1;
        assertEquals(2,a);
    }

    @Test
    void prisSamler() {
        Pizza pizza = new Pizza("0", "hej", "40", "1");
        int a = Integer.parseInt(pizza.getPris());
        int Antalpizzakøbt =   a + 40;
        assertEquals(80,a);

    }

    @Test
    void omsætning() {
        int sum = 0;
        Pizza pizza = new Pizza("0", "hej", "40", "0");
        int a = Integer.parseInt(pizza.getPris());
        sum += Integer.parseInt(pizza.getPris());
        assertEquals(40,sum);
    }
}