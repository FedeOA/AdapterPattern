package dto.provider.resp;

import domain.Provider;
import dto.provider.ProviderResponseDto;

public class ExternalProviderResponseDto extends ProviderResponseDto {

    /*
        simulate the quotation for USD
     */
    private static final double quotation = 1499.44;

    public ExternalProviderResponseDto(Provider provider, String productName, double price, String code) {

        super(provider, productName, price, code);
        setPrice(price*quotation);
    }
}
