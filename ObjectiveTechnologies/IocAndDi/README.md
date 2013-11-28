Inversion of control and dependency injection
====================

Description
-----------

Third labaratory work.

Martin Fowler talking abou DI and it's alternative - service locator - http://uosis.mif.vu.lt/~plukas/resources/DependencyInjection/Fowler/injection.html

Requirements
------------

Choose and implement concrete situation following these requirements:

    * Use Spring Framework - http://spring.io/

        * Use XmlBeanFactory/XmlApplicationContext class to create and join several objects

        * Object classes are independent from each other, dependencies only using interfaces

        * Demonstrate variant, when several objects are being composed with one concrete interface realization, other objects - with another interface implementation

        * Demonstrate object creation using constructor and using static method

        * Implement and use your own Factory Bean

        * Demonstrate addition of dependencies using contructor parameters and setters

        * Demonstrate singleton and non-singleton modes

        * Demonstrate dependencies configuration, autowiring, qualificators and annotations

        * Demonstrate dependent object multiple instances producing from container using lookup-method. ("Method Injection")

    * Implement the same configuration using Spring JavaConfig instead of XML file

    * Implement The same configuration using Google Guice (http://code.google.com/p/google-guice/) or Java EE CDI.