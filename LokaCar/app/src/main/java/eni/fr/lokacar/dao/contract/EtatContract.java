package eni.fr.lokacar.dao.contract;

import static eni.fr.lokacar.dao.contract.ClientContract.*;
import static eni.fr.lokacar.dao.contract.VehiculeContract.*;

/**
 * Created by afavrat2015 on 22/05/2017.
 */

public class EtatContract {

    public static final String TABLE_ETAT = " etat ";

    public static final String COL_ID_ETAT = " id ";
    public static final String COL_IMATVEHICULE_ETAT = " imatVehicule ";
    public static final String COL_IDCLIENT_ETAT = " idClient ";

    public static final int NUM_COL_ID_ETAT  = 0;
    public static final int NUM_COL_IMATVEHICULE_ETAT = 1;
    public static final int NUM_COL_IDCLIENT_ETAT  = 2;


    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS "
                    +TABLE_ETAT
                    + "("
                    + COL_ID_ETAT
                    + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COL_IMATVEHICULE_ETAT
                    + "INTEGER,"
                    + " FOREIGN KEY ("+COL_IMATVEHICULE_ETAT+") REFERENCES "+TABLE_VEHICULE+"("+COL_NUM_VEHICULE+"));"
                    + COL_IDCLIENT_ETAT
                    + "INTEGER,"
                    + " FOREIGN KEY ("+COL_IDCLIENT_ETAT+") REFERENCES "+TABLE_CLIENT+"("+COL_ID_CLIENT+"));"
                    + ");";

    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS "
                    + TABLE_ETAT;
}
