package com.dxctraining.hotelmgt.dao;

import com.dxctraining.hotelmgt.entities.*;

public interface IGuestDaoImpl {

	public Guest addGuest(Guest guest);

	public void removeGuest(String id);

	public Guest UpdateGuest(Guest guest);

	public Guest findGuestById(String id);

	public Guest findGuestByName(String name);
}
