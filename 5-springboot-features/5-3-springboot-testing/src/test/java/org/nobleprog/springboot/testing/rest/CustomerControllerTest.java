package org.nobleprog.springboot.testing.rest;

import org.junit.runner.RunWith;
import org.nobleprog.springboot.testing.sevice.CustomerService;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit4.rules.SpringClassRule;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
class CustomerControllerTest {

    @MockBean
    CustomerService customerService;



}