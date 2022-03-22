package in.jt;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		IK obj = new IK();
		obj.m1();
		
		K obj1 = new IK();
		obj1.m1();
		
		System.out.println("--------------------");
		
		K obj2 = new K()
				{			//Test$1
					public void hi() {
						System.out.println("AIC :: hi");
					}
				};
		System.out.println(obj2);
		obj2.m1();
		
		K.m2();
	
		BinaryOperator
	}
}	

