package com.dxctraining.inventorymgt.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.computer.services.IComputerService;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.services.IItemService;
import com.dxctraining.inventorymgt.phone.entities.Phone;
import com.dxctraining.inventorymgt.phone.services.IPhoneService;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.services.ISupplierService;
@Component
public class ItemUi {

	@Autowired
	private IComputerService computerService;
	
	@Autowired
	private IPhoneService phoneService;
	
	@Autowired
	private IItemService itemService;
	
	@Autowired
	private ISupplierService supplierService;

	@PostConstruct
	void runApp() {
		
		System.out.println("******SPrint 1 is working");

		Supplier supplier1 = new Supplier(1,"mohan");
		Supplier supplier2 = new Supplier(2,"sohan");
		Supplier supplier3 = new Supplier(3,"Rohan");
		supplierService.add(supplier1);
		supplierService.add(supplier2);
		supplierService.add(supplier3);
		
		System.out.println("******Sprint 2 is working");
		
		Item item1 = new Item(11,"iphone",supplier1);
		Item item2 = new Item(22,"samsung",supplier2);
		Item item3 = new Item(33,"oneplus",supplier3);
		itemService.addItem(item1);
		itemService.addItem(item2);
		itemService.addItem(item3);
		
		System.out.println("******Sprint 3 is working");

		
		Phone ph1 = new Phone(101,"AAA",supplier1,64);
		phoneService.add(ph1);
		Phone ph2 = new Phone(202,"BBB",supplier2,128);
		phoneService.add(ph2);
		
		System.out.println("******Sprint 4 is working");
		
		Computer computer1 = new Computer(1011,"HP",supplier3,111); 
		computerService.addComputer(computer1);
		Computer computer2 = new Computer(1012,"LG",supplier2,222); 
		computerService.addComputer(computer2);
			
		int id1 = item1.getId();
		Item itemFetched1 = itemService.findItemById(id1); 
		System.out.println("id is"+itemFetched1.getId()+"name is"+itemFetched1.getName());
	}
}
