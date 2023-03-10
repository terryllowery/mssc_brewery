package net.lowerytech.msscbrewery.services;

import net.lowerytech.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .name("Johny Five")
                .id(UUID.randomUUID())
                        .build();
    }
}
