package dto.provider;

public abstract class ProviderRequestDto {

    protected String productCode;

    public ProviderRequestDto(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
