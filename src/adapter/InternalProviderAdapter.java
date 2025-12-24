package adapter;

import domain.Product;
import dto.provider.req.InternalProviderRequestDto;
import dto.provider.resp.InternalProviderResponseDto;
import manager.RestaurantManager;
import service.InternalProvider;

import static constants.Constants.RESTAURANT_NAME;

public class InternalProviderAdapter implements RestaurantManager {

    private final InternalProvider internalProvider;

    public InternalProviderAdapter(InternalProvider internalProvider) {
        this.internalProvider = internalProvider;
    }

    @Override
    public Product getProduct(String productCode) {

        InternalProviderRequestDto request = new InternalProviderRequestDto(productCode,RESTAURANT_NAME);
        InternalProviderResponseDto response = internalProvider.getPrice(request);

        System.out.println("Map response to Product");

        return new Product(
                response.getCode(),
                response.getProductName(),
                response.getPrice(),
                response.getProvider()
        );
    }
}
