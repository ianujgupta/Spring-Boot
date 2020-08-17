package com.dxctraining.hotelmgt.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dxctraining.hotelmgt.dao.IGuestDaoImpl;
import com.dxctraining.hotelmgt.entities.Guest;
import com.dxctraining.hotelmgt.exceptions.InvalidArgumentException;

@Transactional
@Service

public class GuestService implements IGuestService {

	@Autowired
	private IGuestDaoImpl dao;

	@Override
	public Guest addGuest(Guest guest) {
		validate(guest);
		guest = dao.addGuest(guest);
		return guest;
	}

	@Override
	public Guest updateGuest(Guest guest) {
		validate(guest);
		guest = dao.UpdateGuest(guest);
		return guest;
	}

	@Override
	public void removeGuest(String id) {
		dao.removeGuest(id);
	}

	@Override
	public Guest findGuestByName(String name) {
		Guest guest = dao.findGuestByName(name);
		return guest;
	}

	@Override
	public Guest findGuestById(String id) {
		validateId(id);
		Guest guest = dao.findGuestById(id);
		return guest;
	}

	private void validateId(String id) {
		if (id == null || id.isEmpty()) {
			throw new NullPointerException("id cant be empty and null");
		}
	}

	public void validate(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("argument is null");
		}
	}

}
