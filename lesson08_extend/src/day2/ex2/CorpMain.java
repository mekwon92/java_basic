package day2.ex2;

public class CorpMain {
	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		int idx = 0;
		employees[idx++] = new Programmer("개똥이");//자기or 자손 인스턴스 가능
		employees[idx++] = new Designer("새똥이");
		employees[idx++] = new Designer("소똥이");
		employees[idx++] = new BuyManager("말똥이");
		
		//추상클래스의 목적은 인스턴스의 생성이 아니라, 공통 조상 정의
		//추상메서드 때문에 인스턴스의 생성이 불가함 문법적으로.. 알수가없자낭.....?
		Employee emp = new Employee("미정사원") { //but 익명클래스로 인스턴스화 가능....
			@Override
			void work() {
				System.out.println("업무진행");
			}
		};
		
		for(Employee e : employees) {
			System.out.println("========"+ e.name + "의 하루==========");
			e.startWork();
			e.work();
//			if(e instanceof Programmer) {
//				((Programmer)e).work();
//			}
//			else if(e instanceof Designer){
//				((Designer)e).work();
//			}
			e.endWork();
		}
	}
}
