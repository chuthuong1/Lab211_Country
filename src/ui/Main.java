/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.CountryController;
import utils.ValidationAndNormalizingTextUtils;
import entity.Country;
import java.util.ArrayList;

/**
 *
 * @author Thuong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CountryController countryController = new CountryController();
        while(true) {
            System.out.println("");
            System.out.println("                                MENU                     ");
            System.out.println("=========================================================================");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of country you've just input");
            System.out.println("3. Search the information of country by user-entered name");
            System.out.println("4. Display the information of countries sorted name in ascending order");
            System.out.println("5. Exit");

            int choice = ValidationAndNormalizingTextUtils.getInt("Input choice", "Only text ", "[0-5]", 1, 5);
            switch (choice) {
                case 1:
                    try {
                        Country c = countryController.addCountry();
                        System.out.println(Country.STRING_COUNTRY);
                        System.out.println(c);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println(Country.STRING_COUNTRY);
                    System.out.println(countryController.displayAllCountry());
                    break;
                case 3:
                    ArrayList<Country> listCountry = countryController.searchCountryByName();
                    System.out.println(Country.STRING_COUNTRY);
                    for (Country country : listCountry) {
                        System.out.println(country);
                    }
                break;
                
                case 4:
                    ArrayList<Country> listSort = countryController.displayAffterSort();
                    System.out.println(Country.STRING_COUNTRY);
                    for (Country country : listSort) {
                        System.out.println(country);
                    }
                    break;
                case 5: 
                    System.exit(5);
                    break;
            }
            
        }

    }

}
