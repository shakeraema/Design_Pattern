package Structural.Decorator;

import Structural.Decorator.component.Pizza;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}
