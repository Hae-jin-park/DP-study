
public class DefaultGameConnectHelper extends AbstGameConnectionHelper {
//구체적인 기능을 구현.
	@Override
	protected String doSecurity(String str) {
		// TODO Auto-generated method stub
		System.out.println("강화된 알고리즘을 이용해 디코드합니다.");
		return str;
	}

	@Override
	protected boolean authentication(String id, String pwd) {
		// TODO Auto-generated method stub
		System.out.println("ID/암호 from DB를 확인하는 과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// TODO Auto-generated method stub
		System.out.println("권한 확인");
		//서버에서 유저의 나이를 알 수 있다.(만약 가입시)
		//나이 확인하고 시간을 확인하여 성인이 아니고 저녁10시 이상이면
		//권한이 없는 것으로 한다.
		return 0;
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		System.out.println("접속준비가 되었습니다! 주소를 넘겨드리겠습니다.");
		return null;
	}

}
