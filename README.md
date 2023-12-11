# Interface

**Objective**

In this project, you will learn how to use interfaces in Java to define a contract that specifies the methods a class must implement without providing the implementation.
 
 **Concepts**

| Concept   |      Resources      |
|----------|:-------------:|
|What is an Interface|[what is an interface](https://www.simplilearn.com/tutorials/java-tutorial/java-interface#:~:text=and%20project%20performance.-,What%20is%20Interface%20in%20Java%3F,in%20Java%20to%20achieve%20abstraction.), [Interface in java](https://www.digitalocean.com/community/tutorials/interface-in-java)|
|Java interface|[Intercface classes (Tutorial)](https://www.youtube.com/watch?v=GhslBwrRsnw)|
|Interfaces vs Abstract Classes| [Different between interface and abstract class](https://www.youtube.com/watch?v=PPZ_vZcF2AU)|

**Problem**

Develop a `Shape` interface with `calculateArea` method and implement the method for different shapes

**Implementation**

* Create an interface named `Shape` which should contain only one method called `calculateArea()`.
* Create `Rectangle` and `Circle` classes that implement the `Shape` interface.
* Overload the `calculateArea()` method in each class.
* In the main method, create an object from each class and return the result of `calculateArea()` method, and print it.

```Java
public class Main {
    public static void main(String[] args) {
       /* write your code here */
    }
}

```

