package eni.fr.lokacar.dao.contract;

/**
 * Created by afavrat2015 on 22/05/2017.
 */

public class VehiculeContract {

    public static final String TABLE_VEHICULE = " vehicule ";

    public static final String COL_NUM_VEHICULE = " id ";
    public static final String COL_MARQUE_VEHICULE = " marque ";
    public static final String COL_DESIGNATION_VEHICULE = " designation ";
    public static final String COL_CNIT_VEHICULE = " CNIT ";
    public static final String COL_PRIX_VEHICULE = " prix ";
    public static final String COL_COULEUR_VEHICULE = " couleur ";
    public static final String COL_VERSION_VEHICULE = " typeVersion ";


    public static final int NUM_COL_NUM_VEHICULE = 0;
    public static final int NUM_COL_MARQUE_VEHICULE = 1;
    public static final int NUM_COL_DESIGNATION_VEHICULE = 1;
    public static final int NUM_COL_CNIT_VEHICULE = 2;
    public static final int NUM_COL_PRIX_VEHICULE = 3;
    public static final int NUM_COL_COULEUR_VEHICULE = 4;
    public static final int NUM_COL_VERSION_VEHICULE = 5;
    //Etat

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS"
                    +TABLE_VEHICULE
                    + "("
                    + COL_NUM_VEHICULE
                    + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COL_MARQUE_VEHICULE
                    + "TEXT,"
                    + COL_DESIGNATION_VEHICULE
                    + "TEXT,"
                    + COL_CNIT_VEHICULE
                    + "TEXT,"
                    + COL_PRIX_VEHICULE
                    + "TEXT,"
                    + COL_COULEUR_VEHICULE
                    + "TEXT,"
                    //Etat
                    + COL_VERSION_VEHICULE
                    + "TEXT"
                    + ");";

    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS "
                    + TABLE_VEHICULE;
}
