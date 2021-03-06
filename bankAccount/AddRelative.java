package bankAccount;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AddRelative {

    /*
    Create an instance variable
        String fullName , age
     */
    //--------------------------------------------------------------------------------------------------

private String fullName, age;


    //--------------------------------------------------------------------------------------------------
    /*
        Create a constructor AddRelative
            parameters String fullName and age

        instance variable fullName equal to parameter fullName

        If the age is more then or equal to 18 then instance variable age equal to parameter age (use relativeAgeChecker method)
        If the age is less then 18 then instance variable age equal to "0"

     */

    /*
        String fullName ve age olan AddReative  parametresi olan constructorunu oluşturun


        instance variable fullName eşittir parameter fullName' e

        Eğer age 18 e eşit veya büyük ise  instance variable age eşittir  parameter age (use relativeAgeChecker method) e.
         Eğer age 18 den küçük ise instance variable age eşittir "0"  .

     */
    //--------------------------------------------------------------------------------------------------

    public AddRelative(String fullName, String age) {
        this.fullName = fullName;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(age,formatter);
        LocalDate date2 = LocalDate.now();
        int age1 = Period.between(date1,date2).getYears();
        if (age1>= 18)
            this.age=age;
        else this.age="0";
    }


    //--------------------------------------------------------------------------------------------------

    /*
        Create a method name is relativeAgeChecker
        parameter String(relativeAge)
        return type is boolean

        if the relativeAge more or equal to 18 then return true
        else false

        Note: use a Users class checkAge method.
     */



    /*
       ---Parametresi String relativeAge ve return tipi boolean olan
          relativeAgeChecker  methodunu oluşturun
       --- Eğer relativeAge 18 den büyük veya eşit ise true return et
           aksi halde false return et

       Not :  Users class checkAge methodunu kullan


     */
    //--------------------------------------------------------------------------------------------------

public boolean relativeAgeChecker(String relativeAge){
    boolean age;
    if (Users.checkAge(relativeAge).equals("You can get a credit card")) {
        age = true;
    }
    else age=false;

    return age;
}




}
