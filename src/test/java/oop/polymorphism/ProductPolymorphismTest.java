package oop.polymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductPolymorphismTest {

    @Test
    public void test() {

        // food extends product

        Product product = new Product(); // product reference (an instance of product)
        Product pFood = new Food(); // product reference (an instance of food)
        Food food = new Food(); // food reference

        Assertions.assertEquals("order product.", product.order());
        Assertions.assertEquals("order food.", pFood.order()); // the subclass method takes precedence without casting reference to a specific subclass type
        Assertions.assertEquals("order food.", food.order());

    }

}
