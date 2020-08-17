package com.dxctraining.inventorymgt.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.services.IItemService;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public class ItemUi {
	
	@Autowired
	private IItemService itemService;

	@PostConstruct
	void runApp() {
		
		Supplier supplier1 = new Supplier(1,"mohan");
		Item item1 = new Item(1,"iphone",supplier1);
		itemService.addItem(item1);
		
		int id1 = item1.getId();
		Item itemFetched1 = itemService.findItemById(id1); 
		System.out.println("id is"+itemFetched1.getId()+"name is"+itemFetched1.getName());
	}
}
