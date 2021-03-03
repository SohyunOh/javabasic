package quiz26;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RamdaQuiz01 {

	public static void main(String[] args) {


		/*
		 * 1. 	BufferedReader 클래스를 사용해서 파일 읽어오기
		 * 2. , 기준으로 잘라서 Data클래스에 값을 한줄 단위로 저장
		 * 		결측치 -> 빠진값을 적절하게 처리하기 위해서 list<Data>에저장
		 * 3. 람다식을 이용해서, 지역:서울, 짝 월, 분양가격 4000이상의 객체만 뽑아서
		 * 새로운 리스트 저장
		 * 
		 */


		List<Data> list = new ArrayList<Data>();
		BufferedReader br = null;


		int n = list.indexOf(",");
		try {
			String path = "D:\\course\\java\\workspace\\quiz\\src\\quiz26\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv";
			br = new BufferedReader(new InputStreamReader( 
					new FileInputStream(path) , "EUC-KR"));

			int hang =0;

			String str ;
			while( (str= br.readLine()) != null ) {
				//,로 짤라서 배열에 입력				
				String[] arr = str.split(",", 5);

				/*
				Data data = new Data();
				data.setRegion(arr[0]);
				data.setSize(arr[1]);
				data.setYear(Integer.parseInt(arr[2]));// int형을  string 으로 변환
				data.setMonth( Integer.parseInt(arr[3]));
				data.setPrice(Integer.parseInt(arr[4]));
				 */
				
				hang++;
				System.out.println(hang);
				System.out.println(Arrays.toString(arr));

				String region = arr[0];
				String size =arr[1];
				String year = arr[2];
				String month = arr[3];
				String price = arr[4].replace(" ", "").replace(",", "").replace("-", "");//공백제거, ,제거, -제거
				if(arr[4].equals("")) {
					price="0";//공백이라면 0을 저장
				}else {
					price = arr[4];//그대로 저장
				}
								
				Data data2 = new Data(region, size, year, month, price);
				list.add(data2); 

			}
			//1. 지역:서울, 짝 월, 분양가격 4000이상의 객체
			List<Data> newList = list.stream()
			.filter((data2)-> data2.getRegion().equals("서울") )
			.filter((data2) -> Integer.parseInt(data2.getMonth() ) %2 ==0 ) //반환되는값 -> 필터값
			.filter( (data2) -> Integer.parseInt(data2.getPrice() ) >= 4000)
			.collect( Collectors.toList() );
			
			int total = 0;
			for(Data data2 : newList) {
				System.out.println(data2.toString());
				total += Integer.parseInt(data2.getPrice());
			
			}
			double averege = total /(double)list.size();
			
			System.out.println(total);
			
			//2.합계 - mapToint를 사용 -> intStream으로 변환 -> 합계메서드
//			newList.stream().mapToInt((data2) -> return Integer.parseInt(data2.getPrice())   )//새로운 값을 뽑아서 IntStrram 반환
			int sum = newList.stream().mapToInt( (data2) -> Integer.parseInt(data2.getPrice())  ).sum(); //새로운 값을 뽑아 Intstream 변환
			System.out.println(sum);
			//3.평균 - mapToint 를 사용 -> price값의 평균을 구한다음에 -> doble형 변환
			double avg = newList.stream().mapToInt( (data2) -> Integer.parseInt( data2.getPrice())  ).average().getAsDouble();
			// 평균을 구하고 더블타입으로 치환
			System.out.println(avg);

		}catch(	Exception e){
			e.printStackTrace();

		}finally {
			try {

				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
