package guest;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

@Stateless
public class HotelDao {

	// Injected database connection:
		@PersistenceContext
		private EntityManager em;

		// Stores a new hotel:
		public void persist(Hotel hotel) {
			em.persist(hotel);
		}

		// Retrieves all the guests:
		public List<Hotel> getAllHotels() {
			TypedQuery<Hotel> query = em.createQuery(
					"SELECT h FROM Hotel h ORDER BY h.id", Hotel.class);
			return query.getResultList();
		}

		public void deleteByName(String name) {
			Query query = em
					.createQuery("DELETE FROM Hotel g WHERE g.name = :name");
			query.setParameter("name", name).executeUpdate();
		}
		
		public void assignGuestToHotel(String guestId, String hotelId) {
			Guest guest = em.find(Guest.class, Long.valueOf(guestId));
			Hotel hotel = em.find(Hotel.class, Long.valueOf(hotelId));
			if (guest != null && hotel != null) {
				hotel.addGuest(guest);
				guest.addHotel(hotel);
			} else {
				System.out.println("Guest or hotel not found.");
			}
		}
}
