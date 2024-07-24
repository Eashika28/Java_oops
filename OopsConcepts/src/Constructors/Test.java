package Constructors;

// Default Constructors - constructor is created by complier by default.
  public class Test {
	
	int i;
	String s;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Test t = new Test();
	System.out.println(t.i + " "+ t.s);
	
	}
  }


 // No arg constructors/User Defined - constructor is created by user/programmer. In this case compiler will not create the const by itself.
  
 /* public class Test {
 * 
 * Test(){
 * 
 * System.out.println("no arg constructor"); }
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * Test t = new Test();
 * 
 * } }
 * 
 */
  
 // Parametrized constructor
  
	/*
	 * public class Test {
	 * 
	 * Test(int a){
	 * 
	 * System.out.println("parametrized constructor"); }
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * Test t = new Test(10);
	 * 
	 * } }
	 */