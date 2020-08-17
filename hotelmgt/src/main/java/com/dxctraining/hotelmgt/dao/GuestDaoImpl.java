package com.dxctraining.hotelmgt.dao;

import com.dxctraining.hotelmgt.entities.*;
import com.dxctraining.hotelmgt.exceptions.GuestNotFoundException;
import com.dxctraining.hotelmgt.exceptions.InvalidArgumentException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class GuestDaoImpl implements IGuestDaoImpl {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Guest addGuest(Guest guest) {
		entityManager.persist(guest);
		return guest;

	}

	@Override
	public Guest findGuestById(String id) {
		Guest guest = entityManager.find(Guest.class, id);
		if (guest == null) {
			throw new GuestNotFoundException("Guest Not Found Exception for id = " + id);
		}
		return guest;
	}

	@Override
	public void removeGuest(String id) {
		Guest guest = findGuestById(id);
		entityManager.remove(guest);

	}

	public void checkGuestId(Guest guest) {
		String id = guest.getId();
		if (id == null) {
			throw new InvalidArgumentException("Guest id can't be null" + id);
		}
	}

	@Override
	public Guest UpdateGuest(Guest guest) {
		guest = entityManager.merge(guest);
		return guest;
	}

	@Override
	public Guest findGuestByName(String name) {
		String jpaql = "from Guest where name = :guest";
		Query query = entityManager.createQuery(jpaql);
		query.setParameter("guest", name);
		List<Guest> list = query.getResultList();
		Guest guest = null;
		if (!list.isEmpty()) {
			guest = list.get(0);
		}
		return guest;
	}

}
