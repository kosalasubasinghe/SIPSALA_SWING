/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sipsala.utility;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Kosala
 */
public class TextValidationTest {
    
    public TextValidationTest() {
    }

   

    /**
     * Test of Email_Validation method, of class TextValidation.
     */
    @Test
    public void testEmail_Validation() {
        System.out.println("Email_Validation");
        String key = "kosala@gmail.com";
        boolean expResult = true;
        boolean result = TextValidation.Email_Validation(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
//     @Test
//    public void testTP_Validation() {
//       
//        String key = "1234567890";
//        boolean expResult = true;
//        boolean result = TextValidation.TelephoneNumber_Validation(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
}
