/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maplabs;

import java.util.*;

/**
 *
 * @author jrankin2
 */
public class MapLabsExtra {
    public static void main(String[] args) {
        /*
        Employee e1 = new Employee(3,"Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2,"Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee(4,"Evans", "Bob", "333-33-3333");
        Employee e4 = new Employee(1,"Mallay", "Fred", "444-44-4444");
        */
        Employee[] emps = {
            new Employee(3,"Doe", "John", "333-33-3333"),
            new Employee(2,"Smith", "Sally", "111-11-1111"),
            new Employee(4,"Evans", "Bob", "333-33-3333"),
            new Employee(1,"Mallay", "Fred", "444-44-4444")
        };
        
        Cat[] cats = {
            new Cat(1, "Lucifer", 4, emps[0]),
            new Cat(3, "Billy", 5, emps[1]),
            new Cat(2, "Johnny", 7, emps[3]),
            new Cat(4, "Dan", 5, emps[2]),
            
        };
    
        Map<Employee, Cat> employeeCats = new HashMap<Employee, Cat>();
        for (Cat cat : cats) {
            employeeCats.put(cat.getOwner(), cat);//add cats and their owners to hashmap
        }
        
        System.out.println("---Employees' cats---");
        for (Employee employee : employeeCats.keySet()) {
            //System.out.println("Employee: " + employee + " has Cat: " + employeeCats.get(employee));
            System.out.println("Employee: " + employee.getFullName() + " has Cat: " + employeeCats.get(employee).getName());
        
        }
        
        System.out.println("\n---Cats and owners---");
        for(Cat cat : employeeCats.values()){
            //System.out.println("Cat: " + cat + " has Owner: " + cat.getOwner());
            System.out.println("Cat: " + cat.getName() + " has Owner: " + cat.getOwner().getFullName());
        }
        
        
        Set<Cat> catSet = new TreeSet<Cat>(employeeCats.values());
        System.out.println("\n---Cats TreeSet---");
        for (Cat cat : catSet) {
            System.out.println("cat = " + cat);
        }
        
        List<Cat> catList = new ArrayList<Cat>(catSet);
        Collections.sort(catList, new CatByName());
        System.out.println("\n---Cats sorted ArrayList---");
        for (Cat cat : catList) {
            System.out.println("cat = " + cat);
        }
        
    }
    
    
    
}
