package _09컬렉션프레임워크;

import java.util.*;

class User2{
	String name;
	int age;

	public User2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name +" " + age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User2 other = (User2) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	

}


public class _04Set이론 {

	public static void main(String[] args) {

		Set<Integer> list1 = new HashSet<>();
		list1.add(1);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		System.out.println(list1.contains(2));
		
		Set<String> list2 = new HashSet<>(
				Arrays.asList("test1","test1","test2","test3")
				);
		System.out.println(list2);
		
	       
        HashSet<Integer> intHashSet = new HashSet<>();
        LinkedHashSet<Integer> intLinkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> intTreeSet = new TreeSet<>();

        for (int i : new int[] { 20,12,30,100,3, 1, 8, 5, 4, 7, 2, 9, 6}) {
            intHashSet.add(i);
            intLinkedHashSet.add(i);
            intTreeSet.add(i);
        }
        
        for (Set s : new Set[] {intHashSet, intLinkedHashSet, intTreeSet}) {
            System.out.println(s);
        }
        
        
        Set<String> strHashSet = new HashSet<>();
        Set<String> strLinkedHashSet = new LinkedHashSet<>();
        Set<String> strTreeSet = new TreeSet<>();

        for (String s : new String[] {
                "Fox", "Banana", "Elephant", "Car", "Apple", "Game", "Dice"
        }) {
            strHashSet.add(s);
            strLinkedHashSet.add(s);
            strTreeSet.add(s);
        }
        for (var s : new Set[] {strHashSet, strLinkedHashSet, strTreeSet}) {
            System.out.println(s);
        }
        
		Set<User2> userList = new HashSet<User2>();
		
		userList.add(new User2("test1" , 10));
		userList.add(new User2("test2" , 10));
		userList.add(new User2("test1" , 30));
		userList.add(new User2("test1" , 10));
		
		System.out.println(userList);
		
		
		
		
	}

}
