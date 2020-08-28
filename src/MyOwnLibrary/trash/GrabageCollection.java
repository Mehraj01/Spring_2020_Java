package MyOwnLibrary.trash;
/*
    Garbage Collection, StringBuilder StringBuffer, Enum

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