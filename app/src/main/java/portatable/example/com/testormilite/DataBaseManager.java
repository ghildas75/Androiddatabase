package portatable.example.com.testormilite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

/**
 * Created by Portable on 2017-12-30.
 */

public class DataBaseManager extends OrmLiteSqliteOpenHelper {
private static  final String DB_NAME="Game.db";
private static  final int DATABASE_VERSION=1;
 public DataBaseManager(Context context) {
 super(context,DB_NAME,null,DATABASE_VERSION);
 }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource,Score.class);
            Log.i("DATABSE","on create invoke");
        }
        catch (Exception ex){
            Log.e("DATABSE","CANNOTT NOT CREATE", ex);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

        try {
            TableUtils.dropTable(connectionSource,Score.class,true);
            Log.i("DATABSE","on upgrad invoke");
            onCreate(database,connectionSource);
        }
        catch (Exception ex){
            Log.e("DATABSE","CANNOTT NOT upgrade", ex);
        }

    }

    public  void insertScore(Score score){
        try {
            Dao<Score, Integer> dao = getDao(Score.class);
            dao.create(score);
        }
        catch (Exception ex){
            Log.e("DATABSE","CANNOTT NOT inser", ex);
        }
    }
}
