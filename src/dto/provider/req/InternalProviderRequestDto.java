package dto.provider.req;

import dto.provider.ProviderRequestDto;

public class InternalProviderRequestDto extends ProviderRequestDto {

    /*
        Internal provider required our restaurant to call service
     */
    private String restaurantName;

    public InternalProviderRequestDto(String productCode, String restaurantName) {
        super(productCode);
        this.restaurantName = restaurantName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}
