package suite.MavenProject;

public class Vendors {
	public String tcid;
	public String vendorName;
	public String email;
	public String street;
	public String city;
	public String state;
	//public String zip;

	public Vendors(String tcid, String vendorName, String email, String street, String city, String state) {
		this.tcid = tcid;
		this.vendorName = vendorName;
		this.email = email;
		this.street = street;
		this.city = city;
		this.state = state;
		//this.zip = zip;
	}
	
	@Override
	public String toString(){
		return "Vendor Details: "+tcid+vendorName+email+street+city+state;
	}

}
