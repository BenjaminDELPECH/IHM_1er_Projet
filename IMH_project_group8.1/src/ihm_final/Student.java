package ihm_final;

/**
 * Class Student
 * This class is the representation of a student, with all his information. 
 * @author group 8.1
 * @version 2019
 */
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class Student {
    private String firstName;
    private String lastName;
    private String year;    // birth year of the student
    private String promo;
    private CheckBox checkbox;  
    private Button update;
    
        Student(String fName, String lName, String year, String promo) {
        this.firstName = fName;
        this.lastName = lName;
        this.year = year;
        this.promo = promo;
        this.checkbox = new CheckBox();
        this.update = new Button("Modifier");
    }
    /*  
    * Allows to get the first name of the student
    */
    public String getFirstName() {
        return firstName;
    }
    
    /*  
    * Allows to set the first name of the student
    */
    public void setFirstName(String fName) {
        this.firstName= fName;
    }
    
    /*  
    * Allows to get the last name of the student
    */    
    public String getLastName() {
        return lastName;
    }
    
    /*  
    * Allows to set the last name of the student
    */
    public void setLastName(String fName) {
        this.lastName= fName;
    }
    
    /*  
    * Allows to get the year of birth of the student
    */
    public String getYear() {
        return year;
    }
    
    /*  
    * Allows to set the year of birth of the student
    */
    public void setYear(String year) {
        this.year = year;
    }
    
    /*  
    * Allows to get the promo of the student
    */
    public String getPromo() {
        return promo;
    }
    
    /*  
    * Allows to set the promo of the student
    */
    public void setPromo(String promo) {
        this.promo = promo;
    }

    /*  
    * Allows to get the checkBox of the student
    */
    public CheckBox getCheckbox() {
        return checkbox;
    }
 
    /*  
    * Allows to set the checkBox of the student
    */
    public void setCheckBox(CheckBox checkbox) {
        this.checkbox = checkbox;
    }
    
    /*  
    * Allows to have a button that get the updates
    */
    public Button getUpdate(){
        return this.update;
    }
    
    /*  
    * Allows to do updates
    */
    public void setUpdate(Button update) {
        this.update = update;
    }
}