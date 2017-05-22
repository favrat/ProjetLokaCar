package eni.fr.lokacar.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 19/05/2017.
 */

public class Gerant implements Parcelable {
    private int id;
    private String nom;
    private String prenom;

    public Gerant() {
    }

    public Gerant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    protected Gerant(Parcel in) {
    }

    public static final Creator<Gerant> CREATOR = new Creator<Gerant>() {
        @Override
        public Gerant createFromParcel(Parcel in) {
            return new Gerant(in);
        }

        @Override
        public Gerant[] newArray(int size) {
            return new Gerant[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
