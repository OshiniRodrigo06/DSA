/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IIIsubmssion;

/**
 *
 * @author user
 */
class RabbitProblem {

    static int rabbitPairs(int n) {
        if (n <= 1)
            return n;
        return rabbitPairs(n - 1) + rabbitPairs(n - 2);
    }

    public static void main(String[] args) {
        int months = 6;
        System.out.println("Rabbit pairs after " + months + " months: " + rabbitPairs(months));
    }
}
