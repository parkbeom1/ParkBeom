
public class Test2 {
	private String name;
	private int age;
	private int[] array;
	
	public Test2(String name, int age) {
		this.name = name;
		this.age = age;
		array = new int[5];
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int[] getInt(int[] array) {
		return array;
	}
	
	public String showInfo() {
		return "이름 : " + name + " 나이 : " + age;
	}
}
