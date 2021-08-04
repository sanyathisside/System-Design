
## Objects and Classes:
  * Objects:
     * A real world element in object oriented environment, that may have physical or conceptual existence.
  * Classes:
      * Blueprint or description of objects, that can be created from it.
      
  ![image](https://user-images.githubusercontent.com/55986045/128104789-2b1a8546-90c4-4634-8bd4-467a08be9655.png)
  ![image](https://user-images.githubusercontent.com/55986045/128104809-cfae4358-6d90-4354-bf76-a02ac5c14723.png)

  
<hr/>
  
## Software development process:
  * Problem solving process:
     1. Requirements Analysis
     2. Design
     3. Implementation
     4. Delivery 
    
  ![image](https://user-images.githubusercontent.com/55986045/128104662-1d095595-a305-4ed4-9440-5cdaa31e3223.png)


<hr/>

## UML Diagram:
  * The Unified Modeling Language (UML) is a standard graphical language for modeling object-oriented software.
  * As UML is a graphical language, it supports two types of diagrams which can be classified as:
    ![image](https://user-images.githubusercontent.com/55986045/127788611-5ed3f83c-2df2-4213-8ff4-08a1163f21ba.png)

    * Structural:
      * The structural Diagrams are used to create a static model of the software. 
      * That is it gives an idea, what all components build up the system.
    * Behavioral: 
      * The Behavioral Diagrams are used to create a dynamic model of the software. 
      * It tells how the different components or modules interact with each other.
      
  * Some of the structural and behavioral diagrams supported by UML are:
    ![image](https://user-images.githubusercontent.com/55986045/128104576-45f10b17-dfb3-4ab6-b8c4-235b6634b9b2.png)

<hr/>

## Class Diagram and Object Diagram:
  * ### Class diagram:
    * A class diagram in the Unified Modeling Language (UML) is a type of structural diagram that describes the structure of a system by showing the System's Classes, their Attributes, Operations (or methods), and the relationships among objects.
    * In a class diagram a class is represented with the help of a rectangular box having three partitions:
      * The first partition contains the class name,
      * The second partition contains all the attributes of the class.
      * The third partition contains all the functionalities of the class.
    ![image](https://user-images.githubusercontent.com/55986045/128105232-e75658dd-62fc-4773-972c-8d7e6521b809.png)
   
   * Relationships:
     * The connection between the two classes in a class diagram is called Relationship. A class may be involved in one or more relationships with other classes.
       ![image](https://user-images.githubusercontent.com/55986045/128105338-2d81c6ea-afbc-44d6-a4a2-d5156eea0f62.png)
   
      1. Association:
         * It shows that one class is associated with other classes.
         * In class diagrams, we can connect two classes with a solid line.
          ![image](https://user-images.githubusercontent.com/55986045/128105456-1cdbccb2-0373-4f1b-9722-915f5b5f6289.png)

      2. Multiplicity:
         * Multiplicity of Association tells us: how many objects of each class take part in the relationship?
           ![image](https://user-images.githubusercontent.com/55986045/128105676-78dd7764-cd6b-4b67-97a8-246a42771cb9.png)

      3. Generalization/Inheritence:
         * Parent-child class relationship
           ![image](https://user-images.githubusercontent.com/55986045/128105806-cd08107d-6046-462f-ba37-992295a0385f.png)

      4. Aggregation:
         * Whenever we need to represent any class that is a part of another class, we can use aggregation.
           ![image](https://user-images.githubusercontent.com/55986045/128105931-4339101a-4a0d-4ec3-9958-20fcb47ee37f.png)
  
  * ### Object diagram:
    * We use OBJECT DIAGRAMS to show objects in software designs.
      ![image](https://user-images.githubusercontent.com/55986045/128106100-a40ac05a-5bcc-403a-95ff-37c28aec8716.png)
      <hr/>
      ![image](https://user-images.githubusercontent.com/55986045/128106128-5e96a3b2-45c2-4f13-9c92-50a59f5f8349.png)



<hr/>

## Use Case Diagram:
  * In UML, use case diagrams are high level diagrams.
  * It provides a basic high level view about the system.
  * Four major components are:
    * System: 
      * The application/software component we are going to develop.  
    * Actor:
      * Any external agent that can interact with the system.
      * Two types:
        1. Primary Actors (on the left side of use case diagram)
           * Responsible for initiating action. 
        2. Secondary Actors (on the right side of use case diagram)
           * Responsible for Response/Reactions
        
        ![image](https://user-images.githubusercontent.com/55986045/128103409-56f7af30-3a29-44dc-8bef-a50405fbf59b.png)
        
    * Use-Case:
      * Shows task within the system. Example: Registration, Login, Search, etc.
    
    * Relationship:
      * Relationship are represented by solid line from actors to use-case.
      * Types:
        1. Association (between actors and use-case)
          * ![image](https://user-images.githubusercontent.com/55986045/128103237-29b4a4c5-925d-4655-a4a1-6fc46ed6fecf.png)
          <hr/>

        2. Inclusive (base use-case -> inclusive use-case)
          * ![image](https://user-images.githubusercontent.com/55986045/128103613-88d874fa-47f1-4230-95f3-cfac2ce2bd37.png)
          <hr/>

        3. Dependent 
          * ![image](https://user-images.githubusercontent.com/55986045/128103677-2585bc6e-740e-429b-9523-ef6d2458f5d5.png) 
          <hr/>  
        
        4. Inheritance
          * ![image](https://user-images.githubusercontent.com/55986045/128103766-d0785d00-aa0c-4175-80d2-5735f7ac1849.png)
          <hr/>
          
       Final diagram:
       ![image](https://user-images.githubusercontent.com/55986045/128103790-758ecc4b-9877-4967-894c-76b5774f117a.png)



