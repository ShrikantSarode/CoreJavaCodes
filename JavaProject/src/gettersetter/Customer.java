package gettersetter;

public class Customer {

	private int cusId;
	private String name;
	private String mobile;
	private String address;

	public Customer() {
		cusId = 0;
		name = "";
		mobile = "";
		address = "";
	}

	public Customer(int cusId, String name, String mobile, String address) {
		super();
		this.cusId = cusId;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	

}
