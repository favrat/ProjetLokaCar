package eni.fr.lokacar.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by Administrateur on 19/05/2017.
 */

public class Location implements Parcelable {
    private int id;
    private Client id_Client;
    private Vehicule imat_Vehicule;
    private boolean loue;
    private Date dateDebut;
    private Date dateFin;
    private Boolean rendu;

    public Location() {
    }

    public Location(Client id_Client, Vehicule imat_Vehicule, boolean loue, Date dateDebut, Date dateFin, Boolean rendu) {
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

    public Client getId_Client() {
        return id_Client;
    }

    public void setId_Client(Client id_Client) {
        this.id_Client = id_Client;
    }

    public Vehicule getImat_Vehicule() {
        return imat_Vehicule;
    }

    public void setImat_Vehicule(Vehicule imat_Vehicule) {
        this.imat_Vehicule = imat_Vehicule;
    }

    public boolean isLoue() {
        return loue;
    }

    public void setLoue(boolean loue) {
        this.loue = loue;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Boolean getRendu() {
        return rendu;
    }

    public void setRendu(Boolean rendu) {
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
