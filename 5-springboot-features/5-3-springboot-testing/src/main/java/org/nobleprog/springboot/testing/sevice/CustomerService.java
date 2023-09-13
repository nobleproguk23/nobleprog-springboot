package org.nobleprog.springboot.testing.sevice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    public List<String> getAllCustomerIds() {
        return new ArrayList<>();
    }
}
