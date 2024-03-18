package filter;

import java.util.List;

public class AndCriteria implements Criteria {

    private final Criteria criteria;
    private final Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Product> meetCriteria(List<Product> products) {
        List<Product> firstCriteriaProducts = criteria.meetCriteria(products);
        return otherCriteria.meetCriteria(firstCriteriaProducts);
    }
}
