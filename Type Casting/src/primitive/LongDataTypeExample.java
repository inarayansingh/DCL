package primitive;

public class LongDataTypeExample {
  public static void main(String args[]) {
	  /*
	   * For byte ,short and char ,int is automatically type casted to the 
	   * respective type(narrowing) without the typecast operator
	   * when it is under the range of the byte,short or char respectively
	   * Else,if the range exceeds,it mandatory to use the typecast
	   * operator.
	   */
	  byte b=120;
	  char c=65000;
	  short s= 30000;
	  
	  /*
	   * long datatype:- wiil be considered as int if the value is under the range of int 
	   * if the value is beyond the range of in t, we nned to suffix with L or l to treat it as a long type.
	   * 
	   */
	  
	  long l=11234567891234567L;
	 
	  System.out.println(b);
	  System.out.println(s);
	  System.out.println(c);
	  System.out.println(l);
  }
}
