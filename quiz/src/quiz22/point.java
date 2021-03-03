package quiz22;

import java.util.List;
import java.util.Scanner;

import quiz21.User;

public class point implements InterPoint {

	Scanner sc = new Scanner(System.in);

	@Override
	public void showPointUI() {

		System.out.println("===========================================================");
		System.out.printf("%4s%10s%10s%10s %11s%11s%11s %11s\n"
				, "학번", "이름", "국어", "영어", "수학", "총점"
				, "평균", "학점");
		System.out.println("===========================================================");

	}

	@Override
	public void input(List<Student> students) {

		/*
		1. 학생의 객체를 1개 생성합니다.
		2. 학생의 객체에 속성값을 설정하는 메서드들을 호출!
			-만약 입력한 학번이 이미 list에 존재하는 학번이라면
			 "이미 등록된 학번 입니다"를 출력하고 메서드종료
		3. 정보저장이 완료된 객체를 리스트에 추가!
		4. 저장완료 메세지를 출력하세요.
		ex) XXX님의 성적 정보가 정상적으로 입력되었습니다.
		 */
		System.out.println("***********");
		System.out.println("등록 할 학번 입력:");
		String stid = sc.next();
		if(students.size()==0) {
			System.out.println("==========\n>등록진행합니다." );
			Student st = new Student();
			st.inputStuInfo();
			students.add(st);
			System.out.println(st.getName() + "님의 성적 정보가 정상적 입력되었습니다.");
		}else {
			for(int i = 0; i <students.size() ; i++ ) {
				if(students.get(i).getStuId().equals(stid)) {
					System.out.println("이미 등록된 학번 입니다");	
				}else {
					Student st = new Student();
					st.inputStuInfo();
					students.add(st);
					System.out.println(st.getName() + "님의 성적 정보가 정상적 입력되었습니다.");
					break;
				}

			}
		}
	}
	@Override
	public void showAll(List<Student> students) {
		/*
		1. 리스트 안에 들어있는 학생객체들의 정보를 반복문을 통해 전체 출력하세요.
		2. 우리반의 전체평균을 가장 아랫부분에 출력하세요.
		 */

		double All = 0; 
		for(int i =0 ; i<students.size();i++) {
			students.get(i).outputInfo();
			students.get(i).calcTotAvg();
			All += (students.get(i).getAvg());
			
		}
		System.out.println("우리반의 전체평균:"+ All/students.size());

	}

	@Override
	public void search(List<Student> students) {

		/*
		1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 정보만 출력하세요.
		2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력하세요.
		 */
		System.out.print("찾을 학번 입력 : ");
		String seacher1 = sc.next();

		for(int i = 0 ; i < students.size() ; i++ ) {
			if(students.get(i).equals(seacher1)) {
				students.get(i).outputInfo();			
				break;
			}
			else {
				System.out.println(seacher1 +"님 정보를 찾지 못함");
			}

		}


	}



	@Override
	public void modify(List<Student> students) {
		/*
		1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 국어,영어,수학 점수를 수정하세요.
		2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력 하세요.
		 */
		System.out.print("수정 할 학번 입력 : ");
		String seacherId = sc.next();
		for(int i = 0 ; i < students.size() ; i++) {
			if(students.get(i).getStuId().equals(seacherId)) {
				System.out.println("국어");
				int kor = sc.nextInt();
				students.get(i).setKor(kor);
				System.out.println("영어");
				int eng = sc.nextInt();
				students.get(i).setEng(eng);
				System.out.println("수학");
				int math = sc.nextInt();
				students.get(i).setMath(math);
				break;
			}
			else {
				System.out.println(seacherId+" : 학번을 찾지 못하엿습니다");
			}
		}




	}

	@Override
	public void delete(List<Student> students) {
		/*
		1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 모든 정보를 삭제하세요.
		2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력 하세요.
		 */

		System.out.println("삭제 할  학번:");
		String seacher1 = sc.next();

		for(int i = 0 ; i < students.size() ; i++ ) {
			if(students.get(i).equals(seacher1)) {
				students.remove(i);
				break;
			}
			else {
				System.out.println(seacher1 +"님 정보를 찾지 못함");
			}

		}
	}


}
