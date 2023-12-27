package _13유용한클래스;

import java.util.Scanner;

public class _02문자열 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 ="abc";
		String str2 = new String("abc");//"abc";
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//System.out.println("입력 >> ");
		//String str3 = sc.next();
		//System.out.println(str3);
		//System.out.println(System.identityHashCode(str3));
		str1+="def";  //"abcdef"
		System.out.println(System.identityHashCode(str1));
		// String => 읽기전용 배열 , 수정이 불가능하다 , 새로운 값 주면 새로운 주소값
		
		// String Builder(싱글 스레드) , String Buffer(멀티 스레드) 
		// 내부적으로 가변 문자배열 char[]
		// 문자열 자체의 여러 변경값이 있을때 유용하다 
		
		StringBuilder builder = new StringBuilder();
		builder.append("abc");
		System.out.println(System.identityHashCode(builder));
		builder.append("def");
		System.out.println(System.identityHashCode(builder));
		System.out.println(builder.toString());
		builder.append("apple");
		System.out.println(System.identityHashCode(builder));
		String result = builder.toString();
		builder.setLength(0);
		System.out.println("test=" + builder.toString());
	}
}
