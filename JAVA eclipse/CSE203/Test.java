import java.io.*;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
//		PrintStream p = System.out;
		PrintStream p = new PrintStream(new File("output.txt"));
//		p.println("Welcome to Java.");
//		p.println("I hate Java.");
//		int a = 10;
//		p.printf("This is our %dth class.\n", a);
		Student st = new Student("abc", "123", 3.8);
		p.println(st);

	}
}


class Student{
	String name,id;
	double cgpa;
	public Student(String name, String id, double cgpa) {
		super();
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return name + "," + id + "," + cgpa;
		//return "Student [name=" + name + ", id=" + id + ", cgpa=" + cgpa + "]";
	}
	
	
}
