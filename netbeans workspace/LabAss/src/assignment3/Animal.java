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
import java.util.Scanner;

/**
 *
 * @author mansi
 */
abstract class Animal {

    public Animal() {
    }

    void label() {
        System.out.println("hellooooo");
    }

    abstract void move();

    abstract void eat();

}

class Bird extends Animal {

    public Bird() {
    }

    @Override
    void label() {
        super.label(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void move() {
        System.out.println("Bird moves by flying.");
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void eat() {
        System.out.println("Bird eats worms,small insects.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class Fish extends Animal {

    public Fish() {
    }

    @Override
    void label() {
        super.label(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void move() {
        System.out.println("Fish moves by swimming.");
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void eat() {
        System.out.println("Fish eats smaller fishes,worms.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class AnimalExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Animal anml;
        System.out.println("Choose one:\n1.Bird 2.Fish");
        int n = input.nextInt();
        switch (n) {
            case 1:
                anml = new Bird();
                
                
                break;
            case 2:
                anml = new Fish();
                break;
            default:
                anml = new Animal() {
            @Override
            void move() {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            void eat() {
               
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
                
                break;
        }
        anml.label();
        anml.move();
        anml.eat();
    }
}
/*
mansi
run:
Choose one:
1.Bird 2.Fish
1
Info...
Bird moves by flying.
Bird eats worms,small insects.
BUILD SUCCESSFUL (total time: 12 seconds)

*/