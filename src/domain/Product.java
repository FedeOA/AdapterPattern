package domain;

public class Product {

    private String code;
    private String name;
    private double price;
    private Provider provider;

    public Product(){}

    public Product(String code, String name, double price, Provider provider) {
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

    public Provider getProvider() {
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

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", provider=" + provider +
                '}';
    }
}
