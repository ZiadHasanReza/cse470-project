/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee.Controller;


import org.junit.After;
import org.junit.AfterClass;
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
public class Add_EmployeeTest {
    static conn cc;
    static Add_Employee a;
    
    public Add_EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        cc = Mockito.mock(conn.class);
        a= new Add_Employee();
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class Add_Employee.
     */
    @Test
    public void testAct() {
        //assertEquals(1,actionPerformed(ActionEvent ae));
        int b= a.act(20);
        String sa="";
        //When(cc.s.executeUpdate(sa)).thenReturn(sa);
        assertEquals(65,b);
                
    }

    /**
     * Test of main method, of class Add_Employee.
     */
    @Test
    public void testMain() {
        
        
    }
    
}
