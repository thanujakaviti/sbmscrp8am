package in.jt;

public interface I {
	public abstract void m1();
	public abstract void m2();
	
	  
    default void m3() { 
		  System.out.println("I :: m3"); 
	 }
	
	
}


