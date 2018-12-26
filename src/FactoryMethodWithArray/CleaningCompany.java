/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodWithArray;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author inbox_bv8awe9
 */
public class CleaningCompany extends Company{
        
    @Override
    List getEmploees() {
        System.out.println("");
        System.out.println("Starting company activity " +CleaningCompany.class.getSimpleName() +"\n");
        List employee = new ArrayList(); //пример c коллекцией
        employee.add(new Cleaner());
        employee.add(new Cleaner());
        employee.add(new Manager());
        employee.add(new Cleaner());
        employee.add(new Cleaner());
        employee.add(new Cleaner());
        employee.add(new Cleaner());
        employee.add(new Manager());
        employee.add(new Electrik());
        
        
        return employee; 
    }
    
   
   
    
}
