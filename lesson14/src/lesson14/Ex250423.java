package lesson14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex250423 {
	public static void main(String[] args) {
		
//		1.학생의 정렬을 리스트의 sort로 변환
//		컨퍼레이터를 정의해라.
		
//		2. Map를 사용한 빈도수 체크
		
		//문자열 -> 문자열 배열 ->   문자로 이루어진 키->  밸류는 인티저. 인티저 ++1;    ->배열을 키를 추가해서 맵으로 변환
		// 출력의 형식은 toString 오버라이드
		// 입력되는 문자열의 종류는 알수 없으므로 맵의 키는 a-zA-Z까지.
		
		
		String str = "aaaaaaaabbbbbbbbbbcccccccccccddddddddd";
		countLetters letters = new countLetters(str);
		letters.count();
		//{a:12개 ,b:13개 ,c:13개 ,d:17}
	}
}

class countLetters{
	String str;
	String[] tmp;
	public countLetters(String str) {
		super();
		this.str = str;
	}
	
	public void count() {
		String[] tmp = str.split("");
		Map<String, Integer> map = new HashMap<>();
		
		for (String s : tmp) {
            if (s.matches("[a-zA-Z]")) {
            	if (map.containsKey(s)) {
            	    map.put(s, map.get(s) + 1); // 이미 존재하면 값 증가
            	} else {
            	    map.put(s, 1); // 처음 등장한 문자면 1로 초기화
            	}
            }
        }
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "의 개수 : " + entry.getValue());
        }
	
	}

}