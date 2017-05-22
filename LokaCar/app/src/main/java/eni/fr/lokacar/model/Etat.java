package eni.fr.lokacar.model;

import android.os.Parcel;
import android.os.Parcelable;

import eni.fr.lokacar.model.Vehicule;

/**
 * Created by Administrateur on 19/05/2017.
 */

public class Etat implements Parcelable {
    private int id;
    private Vehicule imat_Vehicule;
    private Client id_Client;

    public Etat() {
    }
    public Etat(Vehicule imat_Vehicule, Client id_Client) {
        this.imat_Vehicule = imat_Vehicule;
        this.id_Client = id_Client;
    }

    protected Etat(Parcel in) {
    }

    public static final Creator<Etat> CREATOR = new Creator<Etat>() {
        @Override
        public Etat createFromParcel(Parcel in) {
            return new Etat(in);
        }

        @Override
        public Etat[] newArray(int size) {
            return new Etat[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicule getImat_Vehicule() {
        return imat_Vehicule;
    }

    public void setImat_Vehicule(Vehicule imat_Vehicule) {
        this.imat_Vehicule = imat_Vehicule;
    }

    public Client getId_Client() {
        return id_Client;
    }

    public void setId_Client(Client id_Client) {
        this.id_Client = id_Client;
    }

    @Override
    public String toString() {
        return "Etat{" +
                "id=" + id +
                ", imat_Vehicule=" + imat_Vehicule +
                ", id_Client=" + id_Client +
                '}';
    }
}
