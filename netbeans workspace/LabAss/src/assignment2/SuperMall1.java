package assignment2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mansi
 */
class Product {

    private String itemName;
    private int itemNo;
    private float price;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(String itemName, int itemNo, float price) {
        this.itemName = itemName;
        this.itemNo = itemNo;
        this.price = price;
    }

}

public class SuperMall1 {

    static Product p = new Product(null, 0, 0);

    public static void main(String[] args) {
        int c = 0;
        ArrayList<Product> array = new ArrayList<Product>(3);
        Scanner input = new Scanner(System.in);
        System.out.println("Do you Want to perform some action(0 for view Actions /1):");
        int ch = input.nextInt();
        int d = 0;
        do {
            System.out.println("1. Add Item");
            System.out.println("2. Delete Item");
            System.out.println("3. Update Item");
            System.out.println("4. View Items");
            System.out.println("5. Search Item");
            System.out.println("What you want?");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    Add(array);
                    break;
                case 2:
                    if (view(array)) {
                        System.out.println("Enter Item number which you want to delete...");
                        int delete = input.nextInt();
                        if (Delete(array, delete)) {
                            System.out.println("Successfully deleted...");
                            if (view(array)) {
                            } else {
                                System.out.println("No items remain...");
                            }
                        } else {
                            System.out.println("No Item number found!!!");
                        }

                    } else {
                        System.out.println("First add items!!");
                    }

                    break;
                case 3:
                    if (view(array)) {
                        System.out.println("Enter Item number which you want to update...");
                        int update = input.nextInt();
                        if (Update(array, update)) {
                            view(array);
                            System.out.println("Upadate successfully...");
                        } else {
                            System.out.println("Id not matched!!");
                        }
                    } else {
                        System.out.println("First add item!!");
                    }

                    break;
                case 4:
                    if (view(array)) {

                    } else {
                        System.out.println("First add item!!");
                    }
                    break;
                case 5:
                    System.out.println("Enter Item number which u want to find...");
                    int find = input.nextInt();
                    if (Search(array, find)) {
                    } else {
                        System.out.println("Item not found!!");
                    }
                    System.out.println("Enter Item Name which you want to find...");
                    input.nextLine();
                    String f = input.nextLine();
                    if (Search2(array, f)) {

                    } else {
                        System.out.println("Item not found!!");

                    }
                    break;
                default:
                    System.out.println("Invalid Entry ...");
            }
            System.out.println("Want more change...?");
            ch = input.nextInt();

        } while (ch == 1);
    }

    public static void Add(ArrayList<Product> array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter item's name:");
        p.setItemName(input.nextLine());
        System.out.println("Enter item number:");
        p.setItemNo(input.nextInt());
        System.out.println("Enter price:");
        p.setPrice(input.nextFloat());
        array.add(new Product(p.getItemName(), p.getItemNo(), p.getPrice()));

    }

    public static boolean Delete(ArrayList<Product> array, int delete) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            p = array.get(i);
            if (delete == p.getItemNo()) {
                array.remove(i);
                flag = true;
            }
        }

        return flag;
    }

    public static boolean Update(ArrayList<Product> array, int up) {
        boolean b = false;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.size(); i++) {
            p = array.get(i);
            if (up == p.getItemNo()) {
                System.out.println("Enter item's new/same name:");
                p.setItemName(input.nextLine());
                System.out.println("Enter item new/same number:");
                p.setItemNo(input.nextInt());
                System.out.println("Enter new/same price:");
                p.setPrice(input.nextFloat());
                array.set(i, p);
                b = true;
            }
        }
        return b;
    }

    public static boolean Search(ArrayList<Product> array, int find) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            p = array.get(i);
            if (find == p.getItemNo()) {
                System.out.println("Here it is...");
                System.out.println("Item" + (i + 1));
                System.out.println("Name: " + p.getItemName());
                System.out.println("Number: " + p.getItemNo());
                System.out.println("Price:" + p.getPrice());
                flag = true;
            }
        }

        return flag;
    }

    public static boolean Search2(ArrayList<Product> array, String f) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            p = array.get(i);
            if (f.compareTo(p.getItemName())==0 ) {
                System.out.println("Here it is...");
                System.out.println("Item" + (i + 1));
                System.out.println("Name: " + p.getItemName());
                System.out.println("Number: " + p.getItemNo());
                System.out.println("Price:" + p.getPrice());
                flag = true;
            }
        }

        return flag;
    }

    public static boolean view(ArrayList<Product> array) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            p = array.get(i);
            System.out.println("Item" + (i + 1));
            System.out.println("Name: " + p.getItemName());
            System.out.println("Number: " + p.getItemNo());
            System.out.println("Price:" + p.getPrice());
            flag = true;
        }
        return flag;
    }

}
/*Want to perform some action(0/1):
1
1. Add Item
2. Delete Item
3. Update Item
4. View Items
5. Search Item
What you want?
4
First add item!!
Want more change...?
1
1. Add Item
2. Delete Item
3. Update Item
4. View Items
5. Search Item
What you want?
1
Enter item's name:
Rice
Enter item number:
1
Enter price:
50
Want more change...?
1
1. Add Item
2. Delete Item
3. Update Item
4. View Items
5. Search Item
What you want?
1
Enter item's name:
Maggie
Enter item number:
2
Enter price:
80
Want more change...?
1
1. Add Item
2. Delete Item
3. Update Item
4. View Items
5. Search Item
What you want?
1
Enter item's name:
Tea
Enter item number:
3
Enter price:
46
Want more change...?
1
1. Add Item
2. Delete Item
3. Update Item
4. View Items
5. Search Item
What you want?
1
Enter item's name:
Drink
Enter item number:
4
Enter price:
80
Want more change...?
1
1. Add Item
2. Delete Item
3. Update Item
4. View Items
5. Search Item
What you want?
2
Item1
Name: Rice
Number: 1
Price:50.0
Item2
Name: Maggie
Number: 2
Price:80.0
Item3
Name: Tea
Number: 3
Price:46.0
Item4
Name: Drink
Number: 4
Price:80.0
Enter Item number which you want to delete...
5
No Item number found!!!
Want more change...?
1
1. Add Item
2. Delete Item
3. Update Item
4. View Items
5. Search Item
What you want?
2
Item1
Name: Rice
Number: 1
Price:50.0
Item2
Name: Maggie
Number: 2
Price:80.0
Item3
Name: Tea
Number: 3
Price:46.0
Item4
Name: Drink
Number: 4
Price:80.0
Enter Item number which you want to delete...
4
Successfully deleted...
Item1
Name: Rice
Number: 1
Price:50.0
Item2
Name: Maggie
Number: 2
Price:80.0
Item3
Name: Tea
Number: 3
Price:46.0
Want more change...?
1
1. Add Item
2. Delete Item
3. Update Item
4. View Items
5. Search Item
What you want?
3
Item1
Name: Rice
Number: 1
Price:50.0
Item2
Name: Maggie
Number: 2
Price:80.0
Item3
Name: Tea
Number: 3
Price:46.0
Enter Item number which you want to update...
2
Enter item's new/same name:
Maggie
Enter item new/same number:
2
Enter new/same price:
90
Item1
Name: Rice
Number: 1
Price:50.0
Item2
Name: Maggie
Number: 2
Price:90.0
Item3
Name: Tea
Number: 3
Price:46.0
Upadate successfully...
Want more change...?
1
1. Add Item
2. Delete Item
3. Update Item
4. View Items
5. Search Item
What you want?
5
Enter Item number which u want to find...
2
Here it is...
Item2
Name: Maggie
Number: 2
Price:90.0
Enter Item Name which you want to find...
tea
Item not found!!
Want more change...?
0
BUILD SUCCESSFUL (total time: 2 minutes 19 seconds)
*/
