package com.bent.inventoryservice.mapper;

import com.bent.inventoryservice.dto.InventoryResponse;
import com.bent.inventoryservice.model.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InventoryMapper {
    @Mapping(target = "isInStock", expression = "java(inventory.getQuantity() > 0)")
    InventoryResponse fromEntity(Inventory inventory);
}