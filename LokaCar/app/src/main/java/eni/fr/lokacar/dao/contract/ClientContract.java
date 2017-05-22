package eni.fr.lokacar.dao.contract;

/**
 * Created by afavrat2015 on 22/05/2017.
 */

public class ClientContract {

    public static final String TABLE_CLIENT = " client ";

    public static final String COL_ID_CLIENT = " id ";
    public static final String COL_NAME_CLIENT = " name ";
    public static final String COL_PRENOM_CLIENT = " prenom ";
    public static final String COL_EMAIL_CLIENT = " email ";

    public static final int NUM_COL_ID_CLIENT = 0;
    public static final int NUM_COL_NAME_CLIENT = 1;
    public static final int NUM_COL_PRENOM_CLIENT = 2;
    public static final int NUM_COL_EMAIL_CLIENT = 3;

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS "
                    +TABLE_CLIENT
                    + "("
                    + COL_ID_CLIENT
                    + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COL_NAME_CLIENT
                    + "TEXT,"
                    + COL_PRENOM_CLIENT
                    + "TEXT,"
                    + COL_EMAIL_CLIENT
                    + "TEXT"
                    + ");";

    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS "
                    + TABLE_CLIENT;
}
