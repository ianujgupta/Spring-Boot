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
		Supplier supplier2 = new Supplier(2,"sohan");
		Supplier supplier3 = new Supplier(3,"Rohan");
		supplierService.add(supplier1);
		supplierService.add(supplier2);
		supplierService.add(supplier3);
		//System.out.println("******SPrint 1 is working");
		//System.out.println("******Sprint 2 is working");
		Item item1 = new Item(1,"iphone",supplier1);
		Item item2 = new Item(2,"samsung",supplier2);
		Item item3 = new Item(3,"oneplus",supplier3);
		itemService.addItem(item1);
		itemService.addItem(item2);
		itemService.addItem(item3);
		
		int id1 = item1.getId();
		Item itemFetched1 = itemService.findItemById(id1); 
		System.out.println("id is"+itemFetched1.getId()+"name is"+itemFetched1.getName());
	}
}
