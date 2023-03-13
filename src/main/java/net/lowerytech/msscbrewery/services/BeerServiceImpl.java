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

    @Override
    public BeerDto save(BeerDto beerDto) {
        return BeerDto.builder()
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .id(UUID.randomUUID()) //TODO: This should be coming from the db
                .upc(beerDto.getUpc()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // TODO implement beerUpdate method
    }
}
