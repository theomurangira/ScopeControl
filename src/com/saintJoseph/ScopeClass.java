package com.saintJoseph;

public class ScopeClass {
    private int servings=9;
    public void feed ( int servings)
    {
        this.servings=this.servings +servings;
    }
    public void poop()
    {
        servings=0;
    }
    public int getServings()
    {
        return servings;
    }
}
