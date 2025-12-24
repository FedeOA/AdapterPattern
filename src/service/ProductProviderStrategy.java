package service;

import enums.ProviderEnum;
import manager.RestaurantManager;

import java.util.Map;

public class ProductProviderStrategy {

    private final Map<ProviderEnum, RestaurantManager> providers;

    public ProductProviderStrategy(Map<ProviderEnum, RestaurantManager> providers) {
        this.providers = providers;
    }

    public RestaurantManager resolve(ProviderEnum provider){
        return providers.get(provider);
    }

}
