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
}

public class _01Eqauls메서드 {
	public static void main(String[] args) {

		String name ="test";
		String name2 = "test";
		System.out.println(name == name2);
		
		User u1 = new User("test");
		System.out.println(u1.hashCode());
		User u2 = new User("test");
		System.out.println(u2.hashCode());
		
		System.out.println(u1.equals(u2));
		
		
		
	}

}
