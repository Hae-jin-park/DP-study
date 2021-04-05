package study.example;

public class AdapterImpl implements Adapter {

	@Override
	public Float twiceOf(Float f) {
		
		return Math.doubled(f.doubleValue()).floatValue();//(float) Math.twoTime(f.doubleValue());
	}

	@Override
	public Float halfOf(Float f) {
		
		//메인함수 수정하지 않고, Math 알고리즘 소스 수정하지 않고 로그 출력 가능.
		System.out.println("절반 함수 호출 시작.");
		return (float) Math.half(f.doubleValue());
	}

}
