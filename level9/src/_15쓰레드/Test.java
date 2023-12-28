package _15쓰레드;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {

	   long preTime = System.currentTimeMillis();
	   System.out.println("pre:" + preTime);
		
		BigDecimal num1 = new BigDecimal("0");
		
		for(int i =0; i < 99999999; i+=1) {
			BigDecimal num2 = new BigDecimal(i+"");
			num1 = num2.add(num2);
		}
		
		System.out.println(num1);
		
		long endTime = System.currentTimeMillis();
		System.out.println("end:" + endTime);
		long time = endTime  - preTime;
		System.out.println("diff :" + time);
	}

}
