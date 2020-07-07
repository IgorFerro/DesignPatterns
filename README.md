# DesignPatterns
Single Responsibibility Principle, Factory, Strategy, Command, Template Method, Proxy and Decorator Pattern

# Factory(Creational, very common usage)

GOALS:
1-Create a new object without exposing the instantiation logic;
2-Refer to the newly created object using its commom interface.

Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

1-Definir uma interfaçe para criar um objeto, mas deixarem as subclasses decidirem que clase instanciar;
2-Criar uma instancia de várias classes derivadas.

PROS: 
1-You avoid tight coupling between the creator and the concrete products;
2-Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support;
3-Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.

CONS:
1-The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.

Example:
1-Create a abstract class with commom steps;
2-Create the page objects class extending abstract class;
3-Create The Factory for build the objects;
4-Create the test Class.

Usage in Test Automation:
1-Aplication Localization Support
   -English
   -Portuguese
2-Framework Multiple Browser Supports
   -Firefox
   -Chrome
3-Require One Object From Multiple options

# Strategy
Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

Applicability
 Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.

 The Strategy pattern lets you indirectly alter the object’s behavior at runtime by associating it with different sub-objects which can perform specific sub-tasks in different ways.

 Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.

 The Strategy pattern lets you extract the varying behavior into a separate class hierarchy and combine the original classes into one, thereby reducing duplicate code.

 Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.

 The Strategy pattern lets you isolate the code, internal data, and dependencies of various algorithms from the rest of the code. Various clients get a simple interface to execute the algorithms and switch them at runtime.

 Use the pattern when your class has a massive conditional operator that switches between different variants of the same algorithm.

 The Strategy pattern lets you do away with such a conditional by extracting all algorithms into separate classes, all of which implement the same interface. The original object delegates execution to one of these objects, instead of implementing all variants of the algorithm.
 
 ## Usage in Test Automation: 
 Application provides multiple options to the user and based on the user selection, application executes the business rule slightly differently
   -Google Search Strategy:
       Text
       Voice
       Image
   -Payment Options
       Credit Card
       Promocode
       Bank Account
       Ether Wallet
   -Shiiping
       Immediate Door delivery
       2 Day Air Shipping
       5 Day Ground Shipping
 

