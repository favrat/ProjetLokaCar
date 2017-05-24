package eni.fr.lokacar.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by Administrateur on 19/05/2017.
 */

public class Location implements Parcelable {
    private int id;
    private String id_Client;
    private String imat_Vehicule;
    private int loue;
    private String dateDebut;
    private String dateFin;
    private int rendu;

    public Location() {
    }

    public Location(String id_Client, String imat_Vehicule, String dateDebut, String dateFin) {
        this.id_Client = id_Client;
        this.imat_Vehicule = imat_Vehicule;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Location(String id_Client, String imat_Vehicule, int loue, String dateDebut, String dateFin, int rendu) {
        this.id_Client = id_Client;
        this.imat_Vehicule = imat_Vehicule;
        this.loue = loue;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.rendu = rendu;
    }

    protected Location(Parcel in) {
        id = in.readInt();
    }

    public static final Creator<Location> CREATOR = new Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_Client() {
        return id_Client;
    }

    public void setId_Client(String id_Client) {
        this.id_Client = id_Client;
    }

    public String getImat_Vehicule() {
        return imat_Vehicule;
    }

    public void setImat_Vehicule(String imat_Vehicule) {
        this.imat_Vehicule = imat_Vehicule;
    }

    public int isLoue() {
        return loue;
    }

    public void setLoue(int loue) {
        this.loue = loue;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public int getRendu() {
        return rendu;
    }

    public void setRendu(int rendu) {
        this.rendu = rendu;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", id_Client=" + id_Client +
                ", imat_Vehicule=" + imat_Vehicule +
                ", loue=" + loue +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", rendu=" + rendu +
                '}';
    }
}
