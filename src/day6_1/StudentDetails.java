package day6_1;

public class StudentDetails {

	// Getters and Setters

	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	private char section;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 70 || age < 20) {
			System.out.println("Error");
		} else {
			this.age = age;
		}
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if(gender.equals("Male")||gender.equals("Female")||gender.equals("Others")) {
		 this.gender = gender;
		}
		else {
			System.out.println("Error");
		}
	}

	// age must be between 20 to 70

	public void printDetails() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		System.out.println(phoneNumber);
		System.out.println(section);
		System.out.println(gender);
	}

}
