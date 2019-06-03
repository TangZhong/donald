package Bean;

/**
 * Created by donald.tang on 2019/6/3.
 */
public class Score {

    String udorm ;
    String uhouse;
    String score;

    public Score() {
    }

    public Score(String udorm, String uhouse, String score) {
        this.udorm = udorm;
        this.uhouse = uhouse;
        this.score = score;
    }

    public String getUdorm() {
        return udorm;
    }

    public void setUdorm(String udorm) {
        this.udorm = udorm;
    }

    public String getUhouse() {
        return uhouse;
    }

    public void setUhouse(String uhouse) {
        this.uhouse = uhouse;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "udorm='" + udorm + '\'' +
                ", uhouse='" + uhouse + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
