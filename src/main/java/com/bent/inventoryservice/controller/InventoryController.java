package com.bent.inventoryservice.controller;

import com.bent.inventoryservice.dto.InventoryResponse;
import com.bent.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/inventory")
@RestController
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCodes) {
        return inventoryService.isInStock(skuCodes);
    }

    @GetMapping(value = "all/")
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> allStock() {
        return inventoryService.getAllStock();
    }
}
