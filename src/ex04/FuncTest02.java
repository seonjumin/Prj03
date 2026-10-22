package ex04;

import java.time.LocalDateTime;
import java.util.Scanner;

public class FuncTest02 {
	//입력
	static String name;
	static String phone;
	static int man;
	static int bYear;
	//출력
	static String gender;
	static int age;
	
	public static void main(String[] args) {
		
		input();
		process();
		calcAge(1995);
		output();

	}

	private static void input() {
		Scanner in  = new Scanner(System.in);
		System.out.print("이름:");
		name = in.nextLine();
		System.out.print("전화번호:");
		phone = in.nextLine();
		System.out.print("성별(1:남자,2여자):");
		man = in.nextInt();
		System.out.print("태어난연도:");
		bYear = in.nextInt();
		
	}

	private static void process() {
		if(man == 1) {
			gender = "남자";
		}else {
			gender = "여자";
		}
	}
	private static int calcAge(int bYear) {
		LocalDateTime now = LocalDateTime.now();
		age = now.getYear() - bYear;
		return age;
	}
	

	private static void output() {
		System.out.println("이름  /  전화       /  성별 / 나이");
		System.out.printf("%s %s %s %d",name,phone,gender,age );
		
	}

}
