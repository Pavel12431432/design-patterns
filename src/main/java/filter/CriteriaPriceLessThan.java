package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPriceLessThan implements Criteria {
    private final double maxPrice;

    public CriteriaPriceLessThan(double maxPrice) {
        this.maxPrice = maxPrice;
    }
    @Override
    public List<Product> meetCriteria(List<Product> products) {
        List<Product> goodProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() < maxPrice) {
                goodProducts.add(product);
            }
        }
        return goodProducts;
    }
}
