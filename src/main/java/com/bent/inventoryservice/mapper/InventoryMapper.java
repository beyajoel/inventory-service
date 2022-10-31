package com.bent.inventoryservice.mapper;

import com.bent.inventoryservice.dto.InventoryResponse;
import com.bent.inventoryservice.model.Inventory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InventoryMapper {

    Inventory asEntity(InventoryResponse inventoryResponse);

    InventoryResponse fromEntity(Inventory inventory);
}