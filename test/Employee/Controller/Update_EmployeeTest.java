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
 *
 * @author ASUS
 */
public class Update_EmployeeTest {
    static conn cc;
    static Update_Employee a;
    static String b ="";
    
    public Update_EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        cc = Mockito.mock(conn.class);
        a= new Update_Employee(b);
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of showData method, of class Update_Employee.
     */
    @Test
    public void testShowData() {
    }

    /**
     * Test of actionPerformed method, of class Update_Employee.
     */
    @Test
    public void testBct() {
        boolean b= a.bct(2000);
        String sa="";
        
        assertEquals(true,b);
    }
    /**
     * Test of main method, of class Update_Employee.
     */
    @Test
    public void testMain() {
    }
    
}
