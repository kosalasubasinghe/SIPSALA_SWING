/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sipsala.utility;


import com.sipsala.utility.UserInputType.inputType;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.EdgedBalloonStyle;
import net.java.balloontip.styles.MinimalBalloonStyle;
import net.java.balloontip.styles.ModernBalloonStyle;
import net.java.balloontip.utils.TimingUtils;

/**
 *
 * @author Kosala
 */
public class MessagesAndTips  extends BalloonTip{
    
    
    
 public static void showTip(JComponent parent,String content,
                                        boolean focus,Orientation orientaion,AttachLocation location){
 TimingUtils.showTimedBalloon( new BalloonTip(parent,new JLabel(content),
                new MinimalBalloonStyle(new Color(245,245,220),5),orientaion, 
				location,10,10, focus),1500);
 
 }
      
    
    
  public static boolean showInputValidationError(JComponent parent,String content,inputType type ,
                                        boolean focus,Orientation orientaion,AttachLocation location){
      boolean returnValue =true;
      
      if (type == inputType.EMAIL)
      {
          if(!TextValidation.Email_Validation(content)){
        TimingUtils.showTimedBalloon(new BalloonTip(parent,new JLabel("<html>Input Email <u>format </u> Error!</html>"),
                new EdgedBalloonStyle(new Color(255,250,240), Color.BLUE),orientaion, 
				location,10,10, focus),2000);
             returnValue =false;
          }
              
      
      }
      else if (type == inputType.NAME)
      {
          if(!TextValidation.Name_Validation(content)){
           TimingUtils.showTimedBalloon(  new BalloonTip(parent,new JLabel("<html>Please Enter <u>Character</u> Sequence!</html>"),
                new EdgedBalloonStyle(new Color(255,235,205), Color.BLUE),orientaion, 
				location,10,10, focus),2000);
           returnValue =false;
          }
              
      
      }
      
      else   if (type == inputType.TELEPHONE_NUMBER)
      {
          if(!TextValidation.TelephoneNumber_Validation(content)){
          TimingUtils.showTimedBalloon(new BalloonTip(parent,new JLabel("<html>Telephone Number <u>format </u> Error!</html>"),
                new EdgedBalloonStyle(new Color(176,224,230), Color.BLUE),orientaion, 
				location,10,10, focus),2000);
          returnValue =false;
          }
              
      
      }

      else   if (type == inputType.NIC)
      {
          if(!TextValidation.NIC_Validation(content)){
          TimingUtils.showTimedBalloon(new BalloonTip(parent,new JLabel("<html>NIC Number <u>format </u> Error!</html>"),
                new EdgedBalloonStyle(new Color(176,224,230), Color.BLUE),orientaion, 
				location,10,10, focus),2000);
          returnValue =false;
          }
              
      
      }
      
    return returnValue ;
  
  }
    
   
  
    
}
