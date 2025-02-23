package org.ncu.Inventory;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
@Profile("remote")

@Component
public class RemoteWarehouseService implements WarehouseService{
	 private final Map<String, Integer> inventory = new HashMap<>();

	    public RemoteWarehouseService() {
	        inventory.put("Laptop", 50);
	        inventory.put("Phone", 30);
	    }

	    @Override
	    public String getInventory(String item) {
	        return "Remote Warehouse: " + inventory.getOrDefault(item, 0) + " units available.";
	    }
	
        
   }



