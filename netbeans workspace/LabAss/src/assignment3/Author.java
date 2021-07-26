/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Name:Mansi Dobariya
AU1841131

*/
package assignment3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    Author(){

    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
        return "Name:"+name+" "+"Email:"+" "+"Gender:"+gender;
    }
    void remove(ArrayList info){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the author's name:");
        String nameofAuthor = input.next();
        Iterator<Author> iterator = info.iterator();
        System.out.println("List of items after deleting");
        while (iterator.hasNext()) {
            Author newinfo = iterator.next();
            if (newinfo.getName() == nameofAuthor) ;
            {
                iterator.remove();
                break;
            }
        }
    }
    void display(ArrayList info){
        Iterator<Author> iterator = info.iterator();
        System.out.println("List of Authors");
        while(iterator.hasNext()){
            Author author = iterator.next();
            System.out.println("Author's name:"+author.getName()
                    +" Author's Email:"+author.getEmail()
                    +" Author's gender:"+author.getGender());
        }
    }
    void add(ArrayList info){
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.println("Enter Author's name:");
            String authorName = input.next();

            System.out.println("Enter Author's Email:");
            String authorEmail = input.next();

            System.out.println("Enter Author's gender:");
            char authorGender = input.next().charAt(0);

            info.add(new Author(authorName, authorEmail,authorGender));

            System.out.println("Do you want to continue:");
            String in = input.next();
            if ("yes".equals(in)){
                repeat = true;
            }
            else if("no".equals(in)){
                repeat = false;
            }
            else{
                System.out.println("Enter yes/no:");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Author obj = new Author();
        java.util.ArrayList<Author> info = new java.util.ArrayList<>();
        Scanner input = new Scanner(System.in);


        int choice;
        do{
            System.out.println("Choose your option \n 1.Add \n 2.Remove "
                    + "\n 3.Check empty ArrayList"
                    + "\n 4.Get size of ArrayList \n 5.Get element by index "
                    + "\n 6.Modify element by index"
                    + "\n 7.Exit");
             choice = input.nextInt();
            switch (choice){
                case 1:
                    obj.add(info);
                    obj.display(info);
                    break;
                case 2:
                    obj.remove(info);
                    obj.display(info);
                    break;
                case 3:
                    boolean check =info.isEmpty();
                    if(check==true){
                        System.out.println("ArrayList is Empty");
                    }
                    else if(check==false){
                        System.out.println("ArrayList is not Empty");
                    }
                    break;
                case 4:
                    System.out.println("Size of ArrayList:"+info.size());
                    break;
                case 5:
                    System.out.println("Enter index number:");
                    int number = input.nextInt();
                    if(number>=0&&number<info.size()){
                        System.out.println(info.get(number));
                    }
                    break;
                case 6:
                    System.out.println("Enter index number: ");
                    int newNumber = input.nextInt();
                    if(newNumber>=0&&newNumber<info.size()){
                        System.out.println("Enter name of author:");
                        String updateName = input.next();
                        System.out.println("Enter Email of author:");
                        String updateEmail = input.next();
                        System.out.println("Enter Gender of author:");
                        char updateGender = input.next().charAt(0);
                        Author update = new Author(updateName,updateEmail,updateGender);
                        info.set(newNumber,update);
                    }
                    break;
            }
        }while(choice!=7);
    }
}
/*
run:
Choose your option
1.Add
2.Remove
3.Check empty ArrayList
4.Get size of ArrayList
5.Get element by index
6.Modify element by index
7.Exit
1
Enter Author's name:
mansi
Enter Author's Email:
mansidobariya@gmail.com
Enter Author's gender:
female
Do you want to continue:
yes
Enter Author's name:
drashti
Enter Author's Email:
ddobariya
Enter Author's gender:
female
Do you want to continue:
no
List of Authors
Author's name:mansi Author's Email:mansidobariya@gmail.com Author's gender:f
Author's name:drashti Author's Email:ddobariya Author's gender:f
Choose your option
1.Add
2.Remove
3.Check empty ArrayList
4.Get size of ArrayList
5.Get element by index
6.Modify element by index
7.Exit
7
BUILD SUCCESSFUL (total time: 3 minutes 15 seconds)

*/
