package MyOwnLibrary.Notes;/*    Methods...

Methods let you group a series of statement together to perform a specific tasks.
       - it is reusable
       - easy maintain and fix
       - Method cannot be declared IN ANOTHER METHOD

>>> Declaration of the Methods: ==> public static void main (Str [] args )

    - public ==> access modifier ==> Access modifiers:  public, protected, default, private
    - static ==> specifier ==> Specifier: static, final, abstract, synchronized
                               // STATIC can be called trough class name
    - void ==> return type ==> Return-type: void, any dataType ( all primitives&objects)
                           // void dose'nt return any value from the method. DataType returns a value (mandatory)
                          // When return-type is not void it's mandatory to return value from the method

    - main ==> Method Name

    - (Str [] args) ==> Parameter, Argument ==> It allows the method receive the argument. It can be ANY DATA TYPE.
        - Sometimes a method needs specific information to perform its task. In such cases, when you
          declare the method you give it parameters. Inside the method, the parameters act like variables.
        - Returning value MUST match with the return Type of the method
        - If the return type of the method is void, the method cannot return any value
        - Closing statement MUST be ended with a return statement.
        - Return statement exits the current method. Can return value from a method if return type is not void.


>>> Method Overloading...

    - Multiple Methods sharing the same name
    - Parameter must be different (either the dataType or number of parameter)
    - Benefits: ==> Easy to read, reusable, easy to remember, very flexible.
    - Only parameter matters (Must be different)
    - Return type dose'nt not matter (can be same or different)


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        Encapsulation ==> hiding data
                      1. Hide the data by giving private access modifier
                      2. Use the private data though getter and setter

      >>>> getter(Read Only);    ==> public instance method
                      - Return type must match with instance variable's data type
                      - No parameter
                      - Returning the private instance variable
     >>>> setter(Modify only);   ==>   public instance method
                      - Return type is void
                      - Passes a parameter
                      - Parameter must match with instance variable's dataType
                      - Initializes the argument to private instance variable







     */
