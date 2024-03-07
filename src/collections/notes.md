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




























