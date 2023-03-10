package net.lowerytech.msscbrewery.services;

import net.lowerytech.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
