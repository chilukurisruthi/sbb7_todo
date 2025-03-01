package beans;

public class Register {
	
	
	
	private int regid;
	private String fname;
	private String lname;
	private String email;
	private String pass;
	private long mobile;
	public String toString() {
		return regid+" "+fname+" "+lname+" "+email+" "+pass+" "+mobile+" "+address;
	}
	public int hashCode() {
		return toString().hashCode();
	}
	public boolean equals(Object o) {
		boolean flag=false;
		if(o instanceof Register) {
			Register reg=(Register)o;
			if( this.regid==reg.getRegid() && this.fname.equals(reg.getFname()) && this.lname.equals(reg.getLname()) && this.email.equals(reg.getEmail()) && this.pass.equals(reg.getPass()) &&  this.mobile==reg.getMobile() && this.address.equals(reg.getAddress()) ) {
				flag=true;
			}
		}
		return flag;
	}
}

	
	
	

	
	

}
