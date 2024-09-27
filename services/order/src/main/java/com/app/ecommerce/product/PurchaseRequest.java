package com.app.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PurchaseRequest(
        @NotNull(message = "Select at least one product")
        Long productId,
        @Positive(message = "Quantity is mandatory")
        double quantity
) {
}
