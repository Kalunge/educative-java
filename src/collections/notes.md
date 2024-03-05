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









