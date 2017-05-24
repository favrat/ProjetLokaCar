package eni.fr.lokacar.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import eni.fr.lokacar.dao.contract.LocationContract;
import eni.fr.lokacar.dao.contract.MarqueContract;
import eni.fr.lokacar.helper.GestionBddHelper;
import eni.fr.lokacar.model.Location;
import eni.fr.lokacar.model.Marque;

import static android.R.attr.id;

/**
 * Created by mrobert2015 on 24/05/2017.
 */

public class MarqueDao {

    private SQLiteDatabase db;
    private GestionBddHelper helper;

    public MarqueDao(Context context)
    {
        helper = new GestionBddHelper(context);
        db = helper.getWritableDatabase();
    }

    public long insert(Marque item)
    {
        ContentValues content = new ContentValues();
        content.put(MarqueContract.COL_LIBELLE_MARQUE, item.getLibelle());
        return db.insert(MarqueContract.TABLE_MARQUE,null,content);
    }

    public List<Marque> get()
    {
        List<Marque> liste = new ArrayList<>();
        try {
            Cursor cursor = db.rawQuery("SELECT * FROM marque", null);
            while (cursor.moveToNext()) {
                Marque marque = new Marque();
                marque.setLibelle(cursor.getString(MarqueContract.NUM_COL_LIBELLE_MARQUE));
                liste.add(marque);
            }
        }catch(Exception ex)
        {
            Log.e("ListLocation",ex.getMessage());
        }
        return liste;
    }

    public void delete(Marque marque) {
        int id = marque.getId();
        db.delete(MarqueContract.TABLE_MARQUE, MarqueContract.NUM_COL_NUM_MARQUE
                + " = " + id, null);
    }

    public Marque getMarque(String mrq) {
        Cursor cursor = db.query(MarqueContract.TABLE_MARQUE, new String[] {  MarqueContract.COL_LIBELLE_MARQUE
                        },  MarqueContract.COL_LIBELLE_MARQUE + "=?",
                new String[] { String.valueOf(mrq) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Marque marque = new Marque(cursor.getString(0));

        return marque;
    }
}
