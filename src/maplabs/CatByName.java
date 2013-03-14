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
public class CatByName implements Comparator<Cat>{

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
