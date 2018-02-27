
** Brian Chase's Individual Project **

# This project is for the Spring 2018 Enterprise Java Course.

## Problem Statement

Although there are other sites where you can enter information regarding your bike rides I don't think there is a site where you can easily enter information about both your bikes and your bike rides.  Most of the sites/apps I have used focus on the statistical part of the bike ride (miles ridden, calories burned, etc.) but do not allow for a more personal experience such as adding information about the users bike(s) and pictures.  myBikePlace is an attempt to solve this problem.

## Project Technologies/Techniques

* Security/Authentication
	* Tomcat's JDBC Realm Authentication
	* Admin role: create/read/update/delete (crud) of all data
	* User role: enter information about bike(s), enter information about bike rides(s), edit data they have entered previously
	
* Database
	* MySQL
	* Stores user information
	* Stores all data for bikes and bike rides

* ORM Framework
	* Hibernate 5

* Dependency Management
	* Maven

* CSS
	* Materialize

* Data Validation
	* Explore Hibernate's validation??

* Logging
	* Configurable logging using Log4J2. In production, only errors will normally be logged, but logging at a debug level can be turned on to facilitate trouble-shooting.

* Hosting
	* AWS

* Independent Research Topics
	* Materialize
	* Google Maps API??
	* Hibernate Validation??

* Project Lombok to eliminate boilerplate code like getters/setters/equals??

* Unit Testing
	* JUnit tests to achieve 80%+ code coverage
	
* IDE: IntelliJ IDEA

## Design
* [Screen Design](myBikePlaceScreens.pdf "myBikePlaceScreens.pdf")
* [Application Flow](applicationFlow.md "Application Flow")
* [Database Design](myBikePlace.pdf "Database Design")


## [Project Plan](projectPlan.md "Project Plan")

## [Time Log](timeLog.md)