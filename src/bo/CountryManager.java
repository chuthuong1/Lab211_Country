/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Country;
import entity.EastAsiaCountries;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Thuong
 */
public class CountryManager {

    private ArrayList<Country> country;

    public CountryManager() {
        country = new ArrayList<>();
    }

    public boolean addCountry(Country c) throws Exception {
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

    public void displayAllCountry() {
        for (Country country : country) {
        System.out.println(String.format("%-10s %-20s %-25.1f %-10s",
                country.getCountryCode(),
                country.getCountryName(),
                country.getTotalArea(),
                ((EastAsiaCountries) country).getCountryTerian())); // Đưa phần này vào hàm format
    }
    }

    public ArrayList<Country> getListSortCountry() {
        Country[] countryArray = country.toArray(new Country[country.size()]);
        Arrays.sort(countryArray);
        return new ArrayList<>(Arrays.asList(countryArray));
    }
}
