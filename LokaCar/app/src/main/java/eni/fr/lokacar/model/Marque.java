package eni.fr.lokacar.model;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrateur on 17/05/2017.
 */

public class Marque implements Parcelable{

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String libelle;

    public Marque() {
    }

    public Marque(String libelle) {
        this.libelle = libelle;
    }

    public Marque(Parcel in) {
        libelle = in.readString();
    }

    public static final Creator<Marque> CREATOR = new Creator<Marque>() {
        @Override
        public Marque createFromParcel(Parcel in) {
            return new Marque(in);
        }

        @Override
        public Marque[] newArray(int size) {
            return new Marque[size];
        }
    };

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(libelle);
    }

}