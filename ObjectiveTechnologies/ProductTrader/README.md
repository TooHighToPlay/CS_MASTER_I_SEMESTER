Product Trader
====================

Description
-----------

Second labaratory work.

"Legacy porno pattern" also known as:

    *Virtual Constructor Late Creation

Official documentations - http://dirkriehle.com/computer-science/research/1996/plop-1996-product-trader.pdf

Requirements
------------

Choose and implement concrete situation following these requirements:

    * There are at least 2 kinds of products. Client works via abstract class interface. In product hierarchy - at least one concrete product must inherit from other concrete product and cloning of these type of products requires deep cloning.

    * Client creates these type of products using Product Trader and specifying Specification object.

    * Each product hierarchy has its own product trader, implemented as separate object or it's tehe same class as product hierarchy base class (using static methods).

    * Specification must be separate class(depends on product hierarchy) object, consisting of at least 2 primitive fields.

    * Product trader must be implemented as "image" (Specification object -> Product prototype). This image is filled in initialization phase by reading some kind of configuration file (it must be passed as parameter to executable). For separate product hierarchy separate files can exist.

    * Use Java Reflection API

    * Separate hierarchy product traders must be implemented based on the same code (separate objects of the same class or classes deriving implementation from parent class or containing mutual implementation class).

Configuration file
------------------

In configuration file the following information must be provided.

    Specification object class;
    Specification object attributes: 'name'='value';
    Product-prototype class;
    Product-prototype object attributes: 'name'='value';


Note:

Solution
--------

I will make it