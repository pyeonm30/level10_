package _08제네릭클레스;
import java.util.Arrays;
import java.util.Objects;

class MyVector<T>{
	Object[] arr;
	int size;
	int capacity;
	MyVector(){           // 제네릭으로 new 할 수 없음 
		arr = new Object[10]; // new 해서 객체 생성할때는 반드시 타입이 특정되야한다 
		capacity = 10;
	}
	
	int size() {
		return size;
	}
	int capacity() {
		return capacity;
	}
	
	T get(int idx) {
		if(idx < 0 || idx >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return (T)arr[idx];
	}
	
	
	void add(T val) {
		if(size >= capacity) {
			Object[] temp = arr;
			arr = new Object[capacity + 10];
			capacity+=10;
			for(int i =0; i < size;i+=1) {
				arr[i] = temp[i];
			}
		}
		
		arr[size] = val;
		size+=1;
	}
	
	void add(int idx , T val) {
		if(idx < 0 || idx >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if(size >= capacity) {
			Object[] temp = arr;
			arr = new Object[capacity + 10];
			capacity+=10;
			for(int i =0; i < size;i+=1) {
				arr[i] = temp[i];
			}
		}
		for(int i = size; i > idx; i--) {
			arr[i] = arr[i-1];
		}
		arr[idx] = val;
		size+=1;
	}
	
	void set(int idx , T val) {
		if(idx < 0 || idx >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		arr[idx] = val;
	}
	
	void remove(int idx) {
		if(idx < 0 || idx >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		for(int i = idx; i < size; i++) {
			arr[i] = arr[i+1];
		}
		arr[size] = null;
		size-=1;
	}
	
	void remove(T value) {
		for(int i =0; i < size;i+=1) {
			if(arr[i] == value) {
				remove(i);
			}
		}
	}
	
	void clear() {
		size =0;
		arr = new Object[capacity];
	}
	@Override
	public String toString() {
		if(size == 0) return"[]";
		String data="[";
		for(int i =0; i < size;i+=1) {
			data += arr[i] +",";
		}
		data = data.substring(0,data.length()-1);
		data += "]";
		return data;
	}
}

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

public class _02백터클래스구현2 {
	public static void main(String[] args) {
		MyVector<Integer> v1 = new MyVector();
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		//v1.add("test");
		
		for(int i =0; i < 10; i+=1) {
			v1.add((i+1)*10);
		}
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1.get(1));
		
		v1.set(1,1000);
		System.out.println(v1);
		
		v1.add(1, 20);
		System.out.println(v1);
		
		v1.remove(3);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.clear();
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		MyVector<User> list = new MyVector<User>();
		list.add(new User("test1"));
		list.add(new User("test1"));
		list.add(new User("test1"));
		list.add(new User("test1"));
		list.add(new User("test1"));
		
		System.out.println(list);
		
		User user1 = new User("test1");
		User user2 = new User("test1");
		
		System.out.println(user1.equals(user2));
		
	}

}
