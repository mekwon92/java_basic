package lesson07_oop;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("������2");
		stack.push("������");
		stack.push("��");
		for(int i = 0 ; i < 100_000 ; i++) {
			stack.push("������");
		}
		System.out.println(stack.peek()); // ���������ʰ� �������ִ°� ���� Ȯ�θ� ��
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());		
	}
}
