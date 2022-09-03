/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import util.MenuUtil;

import static bean.Config.registeredPeople;
import java.util.Random;
import java.util.Scanner;

public class MenuStartService extends MenuService {

    @Override
    public void process() {
        Random random = new Random();
        int number = random.nextInt(registeredPeople) + 1;
        System.out.println("Who is the chosen participant?");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        if (answer == number) {
            System.out.println("Congratulations!!! You won!");
        } else {
            System.out.println("You failed..");
        }
    }
}
