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
### How to write implementation of the compareTo method
let us say you have a custom class, and you need to write the implementation of the ```compareTo()``` method. 
the first step will be to select the fields within that class where you need to sort the objects. for example, if you have a vehicle class then you would like to sort it on the basis of the year it was sold. 
once you have decided the field where the sorting will be done , then the second step will be to write the implementation of the ```compareTo(T o)``` method. the ```compareTo(T o)``` takes only one object as an input. the comparison is made with the calling object. let us say we have two Vehicle class obects

```java
Vehicle v1 = new Vehicle();
Vehicle v2 = new Vehicle();
```
then ```v1.compareTo(v2)``` should return;
1. -1 if the production year of v1 is less than that of v2
2. 1 if the production year of v1 is greater than that of v2
3. 0 if the production year of v1 is equal to that of v2


## Understanding Comparator Interface
one of the major drawbacks of using a comparable interface is that the comparing logic gets fixed. for instance, if we have a vehicle class, then it can be sorted either on the basis of the brand or the production year depending on the implemntation of the ```compareTo``` method.
if we need some flexibility in sorting, we should use the Comparator interface instead of the Comparable interface. the Comparator interface has a method, ```compare(T o1, T o2),``` which takes two objects , o1 and o2 as parameters. it returns -1 if o1 < o2, 1 if o1 > o2 and 0 if o1 is equal to o2.
if we need to use the comparator interface, then we cannot use the collections.sort(List<T> list) method as T should implement the comparable interface. there is another overloaded method, ```sort(List<T> list, Comparator<? super T> c)```, that takes the list as well as a Comparator object as input. it then sorts the list on the basis of logic , which is provided in the Comparator implementation.

the below code shows how to create a custom Comparator. we will create two custom comparators: one for sorting by brand and one for sorting by year. 

we can also use an anonymous class in the sort method instead of creating a separate class that implements Comparator. This is shown in the below example.

## LinkedList
The **LinkedList** class in Java implements the **List** and the **Deque** interface. some of the salient features of a LinkedList are:
* the elements are stored in the order of insertion
* it supports duplicate elements
* we can add any number of null elements
![Screenshot 2024-03-07 at 08.19.52.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fjd%2F_tr5km9d1bn2rtnrw8k2rxsc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_ZfQupb%2FScreenshot%202024-03-07%20at%2008.19.52.png)
## Internal implementation of a LinkedList
the **LinkedList** class has a static inner class called **Node**. this class contains three fields
* **item** - This contains the value of the current element
* **next** - this contains te pointer to the next element. 
* **prev** - this contains the pointer to the previous element

```java
public static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

    }
```
when an element is added to the LinkedList, a new Node instance is created. Depending on where the new node is being added, the **prev** and **next** fields are set.
when a Node at index i is removed, the next field of node at index i - 1 is set to the node at index i + 1. Similarly, the prev field of node at index i + 1 is set to node i - 1
![Screenshot 2024-03-07 at 08.27.39.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fjd%2F_tr5km9d1bn2rtnrw8k2rxsc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_4IA3aL%2FScreenshot%202024-03-07%20at%2008.27.39.png)

## Time complexities for LinkedList operations
let us see what time complexities are for different operations in a LinkedList

### Adding an element
the complexity of adding an element to a LinkedList is O(1). if we need to search for the position where the Node needs to be inserted, the time complexity is O(n), but the element is usually inserted at the beginning or end which makes it O(1)
the biggest benefit of LinkedList, in comparison to an array, is that when new elements are added or removed , the other elements are not rearranged.
### Removing an element
removing an element is also a O(1)operation if we are aware of the position of the element that needs to be removed. if we need to search and remove an element, it is an O(n) operation

### Searching for an element
searching an element is an O(n) operation, as the entire LinkedList is iterated to search the element in the worst case.

## Creating a LinkedList
there are two ways to create a LinkedList
### Using the no-arg constructor
the default constructor does not take any arguments and creates a LinkedList of size zero. below is the syntax to create LinkedList using the default constructor.

```java
import java.util.LinkedList;

List<Integer> list = new LinkedList<Integer>();
```

### Using existing collection
a LinkedList can also be created using an existing **Collection**. the newly created LinkedList will contain all the elements in the same order as the original Collection.

## Inserting an element into a LinkedList
let us look at various ways of inserting an element into a LinkedList

### inserting a single element at the end
To insert a single element at the end we can use the ```add(E e) ```or ```addLast(E e)``` method. These methods insert the given element at the end of the list and do not return anything
### inserting a single element at the beginning
we can use the ```addFirst(E e)``` method to insert an element at the beginning
### inserting an element at a particular index
we can use the ```add(int index, E element)``` method to insert an element at a particular index. the index should be greater than zero and less than the size of the LinkedList; otherwise ```IndexOutOfBoundsException``` is thrown

### Inserting multiple elements from another collection
if we have a collection and we need to add all its elements to another **LinkedList**, then the ```addAll(collection c)``` method can be used. This method will add all the elements at the end of the LinkedList.
```java
list.addAll(anotherList);
```
### Inserting multiple elements from another collection at a particular index
if we have a collection and we need to add all its elements to another LinkedList at a particular index, then the ```addAll(int index, Collection c)``` method can be used. this method inserts all the elements in the specified collection into this list starting at the specified location.

## LinkedList Fetching and removing
let us discuss how to fetch and remove elements from a LinkedList

## Fetching element from a LinkedList
### Fetching the first element
we can use the ```getFist()``` method to fetch the first element in the list. if the LinkedList is empty, then ```NoSuchElementException``` is thrown. 
### Fetching the last element
we can use the ```getLast``` method to fetch the last element in the list. if LinkedList is empty, then ```NoSuchElementException``` is thrown. 
### Fetching element at a particular index
we can fetch an element at a particular index by using the ```get(ind index)``` method. the index should be more than zero and less than the size of the LinkedList; otherwise, ```OndexOutOfBoundsException``` will be thrown. 

## Removing element from a LinkedList
let us discuss different methods to remove an element from a LinkedList

### Removing the first element
we can use the ```removeFirst()``` method to remove the first element in the list. if the LinkedList is empty, the  ```NoSuchElementException``` is thrown.
### Removing the last element
we can use the ```removeLast()``` method to remove the last element in the list. if the LinkedList is empty, the  ```NoSuchElementException``` is thrown.
### Removing an element at a particular index
we can remove an element at a particular index by using the ```remove(int index)``` method. the index should be more than zero and less than the size of the LinkedList; otherwsie, ```OndexOutOfBoundsException``` will be thrown. 
### Removing a particular element
we can use the ```remove(object o)``` method to remove a particular element from the LinkedList. if there is more than one occurrence of a particular element, the first occurrence is removed. if we want to remove the last occurrence of an element , the ```removeLastOccurrence()``` method can be used.

## Sorting LinkedList

to sort a **LinkedList** we can use the ```sort()``` method of the Collections class as shown. 

```java
package linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1); // adds 1 to the list
        linkedList.add(2); // adds 2 to the end of the list
        linkedList.add(4);

        linkedList.addLast(3); // adds 3 to the end of the list
        System.out.println(linkedList);

        linkedList.addFirst(10); // adds 10 to the start of the list
        System.out.println(linkedList);

        linkedList.add(2, 20); // adds 20 to second position of the list
        System.out.println(linkedList);

        List<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);


        linkedList.addAll(3, list); //adds a collection of elements at third position in the list.
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst()); // fetching the first element
        System.out.println(linkedList.get(3)); // fetching the element at the third index
        System.out.println(linkedList.getLast()); // fetching the last element

        System.out.println("Linked List before removing any element: " + linkedList);

        linkedList.remove(); // removes the first element
        System.out.println("LinkedList after removing the first element: " +linkedList);

        linkedList.removeLast(); // removes the last element
        System.out.println("LinkedList after removing the last element: " +linkedList);



        linkedList.remove(Integer.valueOf(2)); // removes the first occurrence of 2
        System.out.println("LinkedList after removing  the first occurrence of 2: " +linkedList);

        linkedList.removeLastOccurrence(4); // removes the last occurrence of 4
        System.out.println("LinkedList after removing  the last occurrence of 4: " +linkedList);

        Collections.sort(linkedList);
        System.out.println("sorted linkedList: " + linkedList);

    }

}

```

# HashSet Creation and Insertion
let us discuss HashSet creation and insertion 

**HashSet** is a class in the **java.utils** package which implements the **Set** interface. some of the features of HashSet are:
* HashSet does not allow duplicate elements
* HashSet allows only one null element
* the elements are inserted in random order in a HashSet
* a HashSet is internally backed by a HashMap

## Creating a HashSet
there are four different constructors available to create a HashSet in Java.

### Using the no-arg Constructor
the simplest way t create a HashSet is by using the no-arg constructor. this constructor creates a HashSet with and initial capcity of 16 and a load factor of 0.75
below is the code syntax to create a HashSet

```java
import java.util.HashSet;

Set<Integer> set = new HashSet<>();
```
**Load factor is a number that defines when a Set should be resized. if the load factor is 0.75, then the Set should be resized when it is 75% full.**

### using the constructor that takes in an initial capacity
we can also provide the initial capacity while creating the HashSet. if we are already aware that our HashSet will contain more than 16 elements, then it is better to provide some initial capacity as it reduces the number of resizes. in this case, also the default load capacity of 075 is used.
### using the constructor that takes in the initial capacity and load factor
we can also provide initial capacity along with the load factor while creating the HashSet. if we don't want frequent resizing, we can set the load factor to a higher number
### Using the constructor that takes another Set as a parameter
we can also create a HashSet using another Set by passing it to the constructor. the newly created HashSet will have the same size as that of the passed Set, whereas the load factor will default to 0.75
## Inserting an element into a HashSet
there is an ```add(E e)``` method available that inserts an element into the **HashSet**. if the element is not already present, then this method puts the element and returns ```true```. if the element is already present, then it returns false.

### Fetching an element from a HashSet
unlike ArrayList, there is not ```get()``` method in HashSet because a HashSet is not backed by an array. The elements are stored in random order in a HashSet, and we cant get aa particular element. if we want to check whether a particular element is in the HashSet or not, then we can use the ```contains()``` method.
```java
package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        System.out.println("Inserting 23 in the HashSet: " + set.add(23)); // returns true
        System.out.println("Inserting 27 in the HashSet: " + set.add(27)); // returns true
        System.out.println("Inserting 23 in the HashSet: " + set.add(23)); // returns false as the element is already present

        System.out.println(set);

        System.out.println(set.contains(23));
    }
}

```

## HashSet Operations
let us discuss some operations that can be done on HashSet

## Removing an element from a HashSet
below are the ways that we can remove an element from the HashSet

### using the ```remove(Object o)``` method
we can use the ```remove(Object o)``` method to remove an element from HashSet. This method takes an object that needs to be removed as a parameter. if the element is removved, the this method returns ```true```. if the element is not present, then it returns ```false```.
### Using the ```clear()``` method.
we can use the clear method to remove all the elements from a HashSet

## Checking if the HashSet is empty
we can check if the HashSet is empty using the ```isEmpty()``` method. this method returns true if the Set does not have elements and returns false if the Set has some elements.
## HashSet Iteration and sorting
let us look at different ways to iterate over a **HashSet**

## Iterating a HashSet
below are the different methods to iterate a HashSet

### Using for loop
a Hashset can be easily iterated over using an enhanced for loop as shown below

### Using Iterator
Hashset can also be iterated using an iterator as shown in the below example.

## Using for each method
we can use ```forEach(Consumer<? suoper T>action)``` method defined in the ```Iterable``` class. This method was introduced in Java 8. it accepts an action that needs to be performed for each element as a parameter.

## Sorting a HashSet
since a **HashSet** stores the elements in random order, it is not possible to store the elements in a HashSet in sorted order. if we want to sort the elements of a HashSet, then we should convert it into some other collection such as a List, TreeSet or linkedhashset.
Here we will see how we can convert a HashSet to an ArrayList, and then we can use the elements from the List. we can create an arrayList by sending another collection to its constructor. we can sort this ArrayList using the sort() method of the Collections class.
```java
package hashset;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        System.out.println("Inserting 23 in the HashSet: " + set.add(23)); // returns true
        System.out.println("Inserting 27 in the HashSet: " + set.add(27)); // returns true
        System.out.println("Inserting 23 in the HashSet: " + set.add(23)); // returns false as the element is already present
        set.add(56);
        System.out.println();
        System.out.println("Iterating the set using for loop");

        for (int i : set) {
            System.out.println(i);
        }
        System.out.println("End of iteration");
        System.out.println();

        System.out.println("Iterating the set using Iterator");


        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Iterating the set using forEach");

        set.forEach(elem -> System.out.println(elem));
//        set.forEach(System.out::println); // using lambda
        set.add(5);
        set.add(7);

        List<Integer> list = new ArrayList<>(set); // creating an arraylist from an existing set
        Collections.sort(list); // sorting the list

        System.out.println("Sorted list: ");

        list.forEach(System.out::println);

        System.out.println(set);

        System.out.println(set.contains(23));

        set.remove(23);
        System.out.println("Hashset after removing one element: " + set);
        System.out.println(set.isEmpty());
        set.clear(); // returns false as set has some elements
        System.out.println("Hashset after removing all elements: " + set);
        System.out.println(set.isEmpty()); // returns true after clear



    }
}

```

# HashMap
## Creation and insertion
Let us look at hot to create a HashMap and insert elements into it.

**HashMap** is a class in the```java.utils``` package that implements the **Map** interface. it is used to store the key-value pair. let us suppose we need tp store the stock prices of some companies. in this case, we can use a HashMap. the company name will be the key and the stock price will be the value.

some of the features of a HashMap are;
* The keys should be unique
* HashMap allows only one null key.
* the values can be null or duplicate.
* the keys are stored in random order.

## creating a HashMap
there are four different constructors available to create a HashMap in Java

### Using the no-arg constructor
the simplest way to create a HashMap is by using the no-arg constructor. this constructor creates a HashMap with an initial capacity of 16 and load factor of 0.75
below is the code syntax to create a HashMap. it states that the key is a String type and the value is an Integer type.

```java
import java.util.HashMap;

Map<String, Integer> map = new HashMap<>();
```
**Load factor is a number that defines when a Map should be resized. if the load factor is 0.75, then it means that the Map should be resized when it is 75 percent full.**

## using the constructor that takes initial capacity.
we can also provide the initial capacity while creating the HashMap. if we are already aware that our HashMap will contain more than 16 elements, then it is better to provide some initial capacity as it reduces the number of resizes. in this case, also, the default load factor is 0.75

## Using the constructor that takes initial capacity and load factor
we can also provide initial capacity with the load factor while creating the HashMap. if we dont want frequent resizing then we can set the load factor to a higher number
## using a constructor that takes another map as a parameter
we can also create a HashMap using another Map by passing it to the constructor. the newly created HashMap will have the same size as that of the passed Map, whereas the load factor will default to 0.75.
## Inserting into a HashMap
let us discuss the methods that we can use to insert a key-value pair in a **HashMap**

### using the ```put()``` method
we can use the ```put(K key, V value)``` method to insert a key-value pair in the HashMap. if the key is not present, then a new key-value pair will be added. if the key is already present, then the value will be updated. 

### using the ```putIfAbsent()``` method
the ```putIfAbsent(K key, V value)``` method inserts a key-value pair only if it is not already present in the Map. if the key is already present then its value will not be updated. This method was added in Java 8.

### using the ```putAll()``` method
the ```putAll(Map<? extends K, ? extends V< m)``` method copies all of the mappings from the specified map to this map. these mappings will replace any mappings this map had for any of the keys currently in the specified map

the below code shows HashMap working properly
```java
package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 56); // inserting share price of oracle into the map
        System.out.println(stockPrice);

        stockPrice.put("Oracle", 70); // inserting share price of oracle again, this should update the existing value
        System.out.println(stockPrice);

        stockPrice.putIfAbsent("Oracle", 100); // inserting share price of oracle again using puIfAbsent
        System.out.println(stockPrice);

    }
}

```
## Updation and Removal
let us discuss the update and delete operations in HashMap

## Fetching an element in a HashMap
There are two ways to get an element from a HashMap
### using the``` get()``` method
the ```get(Object key)``` method takes a key as a parameter and returns the value corresponding to that key. if the key is not present, it returns ```null```

### using the ```getOrDefault() ```method
the ```getOrDefault(Object key, V defaultValue)``` method is useful if are not sure whether a key i s present in the Map or not. if the key is present the this method returns the value corresponding to the key and if the key is not present then the default value is returned

## Replacing a value in HashMap
when we insert a key-value pair in HashMap and the key is already present then its value gets updated. but if we only want to update the value of a key that is present in the map, then we can use the ```replace()``` method. there are two overloaded versions of the replace() method and one replaceAll() method. all three methods were added in Java 8.
### Using the ```replace(K key, V oldValue, V newValue)``` method
The ```replace(K key, V oldValue, V newValue)``` method takes three parameters: the key, the oldValue, and a new value. it checks if the current value of the key is equal to the old value provided in the parameter. if yes then it replaces the value with ```newValue``` and returns true; otherwise, it returns false.
### using the ```replace(K key, V value)```  
this method takes only two parameters: a key and a value. it replaces the value of the key with the new value provided as a parameter and returns the old value. if the key is not present, then it returns null.

### using the ```replaceAll(BiFunction<? super K, ? super V, ? extends V> function)``` method
this method takes a BiFunction as input and replaces the values of all the keys with the result of the given function. Suppose we need to add ten to the stock price of each company. instead of updating the value for each stock one by one, we can use ths method. The lambda expression to do this task will look like this
```java
(key, value) -> value + 10;
```

## Removing element from a HashMap
an element can be easily removed from the **HashMap** using the ```remove(Object key)``` method. it takes a key as a parameter and removes that key from the map. This method returns the value of the key that was removed. if the key is not present, then it returns ```null```

another overloaded version of this method ```remove(Object key, Object value)``` was aded in Java 8. this method removes a key only if is is currently mapped to the sepcified value. this method returns true if the key is removed; otherwise it returns false. 

## HashMap Operations
let's discuss some HashMap operations

## Checking if a key is present in the HashMap
we can use the ```containsKey(Object kye)``` method to check if a given key is present in the HashMap. this method returns true if the ley is present and returns false if the key is not present. Similarly, we have a ```containsValue(Object value)``` method that retuns if one or more keys are mapped to this value.

## Fetching all the keys from HashMap
if we need to fetch all keys that are stored in a HashMap, then we can use the ```keySet()``` method. This method returns a Set containing all the keys present in the map.

## Fetching all the values from HashMap
if we need to fetch all the values stored in a HashMap, we can use the ```values()``` method. This method returns a Collection containing all the values present in the Map.

## Checking if the HashMap is empty
we can check if the HashMap is empty using the ```isEmpty()``` method. This method returns true if the Map does not have any elements and returns false if the Map has soe elements.

## Java 8 Improvements
let us discuss the improvements made in the HashMap class in Java 8.
in this lesson we will look at some of the HashMap Operations that were added in Java 8

## The ```compute()``` method
The ```compute(key, BiFunction)``` method allows us to update a value in HashMap. This method tries to compute a mapping for the specified key and its current mapped value(or null if no current mapping is found). this method is used to atomically update a value for a given key in HashMap
1. if the remapping function passed in compute returns null, the mapping is removed from the Map(or remains absent if initially absent)
2. if the remapping function throws an exception, the exception is rethrown, and the current mapping is left unchanged.
the syntax of this method is

```java
import java.util.function.BiFunction;

compute(K key, BiFunction<? super K, ?super V, ? extends V> remappingFunction)
```
let's say we have a HashMap in which the key is a String, and the value is an Integer. we need to increment the value for a given key by one, and if the key is not present, we need to insert the key with the default value of 10. we can create a lambda expression and pass it to the compute() method.

## the ```computeIfAbsent() ```method
the ```computeIfAbsent(Key, function)``` method of the HashMap class is used to compute the value for a given key using the given mapping function and enter that computed in HashMap; otherwise, it is null. please note that the computeIfAbsent() will work only if the key is absent ot of the key is present with a null value. 
the syntax of this method is

```java
import java.util.function.Function;

public V
computeIfAbsent(K key,
                Function<? super  K, ? extends V> remappingFunction);
```
let us say we have a HashMap in which the key is a String and the value is the length of the String. we can use the computeIfAbsent() method to insert new pairs in the Map. we will pass a lambda function that returns the length of the key. 

## The ```ComputeIfPresent() ```method
the ```ComputeIfPresent(Key, BiFunction)``` method of the HashMap class allows ou to compute the value of mapping for a specified key if the key is already associated with a value or is mapped to null. 
1. if the mapping function of this method returns null, the mapping is removed
2. if the mapping function throws an exception, the exception is rethrown, and the mapping is left unchanged.

the syntax of this method is
```java
public Object computeIfPresent(Object key,
                               BiFunction remappingFunction);
```

let's say we have a HashMap in which the key is a String and the value is some Integer. then we can use ```computeIfPresent()``` method to update the value in the Map. we will pass a lambda function that will calculate a value if the key is already present in the Map.
## The ```merge() ```method
the merge function can be used to merge two Maps. this method takes three arguments:
1. **key** - The Key that needs to be merged
2. **value** - The value that needs to be inserted in case the key is not present.
3. **remappingFunction** - This is a BiFunction that is used to update the value if the key is present. 

we will begin to understand the working of this method using an example. let us say we have two Mpas in which the key is tha name of a person and the value is the amount of money that person has borrowed from us. it is possible that a person is present in both the Mpas. So, we need to merge these maps to find the total amount that each person has borrowed from us. 
The syntax of this method is

```java
import java.security.Key;
import java.util.function.BiFunction;

merge(K key, V value,
      BiFunction remappingFunction);
```

## HashMap Internal Implementation
Let us look at how a **HashMap** works internally. 

How **HashMap** works internally is the most asked interview question in Java interviews. and the reason is that it is difficult to understand the inner workings of HashMap. In this lesson, we will try to understand every aspect of HashMap.
The basic principle used by a HashMap to store elements is **Hashing** Hashing is a way to assign a unique code for any variable or object after applying any formula to its properties. The unique code is called **HashCode**.
some of the properties of HashCode is
1. if two objects are equal then they should have the same hashCode. 
2. if two objects have the same HashCode, then it is not necessary for them to be equal.

## Creating a HashMap
we already know that the HashMap stores key-value pairs. HashMap has a nested static class called Node as shown below

```java
import java.util.Map;

static class Node(K, V) implements Map.Entry<K,V> {
    final int hash;
    final K key;
    V value;
    Node<K,V> next;
    ...some more code;
}
```
This class has a key and a value field. it also has a next field that is used to point to the next Node.
HashMap also has a field called table as shown below. it is basically an array of Node objects that are not yet initialized
```java
transient Node<K, V>[] table;
```
when we create a HashMap using the no-arg constructor, then the only thing that happens is that the loadFactor is assigned ```DEFAULT_LOAD_FACTOR```, WHICH IS .75
The table array that we have discussed above is not initialized at the time of creation of HashMap

```java
public HashMap() {
    this.loadFactor = DEFAULT_LOAD_FACTOR; // all other field defaulted
}
```
## Inserting into a HashMap
when an element is inserted into the HashMap for the first time, the array table is initialized with size 16. so now there are 16 buckets from index 0 to 15.
if the key we are inserting is null, then it is inserted at index 0 because the hashCode of null is 0. if the key is not null, then the hash of the key is calculated, and based on the hash value the bucket is decided.
it there is no other element in that bucket, then a new Node is created and is inserted in that bucket.
![Screenshot 2024-03-12 at 11.55.30.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fjd%2F_tr5km9d1bn2rtnrw8k2rxsc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_4VseSH%2FScreenshot%202024-03-12%20at%2011.55.30.png)
Now, let us say we insert another key that has the same hashcode as the previous key. in this case, this key will go to the same bucket and see that there is already an element there. This is referred to as **collision**
in case of collision, it checks if the existing key in the bucket is equal to the key that we are trying to store. if yes then the value of the key is updated. if the key is different, then it is added at the end of the existing key into the bucket to fork=m a linkedlist.
![Screenshot 2024-03-12 at 11.58.19.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fjd%2F_tr5km9d1bn2rtnrw8k2rxsc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_An3KGH%2FScreenshot%202024-03-12%20at%2011.58.19.png)

There is no improvement made in Java 8. if the size of the LinkedList in a particular bucket becomes more than **TREEIFY_THRESHOLD**, then the linkedlist is converted to a red-black tree. 
**TREEIFY_THRESHOLD** is a constant with a default of 8. This value can't be changed as it is a final variable. This means that if the size of the linked list becomes more than 8 then it is converted into a tree. 
![Screenshot 2024-03-12 at 12.01.01.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fjd%2F_tr5km9d1bn2rtnrw8k2rxsc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_AQksJj%2FScreenshot%202024-03-12%20at%2012.01.01.png)

## Fetching a value from HashMap
when we need to get a value from **HashMap**, then the hashcode of the key is calculated. Based on the hashcode the index is decided, and we go to that index. Now it is possible that there are zero or more keys stored at that index. we match our key with all the keys at that index using the ```equals()``` method. if the match is found, then we reeturn the value of that key. if the key is not found, then null is returned.
![Screenshot 2024-03-12 at 12.03.45.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fjd%2F_tr5km9d1bn2rtnrw8k2rxsc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_eOyyWG%2FScreenshot%202024-03-12%20at%2012.03.45.png)

## Resizing a HashMap
we already know that a HashMap is resized when it is about to get full. when a HashMap will be resized depends upon the load factor. if the current capacity is 16, the load factor is .75, then the HashMap will resize when it has 12 elements(0.75 * 16)
when a HashMap is resized, its capacity is always doubled. so if the current capacity is 16, then the new capacity will be 32. Now all the elements that are stored in the HashMap will be rearranged amongst these 32 buckets. This is a time-consuming operation as the bucket for each key is calculated and rearranged. 

# HashMap: How to design a good key
Let us see how we can design a good HashMap key. 
the first and foremost requirement for a good key is that it should follow the ```hashCode()``` and ```equals()``` contract. the contract says:
1. if two objects are equal , then they must have the same hash code
2. if two objects have the same hash code, they may or may not be equal

This means that the class that is being used as key must override both ```equals()``` and ```hashCode()```

#### why overriding both ```hashCode()``` and ```equals()``` is important
if a class does not override bth ```hashCode()``` and ```equals()``` method, then it will break the contract and the HashMap may not work. Let us look at an example. we have an Employee class that has two fields as shown below
```java
public class Employee {
    int empId;
    String empName;
}
```
this class overrides the ```hashCode()``` method but does not override the``` equals()``` method. ideally, two objects are considered equal if their empID is equal.
now we will create theo Employee objects with the same empId and empName.  we will also create a HashMap where the key will be the Employee object, and the value will be the salary. the HashMap shuld not allow both the employee objects to be inserted as they are equal.
```java
package hashmap;

import java.util.Objects;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}


Employee employeeOne = new Employee(123, "Jane");
Employee employeeTwo = new Employee(123, "Jane");

Map<Employee, Integer> employeeMap = new HashMap<>();
employeeMap.put(employeeOne, 56000);
employeeMap.put(employeeTwo, 45000);

for (Map.Entry<Employee, Integer> entry : employeeMap.entrySet()) {
    System.out.println("Employee id: " + entry.getKey().id + " employee name: " + entry.getKey().name);
}
```

on running the above programme, we can see that both the Employee objects  got inserted into the HashMap. The reason is that since we have not overridden the equals() method , the equals() method of the Object class is called because Object is the super class of all the classes. below is the implementation of the equals() method in the Obect class.
```java
public boolean equals(Object obj) {
    return (this == obj);
}
```
as we can see, it compares two reference points to the same object. since we have created two separate Employee objects, the equality check failed and both objects were saved. 
now we will override the equals() method as well in the Employee class, and then we we=ill see that only one Employee object is stored

## Why immutable objects make a good key
it is not mandatory for a HashMap key to be immutable, but it is suggested that key objects are immutable. Immutability allows us to get the same hashCode every time for a key object.
all the wrapper classes such as String, INteger, e.t.c, are immutable, so they are considered good key candidates
Let us look at an example to understand what happens when a key object is not immutable. in the below example, we are using an Employee object as a key. After inserting the employee object into the HashMap, we will make a change in the Employee object. after that, we will tryto get the value for this key from the HashMap
```java
Employee employeeOne = new Employee(123, "Jane");
Employee employeeTwo = new Employee(123, "Jane");

Map<Employee, Integer> employeeMap = new HashMap<>();
employeeMap.put(employeeOne, 56000);

employeeOne.name = "Muthomi";
System.out.println(employeeMap.get(employeeOne));
```
when we run the above program, null is returned. The reason is when we change the Employee object its hashCode also changes. Therefore, when we try to search for the Employee object, a different bucket is retruned. although the object was present in the HashMap, it is not returned
if we are using custom object as the HashMap key, then either the class should be immutable, or the fields that are used to calculate the hashCode should be made final.

## HashMap Iteration
let us see how we can iterate elements of a HashMap

Iterating a HashMap is a bt challenging compared to a List or a Set as it contains pairs of elements. In a map, each key-value pair is called entry. the ```entrySet()``` method returns the Set view of the mapped elements. we can iterate over this set using any of the below approaches

## Iterating using a for loop
we can easily iterate the EntrySet returned by the entrySet() method using an enhanced for loop. The Entry class contains two methods: ```getKey()``` and ```getValue()```, which can be used to get the key and value respectively.

## Using an Iterator
Instead of using for loop , we can get the iterator on the EntrySet and then use it to iterate the HashMap. if we remove an element from the EntrySet, then it is also remove from the original map.

## using ```forEach()``` method

the ```forEach(BiConsumer<? super K, ? super V> action)``` method is a default method that was introduced in Java 8. it takes a ```BiConsumer``` as a parameter. The below example shows how we can use the ```forEach()``` method to print the key-value pairs
```java
package hashmap;

import java.security.KeyStore;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 30); // inserting share price of oracle into the map
        System.out.println(stockPrice);

        stockPrice.put("Oracle", 56); // inserting share price of oracle again, this should update the existing value
        System.out.println(stockPrice);

        stockPrice.putIfAbsent("Oracle", 100); // inserting share price of oracle again using puIfAbsent
        System.out.println(stockPrice);

        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        System.out.println(stockPrice.get("Oracle"));
        System.out.println(stockPrice.get("Google")); // should return null

        // since google is not present , this will insert it with default value of q00.
        System.out.println(stockPrice.getOrDefault("Google", 100));

        //this will not replace the value of oracle because current value is not 70
        stockPrice.replace("Oracle", 70, 76);
        System.out.println(stockPrice.get("Oracle"));

        //this will replace the value of oracle because current value is  56
        stockPrice.replace("Oracle", 56, 76);
        System.out.println(stockPrice.get("Oracle"));

        // this will replace the value of Fiserv as the current value does not matter
        stockPrice.replace("Fiserv", 100);
        System.out.println(stockPrice.get("Fiserv"));

        // Using the replace all method to add 1000 to the price of each stock
        stockPrice.replaceAll((key, value) -> value + 1000);
        System.out.println(stockPrice);

        System.out.println(stockPrice.remove("Oracle")); //this will remove Oracle from the Map and return oracle value = 1076
        System.out.println(stockPrice.remove("Google")); // will return null as Google is not in the Map
        System.out.println(stockPrice.remove("BMW", 30)); // will return false as 30 is not the value of BMW

        System.out.println(stockPrice.containsKey("Microsoft")); // returns true
        System.out.println(stockPrice.containsValue(1213)); // returns true

        System.out.println("HashMap keys");
        Set<String> keys = stockPrice.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("HashMap values");
        Collection<Integer> values = stockPrice.values();
        for (int value : values) {
            System.out.println(value);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("India", 5);
        map.put("USA", 3);
        map.put("China", 5);
        map.put("Russia", 6);

        // increase value of india by 1 if present
        map.compute("India", (key, value) -> value == null ? 10 : value + 1);

        // insert Vietnam with a value of 10
        map.compute("Vietnam", (key, value) -> value == null ? 10 : value + 1);

        System.out.println(map);

        System.out.println(stockPrice.isEmpty());

        map.computeIfAbsent("Malaysia", k -> k.length());
        System.out.println(map);


        // increment the value of India by one since it is present
        map.computeIfPresent("India", (k, v) -> v == null ? 10 : v + 1);
        System.out.println(map);

        // will not Insert Kenya into the map
        map.computeIfPresent("Kenya", (k, v) -> v == null ? 10 : v + 1);
        System.out.println(map);

        Map<String, Integer> mapOne = new HashMap<>();

        mapOne.put("Jay", 5000);
        mapOne.put("Rahul", 3000);
        mapOne.put("Nidhi", 4500);
        mapOne.put("Amol", 60000);

        Map<String, Integer> mapTwo = new HashMap<>();
        mapTwo.put("Jay", 7000);
        mapTwo.put("Rahul", 4500);
        mapTwo.put("Nidhi", 1200);
        mapTwo.put("Saurav", 25000);

        mapOne.forEach((key, value) -> mapTwo.merge(key, value, (v1, v2) -> v1 + v2));
        System.out.println(mapTwo);


        Employee employeeOne = new Employee(123, "Jane");
        Employee employeeTwo = new Employee(123, "Jane");

        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(employeeOne, 56000);
        employeeMap.put(employeeTwo, 45000);

        employeeOne.name = "Muthomi";
        System.out.println(employeeMap.get(employeeOne));


        for (Map.Entry<Employee, Integer> entry : employeeMap.entrySet()) {
            System.out.println("Employee id: " + entry.getKey().id + " employee name: " + entry.getKey().name);
        }


        Set<Map.Entry<String, Integer>> entrySet = stockPrice.entrySet(); // returns a set of entries
        Iterator<Map.Entry<String, Integer>> itr = entrySet.iterator(); // Getting the iterator


        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("Company name: " + entry.getKey() + " Stock price: " + entry.getValue());
        }

        System.out.println();

        System.out.println("Iterating using an iterator");

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Company name: " + entry.getKey() + ", Stock price: " + entry.getValue());

            if (entry.getKey().equals("Oracle")) {
                itr.remove();
            }
        }
        System.out.println("Printing out the resulting Map");
        System.out.println();

        System.out.println(stockPrice);

        System.out.println("Iterate using forEach");
        System.out.println();

        stockPrice.forEach((key, value) -> System.out.println("Company name: " + key + ", Stock price: " + value));

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);

        System.out.println(stockPrice);

        System.out.println("Find the highest stock price");

        Set<Map.Entry<String, Integer>> maxSet = stockPrice.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = maxSet.iterator();
        int max = 0;
        String company = "";

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();


            if (entry.getValue() > max) {
                max = entry.getValue();
                company = entry.getKey();
            }
        }
        System.out.println(company);

        List<Integer> stockPrices = new ArrayList<>();
        int total = 0;

        for (Map.Entry<String, Integer> entry : maxSet) {
            stockPrices.add(entry.getValue());
        }

        for (Integer i : stockPrices) {
            total += i;
        }


        System.out.println(total / stockPrices.size());

        Collection<Integer> allValues = stockPrice.values();

        int sum = 0;

        for(Integer v : allValues) {
            sum += v;
        }

        System.out.println(sum / values.size());

        Iterator<Map.Entry<String, Integer>> newIterator = maxSet.iterator();

        while (newIterator.hasNext()) {
            Map.Entry<String, Integer> entry = newIterator.next();
            if (entry.getValue() < 50) {
                newIterator.remove();
            }
        }

        System.out.println(stockPrice);





    }


}

```

# ARRAY CLASS
## Searching an Array
let us discuss how we can use the binarySearch() method to search an element in an array

**Arrays** is a class in the ```java.utils``` package that contains various methods for manipulating arrays(such as sorting and searching). This class also contains a static factory that allows arrays to be seen as a list. The methods in this class throw a ```NullPointerException``` if the specified array reference is null.
## Searching a element in an array
the **Arrays** class provides the ```binarySearch()``` method to search for a particular element in an array. There are a lot of overloaded ```binarySearch()``` methods to handle all the primitive types. some of the important points to note about the ```binarySearch() ```method are:
1. The array that is passed to the method should be sorted. if the array is not sorted, then the result is undefined.
2. this method returns the index where the element is present in the array. if the element is not present in the array, then the index of the first element greater than the key is returned. 
3. if the array contains multiple elements with the specified value, there is not guarantee which one will be found.
4. classCastException is thrown if the search key is not comparable to the elements of the array.
as the name suggests, the binarySearch method uses the binary search algorithm to search for an element in the array. it is far better than a linear search. the complexity of the linear search algorithm is O(n) whereas that of the binary search algorithm is O(log n).
the example below shows how we can use the binary search method to search an element in an integer array
it is possible that we may not need to search the entire array. in that case, we can provide the start and end index of the elements in the array that needs to be searched.
```java
public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("The index of element 4 in the array is: " + index);

        int anotherIndex = Arrays.binarySearch(numbers, 5,9,4);

        System.out.println("The index of element 4 in the array is: " + anotherIndex);

        anotherIndex = Arrays.binarySearch(numbers, 1, 5, 4);

        System.out.println("The index of element 4 in the array is: " + anotherIndex);
    }
}
```
## Searching a custom class object in an array
let us say we have created an Employee class and we have an array of **Employee** objects. we want to check if a particular Employee object is present in the array or not. 
we will pass the employee array and the object that we need to search to the ```binaryearch()``` method as shown in the example below. 
the example will not compile because our Employee class does not implement the Comparable interface. For the search to be successful it is necessary that the objects we have stored in the array should be comparable
```java
Employee[] employees = { new Employee(123, "Jay"), new Employee(124, "Roy"), new Employee(125, "Nikki"),
                new Employee(126, "Tom") };

        int employeeIndex = Arrays.binarySearch(employees, new Employee(124, "Roy")); // throws ClassCast exception as Employee doesnt implement Comparable interface
        System.out.println("The index of employee  in the array is: " + employeeIndex); 
```
we have to options to fix the above issue. Either our class should implement the Comparable interface or we should pass a Comparator implementation while calling the ```binarySearch() ```method.
in he example below we are passing Comparator implementation while calling the ```binarySearch()``` method

## Sorting an array
let us see how we can sot an array using the sort() method of the Arrays class.

The Arrays class has a sort() method that is used to sort the arrays of objects and primitives. If we are sorting a primitive array, then quicksort is used. And if we are sorting an object array, then merge sort is used.

Although quicksort is faster in both cases, it is not a stable algorithm. Merge sort is a stable algorithm, so it is used in the case of sorting an object array. In the case of the primitive array, we don’t care about stability, so quicksort is used.
**Stable sorting algorithms are algorithms that maintain the relative order of equal elements. For example, we have an array [1,4,6,8,6], which we need to sort. Now after sorting this array, the result is [1,4,6,6,8]. Although there are two sixes in the array, we don’t care which six came first in the sorted array. But in the case of an object array, the relative order of elements also matters. If two objects are the same in an object array, then their relative order should be the same in the sorted array.**

The sort method has two variants:
1. ```sort(array)``` - sorts the full array into ascending order.
2. ```sort(array, fromIndex, toIndex)``` - sorts only the elements from fromIndex to toIndex.

## Sorting an array in parallel
in Java 8, a new method ```parallelSort()``` was introduced to sort the arrays parallelly. Unlike, ```sort()```, which sorts data sequentially using a single thread, parallelSort() uses a parallel sort-merge sorting algorithm. it breaks the array into sub-arrays that are themselves sorted and then merged.
This method uses the ForkJoin pool for executing parallel tasks. The array is sorted parallelly only when certain conditions are meet. if the array size is less than or equal to 8192 or the processor has onlly one core, then the sequential dual-pivot quicksort algorithm is used. otherwise, it uses a parallel sort.

## Copying an array
let us discuss how we can create a copy of an array using the copyOf() method

if we need to create copies of our array then we can use the ```copyOf()``` method from the **Arrays** class. we need to provide the array that needs to be copied and the new array's size as a parameter.
the example below show how to create a copy of an array where the copied array size is the same as the original array. if the new array's size is greater than the original aray then the remaining positions filled with zeros
it is possible that we may only want to copy a part of our original array. in that case, we can use the ```copyOfRange()``` method. This method takes three arguments: the from index which is inclusive, and a to index which is exclusive.
Have you ever wondered what would happen if we create a copy of an array that contains objects of a custom class.
if we change the objects in the original array, will it be changed in the copied array?
let us try to answer these questions using an example. we have created an array of two Employee objects. then we created a copy of this array. we will see what happens when one of the Employee objects is changed in the original array. 
```java
package arrays;

import hashmap.Employee;

import java.util.Arrays;

public class ArraysCopyDemo {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] newArray = Arrays.copyOf(numbers, numbers.length);

        System.out.println("The copied array is");

        for(int num : newArray) {
            System.out.print(num +", ");
        }

        int[] newArrayBiggerSize = Arrays.copyOf(numbers, 20);

        System.out.println("The copied array is");

        for(int num : newArrayBiggerSize) {
            System.out.print(num +", ");
        }

        int[] rangeCopiedArray = Arrays.copyOfRange(numbers, 0, 5);

        System.out.println("The copied array is");

        for(int num : rangeCopiedArray) {
            System.out.print(num +", ");
        }

        Employee[] employees = { new Employee(123, "Jay"), new Employee(124, "Ryan") };
        Employee[] copiedArray = Arrays.copyOf(employees, 2);

        employees[0] = new Employee(123, "Changed name");
        System.out.println();
        System.out.println(employees[0].getName());

        System.out.println(copiedArray[0].getName());

    }
}

```
as we can see from the above program's output, the name did not change in the copied array. This means that the copyOf() method creates a deep copy of objects instead of just changing the references. 

# Arrays Operations
let us discuss some operations that can be performed using the Arrays class

## Converting an array into a List
we can convert an array into a list using the ```asList()``` method. if any changes are made to the resulting list, then changes are propagated to the original array. the asList method returns a fixed-size list, so it is not possible to add or remove elements from this list

## checking if two arrays are equal
we can use the ```equals()``` method of the Arrays class to check if the two arrays are equal or not. Two arrays are considered equal if both have the same number of elements and all corresponding pairs of elements in the two arrays are equal. 
```java
package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysOperationsDemo {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8};
        List<Integer> list = Arrays.asList(numbers);

        System.out.println(list);

        int[] numbersOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbersTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] numbersThree = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbersFour = {1, 1, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean isEqual = Arrays.equals(numbersOne, numbersTwo);

        System.out.println("Checking if two arrays are equal : " +isEqual);

        boolean isEquals = Arrays.equals(numbersThree, numbersFour);

        System.out.println("Checking if two arrays are equal : " +isEquals);
    }
}

```
## Filling an array with default value
have you ever encountered a scenario where you need to initialize an array and then fill it with some default values.
if yes, then you might have iterated the array and filled each element with the default value. This method takes an array and a default value as input. it then assigns the default value to each element of the array

# Collections Class
## Finding the min and max element
let us look at how we can find the min and max elements in a collection

## Finding the minimum element in a collection
the ```min(Collection c)``` method can be used to find the minimum element in a **Collection**. The elements present in the Collection must implement the Comparable interface. if the elements do not implement the Comparable interface, we can use another overloaded method ```min(Collection c, Comparator comp)```. this method takes a Comparator as a n argument that is used to compare the elements. This method iterates over the entire collection; hence it requires time proportional to the size of the collection.

## Finding the maximum element in a collection
the ```max(Collection c)``` method can be used to find the maximum element in a colletion. The elements present in the collection must implement the comparable interface. if the elements do not implement the Comparable interface, we can use another overloaded method, ```max(Collection c, Comparator comp)```. this method takes a Comparator as a n argument that is used to compare the elements. This method iterates over the entire Collection; hence it requires time proportional to the size of the Collection


## Finding the frequency of an element in a collection
there is a ```frequency(Collection c, Object o)``` method that can be used to find the frequency of a given element in the Collection. This method iterates over the entire collection so the time complexity is proportional to the size of the collection.
```java
package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("The minimum element in the lists is: " + Collections.min(list));
        System.out.println("The maximum element in the lists is: " + Collections.max(list));
        System.out.println("The number of time 12 occurs in the list is: " + Collections.frequency(list, 12));
    }
}

```
## Searching Filling and copying Collection
let us discuss some operations available in the Collections class.

## Searching an element in a collection
the ```binarySearch(List list, T key)``` method searches the specified list for the specified object using the binary search algorithm. The elements added in the list must implement the Comparable interface, and the list must be sorted into ascending order before mking this call. if it is not sorted, the results are undefined. if the list contains multiple elements equal to the specified object , there is no guarantee which one will be found.
if the elements added to our list do not implement the Comparable interface, then we can use another overloaded version of ```binarySearch(List list, T key, Comparator c)``` which takes a Comparator for the input as well. the list must be sorted into ascending order according to the specified comparator.
if the element is not present in the list, then this method returns a position where the element can be inserted.

## Copying a list into another list
the ```copy(list dest, list src)``` method is used to copy all the  elements from a source list to a destination list. if the size of the destination list is smaller than the source list, then ```indexOutOfBoundsException``` is thrown. After the operation, the index of each copied element in the destination list will be identical to its index in the source list.
let's us consider an example:

```java
import java.util.Collections;

List dest = 10, 20,30,40,50,60;
List src = 1,2,3
Collections.copy(dest, src)
```

after doing the copy operation above, the dest list will become

```java
{1,2,3,40,50,60}
```

so the ```copy()``` method does not merge the elements of the two lists. it replaces the elements in the destination list from the elements in the source list



















