package cels.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TestRecord implements Serializable, Comparable<TestRecord> {
    private List<BaseTerm> datas;
    private Date testDate;
    private long seconds;
    private int correct;
    private int error;
    private int total;
    private int count;

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public TestRecord() {
    }

    public TestRecord(List<BaseTerm> datas, Date testDate) {
        this.datas = datas;
        this.testDate = testDate;
    }

    public List<BaseTerm> getDatas() {
        return this.datas;
    }

    public void setDatas(List<BaseTerm> datas) {
        this.datas = datas;
    }

    public Date getTestDate() {
        return this.testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public long getSeconds() {
        return this.seconds;
    }

    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }

    public int getCorrect() {
        return this.correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getError() {
        return this.error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("测试时间：").append((this.testDate)).append(" , 测试时长：").append(this.seconds/10000L).append("\n");
        builder.append("测数总题数：").append(this.total).append(" , 完成题数：").append(this.count).append("\n");
        builder.append("正确个数：").append(this.correct).append(" , 错误个数：").append(this.error).append("\n");
        builder.append("本次测试数据如下：\n");

        for(int i = 0; i < this.datas.size(); ++i) {
            BaseTerm bt = (BaseTerm)this.datas.get(i);
            builder.append(i + 1).append(". ").append(bt.getEn());
            if(i != this.datas.size() - 1) {
                builder.append("\t");
            }

            if((i + 1) % 5 == 0) {
                builder.append("\n");
            }
        }

        System.out.println("————————————————————————————————————");
        builder.append("\n");
        return builder.toString();
    }

    public int compareTo(TestRecord o) {
        return o.testDate.compareTo(this.testDate);
    }
}
