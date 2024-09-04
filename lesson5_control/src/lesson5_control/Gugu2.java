package lesson5_control;
//break문 사용하기
//debug 해보기.  Ctrl + Shift + B (breakpoint)

public class Gugu2 {
	public static void main(String[] args) {
//A * B = C
		
for(int i = 2; i <= 9 ; i++) {
	if(i == 5) {
		continue; //A가 5일경우 출력X
	}
	System.out.println("["+i+"단]");
	for(int j = 1 ; j <= 9 ; j++) {
		if(j ==5) {
			continue; //B가 5일 때 건너뛰고 출력 
			//break; //B가 5일 때 반복 정지
		}
		System.out.println(i + "*" + j + "=" + i * j);
	}
}
		
		//B가 5였을 때 i 반복 정지(라벨 붙이기) target:
point:
for(int i = 2; i <= 9 ; i++) {
	System.out.println("["+i+"단]");
	for(int j = 1 ; j <= 9 ; j++) {
		if(j ==5) {
			break point;
		}
		System.out.println(i + "*" + j + "=" + i * j);
	}
}
for(;;) {
	break;
}
System.out.println();//도달하지못하니 break를 추가해줘야함다
	}
}
