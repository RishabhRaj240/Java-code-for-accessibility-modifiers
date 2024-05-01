//Sample.java
class Sample {
   public static void main(String[] args) {

	//System.out.println(a);  //CE: cannot find symbol...
	//System.out.println(x);  //CE: cannot find symbol...

	System.out.println(Example.a);
	//System.out.println(Example.x);  //CE: NSV x cannot...

	Example e2 = new Example();
	System.out.println(e2.a);  //10
	System.out.println(e2.x);  //20
   }
}
