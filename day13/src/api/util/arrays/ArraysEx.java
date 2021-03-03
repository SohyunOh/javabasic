package api.util.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {

		
		int[] arr = {5,4,3,2,1};
		
		//정렬
		Arrays.sort(arr);
		
		//확인
		System.out.println(Arrays.toString(arr));
		
		//배열의 검색 binarySearch() -  선택 조건 정렬.
		int index = Arrays.binarySearch(arr, 3 );
		System.out.println("3이 있는  index: " +index);
		
		int index2 = Arrays.binarySearch(arr, 100 );
		System.out.println("3이 있는  index: " +index2);
		//찾는 값이 없을 경우 쓰레기 값(-값)을 돌려둠
		
		//배열 복사(배열명, 길이)
		int[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(newArr));

		
		//배열 복사 (배열명, 시작 값 (index), 끝값 (index))
		int[] newArr2 = Arrays.copyOfRange(arr,2, arr.length);
		System.out.println(Arrays.toString(newArr2));

		//배열의 내부요소가 동일한지 확인
		if(Arrays.equals(arr, newArr)) {
			System.out.println("배열요소가 같다");
		}
		

	}

}
