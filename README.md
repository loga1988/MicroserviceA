Service Discovery, Service Registry and Load Balancer Service Discovery is a mechanism which registers the service information in the service registry when the server is booting Service Registry -- information about a microservice like its Ip and port number Example : Lets say microservice A wants to talk to microservice B then first step it goes to the load balancer and load balancer reaches service discovery which in turn looks at service registry to get the ip and port details of microservice B once obtained the data from servuce discovery the load balancer decides where to route the request Client-Side Service Discovery Example: Netflix Eureka, Zookeeper, Consul -- querying service registry to find the microservices Server-Side Service Discovery : Amazon ELB -- find the microservices availability from service registry through router or load balancer

Service Discovery -- Service Provider + Service Registry + Service Consumer

Circuit Breaker : When a request fails to the service again and again then circuit breaker opens and halts all the requests to the service Closed State, Open State, Half-open state

API Gateway -- 

client interacts with API gateway and the gateway routes the requests to different microservices based on the url, http method
Handles the transaction between microservices and also the routing 

design patterns of microservice 

1) Service Discovery pattern
2) API gateway pattern
3) Database per service pattern
4) circuit breaker pattern
5) Saga Pattern
6) Proxy pattern

API gateway pattern 
Commercial -- AWS API gateway, Azure API management
Open source -- Zuul gateway 
custom -- Spring cloud gateway

proxy pattern -- setting up a service that acts as an intermediary between clients and backend services

Okta -- Okta is a cloud-based identity and access management service. It provides features for secure authentication and authorization,

