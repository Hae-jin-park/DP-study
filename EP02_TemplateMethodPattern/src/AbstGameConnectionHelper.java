
public abstract class AbstGameConnectionHelper {

	//접속 알고리즘 : 보안,인증,권한,접속
	protected abstract String doSecurity(String str);
	protected abstract boolean authentication(String id, String pwd);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	public String requestConnection(String enc_info) {
		
		//보안작업 -> 암호화 된 문자열을 복호화. 이는 우리의 몫.
		String decodedInfo = doSecurity(enc_info);
		
		String id = "aaa";
		String pwd = "bbb";
		
		if(!authentication(id, pwd)) {
			throw new Error("ID, 암호가 틀려요...");
		}
		//보안작업 결과를 받은 것을 가지고 id, password를 할당한다.
		String userName = "userName";
		int i = authorization(userName);
		switch(i) {
			case -1:
				throw new Error("셧다운제로 인하여 10시 이후에는 접속할 수 없습니다.");
			case 0://GM
				System.out.println("게임 매니저이시네요.");
				break;
			case 1://유료회원
				System.out.println("유료 회원이시네요.");
				
				//추가기능 구현
				
				break;
			case 2://무료회원
				System.out.println("무료 회원이시네요.");
				
				//추가기능 구현
				
				break;
			case 3://권한없음
				System.out.println("권한이 없으시네요...");
				break;
			default:
				break;
		}
		
		
		authorization(userName);
		
		return connection(decodedInfo);
	}
}
