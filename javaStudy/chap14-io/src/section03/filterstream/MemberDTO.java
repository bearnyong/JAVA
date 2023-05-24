package section03.filterstream;

public class MemberDTO implements java.io.Serializable {
	
	private String id;
	private String pass;
	private String name;
	private String email;
	private int age;
	private char gender;
	private double point;
	
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String id, String pass, String namel, String email, int age, char gender, double point) {
		super();
		this.id = id;
		this.pass = pass;
		this.namel = namel;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNamel() {
		return namel;
	}

	public void setNamel(String namel) {
		this.namel = namel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pass=" + pass + ", namel=" + namel + ", email=" + email + ", age=" + age
				+ ", gender=" + gender + ", point=" + point + "]";
	}
	
	
	

}
