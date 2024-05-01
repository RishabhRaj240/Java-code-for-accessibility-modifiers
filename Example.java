//Example.java
class Example {
	static int a = 10;
	int x = 20;

	public static void main(String[] args) {
		System.out.println(a);
		//System.out.println(x);  //CE: NSV X cannot....

		System.out.println(Example.a);
		//System.out.println(Example.x);  //CE: NSV x cannot...

		Example e1 = new Example();
		System.out.println(e1.a);
		System.out.println(e1.x);
	}
}