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
public class Search_EmployeeTest {
    static conn cc;
    static Search_Employee a;
    public Search_EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        cc = Mockito.mock(conn.class);
        a= new Search_Employee();
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of actionPerformed method, of class Search_Employee.
     */
    @Test
    public void testBct() {
        boolean b= a.bct(0);
        String sa="";
        
        assertEquals(false,b);
    }

    /**
     * Test of main method, of class Search_Employee.
     */
    @Test
    public void testMain() {
    }
    
}
