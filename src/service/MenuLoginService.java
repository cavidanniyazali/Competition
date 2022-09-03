/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import util.MenuUtil;

public class MenuLoginService extends MenuService {
    @Override
    public void process() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please login ");
            System.out.print("Enter username:");
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();

            System.out.print("Enter the password:");
            sc = new Scanner(System.in);
            String password = sc.nextLine();
            if (!(username.equals("cavidan.niyazali@gmail.com") && password.equals("12345"))) {
                System.out.println("The username or password you entered is incorrect!!!");
                count++;
            } else {
                System.out.println("you have successfully logged in..");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Unfortunately, you banned..");
            System.exit(0);
        }
        while (true) {
            MenuUtil.showMenu();
        }
    }
}
