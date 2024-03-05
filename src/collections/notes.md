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
so, we need to provide the type of object wth <> while creating the list.
creating a parameterized Collection is very important. without it, there can be serious errors, which we will se e in the next lesson when we discuss ArrayList iteration.

### Fetching elements form an ArrayList
to fetch an element from ArrayList, we can use the ```get(int index)``` method. this method takes an ```index``` as input and returns the element at that index. the index provided should be equal or greater than zero and should be lesst than the ArrayList size. 
we can fetch the size of the array using size() method.
## Removing elements form an ArrayList
elements can be removed from an ArrayList in the following ways.

### Removing an element at a particular index
we can use the remove(int index) method to remove an element at a particular index. the index should be less than the size of ArrayList, otherwise, ```IndexOutOfBoundsException``` will be thrown. 
![Screenshot 2024-03-05 at 10.51.41.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fjd%2F_tr5km9d1bn2rtnrw8k2rxsc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_sBTQMd%2FScreenshot%202024-03-05%20at%2010.51.41.png)
### Removing a particular element from the ArrayList
we can also specify that we want to remove using remove(object o) method, and the first occurence of that element will be removed.
![Screenshot 2024-03-05 at 10.52.54.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fjd%2F_tr5km9d1bn2rtnrw8k2rxsc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_kyVWDs%2FScreenshot%202024-03-05%20at%2010.52.54.png)
### Removing all the elements within a range
let us suppose we need to remove all the elements from index 5 to 9. this can be done using the ```removeRange(int fromIndex, int toIndex)``` method. this method will remove, from this list, all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive. please note that this method is not defined in the List class. so, it can be used only when the reference type is also ArrayList and not List. 
![Screenshot 2024-03-05 at 10.56.02.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fjd%2F_tr5km9d1bn2rtnrw8k2rxsc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_KmCmdH%2FScreenshot%202024-03-05%20at%2010.56.02.png)
### Removing all the elements within a given collection
we can use the ```removeAll(Collection<?> c)``` method to remove, from the given list, all of the elements that are contained in the specified collection.

### Removing all the elements from the ArrayList
we can use the ```clear()``` method to remove all the elements from the ArrayList

### Replacing all the elements of the ArrayList
a new method ```replacAll(UnaryOperator<E> operator```, was added in Java 8.this method takes in a single UnaryOperator type argument. the UnaryOperator interface is a functional interface that has a single abstract method, ```apply()```, that returns a result of the same object type as the operrand.
let us say we have an ArrayList that contains String objects; we need to make all the elements in this list uppercase. in this case, we can use the ```replaceAll``` method and provide it with lambda expression that converts each element into uppercase.

## Additional operations in ArrayList
### updating an element in ArrayList
to update an element in ArrayList, the ```set(int index, E e)``` method can be used. this method takes the idnex, which needs to be updated and a new value. 

### checking if an element is present in the arraylist
to check if an element is present in the list, we can use the ```contains(Object o)``` method. this method returns true if the element is present in the lst; otherwise, it returns false.

if we need the index of the first occurrence of the element, then the ```indexOf(Object o)``` method can be used. and if we need the last occurrence of the element ```lastIndexOf(object o)``` can be used.

## ArrayList Iteration
there are different ways of iterating over an ArrayList

### Using for loop
an ArrayList can be iterated easily using a simple **for** loop or an enhanced **for** loop as shown below

### using Iterator

the ```Iterator()``` method in ArrayList returns an ```Iteratot``` type object. the Iterator interface declares the below methods that help with iterating an ArrayList

1. ```hasNext()``` - this method returns true if there are more elemets in the list; otherwise, it returns false.
2. ```next()``` - this method returns the next element in the list. before calling it, we should always call ```hasNext``` to verify that there is an element; otherwise, ```NoSuchElementException``` will be thrown.
3. ```remove()``` - this method removes the las element returned by the iterator. it can be called only once per call to the ```next()```
4. ```forEachRemaining(Consumer<? super E> action)``` - this method was introduced in Java 8. it performs the given action for each remaining element untill all elements have been processed or the action throws an exception. this method's benefit is that we do not need to check if there is a next element every time.

if we try to directly remove an element while iterating an ArrayList using an Iterator is created, then ```ConcurrentModificationException``` will also be thrown. we should always use the ```remove()``` method in the iterator to remove an element from the ArrayList.

## Iteration using ListIterator

## using ListIterator
The ```Iterator``` provides very limited capabilities as we can iterate only in the forward direction and we cannot update or insrt an element to the list while iterating. to overcome these problems, we can use ```ListIterator```. the ```ListIterator()``` method returns an object of type ListIterator which can then be used to iterate the ArrayList

below are the methods that are available in the ListIterator interface.
1. ```hasNext``` - this method is used to check if there is a next element in the lit when the list is iterated in the forward direction.
2. ```next()``` - this method returns the next element in the list and advances the cursor position. 
3. ```hasPrevious()``` - this method is used to check if there is a next element in the list when the list is iterated in the backward direction
4. ```previous()``` - this method returns the previous element in the list and moves the cursor position backward
5. ```nextIndex()``` - this method returns the index of the element that would be returned by a subsequent call to next(). it returns -1 if the listIterator is at the beginning of the list.
6. ```previousIndex()``` - this method return the index of the element that would have been returned by a subsequent call to precious(). it returns -1 if the list iterator is at the beginning of the list.
7. ```remove()``` - this method removes the last element that was returned by next() or previous() from the list. this call can only be made once per call to next() or previous(). it can be made only if add() has not been called after the last call to next() or previous()
8. ```set(E e)``` - this method replaces the last element returned by next() or previous() with the specified element. This call can be made only if neither remove() nor add() have been called after the last call to next() or previous().
9. ```add(E e)``` - This method inserts the specified element into the list. the element is inserted immediately before the element that would be returned by next(), if any , and after the element that would be returned by previous() if any.

### Why raw type collection should be avoided
whenever we create a collection, we should provide the type of object it can hold. this is called **parameterized type** Collection. a **raw type** Collection does not have any type safety, and an object of any type can be inserted into it. in the below example we have created a raw type ArrayList. Elements of Integer and String are added to it. This code will compile but will fail at run-time with ```ClassCastException```. This would have been avoided if wer had used Parameterized type.

# ArrayList Sorting
let us see how ArrayList can be sorted

### Sorting an ArrayList in ascending order
The Collections class contains a ```sort(List<T> list``` method, which is used to sort an ArrayList. This method takes an ArrayList as input and sorts it in ascending order. 
in the ```sort(List<T> list``` method, T represents the type of object that is sorted in the ArrayList. The ```collections.sort(List<T> list``` method takes an ArrayList of type T objects as the input. it is a must that T should implement the Comparable interface; otherwise the code will not compile. 

There is another way to sort an ArrayList using Streams, which is a Java 8 feature. once we create a stream then we can use the **sorted** method of the **stream** class, which returns the stream of objects in sorted order

### Sorting an ArrayList in descending order
there is another overloaded version of the sort() method i.e ```sort(list<T> list, Comparator<? super T> c)```, which takes a list and Comparator objects as the input.

The ArrayList can be sorted in reversed order using streams by passing Comparator.reverseOrder() to the sorted method
in Java 8, the ```sort(Comparator<? super E> c``` method was added to the List interface. if we look at the implementation of the Collections.sort() method, then we will find that it internally calls the sort() method of the List interface. the code is shown below.

```java
public static <T extends Comparable<? super T>> void sort(List<T> list){
    list.sort(null);
}
```
let us see how the sort() method of the List interface sorts a list. when the sort() method is called, an array containing all elements in the list is created and sorted. after sorting the array, the list is iterated and each element is reset from the corresponding position in the array.
the elements are first copied to an array and the sorted because it takes less time to sort a linked list using this approach

## Understanding Comparable Interface
let us discuss comparable interface in Java

## Comparable Introduction
```Collections.sort()``` method sorts the given List in ascending order. But the question is, how does the ```sort()``` method decide which element is smaller and which one is larger?

Each wrapper class, String class, and Date class implements an interface called **Comparable**. This interface contains ```compareTo()``` method which is used by sorting methods to sort the Collection. This method returns a negative integer, zero or a positive integer if **this** object is less than. equal to, or greater than the object passed as an argument. 
**if we use the ```Collections.sort(List<T> list)``` method to sort an ArrayList, then the class whose objects are stored in the ArrayList must implement the Comparable interface. if the ArrayList stores an Integer, a Long, or a String, the we don't need to worry as these classes already implement the Comparable interface. but if the **ArrayList** stores a custom class object, then that class must implement the Comparable interface.**
in the given example, we have a custom class called ```Employee```. we have stored some ```Employee``` objects in an **ArrayList**, and we need to sort it. the below example will not compile as the Employee class does not implement the Comparable interface.
```java
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class ArrayListDemo {
        public static void main(String[] args) {
            List<Employee> list = new ArrayList<>();
            list.add(new Employee("Jane", 29));
            list.add(new Employee("Alex", 54));

            Collections.sort(list);
            System.out.println("Employees in asc order: " + list);

        }
    }


}


```
in the example below the ```Employee``` class implements the ```Comparable``` interface. the code will run successfully and will sort the Employee objects in ascending order of their age




















