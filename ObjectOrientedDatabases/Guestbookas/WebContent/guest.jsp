<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,guest.Guest,guest.Hotel"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>JPA Guest Book Web Application Tutorial</title>
</head>

<body>

	<h3>Actions with Guests</h3>

	<form method="POST" action="guest">
		<input type="hidden" name="Add"> Name: <input type="text"
			name="name" />
		<select name="Option">	
			<option value="Regular">Regular</option>
			<option value="VIP">VIP</option>
		</select>
		<input type="submit" value="Add" />
	</form>

	<form method="POST" action="guest">
		<input type="hidden" name="Delete"> Delete by Name: <input
			type="text" name="name" /> <input type="submit" value="Delete" />
	</form>

	<form method="POST" action="guest">
		<input type="hidden" name="Update"> Id to update: <input
			type="text" name="id" /> Update name for id: <input type="text"
			name="name" /> <input type="submit" value="newName" />
	</form>

	<hr>
	<h3>Actions with Hotels</h3>

	<form method="POST" action="hotels">
		<input type="hidden" name="Add"> Name: <input type="text"
			name="name" /> <input type="submit" value="Add" />
	</form>

	<form method="POST" action="hotels">
		<input type="hidden" name="Delete"> Delete by Name: <input
			type="text" name="name" /> <input type="submit" value="Delete" />
	</form>

	<form method="POST" action="hotels">
		<input type="hidden" name="Assign"> Assign hotel id: <input
			type="text" name="hotelId" /> Assign guest id: <input type="text"
			name="guestId" /> <input type="submit" value="Assign" />
	</form>
	<hr>

	<h3>List of Guests</h3>

	<hr>
	<ol>
		<%
            @SuppressWarnings("unchecked") 
            List<Guest> guests = (List<Guest>)request.getAttribute("guests");
            if (guests != null) {
                for (Guest guest : guests) { %>
		<li><%= guest.toString() %></li>
		<%
                }
            } %>
	</ol>
	<hr>

	<h3>List of Hotels</h3>

	<hr>
	<ol>
		<%
            @SuppressWarnings("unchecked") 
            List<Hotel> hotels = (List<Hotel>)request.getAttribute("hotels");
            if (hotels != null) {
                for (Hotel hotel : hotels) { %>
		<li><%= hotel.toString() %>
			<ul>
				<% 
                    		Set<Guest> hotelGuests = hotel.getGuests();
                    		if (hotelGuests != null) { 
                    			for (Guest hotelGuest : hotelGuests) {
                    				%>
				<li><%= hotelGuest.toString() %></li>
				<%
                    			}
                    		}
                    	%>
			</ul></li>
		<%
                }
            } %>
	</ol>
	<hr>
	<h3>Search by default address(object) count</h3>
	<hr>
		<p> <%= request.getAttribute("count") %></p>	
	<hr>

	<iframe src="http://www.objectdb.com/pw.html?jee-eclipse"
		frameborder="0" scrolling="no" width="100%" height="30"> </iframe>
</body>
</html>