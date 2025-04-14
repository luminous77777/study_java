package lesson07;

import java.util.Arrays;

public class MemberMain2 {
	public static void main(String[] args) {
		Member[] members = new Member[3]; //배열을 초기화 하기 위해.
		System.out.println(Arrays.toString(members)); // 이 배열의 참조 자료형의 기본값은 NULL, 참조형만 넣을 수있음
		
		members[0] = new Member(); //객체를 초기화 하기 위해  -> 이 객체는 int,String,int의 자료형이기 때문에0,NULL,0으로 초기화
		System.out.println(Arrays.toString(members));
		
		members[0].num =1;
		members[0].name ="김윤석";
		members[0].age =27;
		members[1].num =2;
		members[1].name ="bbb";
		members[1].age =33;
		members[2].num =3;
		members[2].name ="ccc";
		members[2].age =41;
	}
}
