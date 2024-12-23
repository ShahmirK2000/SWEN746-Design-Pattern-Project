# SWEN746-Design-Pattern-Project
A small project for SWEN746: Model-Driven Development

## Factory Design Pattern
The first design pattern I chose to implement is the factory design pattern. Its goal is to create an outline of objects, that subclasses can produce. The parent interface, or abstract class, may not know exactly how to implement certain objects, so child classes can implement them exactly how they want to. I used this design pattern to create a simple arena with 4 types of characters. I simulated a battle between the 4, with attributes (buffs/debuffs) to each class.

![SWEN746 Design Patterns-Page-1 drawio](https://github.com/user-attachments/assets/43caf0a2-be94-4a86-9de9-9a08f07a891a)

## Strategy Design Pattern
The second design pattern I chose to implement is the strategy design pattern. Its goal is to allow the designer to define a family of algorithms and put them into their own separate class, which makes their objects interchangeable. I used this design pattern to create a simple shopping interface that allows the user to pick which payment option (strategy) they would like to use. 

![SWEN746 Strategy Design Pattern drawio (1)](https://github.com/user-attachments/assets/c650f976-7beb-408d-8f38-dbd78c21cae8)

## Requirements Diagram
This shows the specific requirements needed to implement one of my design patterns. I chose to implement a requirements diagram for the strategy design pattern. It shows the actual requirements of all functioning parts of the program and the relationships between requirements. The point of this implementation of the strategy design pattern was to show how different strategies can be implemented by using abstraction. This project specifically shows how different payment methods can be implemented by using one interface. Creating a relationship between the cart and the interface allows the client to choose which payment strategy to use easily.

![SWEN746 Requirements Diagram](https://github.com/user-attachments/assets/5ae400ae-6509-405a-a95a-415dfed7aaa5)
