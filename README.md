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


