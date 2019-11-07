/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employe;

import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c3
 */
public class EmployeeBeanInfo extends SimpleBeanInfo{

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor pdName= new PropertyDescriptor("ename",Employee.class);
            PropertyDescriptor pdS= new PropertyDescriptor("salary",Employee.class);
             PropertyDescriptor pdd[] = {pdName,pdS};
             return pdd;
        } catch (IntrospectionException ex) {
            Logger.getLogger(EmployeeBeanInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

    @Override
    public MethodDescriptor[] getMethodDescriptors() {
     
        try {
            MethodDescriptor md;
            md = new MethodDescriptor(Employee.class.getMethod("xyz", int.class,int.class));
            MethodDescriptor M[] = {md};
            return M;
        } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(EmployeeBeanInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
       
    }
    
    
    
    
}
