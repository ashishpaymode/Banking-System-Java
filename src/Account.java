
public class Account {
	private int accno;
	private static int saccno = 1001;
	private String name;
	private int bal;
	private String city;
	public Account(String name, int bal, String city) {
		this.name = name;
		this.bal = bal;
		this.city = city;
		this.accno=saccno++;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public static int getSaccno() {
		return saccno;
	}
	public static void setSaccno(int saccno) {
		Account.saccno = saccno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "[accno=" + accno + ", name=" + name + ", bal=" + bal + ", city=" + city + "]";
	}
	
}

