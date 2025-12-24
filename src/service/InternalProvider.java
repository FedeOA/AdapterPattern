package service;

import dto.provider.req.InternalProviderRequestDto;
import dto.provider.resp.InternalProviderResponseDto;

public interface InternalProvider {

    InternalProviderResponseDto getPrice(InternalProviderRequestDto product);
}
