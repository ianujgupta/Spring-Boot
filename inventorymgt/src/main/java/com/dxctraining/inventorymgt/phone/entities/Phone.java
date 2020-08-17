package com.dxctraining.inventorymgt.phone.entities;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public class Phone extends Item{
	private  int storageSize;

	public Phone(int id, String name, Supplier supplier,int storageSize) {
		super(id, name, supplier);
		this.storageSize=storageSize;
	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}
	
	

}
