package com.company;

import com.company.duck.Duck;
import com.company.duck.MallardDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
    }
}
