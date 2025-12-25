package dto.provider;

import domain.Provider;

public abstract class ProviderResponseDto {

    protected Provider provider;
    protected String productName;
    protected double price;
    protected String code;

    public ProviderResponseDto(Provider provider, String productName, double price, String code) {
        this.provider = provider;
        this.productName = productName;
        this.price = price;
        this.code = code;
    }

    public Provider getProvider() {
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

    public void setProvider(Provider provider) {
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
