/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicstore;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class ElectronicStore {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) Xbox");
        System.out.println("3) Switch");
        System.out.print("Enter your choice (1-3): ");

        try {
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("1");
            } else if (choice == 2) {
                System.out.println("2");
            } else if (choice == 3) {
                System.out.println("3");
            } else {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number (1-3).");
        }
        
        System.out.println("Enter the store: Number 1 Electronic Store" );
         System.out.println("Enter the total sales of PS5 consoles for Number 1 Electronic  Stores: 500 1 Electronic Store" );

            scanner.close();
        }
    }

