package com.revature;

import static com.revature.math.MathUtility.*;

public class ClassThatIsImportingStatic {

	public static void main(String[] args) {
		// Instead of referencing the ClassName.<static method/variable>
		// I can now access them directly
		System.out.println(PI);
		System.out.println(add(10, 20));
	}
	
}
