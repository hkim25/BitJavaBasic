package member;

/*
 * 요구사항 (기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 로그인
 * 3. 비번 수정
 * 4. 회원 탈퇴
 * 5. 아이디 존재 체크
 * 6. 마이페이지
 * **********************
 * <관리자기능>
 * 7. 회원목록
 * 8. 아이디검색
 * 9. 이름검색
 * 10. 전체 회원수
 */

import java.util.Scanner;

public class MemberApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		MemberService memberService = new MemberServiceImpl();
		while(true) {
			System.out.println("< < 메 뉴 > >");
			System.out.println("0. 종료   1. 회원가입   2. 로그인  3. 회원목록  4. 중복체크  5. 비번수정  6. 회원탈퇴  "
					+ "7. 아이디 검색  8. 이름 검색  9. 전체 회원수");
			switch(scanner.nextInt()) {
			case 0 : 
				System.out.println("시스템 종료"); return; 
				
			case 1 : 
				member = new Member();
				System.out.println("회원가입");
				System.out.println("아이디 :");
				member.setUserid(scanner.next());
				System.out.println("비밀번호 :");
				member.setPassword(scanner.next());
				System.out.println("이름 :");
				member.setName(scanner.next());
				System.out.println(member.toString());
				memberService.join(member);
				break;
				
			case 2 :  
				member = new Member();
				System.out.println("로그인");
				System.out.println("아이디 :");
				member.setUserid(scanner.next());
				System.out.println("비밀번호 :");
				member.setPassword(scanner.next());
				String result = memberService.login(member);
				System.out.println(result);
				break;
				
			case 3 :
				System.out.println("목록보기");
				Member[] list = memberService.list();
				for(int i = 0; i < 3; i++) {System.out.println(list[i]);}
				break;
			
			
			case 4 : 
				member = new Member();
				System.out.println("아이디 체크");
				System.out.println("아이디 :");
				member.setUserid(scanner.next());
				result = memberService.idCheck(member);
				System.out.println(result);
				break;
				
				
			case 5 :
				member = new Member();
				System.out.println("비밀번호 변경");
				System.out.println("아이디 :");
				member.setUserid(scanner.next());
				System.out.println("비밀번호 :");
				member.setPassword(scanner.next());
				memberService.changePassword(member);
				break;
			
			case 6 : 
				member = new Member();
				System.out.println("회원 탈퇴");
				System.out.println("아이디 :");
				member.setUserid(scanner.next());
				System.out.println("비밀번호 :");
				member.setPassword(scanner.next());
				memberService.withdrawal(member);
				break;
				
			case 7 : 
				
				break;
			
			case 8 : break;
				
			case 9 : break;
			
			case 10 : break;
				
			default : System.out.println("메뉴 선택 오류"); break;
			
			
			
			}
		}
	}
}
