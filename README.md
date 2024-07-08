## Overview

Film recommendation microservice by genre, where we have a microservice responsible for providing all the films and another microservice 
for consuming the films and filtering them by genre.

Microservices developed with <strong>Spring Cloud load balance</strong>.

## Execution

Tools:
<li> Java 17 </li>
<li> SpringBoot 3.2.0 </li>
<li> Spring Cloud Netflix (Eureka) </li>
<li> Spring Cloud OpenFeign </li>
<li> Spring Boot Actuator </li>
<li> Docker </li>
<li> MySQL </li>
<li> FlyWay </li>
<br>
<strong>Back-end: </strong>
Import the project into an IDE of your choice, the IDE used in the development was the Netbeans IDE, 
so just build the application to download the dependencies that are managed by Maven,
but first, Docker must be installed and the container images encoded in the <code>docker-compose.yml</code> file initialized, 
with the <code>docker-compose up -d</code> command, and when the application is running, just access the link <code>http://localhost:8761/</code> to access Eureka Client.


## Demo

https://github.com/MiguelCastro9/Microsservice-movie-recommendations/assets/56695817/14d8e27d-9e00-4d1f-b57d-adf3217ba05c



