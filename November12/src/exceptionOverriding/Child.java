package exceptionOverriding;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Child extends Parent {
	
	
	
   
	public void method1() throws FileNotFoundException {
	
}
	
	
	
	//public void method2() throws IOException {}
	
	public void method3() throws IOException {}
	
	public void method4() {}	
	
	//public void method5()  throws IOException{}
	
	//public void method6()  throws SQLException{}
	
	
	public void method7()  throws ArithmeticException{}
	
	
	public void method8()  throws ArrayIndexOutOfBoundsException{}
	
	//public void method9()  throws IOException{}
	
}
