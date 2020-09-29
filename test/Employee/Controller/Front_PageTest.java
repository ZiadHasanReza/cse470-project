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
public class Front_PageTest {
    static conn cc;
    static Front_Page a;
    
    public Front_PageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        cc = Mockito.mock(conn.class);
        a= new Front_Page();
        
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of actionPerformed method, of class Front_Page.
     */
    @Test
    public void testAct() {
        //assertEquals(1,actionPerformed(ActionEvent ae));
        int b= a.act(20);
        String sa="";
        
        assertEquals(65,b);
    }
    public void testBct() {
        //assertEquals(1,actionPerformed(ActionEvent ae));
        int b= a.bct(20);
        String sa="";
        
        assertEquals(76,b);
    }


    /**
     * Test of main method, of class Front_Page.
     */
    @Test
    public void testMain() {
    }
    
}
