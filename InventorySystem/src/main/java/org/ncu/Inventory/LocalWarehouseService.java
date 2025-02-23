package org.ncu.Inventory;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
@Profile("local")

public class LocalWarehouseService implements WarehouseService {
    private final Map<String, Integer> inventory = new HashMap<>();

    public LocalWarehouseService() {
        inventory.put("Laptop", 10);
        inventory.put("Phone", 5);
    }

    @Override
    public String getInventory(String item) {
        return "Local Warehouse: " + inventory.getOrDefault(item, 0) + " units available.";
    }
}


