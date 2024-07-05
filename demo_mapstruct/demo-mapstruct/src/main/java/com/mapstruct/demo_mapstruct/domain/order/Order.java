package com.mapstruct.demo_mapstruct.domain.order;

import com.mapstruct.demo_mapstruct.domain.customer.Customer;
import com.mapstruct.demo_mapstruct.domain.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private OrderId id;
    private Customer customer;
    private List<Product> productList;
    private LocalDateTime generetedAt;
}
