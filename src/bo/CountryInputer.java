/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Country;
import entity.EastAsiaCountries;
import utils.ValidationAndNormalizingTextUtils;

/**
 *
 * @author Thuong
 */
public class CountryInputer {

    private Country c;

    public CountryInputer() {
        c = new EastAsiaCountries();
    }

    public Country getInfoCountry() {
        inputInfocomon();
        inputInfoEast();
        return c;
    }

    private void inputInfocomon() {
        c.setCountryCode(ValidationAndNormalizingTextUtils.getStringByRegex("Enter country code: ", "erro format", "[A-Za-z]+"));
        c.setCountryName(ValidationAndNormalizingTextUtils.getStringByRegex("Enter country name: ", "erro format", "[A-Za-z]+"));
        c.setTotalArea(ValidationAndNormalizingTextUtils.getFloat("Enter area: ", "Erro number format ", "out of ranger", 0.f, Float.MAX_EXPONENT));
    }

    private void inputInfoEast() {
        String countryTerian = ValidationAndNormalizingTextUtils.getStringByRegex("Enter terrain country : ", "erro format", "[A-Za-z]+");
        ((EastAsiaCountries) c).setCountryTerian(countryTerian);
    }
}
