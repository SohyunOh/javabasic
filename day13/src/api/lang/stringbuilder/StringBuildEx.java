package api.lang.stringbuilder;

public class StringBuildEx {

	public static void main(String[] args) {

		//StringBuffer, StringBuilder

		String str = new String("java");
		StringBuffer sb = new StringBuffer("java");

		System.out.println(str);
		System.out.println(sb);

		//차이점
		str = str + "choco";
		sb.append("choco");

		System.out.println(str);
		System.out.println(sb);

		// 끝에 문자열 추가
		sb.append("chip");
		System.out.println(sb);

		// 중간에 문자열 추가
		sb.insert(4, " ");
		System.out.println(sb);

		//문자열 변경 replace
		sb.replace(0, 4, "자바");
		System.out.println(sb);

		//문자열 삭제
		sb.delete(2, sb.length());
		System.out.println(sb);

		//문자열 꺼구로 reverse()
		sb.reverse();
		System.out.println(sb);

		//다시 꺼구로 reverse()
		sb.reverse();
		System.out.println(sb);
		
		//문자열로 변경toString()
		if(sb.toString().equals("자바")) {
			System.out.println("문자열이같음");
		}
		
		
	}

}
