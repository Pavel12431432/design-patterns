package filter;

import java.util.List;

public interface Criteria {
    List<Product> meetCriteria(List<Product> products);
}
