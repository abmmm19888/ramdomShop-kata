package org.example;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {

    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(3.5, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(5.0, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);

        shoppingCart.addProduct(product);

        assertEquals(100.0, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertEquals(50.0, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(4.40, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(6.80, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForMagicCards_brown() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(2.0, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForMagicCards_lotus() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "none", null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertEquals(40000.0, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForBlueFish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", BigDecimal.valueOf(0), "Blue Fish", null);

        shoppingCart.addProduct(product);

        assertEquals(0.1, shoppingCart.getTotalPrice(), 0.1);
    }

    @Test
    void calculatePriceForGoldenFish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "gold", BigDecimal.valueOf(1), "Golden Fish", null);

        shoppingCart.addProduct(product);

        assertEquals(100.0, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForBasePriceFish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "other_color", BigDecimal.valueOf(1), "Base Price Fish", null);

        shoppingCart.addProduct(product);

        assertEquals(1, shoppingCart.getTotalPrice(), 0.01);

    }

    @Test
    void calculatePriceForSpider_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false, "red", null, "Spider", null);

        shoppingCart.addProduct(product);

        assertEquals(11.6, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForSpider_redstinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true, "red", null, "Spider", null);

        shoppingCart.addProduct(product);

        assertEquals(5.8, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForSpider_gold() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false, "gold", null, "Spider", null);

        shoppingCart.addProduct(product);

        assertEquals(12.6, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForSpider_goldstinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true, "gold", null, "Spider", null);

        shoppingCart.addProduct(product);

        assertEquals(6.3, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForSpider_brownstinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true, "brown", null, "Spider", null);

        shoppingCart.addProduct(product);

        assertEquals(4.8, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    void calculatePriceForSpider_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false, "blue", null, "Spider", null);

        shoppingCart.addProduct(product);

        assertEquals(9.6, shoppingCart.getTotalPrice(), 0.01);

    }

    @Test
    public void calculatePriceForBlueMagicCardOver10Years() {
        Product blueCard = new Product(null, 15, false, "blue", new BigDecimal("5.00"),
                "Magic: The Gathering - Blue Card", null);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(blueCard);
        assertEquals(1.25, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testRedCardOlderThan10Years() {
        Product redCard = new Product(null, 12, false, "red", new BigDecimal("3.50"), "Magic: The Gathering - Red Card",
                null);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(redCard);
        assertEquals(1.75, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testGreenCardOlderThan20Years() {
        Product greenCard = new Product(null, 22, false, "green", new BigDecimal("4.40"),
                "Magic: The Gathering - Green Card", null);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(greenCard);
        assertEquals(5.28, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testBlackCardOlderThan20Years() {
        Product blackCard = new Product(null, 25, false, "black", new BigDecimal("6.80"),
                "Magic: The Gathering - Black Card", null);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(blackCard);
        assertEquals(8.16, cart.getTotalPrice(), 0.01);
    }
}