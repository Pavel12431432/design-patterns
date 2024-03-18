package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaShoe implements Criteria{
    @Override
    public List<Product> meetCriteria(List<Product> products) {
        List<Product> shoeProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getType().equalsIgnoreCase("shoe")) {
                shoeProducts.add(product);
            }
        }
        return shoeProducts;
    }
}
