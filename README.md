[<h1 align="center">Design Pattern</h1>](https://springframework.guru/gang-of-four-design-patterns/)

![](https://4.bp.blogspot.com/-Mrv55XLP0y4/WwwaPGRIunI/AAAAAAAACV8/s3JTDambNs82GpY0_ZiITuqOrQy5ilG9QCLcBGAs/s1600/gof-design-pattern-category-diagram.PNG)
![](http://learnandshare.wdfiles.com/local--files/design-patterns/Design_Pattern_Relationships)


## 1. Abstract Factory

[Allows the creation of objects without specifying their concrete type.](https://springframework.guru/gang-of-four-design-patterns/abstract-factory-design-pattern/)

> Program an interface, not an implementation

| Factory Method        | Abstract Factory                          |
|-----------------------|-------------------------------------------|
| Create objects        | Create factories *(Factory of factories)* |
| Method -> single type | Object -> Families of objects             |
| Inheritance           | Composition                               |

### Participants

- **Abstract product**: Is an interface or an abstract class whose subclasses are instantiated by the abstract factory objects.
- **Concrete product**: Are the concrete subclasses that implement/extend AbstractProduct. The abstract factory objects instantiate these subclasses.
- **Abstract factory**: Is an interface or an abstract class whose subclasses instantiate a family of AbstractProduct objects.
- **Concrete factory**: Are the concrete subclasses that implement/extend AbstractFactory. An object of this subclass instantiates a family of AbstractProduct objects.
- **Client**: Uses AbstractFactory to get AbstractProduct objects.

## 2. Builder

[Uses to create complex objects](https://springframework.guru/gang-of-four-design-patterns/builder-pattern/)

> Separate the construction of a complex object from its representation so that the same construction process can create different representations.

### Participants

- **Product**: A class that represents the product to create.
- **Builder**: Is an interface to build the parts of a product.
- **ConcreteBuilder**: Are concrete classes that implement Builder to construct and assemble parts of the product and return the finished product.
- **Director**: A class that directs a builder to perform the steps in the order that is required to build the product.