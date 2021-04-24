/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author rizwa
 */
public class contoh1 {
    static void Happy1(){
        System.out.println("\nHappy 1 function");
        return;
    }
    static void Happy2(){
        System.out.println("\nHappy 2 function");
        return;
    }
    static void Happy3() {
        System.out.println("\nHappy 3 function");
        return;
    }
    
    public static void main(String[] args) {
        char quit = 'n';
        String input;
        int choice = 0;
        
        Scanner scan = new Scanner(System.in);
        while (quit != 'y') {
            System.out.println("Please choose a function"
                    +"\n1.Happy 1"
                    +"\n2.Happy 2"
                    +"\n3.Happy 3");
            System.out.print("Make a function: ");
            choice = scan.nextInt();
            
            switch (choice) {
                case 1:
                    Happy1();
                    break;
                case 2:
                    Happy2();
                    break;
                case 3:
                    Happy3();
                    break;
                default:
                    System.out.println("That wasn't a choice.");
            }
            System.out.println("Would you like to quit y/n? ");
            input = scan.next().toLowerCase();
            quit = input.charAt(0);
            }
        }
}

