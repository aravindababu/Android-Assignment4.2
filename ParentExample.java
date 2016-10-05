/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentexample;

/**
 *
 * @author user2
 */
public class ParentExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //A new "Child" object of Reference variable "P"
        //since "Child" is inheriting behaviour and properties of Parent(superclass)
        //we can create a new object "child" of type "Parent" class
        
        Parent p = new Child();
        //Calling the method2 from variable p to print results
        p.method2();
        //p.method2();
        //tmethod2 will print="Parent's method2()"
        //After this method1 will be called
        //method1 will print="Parent's method1()"
    }
    
}
//Defining a superclass Parent
class Parent{
    //Declaring Two methods in Parent class
    //methos1 and method2
    private void method1(){
    System.out.println ("Parent's method1()");
}
    public void method2() {
    System.out.println ("Parent's method2()");
    //Calling method1 after printing-"Parent's method2()"
    method1();
    //this will print-"Parent's method1()" 
    //after printing-"Parent's method2()" 
}
}
//Defining a SubClass which extends Superclass(Parent)
class Child extends Parent {
    //Defining a method in child class -method1
public void method1() {
System.out.println ("Child's method1()");
}
}


//RESULT=Parent's method2()
//       Parent's method1()