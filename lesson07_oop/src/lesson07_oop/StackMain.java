package lesson07_oop;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("새똥이2");
		stack.push("에어콘");
		stack.push("츄르");
		for(int i = 0 ; i < 100_000 ; i++) {
			stack.push("새똥이");
		}
		System.out.println(stack.peek()); // 제거하지않고 맨위에있는게 뭔지 확인만 함
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());		
	}
}
