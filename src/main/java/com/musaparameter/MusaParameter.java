package com.musaparameter;

public class MusaParameter {

	public static void main(String[] args) {

		MusaParameter abc=new MusaParameter();
		abc.musafamily("mohammed musa");
		abc.musafamily("samina sultana");
		abc.musafamily("rayhana musa");
		abc.musafamily("herah musa");
		
		/*int a=10;
		int b=5;
		int c=a/b;
		int d=a*b;
	System.out.println("this value is divided a and b:"+c);
	System.out.println("this value is multiply a and b:"+d);*/
		
		add(3,4);
		add(30,40);
		add(300,400);
		
	}
		void musafamily(String a) {
		System.out.println("my name is:" +a);
	}
	static void add(int a,int b) {
		int c=a+b;
		System.out.println("this value is adding a and b:"+c);
	}
}

/*(a parameter is a value that 
you can pass to a method in java.
then the method use the parameter
as though it were a local variable initialized
with the value of the variable passed 
to it the calling method.)*/
//----------------------------------
/*public class Main {
	  static void myMethod(String fname, int age) {
	    System.out.println(fname + " is " + age);
	  }

	 public static void main(String[] args) {
	   myMethod("Liam", 5);
	    myMethod("Jenny", 8);
	    myMethod("Anja", 31);
	 }
	}

	 Ans
      Liam is 5
	 Jenny is 8
	Anja is 31*/
//-------------------------------------------
/*public class Main {
	  static int myMethod(int x) {
	    return 5 + x;
	  }

	  public static void main(String[] args) {
	    System.out.println(myMethod(3));
	  }
	}
	 Outputs 8 (5 + 3);*/
//------------------------------------------------
/*public class Main {
	 static int myMethod(int x, int y) {
	   return x + y;
	  }

	  public static void main(String[] args) {
	    System.out.println(myMethod(5, 3));
	 }
	}
	 Outputs 8 (5 + 3);*/
//------------------------------------------------------
/*public class Main {

	  //-- Create a checkAge() method with an integer variable called age
	  static void checkAge(int age) {

	    //-- If age is less than 18, print "access denied"
	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough!");

	    -- If age is greater than, or equal to, 18, print "access granted"
	    } else {
	     System.out.println("Access granted - You are old enough!");
	    }

	  }

	 public static void main(String[] args) {
	    checkAge(20); // Call the checkAge method and pass along an age of 20
	  }
	}*/
//---------------------------------------
////------parameter-------overriding---------
/*class Dog{
public void bark(){
    System.out.println("woof ");
}
}
class Hound extends Dog{
public void sniff(){
    System.out.println("sniff ");
}

public void bark(){
    System.out.println("bowl");
}
}

public class OverridingTest{
public static void main(String [] args){
    Dog dog = new Hound();
    dog.bark();
}
}*/
////----parameter--overloading----because different parameter--------
/*class Dog{
public void bark(){
    System.out.println("woof ");
}

//overloading method
public void bark(int num){
	for(int i=0; i<num; i++)
		System.out.println("woof ");
}
}*/