/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Country;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Thuong
 */
public class CountryManager {

    private ArrayList<Country> country;

    public CountryManager() {
        country = new ArrayList<>();
    }

    public boolean addCountry(Country c) {
        return country.add(c);
    }

    public ArrayList<Country> searchCountryByName(String name) {
        ArrayList<Country> listSearch = new ArrayList<>();
        for (Country o : country) {
            if (o.getCountryName().toLowerCase().contains(name.toLowerCase())) {
                listSearch.add(o);
            }
        }
        return listSearch;
    }

    @Override
    public String toString() {
        String listAllCountry = "";
        for (Country o : country) {
            listAllCountry += o;
        }
        return listAllCountry;
    }

    public ArrayList<Country> getListSortCountry() {
        Collections.sort(country);
        return country;
    }
}
