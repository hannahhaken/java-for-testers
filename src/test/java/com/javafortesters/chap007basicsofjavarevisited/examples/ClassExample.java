package com.javafortesters.chap007basicsofjavarevisited.examples;

public class ClassExample {

    /*Because the class is public, it can be used by another class, so long as they import it, or
     if they are in the same package. If I didn’t add the public, then the class would have
     package scope and only be available to other classes in the same package.*/

    public static final String CONSTANT = "a constant string";
    //final - once the field has a value it cannot be changed
    //public = accessible to any class that imports the parent class

    public static String aClassField = "a class field";
    //A public static field is available to any class which imports the ClassExample class.

    protected static String proField = "a class field";
    //protected = accessible to any class in the same package, or any subclass

    public String pubField = "a public field";
    //A public field is accessible to all classes which instantiate a new instance variable of the class

    private String privField = "a private field";

    private String name;
    //private = accessible to methods in the class

    public ClassExample(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
