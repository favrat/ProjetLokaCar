package eni.fr.lokacar.dao.contract;

/**
 * Created by afavrat2015 on 22/05/2017.
 */

public class VehiculeContract {

    public static final String TABLE_VEHICULE = " vehicule ";

    public static final String COL_NUM_VEHICULE = " id ";
    public static final String COL_MARQUE_VEHICULE = " marque ";
    public static final String COL_MODELEDOSSIER_VEHICULE = " modeleDossier ";
    public static final String COL_MODELECOMMERCIAL_VEHICULE = " modeleCommercial ";
    public static final String COL_DESIGNATION_VEHICULE = " designation ";
    public static final String COL_CNIT_VEHICULE = " CNIT ";
    public static final String COL_VERSION_VEHICULE = " typeVersion ";
    public static final String COL_CARBURANT_VEHICULE = " carburant ";

    public static final int NUM_COL_NUM_VEHICULE = 0;
    public static final int NUM_COL_MARQUE_VEHICULE = 1;
    public static final int NUM_COL_MODELEDOSSIER_VEHICULE = 2;
    public static final int NUM_COL_MODELECOMMERCIAL_VEHICULE = 3;
    public static final int NUM_COL_DESIGNATION_VEHICULE = 4;
    public static final int NUM_COL_CNIT_VEHICULE = 5;
    public static final int NUM_COL_VERSION_VEHICULE = 6;
    public static final int NUM_COL_CARBURANT_VEHICULE = 7;

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS "
                    +TABLE_VEHICULE
                    + "("
                    + COL_NUM_VEHICULE
                    + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COL_MARQUE_VEHICULE
                    + "TEXT,"
                    + COL_MODELEDOSSIER_VEHICULE
                    + "TEXT,"
                    + COL_MODELECOMMERCIAL_VEHICULE
                    + "TEXT"
                    + COL_DESIGNATION_VEHICULE
                    + "TEXT"
                    + COL_CNIT_VEHICULE
                    + "TEXT"
                    + COL_VERSION_VEHICULE
                    + "TEXT"
                    + COL_CARBURANT_VEHICULE
                    + "TEXT"
                    + ");";

    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS "
                    + TABLE_VEHICULE;
}
