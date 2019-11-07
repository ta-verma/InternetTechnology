/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employe;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

/**
 *
 * @author c3
 */
public class beanInfo {
    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException {
        Class St;
        St = Class.forName("testbean.Employee");
        BeanInfo beanInfo=Introspector.getBeanInfo(St);
        PropertyDescriptor pd[]=beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : pd) {
            System.out.println(propertyDescriptor.getName());
            
        }
        MethodDescriptor[] Md =beanInfo.getMethodDescriptors();
        for (MethodDescriptor methodd : Md) {
            System.out.println(methodd.getName());
            
        }
        
        
    }
    
}
    