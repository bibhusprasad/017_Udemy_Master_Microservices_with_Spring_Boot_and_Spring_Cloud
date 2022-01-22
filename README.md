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
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/094c567751109cea464344f39f0a655eece5064b
	
Use case: Introduction to Distributed Tracing

	scenario: Implementing Spring Cloud Sleuth
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/03a2d5955d074429a09a862b36c3ef22a1cebd05
	
	scenario: connecting microservices to zipkin
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/4695e71a18a0bd98666ff8428361208c156931ed
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/acb5d975bba1064ca83e1396f9f1c47ebd2157b9
	
Use case: Implementing spring cloud bus
limits-service
spring-cloud-config-server

	scenario: Implementing Spring Cloud Bus
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/91ab04eb3352b66f95b7be86759fca504b9542d8
	
	scenario: Fault Tolerance with Hystrix
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/ba163fa4b2f95c21dc1a05b177bad231f1943d53
	
Section 6: Microservices with Spring cloud version 2
Use case: simple limits-service to read data from properties file
limits-service-V2

	Use case: simple limits-service to read data from properties file v2
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/d8c6fc7017d321550feea8378a4403072fb270d8
	
Use case: Spring cloud config server V2
spring-cloud-config-server-v2	
	
	scenario: set up local git repository
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/991bce8fccd70534ff8508bf4422e9eac0d8906d
	
	scenario: configure profiles for limits-service
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/98030504b380d3f5fff7ff3a6bb5ac3f03eecbde
	
Use case: Introduction to currency conversion and currency exchange service
currency-exchange-service-v2

	scenario: Implementing currency-exchange-service-v2 with jpa and h2 database
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/2ba3da6ecd6ad22e3a6ad0b05fc971a930dd83e2
	
currency-conversion-service-v2

	scenario: Initializing and invoking currency-exchange-service from currency-conversion-service
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/49c4976dbff939ce38b0a46cea9bee31d9809e4b
	
Use case: Feign Rest Client	as service invocation (to replace RestTemplate)
	
	scenario: Feign Rest Client	as service invocation
	commit: https://github.com/bibhusprasad/017_Udemy_Master_Microservices_with_Spring_Boot_and_Spring_Cloud/commit/ca40a2fc7f4f7f1dd6709b3b383affed445d239e
	
Use case: Understanding need of naming server	
netflix-eureka-naming-server-v2
	
	scenario: setting of Eureka Naming Server
	commit: 