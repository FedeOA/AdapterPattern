package dto.provider.req;

public class ExternalProviderRequestDto {

    /*
       External provider required the code given, our name and location to call service.
    */
    private String restaurantCode;
    private String restaurantName;
    private String location;

    public ExternalProviderRequestDto(String productCode, String restaurantCode, String restaurantName, String location) {
        this.restaurantCode = restaurantCode;
        this.restaurantName = restaurantName;
        this.location = location;
    }

    public String getRestaurantCode() {
        return restaurantCode;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getLocation() {
        return location;
    }

    public void setRestaurantCode(String restaurantCode) {
        this.restaurantCode = restaurantCode;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
