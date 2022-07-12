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


public class Airports {
    
    ArrayList<Airport> airportList = new ArrayList<>();
    
    public void getAirportsOne(File fAirportsIn)throws Exception {
        ArrayList<String> justLines = new ArrayList<>();
        ArrayList<String> codeLines = new ArrayList<>();
        ArrayList<Object> cleanerLines = new ArrayList<>();
        
       System.out.println("Start here");
        // parsing entire file to array list justLines by line
      if(!fAirportsIn.exists()){
          throw new FileNotFoundException("File not found");
      }
        try (Scanner scnrIn = new Scanner(fAirportsIn)) {
            while(scnrIn.hasNext()){
                String sAirportLine = scnrIn.nextLine().strip();
                justLines.add(sAirportLine);
            }
            
            // adding only airport code lines to array list codeLines
        for(int i = 0; i < justLines.size(); i++) {
            if(justLines.get(i).length() != 0 && justLines.get(i).length() > 7){ 
            
                if(justLines.get(i).substring(0, 8).equals("<tr><td>")){
                    String codeLine = justLines.get(i);
                    codeLines.add(codeLine);                
                }
            }
                       
        }   
        //System.out.println(codeLines);
        
        // splitting single line elements into intermediate array cleanCodes, then adding to cleanerLines arrayList
        String[] cleanCodes;
        for(int i=0; i< codeLines.size(); i++){
            cleanCodes = codeLines.get(i).split("</td><td>");
            cleanerLines.add(cleanCodes);
        }
        //System.out.println(cleanerLines);
        }
        
        for(int i=0; i < cleanerLines.size(); i++){
           String[] cleanedLines = (String[]) cleanerLines.get(i);
           String code = cleanedLines[0].substring(8,11);
           String name = cleanedLines[1];
           String city = cleanedLines[2];
           String state = cleanedLines[3].substring(0, 2);
           
           Airport airport = new Airport(code, name, city, state, "USA");
           airportList.add(airport);
        }
        System.out.println(airportList.size());
        System.out.println(airportList);    
    }
    
    public int getAirportNumber(){
        return(airportList.size());
    }
    
    @Override
    public String toString() {
        return "Airports{" + "airportList=" + airportList + '}';
    }
    
    
    
}
