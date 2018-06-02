//File: Annotations.java

/*
Inbuilt annotations:
 //java.lang:
- Override
- SuppressWarnings
- Deprecated

//java.lang.annotation:
- Retention
- Documented
- Target
- Inherited
*/

import java.util.*;
class Parent{
	public void foo(){
		System.out.println("Parent foo");
	}
}

class Child extends Parent{
	//Throws complie time error if parent doesn't contain foo()

	@Override
	public void foo(){
		System.out.println("Overriden foo");
	}
	
	//@SuppressWarnings must contain a default value which must be the type of warning
	@SuppressWarnings("unchecked")
	public void bar(){
		ArrayList al =new ArrayList();
		al.add("a");
	}
	//A warning is thrown at compile time saying this method is deprecated. But runs fine!

	@Deprecated
	public void depricatedMethod(){
		System.out.println("Deprecated method");
	}
}




public class Annotations{
	@SuppressWarnings("deprecation")
	public static void main(String ar[]){
		Child ch = new Child();
		ch.depricatedMethod();
		ch.bar();
	}
}



