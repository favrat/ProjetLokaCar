package eni.fr.lokacar.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import eni.fr.lokacar.dao.contract.LocationContract;
import eni.fr.lokacar.helper.GestionBddHelper;
import eni.fr.lokacar.model.Location;

/**
 * Created by afavrat2015 on 22/05/2017.
 */

public class LocationDao {

    private SQLiteDatabase db;
    private GestionBddHelper helper;

    public LocationDao(Context context)
    {
        helper = new GestionBddHelper(context);
        db = helper.getWritableDatabase();
    }

    public long insert(Location item)
    {
        ContentValues content = new ContentValues();
        content.put(LocationContract.COL_ID_LOCATION,item.getId());
        content.put(LocationContract.COL_IDCLIENT_LOCATION, String.valueOf(item.getId_Client()));
        content.put(LocationContract.COL_IMATVEHICULE_LOCATION,String.valueOf(item.getImat_Vehicule()));
        content.put(LocationContract.COL_lOUE_LOCATION,item.isLoue());
        content.put(LocationContract.COL_DATEDEBUT_LOCATION,item.getDateDebut());
        content.put(LocationContract.COL_DATEFIN_LOCATION,item.getDateFin());
        content.put(LocationContract.COL_RENDU_LOCATION,item.getRendu());
        return db.insert(LocationContract.TABLE_LOCATION,null,content);
    }

    public List<Location> get()
    {
        List<Location> liste = new ArrayList<>();
        try {
            Cursor cursor = db.rawQuery("SELECT * FROM location", null);
            while (cursor.moveToNext()) {
                Location location = new Location();
                location.setId(cursor.getInt(LocationContract.NUM_COL_ID_LOCATION));
                //location.setId_Client(cursor.getClass(LocationContract.NUM_COL_IDCLIENT_LOCATION));
                //location.setImat_Vehicule(cursor.getClass(LocationContract.NUM_COL_IMATVEHICULE_LOCATION));
                location.setLoue(cursor.getInt(LocationContract.NUM_COL_lOUE_LOCATION));
                location.setDateDebut(cursor.getString(LocationContract.NUM_COL_DATEDEBUT_LOCATION));
                location.setDateFin(cursor.getString(LocationContract.NUM_COL_DATEFIN_LOCATION));
                location.setRendu(cursor.getInt(LocationContract.NUM_COL_RENDU_LOCATION));
                liste.add(location);
            }
        }catch(Exception ex)
        {
            Log.e("ListLocation",ex.getMessage());
        }
        return liste;
    }

    public void delete(Location location) {
        int id = location.getId();
        db.delete(LocationContract.TABLE_LOCATION, LocationContract.NUM_COL_ID_LOCATION
                + " = " + id, null);
    }

    public int update(Location location)
    {
        ContentValues content = new ContentValues();
        content.put(String.valueOf(LocationContract.NUM_COL_lOUE_LOCATION), location.isLoue());
        content.put(String.valueOf(LocationContract.NUM_COL_DATEDEBUT_LOCATION),location.getDateDebut());
        content.put(String.valueOf(LocationContract.NUM_COL_DATEFIN_LOCATION),location.getDateFin());
        content.put(String.valueOf(LocationContract.NUM_COL_RENDU_LOCATION),location.getRendu());

        return db.update(LocationContract.TABLE_LOCATION, content, LocationContract.NUM_COL_ID_LOCATION + " = ?",
                new String[] { String.valueOf(location.getId()) });
    }
}
