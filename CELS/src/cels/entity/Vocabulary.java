package cels.entity;

/**
 * Created by donald.tang on 2019/5/30.
 */
public class Vocabulary extends BaseTerm {

    private String acronym;

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    @Override
    public String toString() {
        return super.toString() + " , Vocabulary{" +
                "acronym='" + acronym + '\'' +
                '}';
    }
}
