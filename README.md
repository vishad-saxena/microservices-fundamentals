# microservices-fundamentals
POCs creation on microservices architecture

**Description:**
this project is for beginners in microservices consists of a small POC on User-Service getting data about user and internally calling contact-service to gather contact information and finally providing a single response in the end.
Database calls are made using sql server on local.

**Technologies used:**
Java, sql, microservices architecture.

**#soon will be adding diagram**

in this diagram requests is made to api-gateway(port-8999) for user data along with contact information. Internally user-service call contact-service for contact information for the requested user and respond to client with the gathered data.

All of this is maintained in the eureka-server (e-server, port: 8761) service registry. which can be monitored on the link "http://localhost:8761"
