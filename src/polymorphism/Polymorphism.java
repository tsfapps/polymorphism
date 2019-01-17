/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author user
 */

class A {
public void m1(){
    System.out.println("Class A m1");
}
public void m2(int x, int y){
    System.out.println("Sum of int's = "+(x+y));
}
}
class B extends A{
    public void m1(){
        System.out.println("Class B m1");
}
}
class C extends A{
public void m1(){
   System.out.println("Class C m1");
}
public int m1(int a, int b){
    return a+b;
}
}

public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        A obj_a = new A();
        A obj_b = new B();
        C obj_c = new C();
        
        obj_a.m1();
        obj_b.m1();
        obj_c.m1();
       int a = obj_c.m1(5 , 6);
        System.out.println(a);
    }
    
}
