package portatable.example.com.testormilite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
  private TextView scoreview;
  private  DataBaseManager dataBaseManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreview=(TextView) findViewById(R.id.score_view);
        dataBaseManager= new DataBaseManager(this);
        dataBaseManager.insertScore(new Score("james",1000, new Date()));
        dataBaseManager.insertScore(new Score("jennifer",1200, new Date()));
        dataBaseManager.insertScore(new Score("marise",100, new Date()));
        dataBaseManager.close();
    }
}
