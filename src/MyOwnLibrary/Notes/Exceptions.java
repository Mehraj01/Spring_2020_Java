package MyOwnLibrary.Notes;


/*


Exception -> Runtime Exception ->
--> Exceptions: unexpected or unwanted events
	- there two types of exception:
			 - unchecked (unexpected event): occurs during run time // Whatever unchecked exception is occurs it
			                                                         automatically compiler jumps to the catch block
                         - RuntimeException class is the parent of all unchecked exceptions
             - checked (unwanted events): occurs during the compile time. needs to be handled IMMEDIATELY


>>> Exception handling:
	   - try & catch: blocks, used for handling the exception
			try{
				exception statements/code
			}catch(ExceptionClass  VariableName){

			}

        ->  printStackTrace(): prints the stack trace of exception
        -> getMessage(): description of exception ==> print the information about the exception to the console
            // We can pass it in the catch block. Return type is a string. We call the method with variable name
               -  EX: ->    try{
                                System.out.println(str.charAt(100));
                            }catch(RuntimeException e){
                                 String description=e.getMessage();
                                 System.out.println(description); // will print ==> "String index out of range: 100"
                            }


 -> try{
	}catch(Runtime){
	}catch(Arithmetic){
	}
	   ...
multi-catch block: parent exception class CAN NOT be placed before its child exception



->  finally block: always gets executed regardless of the exception
      - We use finally block when we have a specific code fragment that have to be run regardless of exceptions
		try{
		}catch(){
		}finally{

		}

-> Thread.sleep(long millisecond): makes the current execution thread to wait for specific amount of time

















Exceptions topic:
		unchecked & checked exception
		try & catch blocks
		multi-catch blocks
		finally block
		throws
		throw
		Custom Exception

next topic: final keyword




 */






