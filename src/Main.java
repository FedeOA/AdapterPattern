import adapter.ExternalProviderAdapter;
import adapter.InternalProviderAdapter;
import domain.Product;
import enums.ProviderEnum;
import manager.RestaurantManager;
import service.ExternalProvider;
import service.InternalProvider;
import service.impl.FirstProviderServiceImpl;
import service.impl.SecondProviderServiceImpl;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        InternalProvider internalProvider = new FirstProviderServiceImpl();
        ExternalProvider externalProvider = new SecondProviderServiceImpl();

        RestaurantManager internalAdapter = new InternalProviderAdapter(internalProvider);
        RestaurantManager externalAdapter = new ExternalProviderAdapter(externalProvider);

        Map<ProviderEnum, RestaurantManager> providers = Map.of(
                ProviderEnum.FIRST, internalAdapter,
                ProviderEnum.SECOND,externalAdapter
        );

        Product productFirstProvider = providers.get(ProviderEnum.FIRST).getProduct("product");
        Product productSecondProvider = providers.get(ProviderEnum.SECOND).getProduct("product");

        System.out.println(productFirstProvider);
        System.out.println(productSecondProvider);
    }
}