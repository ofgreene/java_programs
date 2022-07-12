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


public class Airport {
    private String code;
    private String name;
    private String city;
    private String state;
    private String country;

    public Airport(String code, String name, String city, String state, String country) {
        this.code = code;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Airport{" + "code=" + code + ", name=" + name + ", city=" + city + ", state=" + state + ", country=" + country + '}';
    }
    
      
    }
    
 