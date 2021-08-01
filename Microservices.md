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

<hr/>

## Service Registry:
