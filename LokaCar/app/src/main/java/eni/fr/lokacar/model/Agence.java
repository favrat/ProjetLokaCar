package eni.fr.lokacar.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 19/05/2017.
 */

public class Agence implements Parcelable {

    private int id;
    private String nom;
    private String ville;
    private int CodePostal;
    private double CA;

    public Agence() {
    }

    public Agence(String nom, String ville, int codePostal, double CA) {
        this.nom = nom;
        this.ville = ville;
        CodePostal = codePostal;
        this.CA = CA;
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCodePostal() {
        return CodePostal;
    }

    public void setCodePostal(int codePostal) {
        CodePostal = codePostal;
    }

    public double getCA() {
        return CA;
    }

    public void setCA(double CA) {
        this.CA = CA;
    }

    protected Agence(Parcel in) {
    }

    public static final Creator<Agence> CREATOR = new Creator<Agence>() {
        @Override
        public Agence createFromParcel(Parcel in) {
            return new Agence(in);
        }

        @Override
        public Agence[] newArray(int size) {
            return new Agence[size];
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
