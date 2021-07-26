/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twlecture1;

/**
 *
 * @author mansi
 */
/*
name :Mansi dobariya
AU1841131
Description:Stack Detail
*/
import java.util.Stack;
public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> STACK = new Stack<Integer>();

        STACK.push(20);
        STACK.push(30);
        STACK.push(50);
        STACK.push(40);

        System.out.println("Original Stack:"+STACK);
        System.out.println("Element on top of the Stack:"+STACK.peek());

        System.out.println("Popped element:"+STACK.pop());
        System.out.println("Popped element:"+STACK.pop());
        System.out.println("New Stack:"+STACK);

    }
}
/*
run:
Original Stack:[20, 30, 50, 40]
Element on top of the Stack:40
Popped element:40
Popped element:50
New Stack:[20, 30]
BUILD SUCCESSFUL (total time: 0 seconds)
*/