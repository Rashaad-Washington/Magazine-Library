package library;

/**
 * @author Rashaad Washington
 * CSCI 3250
 * Assignment 2
 */

import java.util.Scanner;
import linkedlist.exception.InvalidMagazineException;
import linkedlist.exception.ListEmptyException;
import linkedlist.exception.ListException;
public class LibraryManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Library lib = new Library();
        int input;
        do{
        System.out.println("\nWelcome to my library management system");
        System.out.println("Choose an option from 1 to 6");
        System.out.println("1: Add Magazine");
        System.out.println("2: Get magazines count");
        System.out.println("3. Get the Magazines with the highest number of pages");
        System.out.println("4. Get number of Magazines have the number of pages more tham ");
        System.out.println("5. Print all magazines");
        System.out.println("6. Quit\n");
        
        
        
        input = scan.nextInt();
        
            switch(input){
                case 1:
                        String line;
                    System.out.println("Enter magazine's name: ");
                    line = scan.nextLine();
                    String nameMag = scan.nextLine();

                    System.out.println("Enter magazine's edition: ");
                    int edtMag = scan.nextInt();

                    System.out.println("Enter the magazine's publish year: ");
                    line = scan.nextLine();
                    int yearPublish = scan.nextInt();

                    System.out.println("Enter magazine's pages: ");
                    line = scan.nextLine();
                    int pages = scan.nextInt();

                    try {
                        Magazine mag = new Magazine(nameMag, edtMag, yearPublish, pages);
                        lib.addMagazine(mag);
                        System.out.println("The magazine added successfully");
                        

                    } catch (InvalidMagazineException e){
                        System.out.println(e.getMessage());
                    }
                    break;


                case 2:
                    System.out.println("Number of magazines in the library: " + lib.getCount());
                    break;

                case 3: 
                    try { 
                    System.out.println(lib.getMagazineWithHighestNumberOfPages());
                    } catch (ListEmptyException | ListException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Enter the page count: ");
                    int count = scan.nextInt();
                {
                    try {
                        System.out.println("There are " + lib.getNumberOfMagazinesHavePagesMoreThan(count) + " magazine(s) with more pages than " + count);
                    } catch (ListException e) {
                        System.out.println(e.getMessage());
                    }
                }
                    break;


                case 5:
                    if (lib.getCount() == 0){
                        System.out.println("No magazines in the library");
                    } else {
                        lib.printAllMagazines();
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the library system.");
                    break;
            }
        } while(input >= 1 || input <= 5);
    }
}
