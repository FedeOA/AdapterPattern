import adapter.ExternalProviderAdapter;
import adapter.InternalProviderAdapter;
import enums.ProviderEnum;
import manager.RestaurantManager;
import service.ExternalProvider;
import service.InternalProvider;
import service.impl.FirstProviderServiceImpl;
import service.impl.SecondProviderServiceImpl;

import java.util.Map;

public class AdaptersMap {

    static Map<ProviderEnum, RestaurantManager> getAdapters() {
        InternalProvider internalProvider = new FirstProviderServiceImpl();
        ExternalProvider externalProvider = new SecondProviderServiceImpl();

        RestaurantManager internalAdapter = new InternalProviderAdapter(internalProvider);
        RestaurantManager externalAdapter = new ExternalProviderAdapter(externalProvider);

        return Map.of(
                ProviderEnum.FIRST, internalAdapter,
                ProviderEnum.SECOND,externalAdapter
        );
    }
}
