package MyOwnLibrary.trash;

/*
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




 */