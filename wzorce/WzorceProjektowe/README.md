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

## Command Pattern

  - encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

  - decouples an object, making a request from the one that knows how to perform it.

  - Command object is at the center of this decoupling and encapsulates a receiver with an action (or set of actions) .

  - invoker makes a request of a Command object by calling its execute() method, which invokes those actions on the receiver.

  - Macro Commands are a simple extension of Command that allow multiple commands to be invoked

## Adapter pattern

  -  converts the interface of class into another interface clients expect.

  - lets classes worj together that couldn't otherwise because of icompatible interaces

  - When you need to use anexisting class and its interface is not the one you need, use an adapter.

  - An adapter changes an interface into one a client expects.


## Facade Pattern

  - provides a unified interface to a set of interfaces in a subsytem.

  - Facade defines a higher-level interface that makes the subsystem easier to use.

  - when you need to simplify and unify a large interface or complex set of interfaces

  - facade decouples a client from a complex subsystem.

  - implementing facade requires that we compose the facade with its subsystem and use delegation to perform the work of the facade.

## Template Method Pattern

   - defines the skeleton of an algorithm in a method, deferring some steps to subclasses.

   - Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.

   - The template method’s abstract class may define: concrete methods, abstract methods and hooks.

   - Abstract methods are  implemented by subclasses.

   - Hooks - are methods that do nothing or default behavior in the abstract class, but may be overridden in the subclass.

   - To prevent subclasses from changing the algorithm in the template method, declare the template method as final.

# Design principles

  - Encapsulate what varies

  - Favor composition over inheritance

  - Program to interface not implementation

  - Classes should be open for extension, but closed for modification.

  - Depend upon abstractions. Do not depend upon concrete classes

  - Principle of Least Knowledge - talk only to your immediate friends.