### Java Spring

* Java - Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.

* Spring is the most popular application development framework for enterprise Java. Spring is a complete and a modular framework for developing enterpise applications in java.

* Spring can be used for all layer implementations for real time application OR can be used for the development of particular layer of a real time application.

* Latest Version - 4.3 (2016)

* Spring Boot: It makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run". Most Spring Boot applications need minimal Spring configuration.

* The core features of the Spring Framework can be used in developing any Java application, but there are extensions for building web applications on top of the Java EE platform. Spring framework targets to make J2EE development easier to use and promotes good programming practices by enabling a POJO-based programming model.

* The benefit of using only POJOs is that you do not need an EJB container product such as an application server but you have the option of using only a robust servlet container such as Tomcat or some commercial product.

* Spring does not reinvent the wheel, instead it truly makes use of some of the existing technologies like several ORM frameworks, logging frameworks, JEE, Quartz and JDK timers, and other view technologies.

* Spring's web framework is a well-designed web MVC framework, which provides a great alternative to web frameworks such as Struts or other over-engineered or less popular web frameworks.

* Spring provides a convenient API to translate technology-specific exceptions (thrown by JDBC, Hibernate, or JDO, for example) into consistent, unchecked exceptions.

* Testing an application written with Spring is simple because environment-dependent code is moved into this framework. Furthermore, by using JavaBeanstyle POJOs, it becomes easier to use dependency injection for injecting test data.

* One of the key components of Spring is the Aspect Oriented Programming (AOP) framework. The functions that span multiple points of an application are called cross-cutting concerns and these cross-cutting concerns are conceptually separate from the application's business logic. There are various common good examples of aspects including logging, declarative transactions, security, caching, etc.

* MVC is a design pattern. User input is interpreted by the controller and are transformed into a model which is represented to the user by the view.

* High and Loose Coupling (Spring uses Loose Couple)

![loose coupling](https://i.imgur.com/k20fR7O.png)

* Layers in Java Spring

![layers available](https://i.imgur.com/rOlMvI8.png)

* Spring Architecture

![architecture](https://i.imgur.com/0NlDo83.png)

* Core Container

![core](https://i.imgur.com/RDzmaBQ.png)

* Data Layer

![data layer](https://i.imgur.com/kVZZd3t.png)

* MVC

![mvc](https://i.imgur.com/AUsk0kL.png)

##### Steps For Importing Spring Boot Application in IntelliJ IDEA

1. Go to Spring Initializer - https://start.spring.io/
2. Select Maven and Java from the dropdowns
3. Select stable version (2.4.2)
4. Enter Group name (shubham) and Artifact name (cms: Customer Management System)
5. Select Spring Web Dependency
6. Download the .zip file
7. Import the project in IntelliJ IDEA by clicking on Open Button

##### Steps For Creating Spring Boot Application with IntelliJ IDEA

1. In the left pane of the New Project wizard, select Spring Initializr and Click Next.
2. Enter Group name (shubham) and Artifact name (cms: Customer Management System)
3. Select Spring Web Dependency (Web -> Spring Web) and Click Next
4. Enter Project Name as customer_management_application


![screenshot of file structure](https://i.imgur.com/l1PI95V.png)

##### Shorcuts to create Constructor, Getters and Setters etc.
1. Right Click and select Generate
2. Select anything you want to create in the class

![shortcuts generate](https://i.imgur.com/pmpgrSp.png)

##### Change Default ASCII Text
1. Generate from - https://www.kammerl.de/ascii/AsciiSignature.php
2. Add new filer under src>main>resources>banner.txt and paste the ASCII
3. Re-Run the appliction

##### Customer Application APIs
1. GET - /customers
2. GET - /customers/:id
3. POST - /customers
4. PUT - /customers/:id
5. DELETE - /customers/:id