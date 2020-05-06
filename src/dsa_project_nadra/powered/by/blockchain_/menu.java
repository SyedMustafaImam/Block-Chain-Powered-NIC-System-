package dsa_project_nadra.powered.by.blockchain_;

import com.sun.webkit.dom.EventImpl;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javafx.event.Event;

public class menu {

    Database db = new Database();
    Scanner scan = new Scanner(System.in);

    @SuppressWarnings("empty-statement")
    public void menue_main() throws NoSuchAlgorithmException, UnsupportedEncodingException, FileNotFoundException {
          System.out.println("--------------------------");
            System.out.println("   Welcome to NADARA"
                    + "     \n\n  Powerd By Block Chain");

            System.out.println("---------------------------\n\n");
        System.out.println("Select any action to perform: ");
        System.out.println("\n1. New Citizen Entery For NIC\n2. NIC Expected Receiving Date\n"
                + "3. Smart Search Citizens\n4. Sorting W.R.T Time\n5. Sorting Name W.R.T alphabetically order"
                + "\n6. Ledger view\n7. Security Check\n8. Exit\n\n--->");

        String choice;

        choice = scan.nextLine();
        do {

            switch (choice) {

                case "1": {

                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                    System.out.println("***** New Citizen Data Entry For NIC*****\n");
                    System.out.println("***DATA FOR NEW CITIZEN***\n\n");
                    db.transction1();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                    System.out.println("Do you want Enter Make Another NIC Yes or no (y/n)\n");
                    choice = scan.nextLine();

                    do {
                        if (("y".equalsIgnoreCase(choice))) {
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("***DATA FOR NEW CITIZEN***\n\n");
                            db.transction2();

                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("***DATA FOR NEW CITIZEN***\n\n");

                            delay("automatically generating data.", 800);
                            db.transction3();

                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("***New User Added to Block***");
                            delay(500);
                            db.transction4();

                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("New User Added to Block");
                            delay(500);
                            db.transction5();

                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("New User Added to Block");
                            delay(500);
                            db.transction6();
                            System.out.println("New User Added to Block");

                            delay("inserting Data Into Block Chain", 1000);
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                            System.out.println("!---Data Successfully Entered Into Block Chain---!");

                            System.out.println("\n\n\nReturning to main menu...");
                            delay(500);
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                            menue_main();

                            break;

                        } else if (("n".equalsIgnoreCase(choice))) {
//...return to main
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                            menue_main();

                        } else {
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                            System.out.println("X--Wrong Input--X");

                            System.out.println("\n\n\nDo you want Enter Make Another NIC Yes or no (y/n)\n");

                        }

                        choice = scan.nextLine();
                    } while (!"y".equals(choice) || !"Y".equals(choice) || !"n".equals(choice) || !"N".equals(choice));

                }

//NIC EXPECTED RECEVING DATE
                case "2": {
System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                        System.out.println("*****NIC EXPECTED RECEVING DATE*****\n");
            Ledger lg = new Ledger();
             
                        
 lg.DODRECORDS();
                        
                        System.out.println("\n\n\nPress any key to return to main menu: ");

                        choice = scan.nextLine();
                        
                    break;
                }

//Smart Search Citizens
                case "3": {
                    do {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                        System.out.println("*****SMART SEARCH CITIZEN*****\n");
                        System.out.println("\n---Serch citizen in Database---\n\n");

                        System.out.print("Enter Keyword to Search :");

                        String toSearch = scan.nextLine();
                        db.searching(toSearch);

                        System.out.println("\n\n\nDo you want to search again Y/N ");

                        choice = scan.nextLine();

                    } while ("y".equalsIgnoreCase(choice));
                    break;
                }

//SORTING W.R.T TIME
                case "4": {

                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("******************SORTING NICs*******************\n");
                    System.out.println("***************SORTING W.R.T Time****************\n");
                    db.SortingWTRTIME();

                    System.out.println("\n\n\nPress any key to return to main menu: ");
                    choice = scan.next();
                    break;
                }

//SORTING NAME W.R.T ALPHABETICALLY ORDER            
                case "5": {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("******************SORTING NICs*******************\n");
                    System.out.println("*****SORTING NAME W.R.T ALPHABETICALLY ORDER*****\n");

                    db.sorting(db.name);

                    System.out.println("\n\n\nPress any key to return to main menu: ");
                    choice = scan.next();

                    break;
                }

//LEDGER VIEW
                case "6": {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                    System.out.println("******************VIEW LEDGER*******************\n");
                    Ledger lg = new Ledger();

                    lg.LedgerRead("Tansaction1", 0);
                    lg.LedgerRead("Tansaction2", 1);
                    lg.LedgerRead("Tansaction3", 2);
                    lg.LedgerRead("Tansaction4", 3);
                    lg.LedgerRead("Tansaction5", 4);
                    lg.LedgerRead("Tansaction6", 5);

                    System.out.println("\n\n\nPress any key to return to main menu: ");
                    choice = scan.next();

                    break;
                }

//SECURITY CHECK
                case "7": {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                    System.out.println("******************BLOCK-CHAIN VALIDATION*******************\n");
                    db.validation();
                    System.out.println("\n\n->Hence you have seen that this Block Chain is valid");

                    System.out.println("\n->Now if any one try to manipulate our data in Block Chain");

                    System.out.println("\n\n*********AGAIN VALIDATING BLOCK CHAIN*********\n\n");
                    db.corruption();

                    System.out.println("\n\n->Now you can see that this Block Chain is in Valid");
                    System.out.println("\n\n\nPress any key to return to main menu: ");
                    choice = scan.next();
                    break;
                }
                
                case"8":{
                 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                    System.out.println("\t\t*******************     EXIT SCREEN      ********************\n");
                   
                    System.out.println("\n\t\t->\t      Thank you for using our system             ");

                    System.out.println("\n\t\t->\t                  Made by                          ");

                    System.out.println("\n\t\t***** HIRDESH KUMAR 1812114 & SYED MUSTAFA IMAM 1812134 *****\n\n");
                
                
                    System.exit(0);
                }

            }

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            System.out.println("--------------------------");
            System.out.println("   Welcome to NADARA"
                    + "     \n\n  Powerd By Block Chain");

            System.out.println("---------------------------\n\n");
            System.out.println("Select any action to perform: ");
            System.out.println("\n1. New Citizen Entery For NIC\n2. NIC Expected Receiving Date\n"
                    + "3. Smart Search Citizens\n4. Sorting W.R.T Time\n5. Sorting Name W.R.T alphabetically order"
                    + "\n6. Ledger view\n7. Security Check\n8. Exit\n\n--->");

            choice = scan.nextLine();
        } while (!"1".equals(choice) || !"2".equals(choice) || !"3".equals(choice) || !"4".equals(choice) || !"5".equals(choice) || !"6".equals(choice) || !"7".equals(choice)|| !"8".equals(choice));

    }

    public void delay(String str, int delay) {
        int l = 0;
        System.out.print("\nPlease wait while " + str + "\n\nLoading ");
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(delay);

                System.out.print(".");

            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

        }
        System.out.print("!\n\n***Done Loading***\n\n");
    }

    public void delay(int delay) {
        int l = 0;
        System.out.print("Loading ");
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(delay);

                System.out.print(".");

            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

        }
        System.out.print("!\n\n***Done Loading***\n\n");
    }

}
