package test;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  String CurrentmonthYear= "march 2018";
	 System.out.println( CurrentmonthYear.length()-4);
	 System.out.println( CurrentmonthYear.substring(CurrentmonthYear.length()-4, CurrentmonthYear.length()));
	 System.out.println( CurrentmonthYear.substring(0, CurrentmonthYear.length()-5));
	 System.out.println( Math.abs(-25));
	 
	  
  }
}
