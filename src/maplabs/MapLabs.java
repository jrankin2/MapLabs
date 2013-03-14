package maplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;


public class MapLabs {
    
    public static void main(String[] args) {
        /*
        Next, create and initialize four Employee objects, but this time make sure at least
        two have the same social security number. Now add them to a HashMap. What
        key will you use? How will you retrieve individual items? Use put(key, value) to
        add items; use get(key) to retrieve items. Demonstrate a solution. How will you
        loop through the keys or values? Demonstrate this too.
        */
        Employee e1 = new Employee(3,"Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2,"Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee(4,"Evans", "Bob", "333-33-3333");
        Employee e4 = new Employee(1,"Mallay", "Fred", "222-22-2222");
        
        Map<Integer, Employee> map = new HashMap<Integer, Employee>(); // edit this!
        map.put(3, e1);
        map.put(2, e2);
        map.put(4, e3);
        map.put(1, e4);
        
        
        Set<Integer> keys = new HashSet<Integer>(map.keySet());
        
        System.out.println("---Map Keys---");
        for (Integer integer : keys) {
            System.out.println("empid = " + integer);
        }
        //method 1
        Set<Employee> employees = new HashSet<Employee>(map.values());
        System.out.println("---Map Values: 1---");
        for (Employee employee : employees) {
            System.out.println("employee = " + employee);
        }
        
        //method 2
        Set<Employee> vals = new HashSet<Employee>();
        for (Integer i : keys) {
            vals.add(map.get(i));
        }
        
        System.out.println("---Map Values: 2---");
        for (Employee employee : vals) {
            System.out.println("employee = " + employee);
        }
        
        
        /*
        * Store the same four Employee objects in a TreeMap. Demonstrate that sorting
        * works. First, make sure you override compareTo() from the Comparable interface.
        * Now try using a Comparator from the GenericsAndMaps project (remember
        * you’ll need a utility class).
        */
        System.out.println("---TreeMap---");
        Map<Integer, Employee> treemap = new TreeMap<Integer, Employee>(map);
        for (Employee employee : treemap.values()) {
            System.out.println("employee = " + employee);
        }
        
        System.out.println("---ArrayList with Comparator---");
        List<Employee> list = new ArrayList<Employee>(treemap.values());
        Collections.sort(list, new EmployeeByFirstName());
        for (Employee employee : list) {
            System.out.println("employee = " + employee);
        }
        
        
        /*
         * Store the same four Employee objects in a TreeSet. Demonstrate that sorting
         * works AND that duplicates are removed by looping through the set using an
         * iterator. Use both the natural ordering and an alternative ordering.
         */
        
        e3.setEmpID(3);//to show that unique values are removed.
        
        System.out.println("---TreeSet---");
        Set<Employee> set = new TreeSet<Employee>(map.values());
        for (Employee employee : set) {
            System.out.println("employee = " + employee);
        }
        
        System.out.println("--TreeSet with Iterator--");
        for (Iterator<Employee> it = set.iterator(); it.hasNext();) {
            Employee employee = it.next();
            System.out.println("employee = " + employee);
        }
        
    }
}
