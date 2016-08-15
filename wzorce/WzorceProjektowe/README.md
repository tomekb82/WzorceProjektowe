# WzorceProjektowe


## Observer Pattern

  - defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are
  notified and updated automatically.

  - Subjects, or as we also know them, Observables, update Observers using a common interface.

  - Observers are loosely coupled in that the Observable knows nothing about them, other than that they implement the
    Observer Interface.

## Decorator Pattern

  - attaches additional responsibilities to an object dynamically.

  - decorators provide a flexible alternative to subclassing for extending functionality.

  - Decorator Pattern involves a set of decorator classes that
    are used to wrap concrete components.

  - decorators change the behavior of their components by adding
    new functionality before and/orafter (or even in place of) method
    calls to the component.
  - You can wrap a component with any number of decorators.


## Factory Method Pattern

  - defines an interface for creating an object, but lets subclasses decide which
class to instantiate. Factory Method lets a class defer instantiation to subclasses.

  - All factories encapsulate object creation

  - Factory Method relies on inheritance: object creation is delegated to subclasses which implement the factory method to
    create objects.

  - Abstract Factory relies on object composition: object creation is implemented in methods exposed in the factory interface.

## Singleton Pattern

  - ensures a class has only one instance, and provides a global point of access to it.

  - provides a global access point to that instance.

  - Java’s implementation of the Singleton Pattern makes use of a private constructor, a static method combined with a static variable.


# Design principles

  - Classes should be open for extension, but closed for modification.

  - Depend upon abstractions. Do not depend upon concrete classes