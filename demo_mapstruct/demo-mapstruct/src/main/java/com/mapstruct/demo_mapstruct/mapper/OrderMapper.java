package com.mapstruct.demo_mapstruct.mapper;

import com.mapstruct.demo_mapstruct.domain.Currency;
import com.mapstruct.demo_mapstruct.domain.Money;
import com.mapstruct.demo_mapstruct.domain.PhoneNumber;
import com.mapstruct.demo_mapstruct.domain.customer.Customer;
import com.mapstruct.demo_mapstruct.domain.customer.CustomerId;
import com.mapstruct.demo_mapstruct.domain.customer.CustomerName;
import com.mapstruct.demo_mapstruct.domain.order.Order;
import com.mapstruct.demo_mapstruct.domain.order.OrderId;
import com.mapstruct.demo_mapstruct.domain.product.Product;
import com.mapstruct.demo_mapstruct.domain.product.ProductId;
import com.mapstruct.demo_mapstruct.domain.product.ProductName;
import com.mapstruct.demo_mapstruct.dto.CurrencyDTO;
import com.mapstruct.demo_mapstruct.dto.CustomerDTO;
import com.mapstruct.demo_mapstruct.dto.OrderDTO;

import com.mapstruct.demo_mapstruct.dto.ProductDTO;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "id", target = "id", qualifiedByName = "orderIdToLong")
    @Mapping(target = "customer", source = "customer", qualifiedByName = "customerToCustomerDto")
    @Mapping(target = "products", source = "productList", qualifiedByName = "productToProductDto")
    OrderDTO ordertoOrderDTO(Order order);
//    @InheritInverseConfiguration
//   Order orderDtoToOrder(OrderDTO orderDTO);

    // pour mapper l'id de Order en OrderDto
    @Named("orderIdToLong")
    default Long orderIdToLong(OrderId orderId) {
        if (orderId == null) {
            return null;
        }
        return orderId.getValue();
    }

    // pour mapper customer de l'Order en customer de OrderDto
    @Named("customerToCustomerDto")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id", qualifiedByName = "CustomerIdToInteger")
    @Mapping(target = "fullName", source = "name", qualifiedByName = "CustomerNameToString")
    @Mapping(target = "phone", source = "phoneNumber", qualifiedByName = "phoneNumberToString")
    CustomerDTO customerToCustomerDTO(Customer customer);

    @Named("CustomerIdToInteger")
    default Integer CustomerIdToInteger(CustomerId customerId) {
        if (customerId == null) {
            return null;
        }
        if (customerId.getValue() == null) {
            return null;
        }
        return customerId.getValue().intValue();
    }

    @Named("CustomerNameToString")
    default String CustomerNameToString(CustomerName customerName) {
        if (customerName == null) {
            return null;
        }
        if(customerName.getFirstName() == null){
            return null;
        }
        return customerName.getFirstName().concat(" ").concat(customerName.getLastName());
    }

    @Named("phoneNumberToString")
    default String PhoneNumberToString(PhoneNumber phoneNumber) {
        if (phoneNumber == null || phoneNumber.getCountryCode() == null) {
            return null;
        }
        return phoneNumber.getCountryCode().concat(" ").concat(phoneNumber.getNumber());
    }

    // pour mapper productList de order en products de orderDto
    @Named("productToProductDto")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id", qualifiedByName = "productIdToLong")
    @Mapping(target = "name", source = "name", qualifiedByName = "productNameToString")
    @Mapping(target = "price", source = "price", qualifiedByName = "moneyToDouble")
    @Mapping(target = "currency", source = "price", qualifiedByName = "CurrencyDtoToMoney")
    ProductDTO productToProductDto (Product product);

    @Named("productIdToLong")
    default Long productIdToLong(ProductId productId) {
        if (productId == null) {
            return null;
        }
        return productId.getValue();
    }

    @Named("productNameToString")
    default String productNameToString(ProductName productName) {
        if (productName == null || productName.getPublicName() == null) {
            return null;
        }
        return productName.getPublicName().concat(" ").concat(productName.getTechnicalName());
    }

    @Named("moneyToDouble")
    default Double moneyToDouble(Money money) {
        if (money == null || money.getAmount() == null) {
            return null;
        }
        return money.getAmount().doubleValue();
    }

    @Named("CurrencyDtoToMoney")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "currency", source = "value")
    Money CurrencyDtoToMoney(CurrencyDTO currencyDTO);






}
