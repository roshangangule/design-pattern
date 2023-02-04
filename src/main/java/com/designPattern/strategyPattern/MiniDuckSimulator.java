package com.designPattern.strategyPattern;

/**
    The Strategy Pattern
        A family of algorithms, encapsulate each one, and makes them interchangeable.
    Strategy lets the algorithm vary independently from clients that use it.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
