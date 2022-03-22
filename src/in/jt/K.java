package in.jt;

public interface K {
	public abstract void hi();
	public default void m1() {
		System.out.println("K :: m1");
	}
	
	public static void m2() {
		System.out.println("K :: m2");
	}
}
