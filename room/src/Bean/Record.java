package Bean;

public class Record {
	private int recordId;
	private String usernumber;
	private String username;
	private String date;
	private String detail;
	private String userdorm;
	private String userhouse;
	private String startDate;
	private String endDate;
	
	public Record() {
	}
	
	public Record(String usernumber, String date, String detail) {
		this.usernumber = usernumber;
		this.date = date;
		this.detail = detail;
	}

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public String getUsernumber() {
		return usernumber;
	}

	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getUserdorm() {
		return userdorm;
	}

	public void setUserdorm(String userdorm) {
		this.userdorm = userdorm;
	}

	public String getUserhouse() {
		return userhouse;
	}

	public void setUserhouse(String userhouse) {
		this.userhouse = userhouse;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Record{" +
				"recordId=" + recordId +
				", usernumber='" + usernumber + '\'' +
				", username='" + username + '\'' +
				", date='" + date + '\'' +
				", detail='" + detail + '\'' +
				", userdorm='" + userdorm + '\'' +
				", userhouse='" + userhouse + '\'' +
				", startDate='" + startDate + '\'' +
				", endDate='" + endDate + '\'' +
				'}';
	}
}
