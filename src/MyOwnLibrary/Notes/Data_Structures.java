package MyOwnLibrary.Notes;
/*

DATA STRUCTURES -> Arrays, Collection, Map

Array (fixed, primitives & objects)   --  Collection (dynamic, only objects)  --  Map (dynamic, only objects)

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

1. ARRAYS -> An variable that Can Hold multiple value or same type : -> Primitives or reference type.
        - An array is an object that stores the collection of values
        - Declaration: -> DataType[] variableName = { dat1, data2, data3 };  ||  int [] scores = new int[4];
        - Represent by square bracket [] on declaration. ->  1. int [] scores;  ||   2. int scores [];
        - Array is fixed size, can not add more items or take out items.
        - Array Object can not be printed out directly to display all the elements
        - Array is ordered and can be accessed by index.
        - Array Allows Duplicate
        - The data we are storing MUST match with DataType
        - Retrieve data from the array: -> variableName[index]
        - Supports primitives and objects
        - Can be multi-dimensional

-> Initializing the size of the array:
       - 1. giving the values: size will be initialized automatically: -> int[] arr = {10, 20, 30};
       - 2. giving the size only: default value of the dataType will be assigned at each index: -> int[] arr = new int[length];

-> Default values:
       - byte, short, int, long -> 0
       - String or any object -> null


-> Arrays UTILITIES: -> Array class presented in "java.util"
       - import PackageName.className; -> import java.util.Arrays;


Arrays.toString(arrayName); -> converts the array to String, returns the string. Any array with any dataType
Arrays.deepToString(arrayName); -> converts multi-dimensional array to String.
Arrays.sort(arrayName); -> sorts the given array in ascending order
Arrays.equals(arr1, arr2); -> checks if the two arrays are same or not. Returns boolean.
length; ->  returns the length of array


--> String methods related to Array:
      - toCharArray(); -> returns char array from the string
      - Split(Value); -> splits the string with given value. Returns String array.


--> ArrayList VS Arrays

- Can store only objects                        - Can store primitives and objects
- Can be resized                                - Has defined size and cannot be changed
- Can be printed directly to display elements   - Can not be printed directly to display elements,
                                                  Need Arrays.toString() method
- ArrayList has add or remove functions         - Array does not have add or remove functions
- ArrayList cannot be multi-dimensional         - Array can be multi-dimensional



>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

2. COLLECTION (I) Framework -> "java.util"
     - combination of classes and interface, which is used to store and manipulate the data in the form of objects.
     - Growable in nature. Can increase or decrease the size.
     - Can hold different data types.
     - Standard data structure. There are ready methods to use.
     - It is half reduced programing effort used a lot of building high level functionality
     - Collection Framework Shipped with JDK
     - It provide many built in feature to work with data
     - Classes -> ArrayList, Vector, Stack, HashSet and etc.
     - Interfaces -> List, Queue, Set and etc.
     - Iterable(I):-> Root interface. Super-type of all interfaces in collections framework.


Iterable (I) -> Collection(I) -> List (I)
                              -> Queue (I)
                              -> Set (I)
List (I) -> ArrayList (C)
         -> LinkedList(C)
         -> Vector -> Stack(C)

Queue(I) -> PriorityQueue(C)
         -> Deque(I) -> ArrayDeque(I)

Set(I)   -> HasSet(C)
         -> LinkedHashSet(C)
         -> SortedSet(I) -> TreeSet(C)


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

-> Collection (I): ->  extended by by List(I), Set(I), Queue(I)
	-> List(I): implemented by ArrayList(C), LinkedList(C), Vector(C)
	                   - has Index Numbers, accepts duplicates, size is dynamic, insertion order persevered

		  -> ArrayList(C): array based class. internally uses array, singly linked
						- singly linked ==> retrieving data is faster ( get() )

		  -> LinkedList(C): each objects are doublly linked
					    - doubly linked ==> removing & adding are faster ( remove(), add() )

		  -> Vector(C): array based class, is synchronized. Only preferred in multi-thread

						-> extended by Stack(C): array based class, is synchronized, Last In First Out order
								- pop(): LIFO, returns the last object from the stack and removes it from stack
								   pop method makes stack class unique.

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

-> Queue(I): does not have index numbers, size is dynamic, accepts duplicates, First in first out order
					   - Poll(): removes the first object in the queue.

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

 -> Set(I): does not accept duplicates. does not have index number, size is dynamic
	     -> hashSet vs - linkedHahSet:
					 - linkedHahSet KEEPS the INSERTION ORDER as it is
					 - hashSet is faster than linkedHahSet (hashSet - DOESN'T KEEPS INSERTION ORDER as it is)

		 -> set is extended by SortedSet(I): sorted set is implemented by TreeSet
					-> TreeSet(C): does not accept duplicates, and sort the objects, TreeSet does not accept null

					- hashSet vs TreeSet:
						- hashSet accepts null, TreeSet does not accept null
						- hashSet is faster than TreeSet


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

-> DIFFERENCES BETWEEN LIST AND SET
     - List ->  Duplicates are allowed, Insertion order preserved
     - SET -> Duplicates are not allowed. Insertion order not preserved

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

--> Singly Linked List: A singly linked list is a set of nodes where each node has two fields ‘data’ and ‘link’.
The ‘data’ field stores actual piece of information and ‘link’ field is used to point to next node.
- Singly linked ot much faster in term of retrieving data that we have.


--> synchronized: -> used for achieving thread-safety. Preventing from multi-thread executing code at the same time
- Synchronized advantage: -> thread safe
- Synchronized disadvantage: -> slower
- thread-safe: one thread at a time in multi-thread environment. Each thread will access the application one by one
- thread: process of operating system scheduling object.
- multi-thread: two or more thread are being executed
- Synchronize can only be applied for methods and block of code
- SynchronizedList(); - method it will accept implemented in the list
       - list = Collections.synchronizedList(list); // thread-safe


--> null: default value of all reference-type (all non-primitives).
		- does not refer to any objects
		- it's not instance of anything
		  WebElement element;  ==> null
		  String str;  ===> null



--> COLLECTIONS: ->  is a utility class of COLLECTION framework. -> import java.util.Collections;
      - SynchronizedList(list); ->
      - sort(CollectionType); -> sorting any given collectionType in Ascending order ==> Collections.sort(ArrayListName);
      - frequency(CollectionType, Object); -> returns the frequency of the given object from the given collectionType
      - min(CollectionType); -> return the min object from collectionType
      - swap(CollectionType, index1, index2); ->  swaps the elements at the given indexes from the collectionType



--> Iterable(I): Root interface
		- classes that implements iterable, gains the ability to iterate the objects
		- we can apply Iterator(I) to the classes that are implementing Iterable
		- Implementing Iterable interface allows an object to be the target of the "foreach" statement.
		- if any class implements the ITERABLE interface, it gains the ability to iterate over an object
		  of that class using an ITERATOR.

--> Iterator(I):
		- 1. it allows us to get access to each objects of the collections type
		- 2. it allows us to remove the objects from collection
        - When using iterator object, we can remove values while looping
        - When using for each loop, we can not remove values from the collection
        - We need to create iterator object to able to use it
        - For each loop works with a temporary variable

		- iterator(): iterates any given collection, then returns Iterator (I)
        - hasNext(): check if there are enough elements that can be iterated. returns boolean
		- next(): if  hasNext() is true, it accesses to the object and retrieves it
		- remove(): removes the current element of iteration



--> Bulk Operations
       - removeAll(); -> removes multiple objects, removes all the matching objects
       - retainAll(); -> removes all the un-matching objects anw will keep the matching ones
       - addAll(); -> adds multiple objects, adds all the objects from given collection type
       - containsAll(); ->  verifies if all objects in CollectionType are contained in the list or not. Returns boolean
       - replaceAll(CollectionType, oldValue, newValue): -> Collections.replaceAll(list, 1, 10);


--> Lambda Expressions, Predicate: -> can be applied to any collection-Type
		- number % 2 != 0;  ->> Predicate<Integer>  oddNumber =  p -> p %2 != 0;
		- removeIf(Predicate): removes everything that's matching with the expression of predicate

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

--> ARRAYLIST Class -> this class is one of the List implementation.
      - We can after import one of this class : ->   import java.util.ArrayList;    import java.util.*;
      - Unlike Array, it is resizable
      - Can only hold objects, can not store primitives
      - Ordered collection and allow duplicate
      - Storing any type is possible but recommended to store only 1 type

--> Arrays.asList(object1, object2 ..): returns the collection type (List)
     - This method is essential because it served as a bridge between array based and collection api.
     - This works hand in hand with Collection.toArray() method.


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


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

3. MAP (I) -> Accepts KEY and VALUE, Key MUST be unique, Cannot be primitives.
             - Map<String, Double> employee = new LinkedHashMap<>();


--> Map methods:
	- put(key, value): inserts key and value to map
	- get(key): returns the value of the given key
	- remove(key): removes the given key and it's value from the map
	- size():
    - containsKey(key): checks if the key is contained in the map. boolean
    - containsValue(Value): checks if the value is contained in the map. boolean
    - clear(): clears everything
    - isEmpty(): boolean
    - keySet(): returns all the keys from the map as Set
    - values(): returns all the values from the map as Collection
    - entrySet(): create an Entry

--> Entry<Key, Value>:  ->  for (Map.Entry<String, String> each : countries.entrySet()){}
    		getKey(): returns the key from the Entry
    		getValue(): returns the value from the entry


--> HashMap: does not keep the insertion order
	 - accepts null

--> HashTable: is synchronized, thread-safe ==> one thread at a time
	 - slower, does not accept null

--> LinkedHashMap: keeps the insertion order as it's.
	 - put & remove are faster ,accepts null

--> TreeMap: sorts the keys in ascending
	 - does not accept null




--> Difference between HashMap and HashTable
    - HashMap -> Every method in HashMap are not synchronized
              -> HashMap is fast
              -> HashMap allows one null key and multiple null values
              ->  HashMap implements Map interface

    - HashTable -> Every method in HashTable are synchronized
                -> HashTable is slow
                -> HashTable does not allow any null key or value
                -> HashMap implements Map interface


--> Difference between HashMap and TreeMap
    - HashMap -> HashMap does not maintain any sorting order
              -> Internally it used hash table
              -> Contains one null key and many null values
              -> HashMap implements Map interface

    - TreeMap -> TreeMap elements are sorted according to natural sorting order
              -> Internally is uses Red Black Tree
              -> Can not contain null keys but may contains many null values
              -> It implements SortedMap interface

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

 WRAPPER Classes
     - It's the classes that provided in JDK for creating an Object that needs to represent primitives type
     - Wrapper classes: -> classes that are dedicated to primitives
     - Each Primitive Types have one corresponding Wrapper Class to create
     - primitives: byte, short, int, long, float, double, char, boolean
     - wrapper classes (Uppercase): Byte, Short, Integer, Long, Float, Double, Character, Boolean
     - The wrapper classes are part of the java.lang package
     - Wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
     - All of wrapper class' default values are null


--> Classes VS Primitives
 - Objects can be created from classes         - No object can be created
 - Class can have field and method to          - There can be no field or methods
   represent property and behavior of object
 - Need bigger memory space                    - Light-weight, require less space


--> We can create wrapper object using corresponding primitive value or is a Sting value.
    - Boolean b = new Boolean(true);   or  Boolean b = new Boolean("true");
    - Character c = new Character('c');
    - Byte d = new Byte ((byte), 123); or  Byte d = new Byte ("123");
    - Short f = new Short ((short), 1200); or  Short f = new Short ("1200");
    - Integer a = new Integer(1202); or Integer a = new Integer("1202");
    - So on... Long, Float, Double will be as same as Integer class


--> Converting between Primitives and Wrapper Class
   -> (Auto)Boxing value:  Primitive Type -> Wrapper Reference Type.  int -> Integer
        - converting primitive values to wrapper class
        - You boxing up the primitive value into the reference type
        - Boxing value: Integer a = 12; -> "Integer a" will box up the primitive type "12" and change it to wrapper type
        - Ex: Integer b = a; (a=12) ->  boxing
        - Ex: Integer d = 12; -> int 12 is auto boxed into Integer d

   -> Unboxing Value:  Wrapper Reference Type -> Primitive type. Integer -> int
        - When we need to get primitive type out from the wrapper reference type
        - converting wrapper class value to primitives
        - Unboxing value: int a = new Integer("12"); -> When we create wrapper object and assign it to primitive type
                                             then we will get auto unBox value and make it corresponding primitive type
        - Ex: int a = new Integer("12"); -> unboxing


--> PARSE METHODS -> Converts string of text to the primitives, returns primitive values
       - Converting String to primitive -> X.parseX(str);
       - Boolean.parseBoolean("true");
       - Character -> None
       - Byte parseByte("1");
       - So on... We use same method to covert String to primitive

--> VALUEOF METHODS -> converting string to wrapper class value, returns wrapper class values
       - Converting String to wrapper class -> X.valueOf(str);
       - Value of method of Boolean: any string other than "true" will ALWAYS return false, not case sensitive
       - Boolean.ValueOf("False");
       - Byte.ValueOf("1");
       - So on... We use same method to covert String to primitive


--> ADVANTAGES of Primitive Wrapper Classes
      - Use primitive type as Object
      - Value can be set to null, which is not the case for primitives.
            - Integer a = null;
      - It has fields and methods like other classes
            - Long.MIN_VALUE; Integer.compare(x,y);
            - .Min_Value: returns the minimum
            - .Max_Value: returns the maximum
            - doubleVar.isNaN(); Character.isDigit(ch); and more...




>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<






 */