import domain.Product;
import enums.ProviderEnum;
import manager.RestaurantManager;
import service.ProductProviderStrategy;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<ProviderEnum, RestaurantManager> adapters = AdaptersMap.getAdapters();

        ProductProviderStrategy providerStrategy = new ProductProviderStrategy(adapters);

        Product productFirstProvider = providerStrategy.resolve(ProviderEnum.FIRST).getProduct("product");
        Product productSecondProvider = providerStrategy.resolve(ProviderEnum.SECOND).getProduct("product");

        System.out.println(productFirstProvider);
        System.out.println(productSecondProvider);
    }
}