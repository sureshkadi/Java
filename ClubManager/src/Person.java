import java.security.acl.Permission;


public class Person {
// private attributes
	private String surName;
	
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	private String firstName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private String secondName;

	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	// default constructor
	public Person(){
		this("#name","#firstname","#secondName");
	}
	public Person(String surName, String firstName){
		this(surName,firstName," ");
		
		
	}
	//parameterized constructor
	public Person(String surName, String firstName, String secondName){
			this.surName= surName;
			this.firstName= firstName;
			this.secondName= secondName;
	}
	
	public void Show(){
		//System.out.println(""+this.surName+" "+this.firstName+" "+this.secondName);
		System.out.println(this.toString());
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
		
			return this.surName+" "+this.firstName+" "+this.secondName;
		}
}
