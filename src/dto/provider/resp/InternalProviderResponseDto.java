package dto.provider.resp;

import domain.Provider;
import dto.provider.ProviderResponseDto;

public class InternalProviderResponseDto extends ProviderResponseDto {
    public InternalProviderResponseDto(Provider provider, String productName, double price, String code) {
        super(provider, productName, price, code);
    }
}
