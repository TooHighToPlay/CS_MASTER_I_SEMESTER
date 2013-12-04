package guest;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.weld.context.ejb.Ejb;

import com.objectdb.jpa.criteria.Expressions.h;

/**
 * Servlet implementation class HotelServlet
 */
@WebServlet(name = "HotelServlet", urlPatterns = { "/hotels" })
public class HotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	HotelDao hotelDao;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("/Guestbookas/");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Handle a new guest:
		String name = request.getParameter("name");
		if (request.getParameter("Add") != null) {
			if (name != null) {
				hotelDao.persist(new Hotel(name));
			}
		} else if (request.getParameter("Delete") != null) {
			if (name != null)
				hotelDao.deleteByName(name);

		} else if (request.getParameter("Assign") != null) {
			String guestId = request.getParameter("guestId");
			String hotelId = request.getParameter("hotelId");
			if (guestId != null && hotelId != null) {
				hotelDao.assignGuestToHotel(guestId, hotelId);
			}
		}

		// Display the list of guests:
		doGet(request, response);
	}

}
