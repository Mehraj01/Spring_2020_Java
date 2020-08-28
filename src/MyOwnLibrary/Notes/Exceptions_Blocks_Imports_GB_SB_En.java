package MyOwnLibrary.Notes;
/*

  Exception, Blocks, Imports, Garbage Collection, StringBuilder StringBuffer, Enum

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

Exception: -> Runtime Exception class is the parent of all unchecked exceptions

--> There two types of exception ->  unexpected or unwanted events
	- unchecked (unexpected event): -> occurs during run time. Whatever unchecked exception is occurs
	it automatically compiler jumps to the catch block
    - checked (unwanted events): occurs during the compile time. needs to be handled IMMEDIATELY


--> Exception handling:
	   - try & catch: blocks, used for handling the exception
			try{
				exception statements/code
			}catch(ExceptionClass  VariableName){

			}
->  printStackTrace(); ->  prints the stack trace of exception
-> getMessage(); -> description of exception. Print the information about the exception to the console
                 -> We can pass it in the catch block. Return type is a string. We call the method with variable name
                 -> EX: ->  try{
                                System.out.println(str.charAt(100));
                            }catch(RuntimeException e){
                                 String description = e.getMessage();
                                 System.out.println(description);  -> Will Print:  "String index out of range: 100"
                            }


                 -> MULTI-CATCH block: parent exception class CAN NOT be placed before its child exception
                 -> Ex:  try{
	                     }catch(Runtime){
	                     }catch(Arithmetic){
	                     }
	                     ...

--> finally block: -> always gets executed regardless of the exception
      - We use finally block when we have a specific code fragment that have to be run regardless of exceptions
	  Ex:  try{
		   }catch(){
		   }finally{
		  }



-->  throws: ->  used for handling checked exceptions. indicates that the methods throws an exception
		         - MUST be used in method signature
		         - public static void method() throws Exception
		         - the caller of the method is responsible for handling the exception
		         - we can throw multiple exception.-> Order: child first, then parent


--> throw: ->  manually throwing the exception, DOES NOT HANDLE
	           - object: new ExceptionClass();
	           - throw Object;
               - Ex: -> NoSuchElementException  obj = new NoSuchElementException();
                        throw new RuntimeException();
               -  try {
                   throw new RuntimeException();
                 }catch (Exception e){
                  }

--> custom exception:
	   - how to create custom unchecked exception?
				- A: by extending RunTimeException class
	   - how to create custom checked exception?
				A: by extending Exception class


-> Thread.sleep(long millisecond): makes the current execution thread to wait for specific amount of time


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

BLOCKS -> We have two initializer blocks in java:

--> static initializer block: gets executed as soon as class is loaded, only once
                - designed for initializing static variables
                                static {
                                        statement;
                                }

--> instance initializer block: belongs to the object, execution depends on the object
                - It will be executed when we object of the class will be created
                - It will be created inside of the class. When we created object of the class in main
                  method then instance block will be executed
                - It is execution depends of the object. If we create 2 object it will run twice
                - designed for initializing instance variables
                                {
                                     statements;
                                }


--> STATIC BLOCK vs INSTANCE BLOCK vs CONSTRUCTOR:
            - static block: executed first, one time only, does not depend on the object
            - instance block: depends on the object, runs before the constructor
            - constructor: depends on the object, runs after the instance block

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

-> regular imports:
      syntax:
        import PackageName.ClassName; ->  imports one class from package
        import PackageName.*;  ->  imports all classes from the package

-> static imports: we can import static variables or methods
      syntax:
        import static PackageName.className.name;  -> only imports one static from the class
        import static PackageName.className.*; -> imports all static variables and methods from the class

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Garbage Collection
     - Java Virtual Machine periodically runs a process known as the garbage collector, which removes unreferenced
       objects from memory.
     - It is automatically done by the garbage collector(a part of JVM) so we do not need to make extra efforts.

--> How can an object be unreferenced?
     - By nulling the reference
           Dog d = new Dog();
           d = null;
     - By assigning a reference to another
           Dog d1 = new Dog();
           Dog d2 = new Dog();
           d1 = d2; -> now the first object referred by d1 is available for garbage collection


--> finalize(): Garbage Collector call this METHOD before destroying the objects. It called before cleaning up.
                - We don't call this method Garbage Collector internally will call it.
                - We can call it too but we shouldn't do that. When we call it will throw an Exception ==> Throwable


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

 String vs StringBuilder vs StringBuffer:

--> String: Immutable version char sequences

--> StringBuilder: mutable version char sequences, not synchronized
		   - StringBuilder builder = new StringBuilder("Cybertek");
		   - builder.append(" School"); -> it will change string value  -> Cybertek School

--> StringBuffer: mutable version char sequences, synchronized , thread-safe, slow
		   - StringBuffer buffer = new StringBuffer("Cybertek");
           - buffer.append(" School");  -> Cybertek School


--> Methods:
          - buffer.append(" School"); -> it will change string value.
          - reverse(); -> Reverse the string
          - word = sb.toString(); -> To convert StringBuffer, StringBuilder to string we can use toString();

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

--> enum: A custom dataType. We can create a custom data type by enum.
		  - containing fixed set of constants
		  - we only need it if we need a variable to take one out of small set values
		  - Enum calling: -> Color myFaveColor1 = Color.Blue;

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<









 */






