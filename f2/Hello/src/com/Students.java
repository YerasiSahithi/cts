package com;
class Students
{
	 static int id,phoneno;
	static String name,course,gender;
	public Students(int id, int phoneno, String name, String course, String gender) {
		super();
		this.id = id;
		this.phoneno = phoneno;
		this.name = name;
		this.course = course;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGender() {
		return gender;
	}
	public void setSex(String gender) {
		this.gender = gender;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s = new Students(1,888,"ss","cse","f");
		//Students s2 = new Students(2,999,"ab","ece","m");
//String name;
System.out.println("id is "+ id + " \nname is "+ name + " \ncourse is "+ course +"\n phone  is "+ phoneno +"\n gender "+ gender);
	//System.out.println(s);
	}

}
