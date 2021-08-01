# MICROSERVICES ARCHITECTURE:

## Microservices Architecture:
  * Microservices is an architectural style in which application is structured as a group of individual loosely coupled services.
  * Microservices interact with each other using very light-weight protocol.
  * They are deployed separately.
  * Advantages:
    * Scaling is easier.
    * Easy deployment.
    * Technology usage. (Independent technologies can be used for each service). 
    * Faster to develop, and understand.
    * Loosely coupled.
  * Disadvantages:
    * Interprocess communication.
    * Distributed transactions.
    * More resources.
    * Debugging issues.
  
## Monolithic Architecture:
  * One application which has every services packed in it.
  * Advantages:
    * Simple to deploy.
    * Simple to develop.
    * Simple to scale.
  * Disadvantages:
    * Technology dependency. (One technology for all services).
    * Engineering focus.
    * Scaling data layer.
    * Overloaded VM/containers.
    * CI/CD tests (Build and conflicts).
    * Understanding.

<hr/>

## Functional Decomposition:
  * A technique where we break down the existing system into smaller different modular services.
  * We decompose the whole application based on the functional areas.

<hr/>

## Scale Cube:
  * x-direction: Horizontal Scaling (Adding more instances of similar services).
  * y-direction: Functional decomposition (Keep decomposing the service to certain degree).
  * z-direction: Data partitioning (Processing part of the data by a service instance).

<hr/>

## API Gateway:
  * There are three patterns to access data from Microservices:
     1. Direct Call: Client makes direct API calls to all of the microservices and gets the information needed to render the page.
         * Problems:
           * Too many request , Complex JS/Android code to handle
           * Protocol difference of micro services
           * Tigthly coupled client and services
           * Performance issues
           * Scalability issues
     3. API Gateway
     4. BFF 
  * An API Gateway is a server that is the single entry point into the system.
  * The API Gateway is responsible for request routing, composition, and protocol translation. 
  * All requests from clients first go through the API Gateway. 
  * It then routes requests to the appropriate microservice. 
  * The API Gateway will often handle a request by invoking multiple microservices and aggregating the results. 
  * It can translate between web protocols such as HTTP and WebSocket and web‑unfriendly protocols that are used internally.
  * Advantages:
    * Authentication
    * SSL Termination
    * Load Balancer
    * Insulation
  * Disadvantages:
    * Increased hops
    * Complicated system
    * 
  * API Gateway also helps to implement:
    * Caching
    * Managing access quotas
    * API health monitoring
    * API Versioning
    * Chaos Monkey Testing
    * A/B Testing
  * ### BFF (Backend for frontend):
     * BFF is essentially a variant of the API Gateway pattern. 
     * It also provides an additional layer between microservices and clients. 
     * But rather than a single point of entry, it introduces multiple gateways for each client.
     * The BFF is tightly focused on a single UI, and just that UI. That allows it to be focused, and will therefore be smaller.
       ![image](https://user-images.githubusercontent.com/55986045/127783144-ddb70d9d-870c-46a0-9a3f-ae1b0654659c.png)


<hr/>

## Service Registry/Discovery:
  * It is a pattern to identify the network addresses of all of the instances of microservices.
  * We use service register for this purpose.
    * Service register is more like a separate system/or a database which contains the list of all of the instances of every microservices and its network addresses.
  * Ways in which service registry can happen:
    1. Self Registry: (The microservices automatically registers themselves to the register).
    2. Third party Registry: (The registry will ask microservices about their address and updates).
  * In discovery we access all of the informations in the registry.

<hr/>

## Inter microservices communication:
  * In a monolithic application, components invoke one another via language‑level method or function calls. 
  * In contrast, a microservices‑based application is a distributed system running on multiple machines. 
  * Each service instance is typically a process. 
  * Consequently, microservices must interact using an inter‑process communication (IPC) mechanism.
  * #### Synchronous inter microservice communication:
    * A synchronous microservice is one in which data moves to and from an endpoint of a service in a blocking interaction.
    * A typical example of a synchronous data exchange is an HTTP request/response interaction.
      ![image](https://user-images.githubusercontent.com/55986045/127782429-148ad5ae-792a-4c34-bca2-98dcad59ac3f.png)

    * Advantages:
      * Easy to implement
      * Easy to handle different use cases
      * Realtime
    * Disadvantages:  
      * Service Availability
      * Response Time
  * #### Asynchronous inter microservice communication:
    * An asynchronous microservice is one in which a request to a service and the subsequent response occur independently from each other.
    * The general practice is to use a message broker technology, such as Kafka or RabbitMQ, to act as a go-between for services.
      ![image](https://user-images.githubusercontent.com/55986045/127782447-3a44e53c-1adf-4d15-9e1e-44f926550dc8.png)

    * Advantages:
      * Faster APIs
      * Decoupled Services
      * Works even when services are down
    * Disadvantages:
      * Complex design
      * Process latency
      * Monitoring costs 

<hr/>

## Circuit Breaking:
  * A design pattern which is used when there are services that are interacting with other services.
  * To protect our microservices from an excess of requests, it’s better to interrupt communication between the front-end and the back-end as soon as a recurring fault has been detected in the back-end.
  * Pattern:
    * If a call from one microservice to other microservices fails, increment the number of failed calls by one.
    * If the number of failed calls goes above a certain threshold, open the circuit.
    * If the circuit is open, return with an error or a default response or cached response.
    * If the circuit is open and some wait timeout has passed, half-open the circuit..
    * If the circuit is half-open and the next call fails, open it again.
    * If the circuit is half-open and the next call succeeds, close it.
  * Closed state:
    * This state implies that the service is up and running(properly). 
    * Then if the number of error responses from the needed service passes a threshold limit, the circuit breaker will be tripped (ie: goes to the open stage).
  * Open state:
    * In the open state, the circuit breaker will trigger the fallback method. 
    * A fallback method will handle the case if the needed service is down.
    * After a considerable time, the circuit breaker will go to half-open state.
  * Half open state:
    * The circuit breaker makes a remote call to the service. 
    * If the request fails, the circuit breaker will go to the open stage. 
    * If the service gives the proper response, the circuit breaker will go to the closed stage.
    * This state takes place after spending some time in the closed stage. 
    
    ![image](https://user-images.githubusercontent.com/55986045/127782969-736548da-a319-4d6d-9846-3ef31503b7e6.png)

  * Features:
    * Cached response
    * Fallback mechanism
    * Recover 

<hr/>

## Service Mesh:
  * Problems faced in inter microservices communication:
    * Load Balance
    * Service discovery 
    * Metrics
    * Retries
    * Circuit Breaking
    * Timeout
  * Service mesh: A component which runs along with every microservice deployment and helps to do all of the above problems.
  * It is a sidecar pattern.
     * For every microservice instance, there will be an instance of service mess which is running in that container. 
  * It also implements proxy design pattern.
  * In service mesh, there are two major components:
     1. Control Plane
        * The centralized hub or a single hub which acts like a control panel from which we can configure configurations for all of the proxies which are side loaded whith every microservice running in every instance.
     2. Data Plane
        * It is comprised of proxies and all of the requests goes through these proxies.

<hr/>

## Deployment Strategies:
  * Deployment goals:
     1. Scalability and throughput
     2. Reliable and available
     3. Isolation
     4. Resource limit
     5. Monitor
     6. Cost effective
   * Patterns:
     1. Multiple Servers Per Host:
        * Advantages:
          * Efficient resource utilization
          * Fast deployment
        * Disadvantages:
          * Poor isolation
          * No resource limit
          * Dependency conflict 
     2. Service per VM/container:
        * Advantages:
          * Isolation and secure
          * Manageable
          * Fast(containers only)
          * Autoscaling
        * Disadvantages:
          * Slow (VM only)
          * Not efficient (VM only)
          * Not so secure (containers)
