package me.elmajni.orderservice.services;

import me.elmajni.orderservice.models.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "customer-service")
public interface CustomerRestClientService {
    @GetMapping(path = "/customers/{id}?projection=fullCustomer")
    Customer customerById(@PathVariable Long id);

    @GetMapping(path = "/customers?projection=fullCustomer")
    PagedModel<Customer> allCustomers();


}
