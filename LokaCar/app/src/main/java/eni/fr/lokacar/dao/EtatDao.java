package eni.fr.lokacar.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import eni.fr.lokacar.dao.contract.EtatContract;
import eni.fr.lokacar.helper.GestionBddHelper;
import eni.fr.lokacar.model.Etat;

/**
 * Created by afavrat2015 on 22/05/2017.
 */

public class EtatDao {

    private SQLiteDatabase db;
    private GestionBddHelper helper;

    public EtatDao(Context context)
    {
        helper = new GestionBddHelper(context);
        db = helper.getWritableDatabase();
    }

    public long insert(Etat item)
    {
        ContentValues content = new ContentValues();
        content.put(EtatContract.COL_ID_ETAT,item.getId());
        content.put(EtatContract.COL_IMATVEHICULE_ETAT, String.valueOf(item.getImat_Vehicule()));
        content.put(EtatContract.COL_IDCLIENT_ETAT,String.valueOf(item.getId_Client()));
        return db.insert(EtatContract.TABLE_ETAT,null,content);
    }

    public List<Etat> get()
    {
        List<Etat> liste = new ArrayList<>();
        try {
            Cursor cursor = db.rawQuery("SELECT * FROM etat", null);
            while (cursor.moveToNext()) {
                Etat etat = new Etat();
                etat.setId(cursor.getInt(EtatContract.NUM_COL_ID_ETAT));
                //etat.setId_Client(cursor.getClass(EtatContract.NUM_COL_IDCLIENT_ETAT));
                //etat.setImat_Vehicule(cursor.getClass(EtatContract.NUM_COL_IMATVEHICULE_ETAT));
                liste.add(etat);
            }
        }catch(Exception ex)
        {
            Log.e("ListEtat",ex.getMessage());
        }
        return liste;
    }

    public void delete(Etat etat) {
        int id = etat.getId();
        db.delete(EtatContract.TABLE_ETAT, EtatContract.NUM_COL_ID_ETAT
                + " = " + id, null);
    }

}
