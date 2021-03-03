import java.sql.Timestamp;

public class RentVO {
	private int rent_no;
	private int b_number;
	private String id;
	private int count;
	private Timestamp regdate ;
	public int getRent_no() {
		return rent_no;
	}
	public void setRent_no(int rent_no) {
		this.rent_no = rent_no;
	}
	public int getB_number() {
		return b_number;
	}
	public void setB_number(int b_number) {
		this.b_number = b_number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public RentVO(int rent_no, int b_number, String id, int count, Timestamp regdate) {
		super();
		this.rent_no = rent_no;
		this.b_number = b_number;
		this.id = id;
		this.count = count;
		this.regdate = regdate;
	}
	
	
	public RentVO() {
		
	}
	
	
}
