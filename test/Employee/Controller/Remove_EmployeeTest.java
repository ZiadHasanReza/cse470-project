/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee.Controller;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import Employee.Model.conn;
import Employee.Controller.*;
import static org.mockito.Mockito.when;
/**
/**
 *
 * @author ASUS
 */
public class Remove_EmployeeTest {
    static conn cc;
    static Remove_Employee a;
    
    public Remove_EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        cc = Mockito.mock(conn.class);
        a= new Remove_Employee();
        
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of actionPerformed method, of class Remove_Employee.
     */
    @Test
    public void testBct() {
        int b= a.bct(30);
        String sa="";
        
        assertEquals(86,b);
    }

    /**
     * Test of main method, of class Remove_Employee.
     */
    @Test
    public void testMain() {
    }
    
}
