package _10Object클래스;

import java.util.Objects;
class User{
	String name;
	public User(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}
	void printAll(int num) {
		System.out.println(num);
	}
}

class Test01 extends User{

	public Test01(String name) {
		super(name);
	}
	//@Override
	void printAll(int num) {
		
	}
	
}

public class _01Eqauls메서드 {
	public static void main(String[] args) {

		String name ="java";
		String name2 = "java";
		String name3 = new String("java");
		
		System.out.println(name == name2);
		System.out.println(name == name3);
		User u1 = new User("test");
		System.out.println(u1.hashCode());
		User u2 = new User("test");
		System.out.println(u2.hashCode());
		
		System.out.println(u1.equals(u2));
		
		
		
	}

}
