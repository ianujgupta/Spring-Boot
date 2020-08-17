package com.dxctraining.inventorymgt.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.services.IItemService;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.services.ISupplierService;
@Component
public class ItemUi {
	
	@Autowired
	private IItemService itemService;
	@Autowired
	private ISupplierService supplierService;

	@PostConstruct
	void runApp() {
		
		Supplier supplier1 = new Supplier(1,"mohan");
		supplierService.add(supplier1);
		System.out.println("******SPrnt 1 is running");
		Item item1 = new Item(1,"iphone",supplier1);
		itemService.addItem(item1);
		
		int id1 = item1.getId();
		Item itemFetched1 = itemService.findItemById(id1); 
		System.out.println("id is"+itemFetched1.getId()+"name is"+itemFetched1.getName());
	}
}
