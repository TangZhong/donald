package Bean;

/**
 * Created by donald.tang on 2019/6/3.
 */
public class RecordCondition {

        String startDate;
        String endDate;
        String usernumber;
        String udorm;
        String uname;

    public RecordCondition() {
    }

    public RecordCondition(String startDate, String endDate, String usernumber, String udorm, String uname) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.usernumber = usernumber;
        this.udorm = udorm;
        this.uname = uname;
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

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber;
    }

    public String getUdorm() {
        return udorm;
    }

    public void setUdorm(String udorm) {
        this.udorm = udorm;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
