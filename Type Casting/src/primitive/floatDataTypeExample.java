package primitive;

public class floatDataTypeExample {
public static void main(String args[]) {
	/*
	 * float datatype:- by default decimal values are treated as double type in java.
	 * so,we need to cast it to float in either of the 3 following ways
	 */
	float f1=14.56f;
	float f2=14.56F;
	float f3=(float)14.56;
	
	System.out.println(f1);
	System.out.println(f2);
	System.out.println(f3);
	
}
}
