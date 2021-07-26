/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
/*
Name:Mansi Dobariya
AU1841131

*/
/**
 *
 * @author mansi
 */
class Parent {

    public Parent() {
        System.out.println("Parent default constructor");
        
    }
    void getmessage(){
        System.out.println("Parent message ");
    }
    
    
}
class Child extends Parent{

    public Child() {
         System.out.println("Child default constructor");
       
    }
    
    @Override
    void getmessage(){
        System.out.println("Child message ");
    }
}
class Test{
    public static void main(String[] args) {
        Child child=new Child();
        child.getmessage();
    }
}

/*
mansi case 1..
Parent default constructor
Child message 
BUILD SUCCESSFUL (total time: 1 second)
case2
Parent default constructor
Child default constructor
Child message 
BUILD SUCCESSFUL (total time: 1 second)

*/