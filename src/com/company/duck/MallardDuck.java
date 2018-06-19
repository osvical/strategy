package com.company.duck;

import com.company.behavior.FlyWithWings;
import com.company.behavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
