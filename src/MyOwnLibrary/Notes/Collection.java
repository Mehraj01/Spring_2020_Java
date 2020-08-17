package MyOwnLibrary.Notes;
/*
-> There is 3 different Data Structures:
   Data Structures is for maintain, manage data efficiently and in an organized manner.
      - Arrays
      - Collections (ArrayList)
      - Map

************************************************************************************************************************
 1) What is the Collection framework in Java?
Collection Framework is a combination of classes and interface, which is used to store and manipulate the data in the
form of objects. It provides various classes such as ArrayList, Vector, Stack, and HashSet, etc. and interfaces such as
List, Queue, Set, etc. for this purpose.

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


************************************************************************************************************************


--> COLLECTION
Collection is a group pf individual objects as a single entity (organization)
   • Growable in nature. Can increase or decrease the size.
   • Can hold different data types.
   • Standard data structure. There are ready methods to use.
   • It defines several classes and interfaces which can be used to represent a group of objects as single entity.

-> collections framework:  consists of multiple interfaces, each interfaces has multiple implementations
			- all the classes and interfaces are presented in "java.util"

Iterable(I): -> Collection -> List(I)
                           -> Queue(I)
                           -> Set(I)

-> Iterable(I): root interface. super-type of all interfaces in collections framework.
     -> Collection (I):    extended by by List(I), Set(I), Queue(I)
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			-> List(I): implemented by ArrayList(C), LinkedList(C), Vector(C)
					has Index Numbers, accepts duplicates, size is dynamic
				 - ArrayList(C): array based class. internally uses array, singly linked
						singly linked ==> retrieving data is faster ( get() )
				 - LinkedList(C): each objects are doublly linked
						doubly linked ==> removing & adding are faster ( remove(), add() )
				 - Vector(C): array based class, is synchronized. Only preferred in multi-thread
						- extended by Stack(C): array based class, is synchronized, Last In First Out order
								pop(): LIFO, returns the last object from the stack and removes it from stack
								   pop method makes stack class unique.
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			-> Queue(I): does not have index numbers, size is dynamic, accepts duplicates, First in first out order
					Poll(): removes the first object in the queue.
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		    -> Set(I): does not accept duplicates. does not have index number, size is dynamic
					- hashSet vs - linkedHahSet:
						* linkedHahSet KEEPS the INSERTION ORDER as it is
						* hashSet is faster than linkedHahSet (hashSet - DOESN'T KEEPS INSERTION ORDER as it is)
					 - set is extended by SortedSet(I): sorted set is implemented by TreeSet
							- TreeSet(C): does not accept duplicates, and sort the objects, TreeSet does not accept null

					- hashSet vs TreeSet:
						* hashSet accepts null, TreeSet does not accept null
						* hashSet is faster than TreeSet





-> List
• List is child interface of Collection.
• If we want to represent a group of individual objects as a single entity where duplicates are allowed, and
insertion order preserved then we should go for List.
- List is an interface because of that we can create object from that class. But we can create instance of subclass from
list interface. exp:  - List<Integer> list1 = new ArrayList<>();

->
• Singly Linked List: A singly linked list is a set of nodes where each node has two fields ‘data’ and ‘link’.
The ‘data’ field stores actual piece of information and ‘link’ field is used to point to next node.
- Linked that is singly linked ot mush faster in term of retrieving data that we have.





*******************************************************************
synchronized: used for achieving thread-safety
		- advantage: thread safe
		- disadvantage: slower
thread-safe: one thread at a time in multi-thread environment. Each thread will access the application one by one
thread: process of operating system scheduling object.
multi-thread: two or more thread are being executed
- SynchronizedList(); - method it will accept implemented in the list
       -list = Collections.synchronizedList(list); // thread-safe


*******************************************************************
null: default value of all reference-type (all non-primitives).
		- does not refer to any objects
		- it's not instance of anything

		WebElement element;  ==> null
		String str;  ===> null





****   Collections is a utility class of COLLECTION framework
             exp: Collections.sort();
NOTE: - Collection is a utility class and COLLECTION is Interface. DONT CONFUSE THEM


Collection Methods
 -> SynchronizedList(list);
 -> sort();
 -> frequency():
 -> swap();




--> Iterable(I): Root interface
		classes that implements iterable, gains the ability to iterate the objects

		we can apply Iterator(I) to the classes that are implementing Iterable

		Iterator(I):
			1. it allows us to get access to each objects of the collections type
			2. it allows us to remove the objects from collection

			iterator(): iterates any given collection, then returns Iterator (I)

			hasNext(): check if there are enough elements that can be iterated. returns boolean

			next(): if  hasNext() is true, it accesses to the object and retrieves it

			remove(): removes the current element of iteration



Bulk Operations
removeAll(); -> Will remove all the matching objects
retainAll(); -> Will retain (keep) all the matching object and will remove all the ones not chosen
addAll(); ->
containAll; -> list.containsAll( Arrays.asList(5, 6, 9, 8, 11 ) ==> returns boolean.


*******************************************************************

	Array (fixed, primitives & objects)
	Collection (dynamic, only objects)
	Map (dynamic, only objects)



	String[] name ={}
	Double[] salary = {};

	List<String> name = new ArrayList<>();
	List<Double> salary = new ArrayList<>();

	Map<String, Double>


Map Interface: accepts key and value. cannot be primitives.
				key MUST be unique



Map methods:
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

    Entry<Key, Value>:
    		getKey(): returns the key from the Entry
    		getValue(): returns the value from the entry


-> HashMap: does not keep the insertion order
		accepts null

-> HashTable: is synchronized, thread-safe ==> one thread at a time
			slower
			does not accept null

-> LinkedHashMap: keeps the insertion order as it's.
			put & remove are faster
			accepts null

-> TreeMap: sorts the keys in ascending
		does not accept null







 */