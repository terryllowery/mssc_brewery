package net.lowerytech.msscbrewery.services;

import net.lowerytech.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}
