package quiz22;

import java.io.OutputStream;
import java.util.Scanner;

public class Student {
	
	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private String grade;
	
	private Scanner sc = new Scanner(System.in);
	
	// 학생 정보 입력
	public String inputStuInfo() {
		/*
		 * 학번, 이름, 국영수 입력
		 * 국영수 문자열 입력시 다시 받을 수 있게 예외처리
		 */
			System.out.println("학번 :");
			stuId = sc.next();
			System.out.println("이름:");
			name = sc.next();
	
		while(true) {
			try {		
			System.out.println("국어 점수: ");
			this.kor = sc.nextInt();
			System.out.println("영어 점수 : ");
			this.eng = sc.nextInt();		
			System.out.println("수학 점수: ");
			this.math = sc.nextInt();
			break;
		} catch (Exception e) {
			sc.nextLine();
			System.out.println("다시 입력");
			
		}
		
		}
		
		return stuId;
			
	}
	
	//총점, 평균, 학점 계산 메서드
	public void calcTotAvg() {
		//총점, 평균, 등급 나누어서 맴버변수 저장
		
		
		this.total = this.kor+this.eng+this.math;
		this.avg = this.total/3 ;
		int lev = (int) avg/10;
		switch (lev) {
		case 9:
			System.out.println("A학점입니다.");
			this.grade = "A학점";
			break;
		case 8:
			System.out.println("B학점입니다.");
			
			this.grade ="B학점";
			break;
		case 7:
			System.out.println("C학점입니다.");
			
			this.grade = "C학점";
			break;
		case 6:
			System.out.println("D학점입니다.");
			
			this.grade = "D학점";
			break;
			
		default:
			System.out.println("F학점입니다.");
			
			this.grade = "F학점";
			
			break;
		}
		
		
		
	}
	// 학생정보 출력 매서드
	public void outputInfo() {

		
		System.out.printf("학번:%s 이름:%s 국어:%d점  영어:%d점 수학:%d점"
				+" 총점:%d점 평균:%.2f점 학점:%s \n"
				, stuId , name, kor,eng, math, getTotal(), getAvg(), getGrade());
	
	}
//		System.out.printf("%4s%6s%11d점%11d점%11d점%11d점%11.2f점%10s\n"
//				, stuId , name, kor,eng, math, total, avg, grade);
//	
//	}
	
	
	public static void main(String[] args) {
		
		new Student().inputStuInfo();
		new Student().calcTotAvg();
		new Student().outputInfo();
		
	}
	
	
	
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total = this.kor+this.eng+this.math;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg = this.total/3;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade = this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

//	@Override
//	public String toString() {
//		return "Student [stuId=" + stuId + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
//				+ ", total=" + total + ", avg=" + avg + ", grade=" + grade + ", sc=" + sc + "]";
//	}

	
	
	
	
	
}
