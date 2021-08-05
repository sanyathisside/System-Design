# System Design:

## Introduction: 

### What is system? 
 * A system is a loosely used term for an architecture or collection of software or technology that communicate with each other or interact with each other in order to serve a certain set of users with a certain set of requirements.
 * A system can be defined and built keeping these three factors in mind:
    1. The user of the systems 
    2. The requirements of those users, and 
    3. The components that are chosen in order to build that system to serve those users and their requirements.

### What is design? 
 * Design is a process of understanding the user requirements and selecting the components, modules, and software technologies how they are going to be intertwined and communicating with each other to actually serve the need of the system.
  
 `In order to understand and develop this skill of designing certain kind of systems which serve to larger scale and larger users the process of system design comes into the picture.`

<hr/>

## Components of System Design:
  * Components are the basic building blocks of system components.
  * It could be divided into two parts:
      1. Logical entities:
         * Data
         * Databases
         * Applications
         * Cache
         * Message Queues
         * Infra
         * Communication Protocol
         * Requests (API, RPC, etc.)
      2. Tangible entities:
         * Text, images, videos..
         * MongoDB, MySQL, Cassandra..
         * Java, Golang, Python, React..
         * Redis, MemeCache..
         * Kafka, RabbitMQ..
         * AWS, GCP, Azure..
         * APIs, RPCs, Messages..

<hr/>


## Client Server Architecture:
  * Client-server architecture is a computing model in which the server hosts, delivers and manages most ofthe resources and services to be consumed by the client. 
  * Client: a piece ofsoftware or application that takes the input and sends request to the servers.
  * Server: a piece ofsoftware that receives and processes requestsfrom clients.
  * Load balancer: responsible for distributing incoming network traffic across a group of backend servers to optimize resource usage.
  * #### A typical topological data flow goes as follows:
     1. Client requests data from server
     2. Load balancer routes the request to the appropriate server
     3. Server processes the request client
     4. Server queries appropriate database for some data
     5. Database returns the queried data back to the server
     6. The server processes the data and sends the data back to the client
     7. This process repeats
   * #### Types of Architecture:
     * Thin client:
       * A thin client is designed to be especially small so that the bulk of the data processing occurs on the server.
       * Example: Ecommerce, streaming applications.
     * Thick client:
       * A thick client (fat client) is one that will perform the bulk of the processing in client/server applications. With thick clients, there is no need for continuous server communications as it is mainly communicating archival storage information to the server. 
       * Example: Gaming apps, video editing software.
   * #### Tier based architecture:
     * 1-Tier:
       * It is the simplest one as it is equivalent to running the application on the personal computer. 
     * 2-Tier:
       * It is like Client-Server architecture, where communication takes place between client and server.
     * 3-Tier:
       * The 3-tier architecture has three different layers.
         * Presentation layer
         * Business Logic layer
         * Database layer
     * N-Tier: 
       * An N-Tier Application program is one that is distributed among three or more separate computers in a distributed network. 

<hr/>

## Proxies:
  * Proxy is an intermediary server between client and the internet. 
  * Proxy servers allow to hide, conceal and make your network id anonymous by hiding your IP address.
  * Proxy servers offers the following basic functionalities:
    * Firewall and network data filtering.
    * Network connection sharing
    * Data caching
  * #### Types of proxy: 
    * Forward Proxy
      * In this the client requests its internal network server to forward to the internet. 
    * Reverse Proxy 
      * In this the requests are forwarded to one or more proxy servers and the response from the proxy server is retrieved as if it came directly from the original server. 

<hr/>

## Data and Data Flow:
  * #### Different formats of data (representation):
    * In Business Layer:
      * Texts, Videos, Images, etc. 
    * In Application Layer:
      * JSON/XML
    * In Data Stores:
      * Databases, Tables, Indexes, Cache, Queues, etc.
    * Network Layer:
      * Packets.
    * Hardware Layer:
      * 0s and 1s.   
   * #### Data Generation:
     * Users
     * Internal Data (System populates on their own).
     * Insights 
   * #### Data Flow Methods:
     * APIs.
     * Messages.
     * Events.
   * #### Factors to be considered:
     * Type of data
     * Volume
     * Consumption/Retrieval
     * Security 
   * #### Types of System (Examples):
     * Authorization System
     * Streaming System
     * Transactional System
     * Heavy Compute System 

<hr/>

## Databases:
  ### Types of databases:
   * If we consider data as people, in terms of buildings, then the way those buildings house people can be said as databases.
   * Some common types of databases are:
      * Relational
      * Non-relational
      * File type
      * Network, etc.

<hr/>

## Anatomy of applications and services:
  * Applications or services performs certain tasks, and at different layers they have different responsibility.
    * Tech stack:
       * All the codes in applications are written in some languages using some frameworks.
       * Any application can be written solely with the use of language. But frameworks do most of the bootstrapping so we can use this feature to make an application on the top of the framework.
    * Responsibilities:
       * Client app:
         * Render UI.
         * Handle interactions.
         * Collect data.
         * Communicate with backend (API) to fetch and store data.
         * Render static data/informations.
       * Backend app:
         * Expose API endpoints.
         * House business logics.
         * Handle data modelling/transformation.
         * Interact with data stores.
         * Interact with other services.
  * Elements/factors of application development:
     * Feature requirements.
     * Layer.
     * Tech Stack.
     * Code structure/design pattern.
     * Data store interactions.
     * Performance/cost.
     * Deployment.
     * Monitoring.
     * Operational excellence/reliability.

<hr/>

## Application Programming Interface (API):
  * An API is a set of defined rules that explain how computers or applications communicate with one another. 
  * Advantages:
    * Communication.
    * Abstraction.
    * Platform agnostic.
  * Examples:
    * Private APIs: The hidden APIs. Not accessible to everyone.
    * Public APIs: Available to public. (Ex: Google maps api)
    * Web APIs: Superset of public and private APIs. 
    * SDK/Library APIs
  * Factors to consider:
    * API contracts 
    * Documentation
    * Data format
    * Security
  * Standards:
    * REST: 
      * Stands for REpresentational State Transfer.
      * Guidelines:
        * Client Server.
        * Cacheable.
        * Layered.
        * Stateless.
        * Uniform Interface.
        * Code on demand.  
    * RPC
    * SOAP

<hr/>

## Caching:
  * A hardware or software component which helps in serving the data which is either frequently requested or it is expensive to compute on, so cache stores the computed response and saves the cost of computing.
  * Cache hit: If a response for a request is available in cache memory, it is called a cache hit.
  * Cache miss: If a response for a request is not available in cache memory, it is called a cache miss.
  * Invalidation and eviction:
     * Invalidation: 
       * The data that is kept in cache is not there for forever, it is volatile. 
       * The data is going to change at some point of time, hence we need to update the cache as well.
       * The process of updating the data in cache by replacing the old value with new value is called data invalidation.
       * Methods to invalidate:
         * Cache expiry (TTL: Time to live).
         * Remove the cache. (When a new request come, cache miss will happen, and data will be fetched.) 
         * Update the cache.
    * Eviction:
      * A cache eviction algorithm is a way of deciding which element to evict when the cache is full.
      * Catch eviction methods:
         * FIFO.
         * LRU.
         * LFU.
  * Cache Patterns:
     * Cache-aside strategy/pattern: 
       * A pattern in which cache never talks to db, only the application code talks to cache.
       * Advantages:
         * If cache fails, data can still be served.
       * Disadvantage:
         * To decide the expiry time for data, or write the logic to update the cache whenever data is changed.       
     * Read through strategy/pattern: 
       * In this pattern, cache sits between application and db, hence application always talks to cache and never to db.
       * Advantage:
         * Supports read heavy workloads. 
       * Disadvantage:
         * First request will always be a cache miss. (Solved sometimes by pre heating the cache)
     * Write through strategy/pattern:
       * It is similar to read through pattern.
       * There is an extra layer of latency while writing. (App to cahce then to db).  
     * Write around strategy/pattern:
       * Similar to write through, only difference being app directly writes to db, but for reading it reads from the cache.
     * Write back strategy/pattern:
       * All the write requested are stored at cache.
       * After some time these writes are sent in bulk to the db. 
       
     ![Untitled](https://user-images.githubusercontent.com/55986045/122691774-41049200-d24f-11eb-9c77-4230023b1d51.png)
     
  * Where can be keep cache?
    * Browser level
    * Proxy level
    * Application level
    * Outside Application level 

<hr/>

## MESSAGE QUEUE: 
   ![image](https://user-images.githubusercontent.com/55986045/122849696-a2009880-d329-11eb-96a8-16a8d578aa20.png)
  * <a href="https://medium.datadriveninvestor.com/what-is-message-queue-b5468ff6db50">Message queue</a>

<hr/>

## Performance Metrics (used to evaluate how good the system is performing):
  * ### Throughput
    * Throughput is the number of actions executed or results produced in a certain amount of time.
    * In system design, throughput comes into picutre when we need to understand how many API calls are being served in a particular amount of time.
  * ### Bandwidth
    * Bandwidth is the maximum amount of data that can travel through a 'channel'.
  * ### Latency
    * Latency is the time required to perform some action or to produce some result.
  * ### Response Time
    * Response time is the time between a client sending a request and receiving a response. It is the sum of round trip latency and service time. 
  * ### EXAMPLES (analogies):
    * Water Analogy:
      * Latency is the amount of time it takes to travel through the tube.
      * Bandwidth is how wide the tube is.
      * The amount of water flow will be your throughput
    * Vehicle Analogy:
      * Vehicle travel time from source to destination is latency.
      * Types of Roadways are bandwidth.
      * Number of Vehicles traveling is throughput.
     
<hr/>     

## Performance metrics of different components:
  * ### Applications:
    * API Response Time
    * Throughput of APIs
    * Error occurences
    * Bug/defect in the code
  * ### Databases:
    * Time taken by various database queries
    * Number of queries executed per unit time(or throughput)
    * Memory
  * ### Caches:
    * Latency of writing to cache
    * Number of cache eviction and invalidation
    * Memory of cache instance
  * ### Message Queues:
    * Rate of production and consumption
    * Fraction of stale or unprocessed messages
    * Number of consumers affects bandwidth and throughput
  * ### Workers:
    * Time taken for job completion
    * Resources used in processing
  * ### Server instances:
    * Memory/RAM
    * CPU

<hr/>

## Fault v/s Failure:
  * Fault is the cause, failure is the effect. 

<hr/>

## Scaling:
  * The ability to handle more request by buying more machines/bigger machines.
  * Key features:
    * Able to handle the increased load.
    * Not complex to implement and maintain.
    * Performance shouldn' takr a hit or rather performance should increase.
  * ## Vertical Scaling:
    * When we increase the capacity of existing resource it is vertical scaling.
  * ## Horizontal Scaling:
    * When we increase the number of resources it is horizontal scaling.
  * ## Horizontal v/s Vertical Scaling:
      | Horizontal | Vertical |
      |------------|----------|
      |Need load balancers.|Load balancers not needed.|
      |Resilient.|Single point of failure.|
      |Slow remote procedure calls.|Fast inter process communication.|
      |Data inconsistency.|Data consistent.|
      |Scales well as uses increases.| Hardware limit.|

<hr/>

## Database Replication:
  * Replication: To have a copy.
  * Having exact copy of data present in other databases in other machines.
  * The database that has main source of writes/updates becomes the primary db. (Master)
  * The database which has the copies from the primary db's is called the secondary database. (Slave)
  * Why do we need replication?
    * Having replicas helps in tolerating faults.
    * Having replicas helps in reducing latency.
    * Replica databases can be used for read queries, whereas the primary one can be used for write queries. (Gain application performance)
  * Replication lag:
    * The time it takes for the value to be copied from the primary to secondary database.
    * If replication lag is huge, then it becomes a problem.
      * Replicas will give inconsistent data.
      * To overcome this there are several consistenct models:
        * Synchronous replication:
          * All replicas have to be updated before host is acknowledged. 
          * Advantages:
            * No lag.
            * Data is always consistent.
          * Disadvantage:
            * Performance might take a hit, because every write will have to wait for all replicas to get updated as well as acknowledge. (High latency)
            * If any replica goes down, and couldn't give any acknowledgement, write will fail.
        * Asynchronous replication: 
          * Host is acknowledged after primary database is updated. Replicas update asynchronously.
          * Advantage:
            * Write opeartion becomes faster.
          * Disadvantage:
            * If any replica fails, system will be in a inconsistent state.
        * Semi-synchronous replication:
          * Whenever a new write is issued, the primary database will update the value to all the replicas, and will wait for one of the replicas to acknowledge.

## CAP (Consistency, Availability, and Partitioning)
  * ### Consistency:
    * In a consistent system, once a client writes a value to any server and gets a response, it expects to get that value (or a fresher value) back from any server it reads from.
  * ### Availability:
    * In an available system, if the client sends a request to a server and the server has not crashed, then the server must eventually respond to the client. The server is not allowed to ignore the client's requests.
  * ### Partitioning:
    * The system continues to function and upholds its consistency guarantees in spite of network partitions.
    * If we can tolerate the partition, and even though if partition happens and system can still be available and consistent is called partition tolerance.
  * ### CAP theorem (Brewer Theorem):
    * Any network shared system wants to have these three properties.
    * In such a system, having all three properties is nearly impossible.
    * We need to sacrifice one of them.
    * Partition tolerance happens due to network failures, and we do not have complete control over network failures.
    * Hence, partition tolerance becomes a mandatory property to support.

## Database Sharding
  * 
