package MyOwnLibrary.trash;
/*

 -> Arrays:

- Can Hold multiple value or same type : -> Primitives or reference type.
- Array is fixed size, can not add more items or take out items.
- Array Object can not be printed out directly to display all the elements
- Array is ordered and can be accessed by index.
- Array Allows Duplicate

 * It works really good with simple data operation, sometimes Array can be limited in a lot cases.
In order to work with data more efficiently Java provides Collection Framework.

 --> Collection Framework
 * It is a unified architecture for representing and manipulating the collection.
 It is half reduced programing effort used a lot of building high level functionality .
 - Collection Framework Shipped with JDK
 - It provide many built in feature to work with data
 - Provide different type of data structure like : ->  List, Set, Map, Queue

 -> ArrayList Class
 * ArrayList class is one of the List implementation.
 - Built into language, can be used after importing 1 of below:
       - import java.util.ArrayList;
       - import java.util.*;
- Unlike Array, it is resizable.
- Can only hold objects, can not store primitives.
- Ordered collection and allow duplicate
- Storing any type is possible but recommended to store only 1 type
      - syntax 1: -> ArrayList<Type> list1 = new ArrayList<>();
      - syntax 2: -> List<Type> list1= new ArrayList<>();  ==> Using List as reference Type (Polymorphism)



   --> ArrayList VS Array

- Can store only objects                        - Can store primitives and objects
- Can be resized                                - Has defined size and cannot be changed
- Can be printed directly to display elements   - Can not be printed directly to display elements,
                                                  Need Arrays.toString() method
- ArrayList has add or remove functions         - Array does not have add or remove functions
- ArrayList cannot be multi-dimensional         - Array can be multi-dimensional

--> Common ArrayList Methods:
- add(Type element) -> Adds the elements to the end of the list
- get(int index) -> Returns the element at the specified position
- contains(Object element) -> Returns true if element is in this list; otherwise, returns false
- indexOf(object element) -> Returns the index of the first occurrence of the element in the list
- clear() -> Removes all elements from this list
- size() -> Returns the number of the elements in this list
- remove(int index) -> Removes the element at the specified index of the list
- isEmpty() -> Returns true if this list is empty; otherwise, returns false
- set(int index, Object element) -> Overwrite the value at given index
So on.....

Ex:
* Adding elements ->  list.add("Item");
* Getting elements -> get(index);
* Getting the index of the item by value -> indexOf(item);
* Checking how many item in the list -> list.size();
* Checking if the list is empty -> isEmpty();
* Setting the value for certain index -> list.set(1, "Pear);
* Remove item by index -> list.remove(0);
* Remove item by value -> list.remove("Item");
* Remove all the items in the list -> list.clear();
* Checking if the list is empty or not -> list.isEmpty();

************************************************************************************************************************



 -> Primitive Wrapper Classes

- It's the classes that provided in JDK for creating an Object that needs to represent primitives type

  -> Classes VS Primitives
 - Objects can be created from classes         - No object can be created
 - Class can have field and method to          - There can be no field or methods
   represent property and behavior of object
 - Need bigger memory space                    - Light-weight, require less space

- Each Primitive Types have one corresponding Wrapper Class to create
- Each Primitive wrapper classes are used to create an Object that needs to represent primitive types in Collection class

Primitive Types  - Wrapper Class (Uppercase)
  - boolean         - Boolean
  - char            - Character
  - byte            - Byte
  - short           - Short
  - int             - Integer
  - long            - Long
  - float           - Float
  - double          - Double

  Example of Constructing
  We can create wrapper object using corresponding primitive value or is a Sting value.
  Syntax:
  - Boolean b = new Boolean(true);   or  Boolean b = new Boolean("true");
  - Character c = new Character('c');
  - Byte d = new Byte ((byte), 123); or  Byte d = new Byte ("123");
  - Short f = new Short ((short), 1200); or  Short f = new Short ("1200");
  - Integer a = new Integer(1202); or Integer a = new Integer("1202");
  - So on... Long, Float, Double will be as same as Integer class


-> Converting between Primitives and Wrapper Class

  -> Boxing value:  Primitive Type -> Wrapper Reference Type ==>  int -> Integer
     - You boxing up the primitive value into the reference type
        ==> ex: Boxing value ==>  Integer a = 12; -> "Integer a" will box up the primitive type "12" and change it to wrapper type

  -> Unboxing Value:  Wrapper Reference Type -> Primitive type ==>  Integer -> int
     - When we need to get primitive type out from the wrapper reference type
        ex: Unboxing value ==> int a = new Integer("12"); -> When we create wrapper object and assign it to primitive type
                                                         then we will get auto unbox value and make it corresponding primitive type

        ex: -> Boxing
        int a = new Integer("12"); ==> unboxing
        Integer b = a; ==> boxing

        Integer c = new Integer(12); ==>
        Integer d = 12; // int 12 is auto boxed to Integer d (==> Because we assigned it to primitive
        int f = c; // Integer c is auto=boxed to int 12 (==>

-> Converting from String Object
   - Converting String to primitive  ==> X.parseX(str);
   - Converting String to wrapper class  ==> X.valueOf(str);

  * Converting from String to PRIMITIVE
    - Boolean.parseBoolean("true");
    - Character ==> None
    - Byte parseByte("1");
    - So on... We use same method to covert String to primitive

  * Converting from String to WRAPPER CLASS
   - Boolean.ValueOf("False");
   - Byte.ValueOf("1");
   -  So on... We use same method to covert String to primitive


-> Benefit of Primitive Wrapper Class
   - Use primitive type as Object
   - Value can be set to null, which is not the case for primitives.
         - Integer a = null;
   - It has fields and methods like other classes
         - Long.MIN_VALUE; Integer.compare(x,y);
         - doubleVar.isNaN(); Character.isDigit(ch); and more...


-> Comparing Wrapper Class Object
   - Like any other object, in order for two wrapper class reference variable to be equal,
      they need to point to exact same object in memory.

* Comparing Wrapper Class Object value using .equal method
   - Like String Class, .equal method will check the value is equal or not instead of checking reference to same object

* Comparing Wrapper Class Object equality
   - Like any other object, in order for two wrapper class reference variables to be equal using double equal operator,
     they need to point to exact same object in memory.


************************************************************************************************************************

Bulk Operations

-> containsAll(CollectionType): verifies if all objects in CollectionType are contained in the list or not. Returns boolean
-> addAll(CollectionType): adds multiple objects, adds all the objects from given collection type
-> removeAll(CollectionType): removes multiple objects, removes all the matching objects
-> retainAll(CollectionType): removes all the un-matching objects
					{1,2,3,4,5,6,7,1,2,3,4}
					removeAll(1,2,3,4) ==> {5,6,7}
					retainAll(1,2,3,4) ==> {1,2,3,4,1,2,3,4 }


-> Arrays.asList(object1, object2 ..): returns the collection type (List)

Collections Class:

	-> Collections: presented in "java.util" package
		- import PackGaName.Classname;
		- import java.util.Collections;

-> sort(CollectionType): sorting any given collectionType ==> Collections.sort(ArrayListName); ==> Ascending order
-> frequency(CollectionType, Object): returns the frequency of the given object from the given collectionType
-> max(CollectionType): return the max object from collectiontype
-> min(CollectionType): return the min object from collectiontype
-> swap(CollectionType, index1, index2): swaps the elemnts at the given indexs from the collectionType
				list: {1,2,3,4,5}
				Collections.swap(list, 1, 2); ==> {1,3,2,4,5}
-> replaceAll(CollectionType, oldValue, newValue):
				list: {1,1,1,2,3,4,5}
				Collections.replaceAll(list, 1, 10); ==>{10,10,10,2,3,4,5}


Lambda Expressions, Predicate
-> Predicate:  can be applied to any collection-Type
		- number % 2 != 0
        - Predicate<Integer>  oddNumber =  p -> p %2 != 0;

ArrayList method:
		- removeIf(Predicate): removes everything that's matching with the expression of predicate








 */