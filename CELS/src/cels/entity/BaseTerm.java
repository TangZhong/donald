package cels.entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by donald.tang on 2019/5/30.
 */
public abstract class BaseTerm implements Serializable {

    private Long id;
    private String en;
    private String[] cn;

    private String category = "计算机英语";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String[] getCn() {
        return cn;
    }

    public void setCn(String[] cn) {
        this.cn = cn;
    }

    @Override
    public String toString() {
        return "BaseTerm{" +
                "id=" + id +
                ", en='" + en + '\'' +
                ", cn=" + Arrays.toString(cn) +
                ", category='" + category + '\'' +
                '}';
    }
}
