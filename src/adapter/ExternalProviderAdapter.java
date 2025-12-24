package adapter;

import domain.Product;
import dto.provider.req.ExternalProviderRequestDto;
import dto.provider.resp.ExternalProviderResponseDto;
import manager.RestaurantManager;
import service.ExternalProvider;

import static constants.Constants.*;

public class ExternalProviderAdapter implements RestaurantManager {

    private final ExternalProvider externalProvider;

    public ExternalProviderAdapter(ExternalProvider externalProvider) {
        this.externalProvider = externalProvider;
    }

    @Override
    public Product getProduct(String productCode) {
        ExternalProviderRequestDto request = new ExternalProviderRequestDto(productCode,RESTAURANT_NAME,RESTAURANT_CODE,RESTAURANT_LOCATION);
        ExternalProviderResponseDto response = externalProvider.getPrice(request);

        System.out.println("Map response to Product");

        return new Product(
                response.getCode(),
                response.getProductName(),
                response.getPrice(),
                response.getProvider()
        );
    }
}
