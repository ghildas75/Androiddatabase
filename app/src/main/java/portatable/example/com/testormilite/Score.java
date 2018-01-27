package portatable.example.com.testormilite;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by Portable on 2017-12-30.
 */
@DatabaseTable(tableName = "T_scores")
public class Score {
    @DatabaseField(columnName = "idScore",generatedId = true)
    private int idScore;
    @DatabaseField
    private String  name;
    @DatabaseField
    private int score;
    @DatabaseField
    private Date  when;

    public Score() {
    }

    public Score(String name, int score, Date when) {
        this.name = name;
        this.score = score;
        this.when = when;
    }

    @Override
    public String toString() {
        return "Score{" +
                "idScore=" + idScore +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", when=" + when +
                '}';
    }

    public int getIdScore() {
        return idScore;
    }

    public void setIdScore(int idScore) {
        this.idScore = idScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }
}
