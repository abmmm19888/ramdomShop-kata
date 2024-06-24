package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product : products) {
            BigDecimal productPrice = calculateProductPrice(product);
            totalPrice = totalPrice.add(productPrice);
        }

        return totalPrice.doubleValue();
    }

    private BigDecimal calculateProductPrice(Product product) {
        if (product.getName().equalsIgnoreCase("el tio juanillo")) {
            return BigDecimal.valueOf(100.0);
        } else if (product.getName().equalsIgnoreCase("French Camembert") && product.isStinky()) {
            return BigDecimal.valueOf(50.0);
        } else if (product.getName().startsWith("Magic: The Gathering")) {
            return BigDecimal.valueOf(calculateMagicCardPrice(product));
        } else if (product.getName().equalsIgnoreCase("Blue Fish")) {
            return BigDecimal.valueOf(0.1);
        } else if (product.getName().equalsIgnoreCase("Golden Fish")) {
            return BigDecimal.valueOf(100.0);
        } else if (product.getName().equalsIgnoreCase("Base Price Fish")) {
            return product.getBasePrice() != null ? product.getBasePrice() : BigDecimal.ZERO;
        } else if (product.getName().equalsIgnoreCase("Spider")) {
            return BigDecimal.valueOf(calculateSpiderPrice(product));
        }

        return BigDecimal.ZERO;
    }

    private double calculateMagicCardPrice(Product product) {
        double basePrice = switch (product.getColor().toLowerCase()) {
            case "red" -> 3.5;
            case "blue" -> 5.0;
            case "green" -> 4.4;
            case "black" -> 6.8;
            case "brown" -> 2.0;
            case "none" -> {
                if (product.getName().equalsIgnoreCase("Magic: The Gathering - Black Lotus")) {
                    yield 40000.0;
                }
                yield 0.0;
            }
            default -> 0.0;
        };

        if (product.getColor().equalsIgnoreCase("red") && product.getAge() != null && product.getAge() > 10) {
            basePrice /= 2;
        } else if (product.getColor().equalsIgnoreCase("blue") && product.getAge() != null && product.getAge() > 10) {
            basePrice = 1.25;
        } else if ((product.getColor().equalsIgnoreCase("green") || product.getColor().equalsIgnoreCase("black"))
                && product.getAge() != null && product.getAge() > 20) {
            basePrice *= 1.2;
        }

        return basePrice;
    }

    private double calculateSpiderPrice(Product product) {
        double basePrice = 8.0;
        if (product.getColor().equalsIgnoreCase("red")) {
            basePrice = 11.6;
        } else if (product.getColor().equalsIgnoreCase("gold")) {
            basePrice = 12.6;
        } else if (product.getColor().equalsIgnoreCase("blue")) {
            basePrice = 9.6;
        } else if (product.getColor().equalsIgnoreCase("brown") && product.isStinky()) {
            basePrice = 4.8;
        } else if (product.getColor().equalsIgnoreCase("brown")) {
            basePrice = 8.0;
        }

        if (product.isStinky() && !product.getColor().equalsIgnoreCase("brown")) {
            basePrice /= 2;
        }
        return basePrice;
    }
}