package com.dxctraining.hotelmgt.services;

import com.dxctraining.hotelmgt.entities.Guest;

public interface IGuestService {
	
	public Guest addGuest(Guest guest);

	public void removeGuest(String id);

	public Guest updateGuest(Guest guest);

	public Guest findGuestById(String id);

	public Guest findGuestByName(String name);
}
