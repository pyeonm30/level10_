package _13유용한클래스;

public class _03StringBliuder {

	public static void main(String[] args) {

		StringBuilder builder1 = new StringBuilder(100); // 기본으로 16
		
		System.out.println(builder1.capacity());
		
		builder1.append("안녕하세요1")
	            .append("안녕하세요2")
		        .append("안녕하세요3");
		
		StringBuilder builder2 = new StringBuilder("0123456789");
		System.out.println(builder2.toString());
		                              // 시작인데스 , 끝인덱스-1 까지 삭제 
		System.out.println(builder2.delete(3, 7).toString());
		
		System.out.println(builder2.deleteCharAt(0).toString());
		System.out.println(builder2.insert(2, "ABC").toString());
		System.out.println(builder2.replace(2,4, "DEF").toString());
		System.out.println(builder2.reverse().toString());
		
		StringBuilder builder3 = new StringBuilder("0123456789");
		
		String result = builder3.delete(3, 7)
				.deleteCharAt(0)
				.insert(2, "ABC")
				.replace(2, 4, "EDF")
				.reverse()
				.toString();
		
		System.out.println(result);
		// String, StringBuffer , StringBuilder
		CharSequence cs1 ="ABC";
		CharSequence cs2 = new StringBuffer();
		CharSequence cs3 = new StringBuilder();
	}

}
