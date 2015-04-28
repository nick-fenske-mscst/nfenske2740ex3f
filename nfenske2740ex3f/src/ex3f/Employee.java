package ex3f;

public class Employee 
{
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee() 
	{
		this.name = "";
		this.idNumber = 0;
		this.department = "";
		this.position = "";
	}
	
	public Employee(String name, int id) 
	{
		this.name = name;
		this.idNumber = id;
		this.department = "";
		this.position = "";
	}
	
	public Employee(String name, int id, String dept, String pos) 
	{
		this.name = name;
		this.idNumber = id;
		this.department = dept;
		this.position = pos;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() 
	{
		return "ID: " + idNumber + ", "+ name + ", Dept: " + department + ", Position:" + position;
	}
	
}
