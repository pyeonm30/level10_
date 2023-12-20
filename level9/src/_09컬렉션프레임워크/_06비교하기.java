package _09컬렉션프레임워크;

import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private static int lastNo = 0;
    private int no;
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.no = ++lastNo;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getNo() { return no; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getHeight() { return height; }

    @Override
    public int compareTo(Person p) {
        return this.getName().compareTo(p.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
    
    
}

class PersonComp implements Comparator<Person> {
    public enum SortBy { NO, NAME, AGE, HEIGHT }
    public enum SortDir { ASC, DESC }

    private SortBy sortBy;
    private SortDir sortDir;

    public PersonComp(SortBy sortBy, SortDir sortDir) {
        this.sortBy = sortBy;
        this.sortDir = sortDir;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int result = 0;
        switch (sortBy) {
            case NO: result = o1.getNo() > o2.getNo() ? 1 : -1; break;
            case NAME: result = o1.getName().compareTo(o2.getName()); break;
            case AGE: result = o1.getAge() > o2.getAge() ? 1 : -1; break;
            case HEIGHT: result = o1.getHeight() > o2.getHeight() ? 1 : -1; break;
        }
        return result * (sortDir == SortDir.ASC ? 1 : -1);
    }
}
public class _06비교하기 {

	public static void main(String[] args) {


		TreeSet[] treeSets = {
                new TreeSet<>(),
                new TreeSet<>(new PersonComp(PersonComp.SortBy.NO, PersonComp.SortDir.DESC)),
                new TreeSet<>(new PersonComp(PersonComp.SortBy.AGE, PersonComp.SortDir.ASC)),
                new TreeSet<>(new PersonComp(PersonComp.SortBy.HEIGHT, PersonComp.SortDir.DESC))
        };

        for (Person p : new Person[] {
                new Person("홍길동", 20, 174.5),
                new Person("전우치", 28, 170.2),
                new Person("임꺽정", 24, 183.7),
                new Person("황대장", 32, 168.8),
                new Person("붉은매", 18, 174.1),
        }) {
            for (TreeSet ts: treeSets) {
                ts.add(p);
            }
        }

        for (TreeSet ts: treeSets) {
            for (Object p : ts) {
                System.out.println(p);
            }
            System.out.println("\n- - - - -\n");
        }
		
		
	}

}
