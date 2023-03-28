/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midsem;

import java.util.Scanner;

/**
 *
 * @author Gitu
 */
public class PERSON {
    private String idnum;
    private String pname;
    private String telno;
    private static String address = "14634";
    Scanner s = new Scanner(System.in);
    
    PERSON(String id, String name, String tel) {
        idnum = id;
        pname = name;
        settelno(tel);
    }
    
    public void settelno(String tel) {
        boolean validate = true;
        do {
            if (tel.length() <= 13) {
                telno = tel;
                break;
            } else { 
                System.out.println("Invalid telephone number for " + pname);
                System.out.println("Enter new telephone number: ");
                settelno(s.next());
                validate = false;
            }
        } while (validate);
    }
    
    public String getidnum() {
        return idnum;
    }
    public String getname() {
        return pname;
    }
    public String gettelno() {
        return telno;
    }
    public String getaddress() {
        return address;
    }
}
