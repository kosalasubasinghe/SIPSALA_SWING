/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sipsala.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Kosala
 */
public class TextValidation {
    
    static final String email_regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    static final String telephone_regex ="\\d{10}";
    static final String nic_regex ="\\d{9}";
    static final String name_regex ="[A-Za-z]+";
    
    public static boolean Email_Validation(String key)
    {
    Pattern pattern = Pattern.compile(email_regex);
    Matcher matcher = pattern.matcher(key);
    return  matcher.matches();
    }
    
    public static boolean TelephoneNumber_Validation(String key){
        
    Pattern pattern = Pattern.compile(telephone_regex);
    Matcher matcher = pattern.matcher(key);
    return  matcher.matches() ;
    
    }
    
   public static boolean Name_Validation(String key){
        
    Pattern pattern = Pattern.compile(name_regex);
    Matcher matcher = pattern.matcher(key);
    return  matcher.matches() ;
    
    }
    
    public static boolean NIC_Validation(String key){
        
    Pattern pattern = Pattern.compile(nic_regex);
    Matcher matcher = pattern.matcher(key);
    return  matcher.matches() ;
    
    }
    
    
}
