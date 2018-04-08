# Application Flow

## User Sign Up
	1. User chooses sign up on the menu 
	2. User fills out the sign up form and submits (user will create a user id which he/she will need to view bikes, bike rides, and user information)
	3. Request goes to sign up servlet
	4. Servlet creates a user object and then creates user in the database
	5. Response to user confirming addition (show a message on the jsp)

## User Sign In
	1. User chooses sign in on the menu (available on all pages, unless the user is signed in already)
	2. User enters username and password on form and submits
	3. If user is authenticated, the server will handle allowing access to edit pages. JDBCRealm used for authentication (users, users_roles, and roles table)
	4. If authentication fails, show error message/page

## View Bike Information
	1. Page sends a request to view bike information servlet along with user id
	2. Servlet uses the GenericDao to select bike information according to user id
	3. Dao performs select and creates bike information objects from results
	4. Dao returns list of bike information matching user id to servlet
	5. Servlet sends list back to bikes jsp
	6. bikes jsp displays the bike information

## View Bike Ride Information
	1. Page sends a request to view bike ride information servlet along with user id
	2. Servlet uses the GenericDao to select bike ride information according to user id
	3. Dao performs select and creates bike ride information objects from results
	4. Dao returns list of bike ride information matching user id to servlet
	5. Servlet sends list back to bikeRides jsp
	6. bikeRides jsp displays the bike ride information

## About Me
	1. Page where a user can get their user information
		
## Add Bike Information
	1. Option only available to logged in users with proper role
	2. User enters bike information
	3. Details are sent to Add Bike Information servlet
	4. Servlet creates bike information object
	5. Servlet sends object to dao
	6. Dao adds bike information to the database
	7. Servlet sends confirmation to bike information page that bike information has been added
	
## Add Bike Ride Information
	1. Option only available to logged in users with proper role
	2. User enters bike ride information
	3. Details are sent to Add Bike Ride Information servlet
	4. Servlet creates bike ride information object
	5. Servlet sends object to dao
	6. Dao adds bike ride information to the database
	7. Servlet sends confirmation to bike ride information page that bike information has been added
	