/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Thuong
 */
public class EastAsiaCountries extends Country {

    private String countryTerian;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryTerian, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerian = countryTerian;
    }

    public EastAsiaCountries(String countryTerian) {
        this.countryTerian = countryTerian;
    }

    public String getCountryTerian() {
        return countryTerian;
    }

    public void setCountryTerian(String countryTerian) {
        this.countryTerian = countryTerian;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "%-25s\n", countryTerian);
    }

}
