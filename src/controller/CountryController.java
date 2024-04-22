/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.CountryInputer;
import bo.CountryManager;
import entity.Country;
import java.util.ArrayList;
import utils.ValidationAndNormalizingTextUtils;

/**
 *
 * @author Thuong
 */
public class CountryController {

    private CountryInputer countryInputer;
    private CountryManager countryManager;

    public CountryController() {
        countryManager = new CountryManager();
    }

    public Country addCountry() throws Exception {
        countryInputer = new CountryInputer();
        Country c = countryInputer.getInfoCountry();
        countryManager.addCountry(c);
        return c;
    }

    public ArrayList<Country> searchCountryByName() {
        String name = ValidationAndNormalizingTextUtils.getStringByRegex("search by name", "please name you want to search", "[a-zA-Z]+");
        return countryManager.searchCountryByName(name);
    }

    public ArrayList<Country> displayAffterSort() {
        return countryManager.getListSortCountry();
    }

    public void displayAllCountry() {
        countryManager.displayAllCountry();
    }

}
