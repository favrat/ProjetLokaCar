package eni.fr.lokacar.dao.contract;

/**
 * Created by mrobert2015 on 24/05/2017.
 */

public class MarqueContract {

    public static final String TABLE_MARQUE= " marque ";

    public static final String COL_NUM_MARQUE= " id ";
    public static final String COL_LIBELLE_MARQUE = " libelle" +
            " ";



    public static final int NUM_COL_NUM_MARQUE = 0;
    public static final int NUM_COL_LIBELLE_MARQUE = 1;
    //Etat

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS"
                    +TABLE_MARQUE
                    + "("
                    + COL_NUM_MARQUE
                    + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COL_LIBELLE_MARQUE
                    + "TEXT"
                    + ");";

    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS "
                    + TABLE_MARQUE;
}
