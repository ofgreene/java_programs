// Oliver Greene, CSC220 - Summer, HW5

/*
• Define an Airport class with code, name, city, state, and country properties
• Write a method that instantiates an airport object from one line of the fil
• Define an Airports class (note the plural) that contains a collection of Airport objects
   It should also have methods returning number of airports and the ability to edit individual Airport values
• Write a method in the Airports class that populates the collection from the file you saved earlier (single parameter would be the filename, including path)
  Method should ignore “uninteresting” lines 
*/
package hw5;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class AirportTester {
    
    
    public static void main(String[] args)throws Exception{
        
        File fAirportsIn = new File("C:\\Users\\ofgre\\OneDrive\\Documents\\CSC 220\\New Folder\\HW5\\airport_codes_source.txt");
        Airports airports = new Airports();
        airports.getAirportsOne(fAirportsIn);
    }
    
}
