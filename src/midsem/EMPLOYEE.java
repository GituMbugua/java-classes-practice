/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midsem;

/**
 *
 * @author Gitu
 */
public class EMPLOYEE extends PERSON {
    private int quantity; // hours/classes
    private double totalpay;
    private String jobtype;
    
    private enum Emp{
        STAFF(1000), FACULTY(100000);
        private final double payrate;
        
        Emp(int pr) {
            payrate = pr;
        }
        
        public double getsalary(int qty) {
            return payrate * qty;
        }
    };
    
    Emp st = Emp.STAFF;
    Emp fac = Emp.FACULTY;
    
    EMPLOYEE(String id, String name, String tel, int qty, String job) {
        super(id, name, tel);
        quantity = qty;
        setsalary(job);
    }
    
    //Employee class
    public void setsalary(String empjob) { 
        switch (empjob) { 
            case "staff":
            case "STAFF":
                jobtype = st.toString();
                totalpay = st.getsalary(quantity);
                break;
            case "faculty":
            case "FACULTY":
                jobtype = fac.toString();
                totalpay = fac.getsalary(quantity);
                break;
        }
    }
    
    @Override
    public String toString() {
        return "==========================================\n"
                + "Number: \t " + getidnum()
                + "\nName: \t\t " + getname()
                + "\nTelephone: \t " + gettelno()
                + "\nAddress: \t " + getaddress()
                + "\nJob Type: \t " + jobtype
                + "\nHours/Classes: \t " + quantity
                + "\nTotal Pay: \t KSH" + totalpay
                + "\n==========================================";
    }   
}
