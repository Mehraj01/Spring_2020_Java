package MyOwnLibrary.CODES;
import java.util.Scanner;

public class String_Practice {
    public static void main(String[] args) {

        /*
     input: cyBerTek sChool
      output:
           Cybertek
           Schoold
 */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();  // cybertek school

        String firstName = fullName.substring(0,  fullName.indexOf(" ") );
        String lastName = fullName.substring(fullName.indexOf(" ")+1    ); // School
        //cYbeRTEK

        firstName = firstName.substring(0,1).toUpperCase() +  firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("Your first name is "+firstName);
        System.out.println("Your last name is "+lastName);

    }
}
//**********************************************************************************************************************
class combinedTwoString{
    public static void main(String[] args) {
        /*
2. Ask user to enter two words. Print first word without its first character then print the
second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana

 */

       //- substring(beginning index, ending index): creates substring of the string value from the beginning index
        //		  till the ending index (ending index is EXCLUDED)
        //		              -firstName.substring(0,1); -> It will start from index zero till index 1
        //		              - "Hello" -> output: -> H
        //		- substring(beginning index): creates substring of the string value from the beginning index
        //		  till the end of the string
        //		               -firstName.substring(0,1); -> it will start from given index till ending index
        //		                - "Hello" -> output: -> ello


        Scanner input=new Scanner(System.in);
        System.out.println("Enter first word ");
        String word1=input.next();//apple
        word1=word1.substring(1);//pple
       // when we substring(1); add only index one it will starts from index one till last index

        System.out.println("Enter second word ");
        String word2=input.next();//banana
        word2=word2.substring(1);//anana

        String result=word1+" "+word2;

        System.out.println(result);


        System.out.println("======================================");

        /*
          Scanner input=new Scanner(System.in);
        System.out.println("Enter first word");
        String word1=input.next();

        System.out.println("Enter second word");
        String word2=input.next();

        String result=word1.concat(word2).concat(word2).concat(word1);
        System.out.println(result);

         */

        System.out.println("======================================");

        // my version with for loop
        Scanner scan=new Scanner(System.in);
        String result1="";
        for (int i=0; i<2; i++){
            System.out.println("Enter word ");
            String word=scan.next();
            result1+=word.substring(1);
        }
        System.out.println(result1);



    }
}

//**********************************************************************************************************************
class print_Initials{
    public static void main(String[] args) {

        // TASK 1.    Initials

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your First Name:");
        String firstName=input.next();
        System.out.println("Enter Your Last Name:");
        String lastName=input.next();

        String initials=""+firstName.charAt(0)+lastName.charAt(0);

        initials=initials.toUpperCase();
        System.out.println(initials);


    }
}

//**********************************************************************************************************************
class print_Reverse{
    public static void main(String[] args) {

        // TASK 2.    Reverse String

        String str="Java";
        // = 0123

        // with charAt(); method
        String reverse1=""+ str.charAt(str.length()-1)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        System.out.println(reverse1);

        //with substring method
        String reverse2=str.substring(str.length()-1)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);
        //from index 2 till index 3, from index 1 till index 2, from index 0 till index 1
        System.out.println(reverse2);

    }

}
//**********************************************************************************************************************
class Credentials_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUsername = input.nextLine();

        System.out.println("Enter your password");
        String inputPassWord = input.nextLine();

        boolean login=inputUsername.equals("Cybertek")&&inputPassWord.equals("School");
        //user  entered both valid username and password
        boolean invaliduser=!inputUsername.equals("Cybertek")&&inputPassWord.equals("School");
        // user enetered invalid user and valid password
        boolean invalidpassword=inputUsername.equals("Cybertek")&& !inputPassWord.equals("School");
        //user name is valid and password is invalid


        if(!inputUsername.isEmpty() && !inputPassWord.isEmpty()){// username and password are not empty
            if(login){
                System.out.println("Logged In");
            }else if(invaliduser){
                System.out.println("Password is correct and username is incorrect");
            }else if(invalidpassword){
                System.out.println("Username is correct and password is incorrect");
            }else{
                System.out.println("Both username and password is incorrect");
            }
        }else{// username and password are empty
            System.out.println("Please enter the credentials");
        }

    }
}
//**********************************************************************************************************************
class MiddleCharacter {
    public static void main(String[] args) {
        /*
3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next();  // elephant
        //  01234567

        String middleCharacter = "";  // to store the middle characters at the end

        int totalChars  =  word.length();  //8
        int middleNumber = totalChars/2; // 8/2 = 4

        if(totalChars % 2 != 0){ // odd numbers

            // middleCharacter += word.charAt( middleNumber );
            middleCharacter = middleCharacter + word.charAt( middleNumber );

        }else{  // even number
            // middleCharacter = middleCharacter + word.charAt(middleNumber -1)+word.charAt( middleNumber );

            middleCharacter +=  word.charAt(middleNumber - 1)+"" + word.charAt(middleNumber);
            /// any thing we added to a string will return it as string

        }

        System.out.println("Middle character: "+middleCharacter);


    }
}
//**********************************************************************************************************************
class Start_End_Words {
    /*
2. Write a program StartEndWords:
	you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"
3. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
			Input:
				abba
			Output:
				true
	pre condition: both words must have 5 characteres

 */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter first word");
        String word1=input.next();
        System.out.println("Enter second word");
        String word2=input.next();

        int length1=word1.length();
        int length2=word2.length();

        if(length1==5 && length2==5){
            if(word1.charAt(length2-1)==word2.charAt(0)){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }
        }else{
            System.out.println("need to be exactly 5 chars length");
        }

    }
}
//**********************************************************************************************************************
class webEndsWith{
    public static void main(String[] args) {

          /*
        write a program that can validate if a weba ddress is valid
            valid web address:
                    MUST start with www.
                    Must ends with  .com, or .edu, .net, .Gov

         */

        String web="www.amazon.com";
        web=web.toLowerCase();
        boolean validEnding=web.endsWith(".com")||web.endsWith(".edu")||web.endsWith(".gov")||web.endsWith(".net");

        if(web.startsWith("www.")&& validEnding){
            System.out.println("Valid Address");
        }else{
            System.out.println("Invalid Address");
        }

        //if(web.startsWith("www.")&&web.endsWith(".com, .edu, .net, .Gov"));
        //System.out.println("Valid");


    }
}










// Methods PracticeTasks.Practice
//**********************************************************************************************************************
class IndexOf_Method{
    public static void main(String[] args) {

        //- indexOf(Value): returns the index number of the first occurred character as an int
        //						- if the value is not exist in the String , it will return negative number
        String str = "I like Java programming John";
        int num1 =   str.indexOf("John"); // IndexOf(); method will print Johns 1st index. Index 24 = "J"
        System.out.println(num1);//24


        String str2 = "Cybertek school is awesome";
        int firstS = str2.indexOf("s"); //9
        int secondS = str2.indexOf("is") + 1 ; //   str2.indexOf("is") ==> returns the index number of i (+1 = s)
        System.out.println(firstS); // index 9
        System.out.println(secondS); // index 17


        String fullname = "Hello World";
        String firstName = fullname.substring(0,  fullname.indexOf(" ")  );// it will start from index zero till to empty space
        String lastName = fullname.substring( fullname.indexOf(" ")+1 );

        System.out.println(firstName);
        System.out.println(lastName);

        String names = "Muhtar";
        int a1 = names.indexOf("Good Guy"); // when there is no index it will return -1
        System.out.println(a1);


        String str4 = "I Like to J learn Java. I Like to watch bthe movie Jumanji";
        int a3 = str4.indexOf("J");  // returns the index num of first matching one'

        int a5 = str.indexOf(" I") +1 ; // second I' index number. Because of empty space
        System.out.println("---- "+a5);


       // - lastIndexOf(): method returns the position of the last occurrence of specified character(s) in a string.
        String s = "I like Java, and I like reading";

        int b1 =   s.lastIndexOf("I");
        System.out.println("++++ "+ b1);//17

        int b2= s.lastIndexOf("l"); //--> it will print where l last time occurred
        System.out.println(b2); // 19



    }
}
//**********************************************************************************************************************
class replace_Concat_Trim_Methods{
    public static void main(String[] args) {

       // - replace(old Value, new Value): new value will be replaced with ALL the given old value, and returns new string
        //		- replaceFirs(old Value, new Value): new value will be replaced with  the very first given old value,
        //		and returns new string
        String s2 = "I like C# Programming C# C#";
        s2 =   s2.replace("C#", "Java" ); // it will replace all "C#" with "Java"
        System.out.println("s2:  "+s2);// ==> I like Java Programming Java Java

        String r1 = "I like C#, C# is fun, C# is cool";
        r1 = r1.replaceFirst("C#", "Java");// it will replace first "C#" with "Java"
        System.out.println("r1: "+r1);// ==> r1: I like Java, C# is fun, C# is cool




        //- concat(Value): Concatenation , concat the given value to the String and returns a new value
        String s1 = "Cybertek";
        s1=s1.concat(" School"); // "Cybertek School"
        System.out.println(s1);  // s1 = Cybertek School



        //- trim(): removes the unused spaces , and returns new String
        //				- only if there is any space that's not separating the words, will be removed
        String A1 = "        Today            is           a          great       day            ";
        A1 = A1.trim();
        System.out.println(A1);

    }
}
//**********************************************************************************************************************

class startsWith_endsWith_Contains_Method{

    public static void main(String[] args) {

         /*
        every website has "www." at the begenning of the web address
         */
        String webAddress = "Www.amazon.com";
        webAddress = webAddress.toLowerCase();
        if( webAddress.startsWith("www.") ){
            // false
            System.out.println("valid");

        }

        System.out.println("===============================");

         /*
        every single gmail address ends with @gmail.com
         */
        String email = "CybertekSchool@Yahoo.com";
        if(email.endsWith("@gmail.com")){
            System.out.println("valid Gmail");
        }else{
            System.out.println("Invalid gmail");
        }

        System.out.println("===============================");

         /*
        valid password should not conatin spaces
         */
        String PassWord = "mmasd 1235";
        if(PassWord.contains(" ")){
            System.out.println("Password cannot have space in it");
        }else{
            System.out.println("valid password");
        }


    }

}
