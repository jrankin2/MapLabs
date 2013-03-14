/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maplabs;

import java.util.Comparator;

/**
 *
 * @author jrankin2
 */
public class EmployeeByFirstName implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.getFirstName().compareTo(e2.getFirstName());
    }
}
