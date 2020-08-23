package MyOwnLibrary.Notes;
/*

-> final: constant, cannot be changed.
		can only be applied to:
				1. variables: cannot be reassigned
				            - Finale instance variable needs to be initialize immediately
				            - Final static variables need to be initialized immediately
				            - Cannot be reassign
				2. methods: implementation of the method can never be changed
							- final, static methods cannot be override, can be overload
							- instance , static method can be final
							- constructors cannot be final
				3. class: immutable class, cannot be inherited
				 			- final class cannot be super class
				 			- For exp: String class immutable because it is final class
				 			- Sub class can be final

>>> If Instance private variable is final then it we can not generate a setter method because value is final and
Setter help us to change the data but we can generate getter method.
Fox exmp: Username and password ==> we can make it final private


 -> Abstraction

- abstraction:
       - hiding the implementation details
	   - concentrating on essentials things, without worrying about the details

- abstract method:
      - a method without body/implementation
	  - a method that's meant to be override. It is mandatory to override the abstract super class method in the subclass
	  - We have to override the abstract class method in the non-abstract class.
	  - only instance method can me abstract
	  - It can not be final, static, private
	  - public abstract void method(); ==> method without body
	  - in regular class we can not create abstract method. Because in regular class we cannot create method without body
	    Because of that we have to override it
	  - when we override abstract method, access modifier have to be same or more visible
	  - we add body adn implementation when abstract method overriding in sub class
	  - we may have multiple abstract methods in the abstract class. And we have to override all of them

- two ways of achieving abstraction:
	  - 1. abstract class
	  - 2. Interface

- abstract class:
      - a class that's meant to be inherited
      - abstract class can not be final
	  - we cannot create objects from abstract class. Because abstract is not concrete, object has to be concrete. (concrete means physically exist)
	  - when abstract class extended by regular class: - we MUST override ALL the abstract methods of super class
	  - when abstract class extended by abstract class: - no need to override any abstract methods


-> Abstract Class ex:

		RemoteWebDriver: -> Abstract Class
				get(URL); -> Abstract method
				quit();  -> Abstract method

		Chrome extends RemoteWebDriver:
				get(URL): opens the chrome
				quit(): quits the chrome

		FireFox extends RemoteWebDriver:
				get(URL): opens the firefox
				quit(): quits firefox

		Opera extends RemoteWebDriver:
				get(URL): opens the Opera
				quit(): quits Opera

		Cybertek extends RemoteWebDriver:
				get(URL): opens the Cybertek Browser
				quit(): closes the cybertek Browser






-> abstract class vs non-abstract class:
	-> non-abstract class:
		can not: -> abstract methods
		can:-> constructor, instance method, static method, instance block, static block, instance variable, static variable...

	-> abstract class:
		can: -> constructor, instance method, static method, instance block, static block, instance variable, static variable... AND ASBTRACT METHOD
        can not: -> cannot create object, cannot be final


-> OOP Abstraction:
			- Abstract method
			- Abstract class
			- Interface




-> shortcut to override the abstract methods of super class:
		for Mac:
			1. hold "Option"
			2. Hit Enter
			3. Hit enter two times

		for windows:
			1. hold "Alt"
			2. Hit Enter
			3. Hit enter two times
 */