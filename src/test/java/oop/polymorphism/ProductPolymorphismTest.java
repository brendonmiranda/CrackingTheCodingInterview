package oop.polymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductPolymorphismTest {

    @Test
    public void test() {

        Product product = new Product();
        Product pFood = new Food();
        Food food = new Food();

        Assertions.assertEquals("order product.", product.order());
        Assertions.assertEquals("order food.", pFood.order());
        Assertions.assertEquals("order food.", food.order());

    }

}
