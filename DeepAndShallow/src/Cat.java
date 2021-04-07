
public class Cat implements Cloneable{
	private String name;
	private Age age;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(Age age) {
		this.age = age;
	}
	public Age getAge() {
		return age;
	}
	
	public Cat copy() throws CloneNotSupportedException {
		Cat ret = (Cat)this.clone();
		
		//위의 코드가 없으면 MainApp에서 복제된 yo라는 객체에서 .getAge().setYear나 Value할 시 navi의 age 멤버변수 값도 바뀌게 됩니다.
		ret.setAge(new Age(this.age.getYear(), this.age.getValue()));
		
		return ret;
	}
	
}
