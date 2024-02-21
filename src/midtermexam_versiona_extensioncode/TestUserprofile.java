/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gilla
 */
public class TestUserprofile {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your name: " );
    String userName =scanner.nextLine();
    System.out.println("Choose your favorite genre:");
    System.out.println("1. Comedy");
    System.out.println("2. Drama");
    System.out.println("3. Action");
    System.out.println("4. Mystery");

   
    int genre = scanner.nextInt();

       
    UserProfile userProfile = new UserProfile(userName, getGenre(genre));
        System.out.println("User profile created successfully!");
    }
    // Get the genre based on the user's choice
    private static String getGenre(int choice) {
        switch (choice) {
            case 1:
                return "Comedy";
            case 2:
                return "Drama";
            case 3:
                return "Action";
            case 4:
                return "Mystery";
            default:
                return "Invalid choice";
        }
    }
}



