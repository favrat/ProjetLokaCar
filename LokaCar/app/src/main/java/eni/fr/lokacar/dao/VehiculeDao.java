package eni.fr.lokacar.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import eni.fr.lokacar.dao.contract.ClientContract;
import eni.fr.lokacar.dao.contract.VehiculeContract;
import eni.fr.lokacar.helper.GestionBddHelper;
<<<<<<< Updated upstream
import eni.fr.lokacar.model.Client;
=======
import eni.fr.lokacar.model.Marque;
>>>>>>> Stashed changes
import eni.fr.lokacar.model.Vehicule;

/**
 * Created by afavrat2015 on 22/05/2017.
 */

public class VehiculeDao {

    private SQLiteDatabase db;
    private GestionBddHelper helper;

    public VehiculeDao(Context context)
    {
        helper = new GestionBddHelper(context);
        db = helper.getWritableDatabase();
    }

    public long insert(Vehicule item)
    {
        ContentValues content = new ContentValues();
        content.put(VehiculeContract.COL_NUM_VEHICULE,item.getNum());
        content.put(VehiculeContract.COL_MARQUE_VEHICULE, String.valueOf(item.getMarque()));
        content.put(VehiculeContract.COL_MODELEDOSSIER_VEHICULE,item.getModeleDossier());
        content.put(VehiculeContract.COL_MODELECOMMERCIAL_VEHICULE,item.getModeleCommercial());
        content.put(VehiculeContract.COL_DESIGNATION_VEHICULE,item.getDesignation());
        content.put(VehiculeContract.COL_CNIT_VEHICULE,item.getCodeNationalIdentificationType());
        content.put(VehiculeContract.COL_VERSION_VEHICULE,item.getTypeVarianteVersion());
        content.put(VehiculeContract.COL_CARBURANT_VEHICULE,item.getCarburant());
        return db.insert(VehiculeContract.TABLE_VEHICULE,null,content);
    }
/*
    public List<Vehicule> get()
    {
        List<Vehicule> liste = new ArrayList<>();
        try {
            Cursor cursor = db.rawQuery("SELECT * FROM vehicule", null);
            while (cursor.moveToNext()) {
                Vehicule vehicule = new Vehicule();
                vehicule.setNum(cursor.getInt(VehiculeContract.NUM_COL_NUM_VEHICULE));
<<<<<<< Updated upstream
                //vehicule.setMarque(cursor.getClass(VehiculeContract.NUM_COL_MARQUE_VEHICULE));
=======
                vehicule.setMarque(cursor.getString(VehiculeContract.COL_MARQUE_VEHICULE));
>>>>>>> Stashed changes
                vehicule.setModeleDossier(cursor.getString(VehiculeContract.NUM_COL_MODELEDOSSIER_VEHICULE));
                vehicule.setModeleCommercial(cursor.getString(VehiculeContract.NUM_COL_MODELECOMMERCIAL_VEHICULE));
                vehicule.setDesignation(cursor.getString(VehiculeContract.NUM_COL_DESIGNATION_VEHICULE));
                vehicule.setCodeNationalIdentificationType(cursor.getString(VehiculeContract.NUM_COL_CNIT_VEHICULE));
                vehicule.setTypeVarianteVersion(cursor.getString(VehiculeContract.NUM_COL_VERSION_VEHICULE));
                vehicule.setCarburant(cursor.getString(VehiculeContract.NUM_COL_CARBURANT_VEHICULE));
                liste.add(vehicule);
            }
        }catch(Exception ex)
        {
            Log.e("ListVehicule",ex.getMessage());
        }
        return liste;
    }*/

    public void delete(Vehicule vehicule) {
        long id = vehicule.getNum();
        db.delete(VehiculeContract.TABLE_VEHICULE, VehiculeContract.NUM_COL_NUM_VEHICULE
                + " = " + id, null);
    }

    public int update(Vehicule vehicule)
    {
        ContentValues content = new ContentValues();
        content.put(String.valueOf(VehiculeContract.NUM_COL_MODELEDOSSIER_VEHICULE), vehicule.getModeleDossier());
        content.put(String.valueOf(VehiculeContract.NUM_COL_MODELECOMMERCIAL_VEHICULE), vehicule.getModeleCommercial());
        content.put(String.valueOf(VehiculeContract.NUM_COL_DESIGNATION_VEHICULE), vehicule.getDesignation());
        content.put(String.valueOf(VehiculeContract.NUM_COL_CNIT_VEHICULE), vehicule.getCodeNationalIdentificationType());
        content.put(String.valueOf(VehiculeContract.NUM_COL_VERSION_VEHICULE), vehicule.getTypeVarianteVersion());
        content.put(String.valueOf(VehiculeContract.NUM_COL_CARBURANT_VEHICULE), vehicule.getCarburant());

        return db.update(VehiculeContract.TABLE_VEHICULE, content, ClientContract.NUM_COL_ID_CLIENT + " = ?",
                new String[] { String.valueOf(vehicule.getNum()) });
    }
}
