package service.impl;

import dto.provider.ProviderDto;
import dto.provider.req.InternalProviderRequestDto;
import dto.provider.resp.InternalProviderResponseDto;
import service.InternalProvider;


public class FirstProviderServiceImpl implements InternalProvider {

    private final static ProviderDto firstProvider = new ProviderDto("First Provider","A1","location 1","Argentina");

    @Override
    public InternalProviderResponseDto getPrice(InternalProviderRequestDto product) {

        System.out.println("Call internal provider Service");

        return new InternalProviderResponseDto(firstProvider,"productResponse",166.99,"code1");
    }
}
