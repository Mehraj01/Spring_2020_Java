package MyOwnLibrary.Notes;
/*

  Operators, Variables, If Statement, Switch Statement, Scanner Class, String Class

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
>>>> OPERATORS

--> Escape sequences: must be given within ""
	 \t: paragraph space
	 \n: new line
	 \": prints double quote " on the console
	 \\: prints \ on the console
	 \': prints single quote
	 ' : prints single quote


--> comparision operators: returns boolean
		> : greater
		>= : greater or equal
		< : less
		<= : less or equal
		== : equal
		!= : not equal

== vs = :
		= : assigning values to variables
		== : comparing the equality


-> Arithmetic operators: only works with numbers
			+ : addition
			- : subtraction
			* : multiplication
			/ : division
				a number cannot be divided by 0
			% : remainder

				10 / 4 = 2.5
				remainder: numerator - (denominator * result of wholeNumber )
							10 - (4 * 2) = 2

				10 / 3 = 3.333...
				remainder: 10 - (3 * 3) =1

				10 % 4 ==> 2 when 10 is divided by 4, there is a remainder 2
				10 % 3 ==> 1


--> Unary Operators:
			+ : Positive
				int a = 10;
				int b = +a;
			- : negative
				int a = -10;
				boolean result = a > 0 ; ==> false
			-- : decrement, decrease the value of the variable by 1
			++ : increment, increase the value of the variable by 1
			! :


--> Shorthand operators:
			+=: addition assignment
			-=: subtraction assignment
			*=: multiplication assignment
			/=: division assignment
			%=: remainder assignment



--> Relational operators: returns boolean
		>, <, <=, >=, ==, !=


--> Logical Operators: can apply to boolean expression, returns boolean

	- !: logical opposite operators
	- &&: and logic --> THE ONLY TIME AND LOGIC RETURNS TRUE IS WHEN BOTH CONDITION ARE TRUE, OTHERWISE ==> FALSE
    - |: or logic --> THE ONLY TIME OR LOGIC RETURNS FALSE IS WHEN BOTH CONDITIONS ARE FALSE, OTHERWISE ==>TRUE


--> Operators that return boolean: >, <, <=, >=, ==, !=, &&, ||, !


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

-> Concatenation vs addition: +

		number + number ==> addition
		text + number ==> concatenation
		number + text ==> concatenation
		text + text ==> concatenation


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

>>>> VARIABLES

--> Variables: makes the data reusable
		- declare variables:
			DataType  variableName = Data;

		- variable name rules:
				1. Must be started with letters
				2. MUST be Unique
				3. cannot be Java Reserved words
				4. cannot contain special character other $ and _

--> Local variables: variables that are declared within the method
		- must be initialized before we use it, otherwise will always give compiler error
        - local variables cannot be used outside its block


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

--> Single if statement:
			if(Condition){
				code fragment1;
			}
			execution of the code fragment1 depends on the condition


--> if & else statement: where there only 2 possibilities, not more or not less

			if(Condition){
				Statement1;
			} else {
				statement2;
			}

		if block only executed if the condition is true
		else block only gets executed if the condition of if block is false

		statement 1: if the condition is true
		statement 2: if the condition is false

		** ONLY ONE OF THE BLOCKS GETS EXECUTED


--> Multi branch if statement (else if) : if there are more than two possibilities, or option

			if(Condition1){
					statement1;  // gets executed if condition1 is true
			} else if(condition2){
					statement2; // gets executed if condition1 is false and condition2 is true
			} else {  // other wise
					statement3;  // gtes executed if all condition1 & 2 are failed
			}

	** ONLY ONE OF THE BLOCK GETS EXECUTED


--> if statement without curly braces: the block can only contain a single statement without the curly brace
        if(9>8)
            System.out.println("9 is greater than 8");
                ** THIS IS NOT A GOOD HABIT


--> Ternary: if statement' short cut
        int num =100;
        String result = "";
        if(num %2 == 0){
            result = "Even";
        }else {
            result = "Odd";
        }

        ? means if keyword, : means the else keyword
        converting to ternary:
              variable  = (condition)? body : body;
              String result2 = (num %2 == 0) ? "Even" : "Odd";

        IN TERNARY TOTAL NUMBER OF ? AND TOTAL NUMBER OF : MUST BE EQUAL


--> Nested If: if the condition can be evaluate to multiple scenario

            - if multiple scenario execution depends on a specific requirment
            - if we have precondition

            if(pre-condition){
                    statementA
                if(Condition1){
                    statementB
                }
            }

        statementA: only if precondition is true
        only statementA: if precondition is true, condition1 is false

        statementB: if precondition is true, and condition1 is true
        only statementB: impossible


// if the block contains more than one statement we must give body

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

>>>> Switch statement:

    syntax:
        switch(expression){
            case  caseValue1:
                        statement;
                        break;
            case  caseValue2:
                        statement;
                        break;
            case  caseValue3:
                        statement;
                        break;
            default:
                statement;
                break;
        }
        - switch-case statement is used to compare the value of a variable with multiple values and execute some
          statements based on the match
        - switch statement' expression cannot be boolean
        - caseValues MUST be matching with the switch statement's expressions
        - caseValue MUST be unique
        - default: gets executed if none of case are matching
        - break statement: used for exiting the switch statement' block
        - Break statement is not mandatory
        - default section is not mandatory
        - if we do not give break statement, then the next available code fragments in switch will be executed
        - switch does not 4 data type accept: long, float, double, boolean




>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

>>>> Scanner Class


--> Scanner class: has the methods to help us to get the user input

            presented in "java.util" package
            in order to use the scanner first we will have to import it:
                         syntax:   import packageName.className;
                                    import java.util.Scanner;
            import statement MUST be places between class name and package name:
                            package A;
                            import java.util.Scanner;
                            public classB{
                            }


- Scanner class is one of the class of Java which provides the methods to get inputs.
- Scanner class is present in java.util package so we have to import this package in our program.
- Scanner is a class which must be instantiated before it can be used.
- System.in is the parameter passed to the Scanner constructor so that Java will know to
connect the new Scanner to the keyboard.

--> Declare scanner:
        Scanner   variableName  =  new  Scanner(System.in);
         variableName: will be reference to scanner object
                    though variableName we can call the methods of scanner


--> methods of Scanner:

     nextByte(): allows user to enter byte value, takes it as byte primitive
     nextShort(): allows user to enter short number, takes it as short primtive
     nextInt(): allows user to enter int number, takes it as int primtive


        nextByte(): returns the input as byte primitive
        nextShort(): returns  the input as short primitive
        nextInt(): returns the input as int primitive
        nextLong(): returns the input as long primitive
        nextFloat(): returns the input as float primitive
        nextDouble(): returns the input as double primitive
        nextBoolean(): returns the input as boolean primitive
        next(): returns the userInput as String
                ONLY THE FIRST WORD
                "TODAY IS GREAT DAY" ==> TODAY
        nextLine(): TAKES EVERYTHING IN THE SCANNER, EVEN THE "ENTER" KEYWORD

        close(): --> closes the scanner






>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


>>>> String Class: presented in "java.lang" package, any class in package "java.lang" will be imported automatically
		1. Object, 	there are two ways we can create string object
				1. String literals:
						String str1 = "Muhtar";
				2. new keyword:
						String str2 = new String("Cybertek");

			- String pool: special memory location for all String literal objects
			- Java Heap: memory location in java that where all objects will be saved at

		2. String is IMMUTABLE:
				- once the object is created, cannot change it

		3. String represents the sequences of characters
				- each character in String has a representative number called index number

				- index number: starts from zero, cannot be less than zero
				String str ="Cybertek";
				// index:    01234567 .....

				String str2 = "Cat dog";
				//index:       01234



>>>> String manipulations:

		- charAt(indexNumber): it returns the char at the given index
		- length(): returns the total number of characters as int
				- length is ALWAYS one unit above the maximum index number
					maxIndex: length()-1;
		- concat(Value): Concatenation , concat the given value to the String and returns a new value
		- toLowerCase(): converts to lowercase and returns a new String
		- toUpperCase(): converts to uppercase and returns a new String
		- trim(): removes the unused spaces , and returns new String
				- only if there is any space that's not separating the words, will be removed
		- substring(beginning index, ending index): creates substring of the string value from the beginning index
		  till the ending index (ending index is EXCLUDED)
		              -firstName.substring(0,1); -> It will start from index zero till index 1
		              - "Hello" -> output: -> H
		- substring(beginning index): creates substring of the string value from the beginning index
		  till the end of the string
		               -firstName.substring(0,1); -> it will start from given index till ending index
		                - "Hello" -> output: -> ello
		- replace(old Value, new Value): new value will be replaced with ALL the given old value, and returns new string
		- replaceFirs(old Value, new Value): new value will be replaced with  the very first given old value, and returns new string
		- indexOf(Value): returns the index number of the first occurred character as an int
						- if the value is not exist in the String , it will return negative number
        - lastIndexOf(): method returns the position of the last occurrence of specified character(s) in a string.

- substring(beginning index, ending index): creates substring of the string value from the beginning index
- substring(beginning index): creates substring of the string value from the beginning index



>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

 */