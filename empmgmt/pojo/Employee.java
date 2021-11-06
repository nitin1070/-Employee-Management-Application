/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.pojo;

/**
 *
 * @author dell
 */
public class Employee {
    private int empno;
    private String empname;
    private double empsal;
   
    public Employee()
    {
    }
    public Employee(int empid,String empname, double empsal)
    {
        this.empno=empid;
        this.empname=empname;
        this.empsal=empsal;
    }
  
    public int getEmpNo()
    {
        return empno;
    }
    public void setEmpNo(int empno)
    {
        this.empno=empno;
    }
    public String getEmpName()
    {
        return empname;
    }
    public void setEmpName(String empname)
    {
        this.empname=empname;
    }
    public double getEmpSal()
    {
        return empsal;
    }
    public void setEmpSal(double empsal)
    {
        this.empsal=empsal;
    }
    
    
    
    
}
