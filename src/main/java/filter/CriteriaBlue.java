package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaBlue implements Criteria {
    @Override
    public List<Product> meetCriteria(List<Product> products) {
        List<Product> blueProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getColor().equalsIgnoreCase("blue")) {
                blueProducts.add(product);
            }
        }
        return blueProducts;
    }
}
