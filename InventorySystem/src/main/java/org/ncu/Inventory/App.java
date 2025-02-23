package org.ncu.Inventory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

public class App 
{
	public static void main(String[] args) {
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "remote");

		ApplicationContext context = new AnnotationConfigApplicationContext(InventoryConfig.class);
        

        WarehouseService warehouseService = context.getBean(WarehouseService.class);

        // Check inventory
        System.out.println(warehouseService.getInventory("Laptop"));
        System.out.println(warehouseService.getInventory("Phone"));

        ((AnnotationConfigApplicationContext) context).close();
    }
}
