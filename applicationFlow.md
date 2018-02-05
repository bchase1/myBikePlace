# Application Flow

## User Sign Up
	1. User chooses sign up on the menu (available on all pages, unless the user is signed in already)
	2. User fills out the sign up form and submits
	3. Request goes to sign up servlet
	4. Servlet creates a user object and then creates user in the database
	5. Response to user confirming addition (show a message on the jsp)

## User Sign In
	1. User chooses sign in on the menu (available on all pages, unless the user is signed in already)
	2. User enters username and password on form and submits
	3. If user is authenticated, the server will handle allowing access to edit pages. JDBCRealm used for authentication (users table)
	4. If authentication fails, show error message/page

## View Bike Information
	1. Page sends a request to view bike information servlet along with criteria (year of make, bike make, bike name, etc)
	2. Servlet uses the bikeinformation dao to select bike information according to criteria
	3. Dao performs select and creates bike information objects from results
	4. Dao returns list of bike information matching criteria to servlet
	5. Servlet sends list back to bike information jsp
	6. bike information jsp displays the reports
	7. Consider paging results so page does not get super long and too much data is sent

## View Bike Ride Information
	1. Page sends a request to view bike information servlet along with criteria (year of make, bike make, bike name, etc)
	2. Servlet uses the bikeinformation dao to select bike information according to criteria
	3. Dao performs select and creates bike information objects from results
	4. Dao returns list of bike information matching criteria to servlet
	5. Servlet sends list back to bike information jsp
	6. bike information jsp displays the reports
	7. Consider paging results so page does not get super long and too much data is sent

## About
	1. Static page - html only?
	2. Consider making contact info configurable
	
## Add Bike Information
	1. Option only available to logged in users with proper role
	2. User enters bike information
	3. Details are sent to Add Bike Information servlet
	4. Servlet creates bike information object
	5. Servlet sends object to dao
	6. Dao adds bike information to the database
	7. Servlet sends confirmation to bike information page that bike information has been added
	
## ADD Bike Ride Information
	1. Option only available to logged in users with proper role
	2. User enters bike ride information
	3. Details are sent to Add Bike Ride Information servlet
	4. Servlet creates bike ride information object
	5. Servlet sends object to dao
	6. Dao adds bike ride information to the database
	7. Servlet sends confirmation to bike ride information page that bike information has been added
	