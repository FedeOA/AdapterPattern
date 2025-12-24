package service;

import dto.provider.req.ExternalProviderRequestDto;
import dto.provider.resp.ExternalProviderResponseDto;

public interface ExternalProvider {

    ExternalProviderResponseDto getPrice(ExternalProviderRequestDto request);
}
