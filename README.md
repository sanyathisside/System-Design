# System Design:

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

## Fault v/s Failure:
  * Fault is the cause, failure is the effect. 

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
    * #### Degrees of Consistency and Availability:
      * 
