package eg1;

public class Account implements Comparable<Account> {

	private long accountId;
	private String customerName;
	private double currentBalance;
	private float ratings;
	private boolean active;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(long accountId, String customerName, double currentBalance, float ratings, boolean active) {
		super();
		this.accountId = accountId;
		this.customerName = customerName;
		this.currentBalance = currentBalance;
		this.ratings = ratings;
		this.active = active;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customerName=" + customerName + ", currentBalance=" + currentBalance
				+ ", ratings=" + ratings + ", active=" + active + "]";
	}

	@Override
	public int compareTo(Account o) {
		Long l1=this.accountId;
		Long l2=o.accountId;
		return l1.compareTo(l2);
	}
	
	
}
