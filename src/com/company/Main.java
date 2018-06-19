package com.company;

import com.company.behavior.FlyRocketPowered;
import com.company.duck.Duck;
import com.company.duck.MallardDuck;
import com.company.duck.ModelDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
