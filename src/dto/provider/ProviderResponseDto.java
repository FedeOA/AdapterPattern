package dto.provider;

public abstract class ProviderResponseDto {

    protected ProviderDto provider;
    protected String productName;
    protected double price;
    protected String code;

    public ProviderResponseDto(ProviderDto provider, String productName, double price, String code) {
        this.provider = provider;
        this.productName = productName;
        this.price = price;
        this.code = code;
    }

    public ProviderDto getProvider() {
        return provider;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getCode() {
        return code;
    }

    public void setProvider(ProviderDto provider) {
        this.provider = provider;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCurrency(String currency) {
        this.code = currency;
    }
}
