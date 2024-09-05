package lesson07_oop;

import java.util.Arrays;

public class MyStack {
	private int[] items = new int[3]; // private : 개별적으로 접근 못하게 12칸이 일반적
	private int cnt;
	
	
	int pop() {
		return items[--cnt];  //1.queue의 경우 0번인덱스를 빼거나(이사하기..arraycopy) - 부하 걸림
							  //빠진곳의 인덱스....를...........새로운변수로.....? begin....? begin이 cnt를 넘어가면안됨...!!
		
	}
	
	
	void push(int item) {
		if(items.length == cnt) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		items[cnt++] = item;
	}
		
	
	int size() {
	//	System.out.println(Arrays.toString(items));
		return cnt;
	}
}


