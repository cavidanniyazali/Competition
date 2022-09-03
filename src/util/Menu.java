/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

public enum Menu {
    REGISTER(1, "Register contestants"),
    START(2, "Start the competition"),
    LOGOUT(3, "Logout"),
    EXIT(4, "Exit");

    private int number;
    private String label;

    Menu(int number, String label) {
        this.number = number;
        this.label = label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }
}
