/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employe;

import java.io.Serializable;

/**
 *
 * @author c3
 */
public class Employee implements Serializable
{
    private int eid;
    private String ename;
    private int salary;
    private String des;
    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    public int abc()
    {
        return 2;
    }
    
    public int xyz(int x , int y)
    {
        return x+y;
    }
    
}
