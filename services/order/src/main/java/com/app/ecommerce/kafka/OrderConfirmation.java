package com.app.ecommerce.kafka;

import com.app.ecommerce.customer.CustomerResponse;
import com.app.ecommerce.order.PaymentMethod;
import com.app.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
