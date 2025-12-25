package service.impl;


import domain.Provider;
import dto.provider.req.ExternalProviderRequestDto;
import dto.provider.resp.ExternalProviderResponseDto;
import service.ExternalProvider;

public class SecondProviderServiceImpl implements ExternalProvider {

    private final static Provider secondProvider = new Provider("Second Provider","B1","location 2","USA");

    @Override
    public ExternalProviderResponseDto getPrice(ExternalProviderRequestDto request) {

        System.out.println("Call external provider Service");

        return new ExternalProviderResponseDto(secondProvider,"productResponse",12,"code1");
    }
}
