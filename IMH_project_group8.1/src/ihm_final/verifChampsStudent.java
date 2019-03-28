package ihm_final;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class FXMLDocumentController
 * This class allows to verify the field of the application, for more security. 
 * @author group 8.1
 * @version 2019
 */
public class verifChampsStudent {

    /*
    * This method allows to verify the last name (of first name) of a student
    * Return 0: The field is correctly fill in
    * Return 1: The field is empty
    * Return 2: The value of the field contains illegals caracters
    *
    * @param : name - Check if the variable 'name' is correctly fill in
    */
    static int verifName(String name) {
        Pattern pattern;
        Matcher matcher;

        //Illegal caracter verification using regex and regular expression
        pattern = Pattern.compile("((\\d)|(^\\s))|(\\s$)|([&~²\"\\(\\)\\{\\}\\[\\]\\|\\+\\*\\/\\#\\_\\@\\%\\€\\$\\£\\¤\\µ\\,\\?\\;\\.\\:\\§\\!])");
        matcher = pattern.matcher(name);

        //Check if the the pattern given is find in the field value
        if (matcher.find()) {
            return 2;
        }
        else if (name.length()==0) {
            return 1;
        } 
        else {
            return 0;
        }
    }

    /*
    * This method allows to verify the birthday year of a student
    * Return 0: The field is correctly fill in
    * Return 1: The field is empty
    * Return 2: The value of the field is greater than the current date
    * Return 3: The value of the field is lower than the date 1900
    *
    * @param : yearBirth - Check if the variable 'yearBirth' is correctly fill in
    */
    static int verifDateOfBirth(int yearBirth) {
        //Stock the current year in the variable 'year'
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        
        if (String.valueOf(yearBirth).length() == 0) {
            return 1;
        } 
        
        else if (yearBirth > year) {
            return 2;
        } 
        else if (yearBirth < 1900) {
            return 3;
        } 
        else {
            return 0;
        }
    }
}
