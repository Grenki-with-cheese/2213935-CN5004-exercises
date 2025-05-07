package practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;

public class main {
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!");
        List<String> printQueue = new ArrayList<>();
        printQueue.add("1. Print a report");
        printQueue.add("4. Print a resume");
        printQueue.add("6. Print a job application");
        printQueue.add("2. Print a document");
        
        
        printQueue.add("5. Print a cover letter");
        printQueue.add("3. Print a letter");
        
        printQueue.add(0, "First item");
        printQueue.set(3, "This item was replaced with set method");
        System.out.println("Before removal: "+printQueue.size());
        printQueue.remove(4);
        System.out.println("After removal: "+printQueue.size());
        int index = printQueue.indexOf("First item");
        if (index != -1) {
            System.out.println("First item found at index: "+index);
        } else {
            System.out.println("First item not found");
        }
        System.out.println("Print queue: "+printQueue);
        System.out.println("Is the queue empty? "+printQueue.isEmpty());
        System.out.println("Does the queue contain 'Print a cover letter'? "+printQueue.contains("5. Print a cover letter"));
        System.out.println("What is the first item in the queue? "+printQueue.get(0));
        System.out.println();
        printQueue.forEach(item ->
        {
            if (item.endsWith("application")){System.out.println("Item that ends with application:"+item);}
        });

        Set<String> registryNums = new HashSet<>();
        registryNums.add("v53PLS");
        registryNums.add("+996703225513");
        registryNums.add("0709545449");
        registryNums.add("Mihoyo");
        registryNums.add("Kuro Games");

        System.out.println("Registry numbers: "+registryNums);
        System.out.println("Is the registry empty? "+registryNums.isEmpty());
        System.out.println("Does the registry contain 'Mihoyo'? "+registryNums.contains("Mihoyo"));
        System.out.println("What is the size of the registry? "+registryNums.size());
        registryNums.remove("Mihoyo");
        System.out.println("After removal: "+registryNums+"\n The size is" +registryNums.size());
registryNums.add("Mihoyo");
        Iterator<String> iteratorItems = registryNums.iterator();
        while (iteratorItems.hasNext()){
            String item = iteratorItems.next();
            if (item.charAt(3) == 'o'){
                System.out.println(item);
            }
        }
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "John");
        students.put(2, "Jane");
        students.put(3, "Jim");
        students.put(4, "Jill");
        students.put(5, "Jack");
        students.put(6, "Jill");
        System.out.println(students.containsKey(3));
        String name = students.get(3);
        if (name != null){
            System.out.println("Name of student 3: "+name);
        } else {
            System.out.println("Student 3 not found");
        }
        System.out.println(students.toString());
        students.remove(4);
        System.out.println(students.toString());
        /*in order to scan the items in the map,
         * the keySet method can be used to return a set of the keys
        */
        Set<Integer> studentKeys = students.keySet();
        Iterator<Integer> iterator = studentKeys.iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            String value = students.get(key);
            if (value.charAt(0)=='J'){
                System.out.println(key+" "+value);
            }
        }
        Set<book> books = new HashSet<>();
        books.add(new book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new book("1984", "George Orwell", 1949));
        books.add(new book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new book("The Catcher in the Rye", "J.D. Salinger", 1951));
        Collections.sort(printQueue);
        System.out.println(printQueue);

        List<book> bookList = new ArrayList<>(books);
        book b1 = new book("A", "F. Scott Fitzgerald", 1925);
        book b2 = new book("D", "George Orwell", 1949);
        book b3 = new book("V", "Harper Lee", 1960);
        book b4 = new book("F", "Jane Austen", 1813);
        book b5 = new book("B", "J.D. Salinger", 1951);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        Collections.sort(bookList);
        System.out.println(bookList +"\n");
    }
}


