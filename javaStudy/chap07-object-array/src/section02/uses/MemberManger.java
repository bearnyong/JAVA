package section02.uses;

public class MemberManger {
	
	public void signUpMembers() {
		
		MemberDTO[] members = new MemberDTO[5];
		// 객체를 배열로 만들 수 있다.
		
		members[0] = new MemberDTO(1, "user01", "pass01", "홍길동", 20, '남');
		members[1] = new MemberDTO(2, "user02", "pass02", "유관순", 16, '여');
		members[2] = new MemberDTO(3, "user03", "pass03", "이순신", 40, '남');
		members[3] = new MemberDTO(4, "user04", "pass04", "신사임당", 36, '남');
		members[4] = new MemberDTO(5, "user05", "pass05", "윤봉길", 22, '남');
		
		MemberInsertManager memberInsetManager = new MemberInsertManager();
		memberInsetManager.insert(members);  //memberInsetManager에 members의 값을 넘긴다.
		
	}
	
	
	public void printAllMembrs() {
		
		MemberDTO[] selectMembers = new MemberSelectManger().selectAllMembers();
		// MemberDTO[], MemberSelectManger()가 자료형이 다르지만 사용이 가능한 이유 = 반환값이 같음
		
		System.out.println("----------가입된 회원 목록----------");
		for(MemberDTO member : selectMembers) {
			System.out.println(member.getInformation());
			
		}
		
		System.out.println("-----------------------------");
		System.out.println("총 "+selectMembers.length+"명의 회원이 가입되어 있습니다.");
	}
	
	
	

}
