package eni.fr.lokacar.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import eni.fr.lokacar.dao.contract.ClientContract;
import eni.fr.lokacar.dao.contract.LocationContract;
import eni.fr.lokacar.helper.GestionBddHelper;
import eni.fr.lokacar.model.Client;
import eni.fr.lokacar.model.Location;

/**
 * Created by afavrat2015 on 22/05/2017.
 */

public class ClientDao {

    private SQLiteDatabase db;
    private GestionBddHelper helper;

    public ClientDao(Context context)
    {
        helper = new GestionBddHelper(context);
        db = helper.getWritableDatabase();
    }

    public long insert(Client item)
    {

        /*    public static final String COL_ID_CLIENT = " id ";
    public static final String COL_NAME_CLIENT = " name ";
    public static final String COL_PRENOM_CLIENT = " prenom ";
    public static final String COL_EMAIL_CLIENT = " email ";*/

        ContentValues content = new ContentValues();
        content.put(ClientContract.COL_ID_CLIENT,item.getId());
        content.put(ClientContract.COL_NAME_CLIENT,item.getNom());
        content.put(ClientContract.COL_PRENOM_CLIENT,item.getPrenom());
        content.put(ClientContract.COL_EMAIL_CLIENT,item.getEmail());
        return db.insert(ClientContract.TABLE_CLIENT,null,content);
    }

    public List<Client> get()
    {
        List<Client> liste = new ArrayList<>();
        try {
            Cursor cursor = db.rawQuery("SELECT * FROM client", null);
            while (cursor.moveToNext()) {
                Client client = new Client();
                client.setId(cursor.getInt(ClientContract.NUM_COL_ID_CLIENT));
                client.setNom(cursor.getString(ClientContract.NUM_COL_NAME_CLIENT));
                client.setPrenom(cursor.getString(ClientContract.NUM_COL_PRENOM_CLIENT));
                client.setEmail(cursor.getString(ClientContract.NUM_COL_EMAIL_CLIENT));
                liste.add(client);
            }
        }catch(Exception ex)
        {
            Log.e("ListClient",ex.getMessage());
        }
        return liste;
    }

    public void delete(Client client) {
        int id = client.getId();
        db.delete(ClientContract.TABLE_CLIENT, ClientContract.NUM_COL_ID_CLIENT
                + " = " + id, null);
    }

    public int update(Client client)
    {
        ContentValues content = new ContentValues();
        content.put(String.valueOf(ClientContract.NUM_COL_NAME_CLIENT), client.getNom());
        content.put(String.valueOf(ClientContract.NUM_COL_PRENOM_CLIENT), client.getPrenom());
        content.put(String.valueOf(ClientContract.NUM_COL_EMAIL_CLIENT), client.getEmail());

        return db.update(ClientContract.TABLE_CLIENT, content, ClientContract.NUM_COL_ID_CLIENT + " = ?",
                new String[] { String.valueOf(client.getId()) });
    }
}
