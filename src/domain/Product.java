package domain;

import dto.provider.ProviderDto;

public class Product {

    private String code;
    private String name;
    private double price;
    private ProviderDto provider;

    public Product(){}

    public Product(String code, String name, double price, ProviderDto provider) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.provider = provider;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProviderDto getProvider() {
        return provider;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProvider(ProviderDto provider) {
        this.provider = provider;
    }
}
