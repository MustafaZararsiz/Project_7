package bankAccount;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Users {



    /*
        Create String variable name password dateOfBirth marriageStatus  relativeName relativeAge isTransferedSuceesfully
        Create int  accountNumber amountAccount1 accountNumber2 amountAccount2

        all public
     */


    /*
    --String name ,password, dateOfBirth, marriageStatus,  relativeName, relativeAge, isTransferedSuceesfully  değişkenlerini oluşturun.
    --int accountNumber, mountAccount1 , accountNumber2 , amountAccount2   değişkenlerini oluşturun.
    -- hepsi public olsun
     */
    //--------------------------------------------------------------------------------------------------


    public String name, password, dateOfBirth, marriageStatus,  relativeName, relativeAge, isTransferedSuceesfully;
    public int accountNumber, amountAccount1, accountNumber2, amountAccount2;



    //--------------------------------------------------------------------------------------------------
    /*
    Create a constructor
    Parameters are String name , passwod , dateOfBirth , marriageStatus
    Int amountAccount1 , amountAccount2

    variable name equal to parameter name
    same for password
    same for amountAccount1
    same for amountAccount2

    Following also in the constructor

    variable accountNumber get the the number from the  randomNumberCreader method
    variable accountNumber2 get the the number from the  randomNumberCreader method
    variable marriageStatus equal to CheckMariageStatus method return
    variable dateOfBirth equal to checkAge return

     */


    /*
    --Parametreleri String name , passwod , dateOfBirth , marriageStatus ve
      Int amountAccount1 , amountAccount2 olan constructor oluşturun

    -- variable name  parameter name e eşittir.
    -- variable password  parameter password a eşittir.
    -- variable amountAccount1  parameter amountAccount1 e eşittir.
    -- variable amountAccount2  parameter amountAccount2 e eşittir.

    --  variable accountNumber   randomNumberCreader methodundan sayı almalı
    --  variable accountNumber2   randomNumberCreader methodundan sayı almalı
    -- variable marriageStatus CheckMariageStatus methodunun  return una eşittir
    -- variable dateOfBirth  checkAge  methodunun return una eşittir
     */
    //--------------------------------------------------------------------------------------------------

    public Users(String name, String password, String dateOfBirth, String marriageStatus, int amountAccount1, int amountAccount2) {
        this.name = name;
        this.password = password;
        this.dateOfBirth = checkAge(dateOfBirth);
        this.marriageStatus = CheckMariageStatus(marriageStatus);
        this.amountAccount1 = amountAccount1;
        this.amountAccount2 = amountAccount2;
        this.accountNumber = r1;
        this.accountNumber2 = r2;
    }




    //--------------------------------------------------------------------------------------------------


    public String CheckMariageStatus(String marriageStatus){
        String text="";
        Scanner read = new Scanner(System.in);
        System.out.print("Marital status? ");
        String married= read.nextLine();
        if (married.toLowerCase().contains("married")){
            System.out.print("Do you want to add add your relative? ");
            String addRelative = read.nextLine();
            if (addRelative.toLowerCase().contains("yes")){
                System.out.print("What is your relative name? ");
                this.relativeName= read.nextLine();
                System.out.print("Date of birth relative? ");
                this.relativeAge = read.nextLine();

                AddRelative relative = new AddRelative(relativeName, relativeAge);

                if (relative.relativeAgeChecker(relativeAge)){
                    text="Transaction done successfully";

                }
                else{
                    this.relativeName="Relative should be more then 18 years old";
                    this.relativeAge="Relative should be more then 18 years old";
                }
            }
        }
        return text;
    }
    /*
        Create method name is  CheckMariageStatus
        parameter is String(marriageStatus)
        return type is String

        if String marriageStatus is married

        Ask to user (use scanner class)
        Do you want to add add your relative?

        if the user say Yes
        Ask to user
        What is your relative name?
        Ask to user
        Date of birth relative?

        Then Add the relative(Use AddRelative class )
        relativeName variable equal to AddRelative class fullName
        relativeAge variable equal to AddRelative class age

            if relativeAge equal to "0"
                then change the relativeName to "Relative should be more then 18 years old";
                then change the relativeAge to "Relative should be more then 18 years old";
                return the "Relative should be more then 18 years old";
            if the relativeAge is not equal to "0"
               return Transaction done successfully

        If the user say No
        then no need to add anything.
     */


    /*

       -- Parametresi String(marriageStatus) ve return  tipi String olan CheckMariageStatus methodunu oluşturun
       if String marriageStatus is married

       -- Eğer String marriageStatus  married ise

       Kullanıcıya sor ( scanner class kullan)
       Do you want to add add your relative?

       --Eğer kullanıcı Yes derse
       Kullanıcıya sor
       What is your relative name?
       Kullanıcıya sor
       Date of birth relative?

       Sonra  relative(Use AddRelative class ) ekle
       relativeName variable  AddRelative class fullName eşittir
       relativeAge variable  AddRelative class age  eşittir

           --Eğer relativeAge  "0"  a eşit ise
                relativeName i  "Relative should be more then 18 years old";  e değiştir
                relativeAge i  "Relative should be more then 18 years old";   e değiştir
               return   "Relative should be more then 18 years old";   olmalı
           -- Eğer the relativeAge  "0" a eşit değilse
               return Transaction done successfully

      -- Eğer kullanıcı No derse
       hiçbirşey eklemeye gerek yok.
    */
    //--------------------------------------------------------------------------------------------------





    //--------------------------------------------------------------------------------------------------
    /*
       Create a static method name is checkAge
       parameter is one String(myDOB)
       return type is String

       Compare today date to myDOB

       if myDOB compare to today date is 18 then return "You can get a credit card"

       if myDOB compare to today date is less then 18 "You should be at least 18 years old to get a credit card."

       For example today date is 10/05/2020

       if myDOB is 09/05/2002

       return should be  "You can get a credit card"

       if myDOB is 11/05/2002

       return should be  "You should be at least 18 years old to get a credit card."

    */


    /*

        -- Parametresi String(myDOB) ve return  tipi String olan checkAge static methodunu oluşturun

        -- taday date i myDOB ile karşılaştır

        -- Eğer compare to today date 18 ise "You can get a credit card" et

        -- Eğer compare to today date 18 den küçük ise "You should be at least 18 years old to get a credit card."
        return et.





        Örnek today date  10/05/2020 ise

        Eğer myDOB  09/05/2002 ise

        return   "You can get a credit card"  olmalı

        Eğer   myDOB  11/05/2002  ise

        return  "You should be at least 18 years old to get a credit card."  olmalı

     */
    //--------------------------------------------------------------------------------------------------


static String checkAge(String myDOB){

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate date1 = LocalDate.parse(myDOB,formatter);
    LocalDate date2 = LocalDate.now();
    int age = Period.between(date1,date2).getYears();
    if (age<18)
        return "You should be at least 18 years old to get a credit card.";

    else return "You can get a credit card";
}



    //--------------------------------------------------------------------------------------------------
    /*
        Create a Random number which is returning 8 digit number

            it should be between 10000000 - 99999999

     */
    int r1 = (int) (Math.random() * (99999999 - 10000000)) + 10000000;
    int r2 = (int) (Math.random() * (99999999 - 10000000)) + 10000000;

    /*

       8 basamak sayı döndüren Random sayı oluştur

           Bu sayı  10000000 - 99999999 arasında olamalı

    */



    /*
        Create a method name is transfer
        Parameters are two Users object
        Return type is void

        In this method
            First ask to user "Do you want to transfer between your accounts or different user" (use scanner class)

        if the answer is own
            Call the method transferToOwnAccount in the Account class

        if the answer different
            Call the method transferOtherUser in the Account class

     */

    public void transfer(Users users1, Users users2){
    Scanner read1= new Scanner(System.in);
    Scanner readInt = new Scanner(System.in);
    int amount = 0;
    String text1 = "";
        System.out.println("Do you want to transfer between your accounts or different user");
        text1=read1.nextLine();
        if (text1.equalsIgnoreCase("own")){
            System.out.print("Enter amount of money= ");
            amount=readInt.nextInt();
            Account.transferToOwnAccount(users1,amount);
        }
        else {
            System.out.print("Enter amount of money= ");
            amount=readInt.nextInt();
            Account.transferOtherUser(users1, users2, amount);
        }
    }

    /*

        -- Parametreleri iki tane Users object olan return tipi void olan transfer adında method oluştur.


        -- Bu method içinden
           Önce kullanıcıya sor  "Do you want to transfer between your accounts or different user" ( scanner class kullan)

      - Eğer cevap own ise
            Account class içinde transferToOwnAccount methodunu çağır

      - Eğer cevap farklı ise
           Account class içinde transferOtherUser methodunu çağır


     */
//--------------------------------------------------------------------------------------------------






//--------------------------------------------------------------------------------------------------
    /*
        Print the object using toString method

        like
         return "\nname: " + name +
                "\npassword: " + password+
                "\ndateOfBirth: " + dateOfBirth+
                ......

     */


    /*

       toString methodunu kullanarak objecti print et


        return "\nname: " + name +
               "\npassword: " + password+
               "\ndateOfBirth: " + dateOfBirth+
               ......


               gibi

    */
    //--------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\n' +
                ", password='" + password + '\n' +
                ", dateOfBirth='" + dateOfBirth + '\n' +
                ", marriageStatus='" + marriageStatus + '\n' +
                ", relativeName='" + relativeName + '\n' +
                ", relativeAge='" + relativeAge + '\n' +
                ", isTransferedSuceesfully='" + isTransferedSuceesfully + '\n' +
                ", accountNumber=" + accountNumber +'\n' +
                ", amountAccount1=" + amountAccount1 +'\n' +
                ", accountNumber2=" + accountNumber2 +'\n' +
                ", amountAccount2=" + amountAccount2 +'\n' +
                '}';
    }
}
