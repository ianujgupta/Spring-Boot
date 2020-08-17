package com.dxctraining.inventorymgt.supplier.entities;

public class Supplier {

	private int id;
	private String name;
	
	Supplier(int id,String name){
		this.id=id;
		this.name=name;
	}


	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		
		Supplier other = (Supplier) obj;
		if (id != other.id)
			return false;
		return true;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}