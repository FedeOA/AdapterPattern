package dto.provider.resp;

import dto.provider.ProviderDto;
import dto.provider.ProviderResponseDto;

public class InternalProviderResponseDto extends ProviderResponseDto {
    public InternalProviderResponseDto(ProviderDto provider, String productName, double price, String code) {
        super(provider, productName, price, code);
    }
}
