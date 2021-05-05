package day06;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		String[] emailList = new String[100];
		int[] ageList = new int[100];

		//현재위치를 나타내는 변수 index, 시작은 -1에서 시작
		int index = -1;
		//저장된 사람 수를 알기 위한 변수 count
		int count = 0;
		
		end:while(true) {// 'end:' 구문으로 종료 
			
			System.out.println("----------------------------");
			System.out.println("[메뉴] 1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Quit");
			System.out.print("메뉴입력>");
			String menu = scan.next();
			
			switch (menu) {
			case "i":
			case "1":
				System.out.println("-------고객 정보 입력--------");
				/*
				 * 이름, 성별, 이메일, 나이를 받아서 각각 배열에 저장, 사람 수를 증가
				 */
				System.out.print("이름:");
				nameList[count] = scan.next();
				System.out.print("성별:");
				genderList[count] = scan.next();
				System.out.print("이메일:");
				emailList[count] = scan.next();
				System.out.print("나이:");
				ageList[count] = scan.nextInt();
				
				count++;
				
				break;
			case "2":
				System.out.println("-------이전 고객 정보--------");
				/*
				 * index <= 0 "이전 고객정보가 없습니다"
				 * 그렇지 않으면 index를 이동해서 이전 고객 정보 출력
				 */
				if(index <= 0) {
					System.out.println("이전 고객정보가 없습니다");
				} else {
					index--; //위치를 이전으로 이동
					System.out.print("이름:" + nameList[index]);
					System.out.print("성별:" + genderList[index]);
					System.out.print("이메일:" + emailList[index]);
					System.out.print("나이:" + ageList[index]);
				}
				
				break;
			case "3":
				System.out.println("-------다음 고객 정보--------");
				/*
				 * 다음 고객정보를 출력할 수 없는 조건을 생각해서 "다음 고객정보가 없습니다"
				 * 그렇지 않으면 index를 이동해서 다음 고객 정보를 출력
				 */
				if(index >= count - 1) { //위치가 마지막에 있는 경우
					System.out.println("다음 고객정보가 없습니다");
				} else {
					index++;
					System.out.println("이름:" + nameList[index]);
					System.out.println("성별:" + genderList[index]);
					System.out.println("이메일:" + emailList[index]);
					System.out.println("나이:" + ageList[index]);
				}
				
				break;
			case "4":
				System.out.println("-------현재 고객 정보--------");
				/* 
				 * 현재 위치를 출력할 수 있는 조건을 생각해서 현재 조건을 출력하면 됩니다.
				 * 그렇지 않으면 "현재 고객정보가 없습니다" 
				 */
				if(index >= 0 && index < count) { //현재 정보를 출력가능한 조건
					System.out.print("이름:" + nameList[index]);
					System.out.print("성별:" + genderList[index]);
					System.out.print("이메일:" + emailList[index]);
					System.out.print("나이:" + ageList[index]);
				} else {
					System.out.println("현재 고객정보가 없습니다");
				}
				
				break;
			case "5":
				System.out.println("-------고객 정보 수정--------");
				/*
				 * 현재 위치를 출력할 수 있는 조건을 생각해서 
				 * 스캐너를 통해 순서대로 이름, 성별, 이메일, 나이 를 입력받고 배열의 값을 수정
				 */
				if(index >= 0 && index < count) { //현재 정보를 수정 가능한 조건
					
					System.out.print("이름(" + nameList[index] + "):" );
					nameList[index] = scan.next();
					System.out.print("성별(" + genderList[index] + "):" );
					genderList[index] = scan.next();
					System.out.print("이메일(" + emailList[index] + "):" );
					emailList[index] = scan.next();
					System.out.print("나이(" + ageList[index] + "):" );
					ageList[index] = scan.nextInt();
					
					System.out.println("정상 수정되었습니다.");
				} else {
					System.out.println("수정할 데이터가 없습니다.");
				}
				break;
			case "6":
				System.out.println("-------고객 정보 삭제--------");
				/*
				 * 현재 정보를 삭제할 수 있는 조건을 생각해서
				 * 현재 index부터 ~~뒤에 있는 배열 요소를 당겨와서 덮어 씌웁니다.
				 * 고객수를 감소
				 * 그렇지 않으면 "삭제할 데이터가 없습니다" 출력 
				 */
				if(index >= 0 && index < count) { //삭제한 가능한 조건
					
					for(int i = index; i < count - 1 ; i++) { //현재 위치에서 마지막 - 1번째 까지
						nameList[i] = nameList[i+1];
						genderList[i] = genderList[i+1];
						emailList[i] = emailList[i+1];
						ageList[i] = ageList[i+1]; 
					}
					count--; //사람 수를 감소
					System.out.println("삭제가 정상 처리되었습니다");
				} else {
					System.out.println("삭제할 정보가 없습니다");
				}
				
				break;
			case "7":
				System.out.println("-----------종료-----------");
				//무한 루프 탈출
				scan.close();
				break end;
			default:
				System.out.println("메뉴를 잘못 입력했습니다");
				break;
			}
			

		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
