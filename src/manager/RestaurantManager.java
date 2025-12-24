package manager;

import domain.Product;

public interface RestaurantManager {
    Product getProduct(String productCode);
}
