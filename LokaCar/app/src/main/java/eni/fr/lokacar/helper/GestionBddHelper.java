package eni.fr.lokacar.helper;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import eni.fr.lokacar.dao.contract.VehiculeContract;

/**
 * Created by Administrator on 19/05/2017.
 */

public class GestionBddHelper extends SQLiteOpenHelper {

    public GestionBddHelper(Context context) {
        super(context, "BddLokaCar", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(VehiculeContract.SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(VehiculeContract.SQL_DROP_TABLE);
    }
}
