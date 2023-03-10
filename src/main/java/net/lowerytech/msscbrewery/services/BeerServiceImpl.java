package net.lowerytech.msscbrewery.services;

import net.lowerytech.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("CoolBeans IPA")
                .beerStyle("India Pale Ale")
                .build();
    }
}
