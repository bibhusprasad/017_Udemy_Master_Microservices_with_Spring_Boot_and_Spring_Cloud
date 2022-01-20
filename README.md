# 017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud

Section 3: Restful Web Services with Spring boot
	
	scenario: Basic Curd Operations
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/eb9809487afcbbb3a0155eeb464e19f8b11a388b
	
	scenario: Validation Implemented
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/de4240a78dad2f3288a060f14135d25ae967036a

	scenario: HATEOAS Implemented
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/da9b0f96359aa0cba6c93952bb9b73dbeb84ed29
	
	scenario: Internationalization(i18) Implemented
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/32243f7e76a1ff1893a622b12ff6528811237ffb
	
	scenario: Content Negotiation (xml support)
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/e9d044a3f11ab95098296e588687750a3b841f21
	
	scenario: Swagger Implementation
	http://localhost:8080/swagger-ui/index.html
	http://localhost:8080/v3/api-docs
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/168ded511dcaaee02bd668f0357af844fcb0692f
	
	scenario: Actuator Implementation
	http://localhost:8080/actuator
	management.endpoints.web.exposure.include=*
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/d4c681203633f3520680cbdf9c3f4c2671b486f8
	
	scenario: Visualizing API with HAL Explore
	http://localhost:8080/
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/15e5c29254c3fceaa7960df546410f45fbf67ccf
	
	scenario: Filtering Implementation
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/93a10db21e3fc83302d01062e2a239729e213fa5
	
	scenario: Versioning Implementation
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/c2e7bef315659d6cd53e9dbdba09045d712c2568
	
Section 5: Microservices with Spring cloud version 1
Use case: simple limits-service to read data from properties file
limits-service

	scenario: simple limit service to read data from properties file
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/7ad41139e5ee50ba9fb7ca8085cc03848fc98dd2
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/c762cfedb75aa753bf4b2a3ba38452808ae8ede4 (package name changed ws->ms)
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/486635df0aa86d9826640c0e1e1507a69382f03d (package name changed ws->ms)
	
Use case: Spring cloud config server
spring-cloud-config-server

	scenario: set up local git repository
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/5cb10cc70d36e46581345e6fb15bb3f1d72483fa
	
	scenario: connect limits-service to spring-cloud-config-server
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/7dbaa180e8d057855ff6f9ef3a9aef99b48c6ceb
	
	scenario: configure profiles for limits-service
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/2bfdcf48fe5645273912db400e8efb5b220d1416
	
Use case: Introduction to currency conversion and currency exchange service
currency-exchange-service

	scenario: initial currency-exchange-service setup
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/9820d7b21fdc57c2973789aea260f61f586e07c1
	
	scenario: Implementation of jpa and h2 database
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/052ccde26cb60b82e8b43196dd31ab8e46ae6ea0
	
currency-conversion-service

	scenario: initial currency-conversion-service setup
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/11509cc33d112c6abda1292e066785f99c24db05
	
	scenario: invoking currency-exchange-service from currency-conversion-service
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/2eb1b8fe9f6b2990568c7fb74f90dac6a2faca3f
	
Use case: Feign Rest Client	as service invocation (to replace RestTemplate)

	scenario: Implementation of Feign Rest Client as service invocation
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/072221848f13f282ef5737eaa8024b1eca697188
	
Use case: Client-side load balancing with Ribbon
	
	scenario: setting up client-side load balancing with Ribbon
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/22c3b8010fee403f980e5e7afaba3c5317325fc0
	
Use case: Understanding need of naming server	
netflix-eureka-naming-server

	scenario: setting of Eureka Naming Server
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/4cf64c89224860518d0ae7601c49e803bcfe33ed
	
	scenario: connect currency-conversion-service to Eureka
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/c61fb7242aaf385cac02a3cfa8a57e694f3e4c3b
	
	scenario: connect currency-exchange-service to Eureka
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/5e85d8bee9af18c7c95d6389ef0d755f88289264
	
	scenario: COURSE UPDATE : Exclude dependency on jackson-dataformat-xml (extra)
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/e27f05a01f29c3648b3996eb0ff49859a88251e4
	
	scenario: Distributing calls using Eureka and Ribbon
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/259d3f05df4f9283400625e0a9846b536de3f904

Use case: API Gateway
netflix-zuul-api-gateway-server

	scenario: setting up Zuul API gateway
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/fd80117d2e01c3a312a452709c7b76cb7cb2f8cc
	
	scenario: Implementing zuul logging filter
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/9f40eedd93718dfe7f4ab21054f3e87d8825f22d
	
	scenario: Setting up Zuul API gateway between microservices
	commit: 