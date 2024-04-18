/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Thuong
 */
public class ValidationAndNormalizingTextUtils {

    public static String getStringByRegex(String mess, String erro, String regex) {
        Scanner scan = new Scanner(System.in);
        String output = null;
        while (true) {
            System.out.println(mess);
            output = scan.nextLine();
            if (output.matches(regex)) {
                return output;
            } else {
                System.out.println(erro);
            }
        }
    }

    public static int getInt(String mess, String erroNumberFormat, String outOfranger, int min, int max) {
        while (true) {
            int ret = Integer.parseInt(getStringByRegex(mess, erroNumberFormat, "[0-9]+"));
            if (ret < min || ret > max) {
                System.out.println(erroNumberFormat);
            } else {
                return ret;
            }
        }
    }

    public static float getFloat(String mess, String erroNumberFormat, String outOfRange, float min, float max) {
        while (true) {
            try {
                float ret = Float.parseFloat(getStringByRegex(mess, erroNumberFormat, "[0-9]+\\.+[0-9]+"));
                if (ret < min || ret > max) {
                    System.out.println(outOfRange);
                } else {
                    return ret;
                }
            } catch (NumberFormatException e) {
                System.out.println(erroNumberFormat);
            }
        }
    }
    

    public static String getDate(String messe) {
        Scanner scan = new Scanner(System.in);
        String input;
        Date date = null;
        String resultDate;

        do {
            System.out.println(messe);
            SimpleDateFormat dateFomat = new SimpleDateFormat("dd-MM-yyyy");
            dateFomat.setLenient(false);
            input = scan.nextLine();
            if (input.isEmpty()) {
                System.out.println("Date not empty");
                continue;
            } else if (!input.matches("d{1,2}[-]\\d{1,2}[-]\\d{4}")) {
                System.out.println("Worong date format");
                continue;
            }

            try {
                date = dateFomat.parse(input);
                Date now = new Date();
                if (date.before(now)) {
                    System.out.println("Date could not be in the past.");
                    continue;

                }
            } catch (Exception e) {
                System.out.println("Date not exit ");
            }
            break;

        } while (true);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        resultDate = dateFormat.format(date);
        return resultDate;
    }

    public static String getNonEmptyString(String mess) {
        String ret = "";
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print(mess);
            ret = removeUnnecessaryBlank(scan.nextLine());
            if (ret.equalsIgnoreCase("")) {
                System.err.println("Please input Non-Empty String!!!");
                continue;
            }
            return ret;
        }
    }

    public static String removeUnnecessaryBlank(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    public static String removeAllBlank(String input) {
        return input.trim().replaceAll("\\s+", "");
    }
}
