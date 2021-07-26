/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansi
 */
import java.io.File;
public class DIrectoriesList {
    public static void main(String[] args) {
        File file = null;
        String[] paths;
        try {
            // create new file object
            file = new File("F:\\ooplab\\netbeans workspace\\tw1");
            // array of files and directory
            paths = file.list();
            // for each name in the path array
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
