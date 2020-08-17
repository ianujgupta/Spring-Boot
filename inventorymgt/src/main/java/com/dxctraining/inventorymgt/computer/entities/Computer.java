package com.dxctraining.inventorymgt.computer.entities;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public class Computer extends Item {

	public int getDiskSize() {
		return diskSize;
	}

	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}

	private int diskSize;

	public Computer(int id, String name, Supplier supplier,int diskSize) {
		super(id, name, supplier);
		this.diskSize=diskSize;		
	}
}
