package com.saintJoseph;

public class Main {

    public static void main(String[] args) {
	ScopeClass scope=new ScopeClass();
    System.out.println(scope.getServings());//9
    scope.feed(34);
    System.out.println(scope.getServings());//43
    scope.poop();
    System.out.println(scope.getServings());//0
    }
}
