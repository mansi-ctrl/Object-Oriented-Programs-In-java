
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansi
 */
public class CreateFolder {
    public static void main(String[] args) {
        
    

File file = new File("D:\\Folder1");
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Folder1 is created!");
            } else {
                System.out.println("Failed to create folder!");
            }
        }
}
}