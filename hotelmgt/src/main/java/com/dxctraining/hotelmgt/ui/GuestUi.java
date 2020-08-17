package com.dxctraining.hotelmgt.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.hotelmgt.entities.Guest;
import com.dxctraining.hotelmgt.exceptions.GuestNotFoundException;
import com.dxctraining.hotelmgt.exceptions.InvalidArgumentException;
import com.dxctraining.hotelmgt.services.IGuestService;

@Component
public class GuestUi {

	@Autowired
	private IGuestService guestService;
	
	@PostConstruct
	private void runApp() {
		try {
			Guest guest1 = new Guest("Anuj", "1");
			Guest guest2 = new Guest("Ankit", "2");
			Guest guest3 = new Guest("Ayushi", "3");
			Guest guest4 = new Guest("rahul", "4");
			guestService.addGuest(guest1);
		//	guestService.addGuest(guest2);
			//guestService.addGuest(guest3);
			//guestService.addGuest(guest4);
			//	guestService.removeGuest("3");

			// guestList();
		//	String id1 = guest1.getId();
			//Guest fetched1 = guestService.findGuestById(id1);
			//System.out.println("Name is = " + fetched1.getName() + "id is = " + fetched1.getId());

		//	Guest fetched2 = guestService.findGuestByName("Anuj");
			//System.out.println("fetched by name=" + fetched2.getName() + " " + fetched2.getId());

		} catch (GuestNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
		}
	} /*
		 * private void guestList() { List<Guest> list = guestservice.guestList(); for
		 * (Guest guest : list) { display(guest); } }
		 * 
		 * private void display(Guest guest) { System.out.println("Name is = " +
		 * guest.getName() + "id is = " + guest.getId()); }
		 */
}