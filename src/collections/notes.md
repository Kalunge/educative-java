a **collection** is an interface whereas **collections** is a class
a **collection** interface provides the standard functionality of a data structure to **List**, **set**, and **queue**. however, the collections class provides the utility methods that can be used to search, sort, and synchronize collection elements.

## ArrayList
* Element are stored in the order f insertion
* it allows the storage of duplicate elements
* it supports null elements

## Adding an element
since an array backs an ArrayList, the addition of an element takes O(1) in the best case. it will take more time if the ArrayList is full and needs to be resized. in that scenario, a new array will be created, and elements will be copied from tye old array to the new array. 

## Removing an element

the remove operation has O(n) in the worst case and O(1) in the best case. there are two overloaded versions of the remove() method in ## Adding an element.
1. the first one takes the index of the element that needs to be removed as inout. the element can be found in O(1) time using the index, but when the element is removed, the other elements need to be moed to the left. so, if the last element is removed the complexity wil be o(1) otherwise, O(n)
2. in the second  case, the remove() method takes the element that needs to be removed as input. the array is scanned from the beginning to find the first occurrence of that element. and then it is removed. this has a complexity of O(n)

## fetching an element
fetching an element from an array using an index is o(1). so fetching an element from an ArrayList takes constant time

## creating an ArrayList
there are three ways to creat an arraylist.

### using the no-arg constructor
the default constructor does not rake any argument and creates a list of size zero. below is h=the syntax to creat ArrayList using the default constructor
```java
List list = new ArrayList();
```
### Using the constructor that takes in initial capacity
we can also provide an initial capacity while creating an ArrayList. the benefit is that if we know that our ArrayList will contain a minimum of 100 elements, then we can create the ArrayList with a size of 100. thus, our ArrayList will not require frequent resizing.
```java
List list = new ArrayList(50);
```

### Using existing collection
an ArrayList can also be created using an existing collection. the newly created ArrayList will ocntain all the elements in the same order in the priginal collection.
```java
List list = new ArrayList(oldList);
```
## Inserting and retrieving elements

## Inserting
there are four ways to add elements in an ArrayList
### inserting a single element at the end.
to add a single element at the end of the List, the add(E e) methodcan be used, where E refers to any type of object. this method will check if there is sufficient capacity in the ArrayList . if the ArrayList is full then it will resize it and insert he element at the end. 
![Screenshot 2024-03-05 at 10.25.42.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fjd%2F_tr5km9d1bn2rtnrw8k2rxsc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_pCKyRI%2FScreenshot%202024-03-05%20at%2010.25.42.png)

### Inserting a single element at a given index
we can also insert an element at a particular index using the add(int index, E element) method. this method will insert the element at the given index and will shift the element currently at that position(if and) and any subsequentelement to the right. this method will throw ```indexoutofbounexception``` if the provided index is less than zero or greater than the size of ArrayList

### Inserting multiple elements from another collection
if we have a collection and we need to add all its elements to another ArrayList, then the ```addall(Collection c``` method can be used. this method will add all the elements at the end of the ArrayList
[Screenshot 2024-03-05 at 10.30.28.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fjd%2F_tr5km9d1bn2rtnrw8k2rxsc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_lp8DCr%2FScreenshot%202024-03-05%20at%2010.30.28.png)
```java!
list.addaAll(anotherList);
```
![Screenshot 2024-03-05 at 10.31.05.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fjd%2F_tr5km9d1bn2rtnrw8k2rxsc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_JLP6ms%2FScreenshot%202024-03-05%20at%2010.31.05.png)

```java
 List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(4); // add four to the end of the array
        System.out.println(list);

        list.add(1, 50);  // add 50 at index 1 and shift all other elements to the right
        System.out.println(list);
        
        List newList = new ArrayList(); // create a new list that will be added to the original list
        newList.add(159);
        newList.add(160);
        
        list.addAll(newList);
        System.out.println(list);
```
in the above demo, we encouter a warning message stating ```ArrayListDemo.java uses unchecked or unsafe operations```. the reason for this is that our ArrayList is of Raw type meaning that while creating the ArrayList, we did not define what type of elements this ArrayList can hold. if we had defined the type of elements it can hold when we created the ArrayList, then it is called a parameterized type. it can be doe as shown below.

```java
import java.util.List;

List<String> list = new ArrayList();
```



































