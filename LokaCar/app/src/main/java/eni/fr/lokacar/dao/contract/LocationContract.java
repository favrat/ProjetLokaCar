package eni.fr.lokacar.dao.contract;

import static eni.fr.lokacar.dao.contract.ClientContract.*;
import static eni.fr.lokacar.dao.contract.VehiculeContract.*;

/**
 * Created by afavrat2015 on 22/05/2017.
 */

public class LocationContract {

    public static final String TABLE_LOCATION= " location ";

    public static final String COL_ID_LOCATION = " id ";
    public static final String COL_IDCLIENT_LOCATION = " idClient ";
    public static final String COL_IMATVEHICULE_LOCATION = " imatVehicule ";
    //public static final String COL_lOUE_LOCATION = " loue ";
    public static final String COL_DATEDEBUT_LOCATION = " dateDebut ";
    public static final String COL_DATEFIN_LOCATION = " dateFin ";
    //public static final String COL_RENDU_LOCATION = " rendu ";

    public static final int NUM_COL_ID_LOCATION  = 0;
    public static final int NUM_COL_IDCLIENT_LOCATION  = 1;
    public static final int NUM_COL_IMATVEHICULE_LOCATION = 2;
    //public static final int NUM_COL_lOUE_LOCATION = 3;
    public static final int NUM_COL_DATEDEBUT_LOCATION = 3;
    public static final int NUM_COL_DATEFIN_LOCATION = 4;
   // public static final int NUM_COL_RENDU_LOCATION = 6;

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS "
                    +TABLE_LOCATION
                    + "("
                    + COL_ID_LOCATION
                    + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COL_IDCLIENT_LOCATION
                    + "INTEGER,"
                    + " FOREIGN KEY ("+COL_IDCLIENT_LOCATION+") REFERENCES "+TABLE_CLIENT+"("+COL_ID_CLIENT+"),"
                    + COL_IMATVEHICULE_LOCATION
                    + "INTEGER,"
                    + " FOREIGN KEY ("+COL_IMATVEHICULE_LOCATION+") REFERENCES "+TABLE_VEHICULE+"("+COL_NUM_VEHICULE+"),"
                   // + COL_lOUE_LOCATION
                    // + "INTEGER"
                    + COL_DATEDEBUT_LOCATION
                    + "TEXT,"
                    + COL_DATEFIN_LOCATION
                    + "TEXT"
                   // + COL_RENDU_LOCATION
                    // + "INTEGER"
                    + ");";

    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS "
                    + TABLE_LOCATION;
}
