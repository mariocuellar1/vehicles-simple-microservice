# README

## Spring Boot Simple Vehicle Microservice

Microservices is a specialization of an implementation approach for service-oriented architectures (SOA) used to build flexible, independently deployable software systems. Services in a microservice architecture (MSA) are processes that communicate with each other over a network in order to fulfill a goal.

This project is a simple but functional example of Microservice using Spring Boot with simple HTTP Basic Authentication. This project is mainly use to test [Eureka Server](https://github.com/mariocuellar1/eureka-server).

### How to install
It's an eclipse project, just import it and run. If you want to run more than one instance please use Spring profiles **instance1** and **instance2**.

### Parameters & Configuration
* **application.yml**
  * **security.user.name**: Basic security: username. 
  * **security.user.password**: Basic security: password. 
  * **security.user.role**: Basic security: roles. 
  * **eureka.client.serviceUrl.defaultZone** : Eureka server URI(s)
  * **server.port** : Server Port

### How to test

Before you run this server you need to configure and init Eureka Server (or cluster) please make a look to [Eureka Server](https://github.com/mariocuellar1/eureka-server). 
This Microservice tries to register itself in Eureka Server, if Eureka server is down throws "java.net.ConnectException: Connection refused: connect" error, but Microservice works.

1. Configure application (application.yml above)
2. Start Microservice [rigth-clic, run  :) ]
3. Import postman project *VehicleMicroserviceTest.postman_collection.json* to postman
   * Test "Get all vehicles": List all vehicles
   * Test "Add Vehicles": Add new vehicle
   * Test "Get one vehicle": Retrieve data for one vehicle. You have to change URI to set a valid Vehicle Id.
   
   
And you Done !!!!  

### Notes:
- I use postman to test 'cause it's what I usually do :) , if you want, modify this readme adding other ways, CURL, junit, simple java ó whatever.
- Please feel free to add/modify/correct/update any part of this content as necessary

### Related Projects
- [Eureka Server](https://github.com/mariocuellar1/eureka-server)
- [Customers Microservice](https://github.com/mariocuellar1/customers-simple-microservice)

### Other Projects:
- [oAuth Server using oauth and opaque token](https://github.com/mariocuellar1/oauth-server-opaque)
- [Basic Resource Server using oauth and opaque token](https://github.com/mariocuellar1/basic-resource-server-opaque)
- [oAuth Server using JWT Token](https://github.com/mariocuellar1/oauth-server-jwt)
- [Basic Resource Server validating JWT Token](https://github.com/mariocuellar1/basic-resource-server-jwt)
