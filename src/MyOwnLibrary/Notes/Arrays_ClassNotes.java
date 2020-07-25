package MyOwnLibrary.Notes;// ARRAYS NOTES
/*

>> Three Data Structures: ==>  1. Array      2. Collection    3. Maps

//(>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>||||||||<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

>> Arrays: a variable that can have multiple data
		Declaration:   ==>>>  DataType[]  variableName = { dat1, data2, data3 };
						              // index:              0     1     2
				-the data we are storing MUST match with DataType
				-the [] can be placed either after DataType or after variable name
				-each data in the array has its own index number
				-retrieve data from the array:  ==>>> variableName[index]

>> Array' size is fixed
>> length: returns the length of array
>> default values: ==>> byte, short, int, long ==> 0  ||   ===>>>  String or any object ==> null

>> Initializing the size of the array:

	1. giving the values: size will be initialized automatically
	                     ==>>> int[] arr = {10, 20, 30};
	                     // DataType, VariableName,  Hardcoded Values of Array
	2. giving the size only: default value of the dataType will be assigned at each index
	                   1). ==>>> int[] arr = new int[length];
	                   2). ==>>> int[] arr = new int[5];
	                   // DataType, VariableName,  DataType and length of the Array



>>> ARRAY UTILITIES:
        - Array class presented in "java.util"
        - import PackageName.className;
        - import java.util.Arrays;

*** Arrays.toString(arrayName): ==> converts single dimensional array with any dataType to String. Returns String.
Array MUST be converted to string before we print
*** Arrays.deeptoString(arrayName): ==> converts multi-dimensional array to String.
*** Arrays.sort(arrayName): sorts the given array in ascending order
                            int[] arr = {8,5,10,7, 12};
							Arrays.sort(arr);
                            arr ==> {5, 7, 8, 10, 12}
*** Arrays.equals(arr1, arr2): checks if the two arrays are same or not. Returns boolean.
                            int[] arr1 = {1,2,3};
						    int[] arr2 = {1,2,3};


>>> STING METHOD RELATED ARRAY:

*** toCharArray(): returns char array from the string.
		String str = "Batch 18";  ==>   char[] ch = str.toCharArray(); //['B', 'a', 't', 'c', 'h', ' ', '1', '8']
*** Split(Value): splits the string with given value. Returns String array.



EXP:
>> double[] nums = {10, 20, 30 , 40, 50}; System.out.println( nums[0] + 1  );==> result will we 11.0. Because we do addition.
                                                                               // index 0=10+1=11
>> char[] characters =  name.toCharArray(); ==> it will convert String to char  >>> "Muhtar" ==> [M, u, h, t, a, r]



 */