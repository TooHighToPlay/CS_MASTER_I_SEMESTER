Abstract Factory
====================

Description
-----------

First labaratory work.

Understanding creational patterns.

Requirements
------------

Choose and implement concrete situation following these requirements:

    * Client works with one of different family products using common interface and wants to create products despite their concrete classes.

    * There are at least 2 families and at least 3 kinds of products.

    * Products are created using Abstract Factory.

    * Parameters to create a product must be provided regarding their kind. Client must get the values of these parameters dynamically (before creating / runtime).

    * Concrete implementations of the same product kinds have different creation/initialization parameters and methods.

    * Which family of products is being used depends on environment variable value or command line argument value.

    * 2 projects: Abstract factory implemented using

        a) method producer/maker

        b) prototype (In java using clone method and Cloneable interface for example)

    !!! In case of Prototype example - demonstrate alternative that class objects can be used instead of prototypes.

Note: Abstractions of products, their families and factory and the client must be the same in both projects. Only factory implementation, and creation/initialization of concrete factory differs.

Solution
--------

Abstract factory using method producer UML diagram:

<img src="https://github.com/TooHighToPlay/CS_MASTER_I_SEMESTER/blob/master/ObjectiveTechnologies/AbstractFactory/abstractfactory.png" alt="Method_Producer" title="Method Producer" />


<img src="https://github.com/TooHighToPlay/CS_MASTER_I_SEMESTER/blob/master/ObjectiveTechnologies/AbstractFactory/prototype.png" alt="Prototype" title="Prototype" />