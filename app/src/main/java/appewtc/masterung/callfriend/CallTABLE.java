package appewtc.masterung.callfriend;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterUNG on 5/9/15 AD.
 */
public class CallTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeDatabase, readDatabase;

    public static final String TABLE_NAME = "callTABLE";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "Name";
    public static final String COLUMN_PHONE = "Phone";


    public CallTABLE(Context context) {

        objMyOpenHelper = new MyOpenHelper(context);
        writeDatabase = objMyOpenHelper.getWritableDatabase();
        readDatabase = objMyOpenHelper.getReadableDatabase();

    }   //Constructor


    public long addNewData(String strName, String strPhone) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_NAME, strName);
        objContentValues.put(COLUMN_PHONE, strPhone);

        return writeDatabase.insert(TABLE_NAME, null, objContentValues);
    }



}   // Main Class
