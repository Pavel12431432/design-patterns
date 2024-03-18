package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Short", "Grey", 61));
        products.add(new Product("Shoe", "Blue", 80));
        products.add(new Product("Shorts", "Pink", 120));
        products.add(new Product("Dress", "Orange", 390));
        products.add(new Product("Shoe", "Blue", 149));
        products.add(new Product("Shoe", "Orange", 49));
        products.add(new Product("Sweater", "Blue", 99));

        Criteria shoes = new CriteriaShoe();
        Criteria blue = new CriteriaBlue();
        Criteria lessThan100 = new CriteriaPriceLessThan(100);
        Criteria blueShoes = new AndCriteria(blue, shoes);
        Criteria blueShoesLessThan100 = new AndCriteria(blueShoes, lessThan100);

        System.out.println("Shoes: " + shoes.meetCriteria(products));
        System.out.println("Blue things: " + blue.meetCriteria(products));
        System.out.println("Things less than 100: " + lessThan100.meetCriteria(products));
        System.out.println("Blue shoes: " + blueShoes.meetCriteria(products));
        System.out.println("Blue shoes less than 100: " + blueShoesLessThan100.meetCriteria(products));
    }
}
