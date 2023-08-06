package org.chatapp.utils;

import java.util.ResourceBundle;

public class ConfigReader
{
	  ConfigReader()
	  {
		  
	  }
	 static ResourceBundle rb=ResourceBundle.getBundle("Config");
     public static  String getValue(String key)
     {
  	   return rb.getString(key);
     }
	public static void main(String[] args)
	{
      
	}

}
