package eni.fr.lokacar.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrateur on 17/05/2017.
 */

public class Vehicule implements Parcelable {

    private int num;
    private String marque;
    private String modeleDossier;
    private String modeleCommercial;
    private String designation;
    private String codeNationalIdentificationType;
    private String typeVarianteVersion;
    private String carburant;
    private String couleur;
    private String prix;
    /**
     * transmis au format String en français
     * ('oui'/'non')
     */
    private Boolean hybride;
    private int puissanceAdministrative;
    private int puissanceMaximale;
    private String boiteDeVitesse;
    private int consommationUrbaine;
    private int consommationMixte;
    private int consommationExtraUrbaine;
    private int emissionCo2;
    private int essaiCO2;
    private int essaiHC;
    private int essaiNox;
    private int essaiHCNOX;
    private int essaiParticule;
    private int masseMini;
    private int masseMaxi;
    private String champV9;
    private String dateMiseAjour;
    /**
     * Transmis au format String
     * (value de l'enum Carosserie)
     */
    private String carrosserie;
    /**
     * Transmis au format String
     * (value de l'enum Gamme)
     */

    public Vehicule() {
    }

    public Vehicule(String marque) {
        this.marque = marque;
    }

    public Vehicule(String marque, String designation, String codeNationalIdentificationType, String typeVarianteVersion, String couleur, String prix) {
        this.marque = marque;
        this.designation = designation;
        this.codeNationalIdentificationType = codeNationalIdentificationType;
        this.typeVarianteVersion = typeVarianteVersion;
        this.couleur = couleur;
        this.prix = prix;
    }

    protected Vehicule(Parcel in) {
        num = in.readInt();
        marque = in.readString();
        modeleDossier = in.readString();
        modeleCommercial = in.readString();
        designation = in.readString();
        codeNationalIdentificationType = in.readString();
        typeVarianteVersion = in.readString();
        carburant = in.readString();
        couleur = in.readString();
        prix = in.readString();
        puissanceAdministrative = in.readInt();
        puissanceMaximale = in.readInt();
        boiteDeVitesse = in.readString();
        consommationUrbaine = in.readInt();
        consommationMixte = in.readInt();
        consommationExtraUrbaine = in.readInt();
        emissionCo2 = in.readInt();
        essaiCO2 = in.readInt();
        essaiHC = in.readInt();
        essaiNox = in.readInt();
        essaiHCNOX = in.readInt();
        essaiParticule = in.readInt();
        masseMini = in.readInt();
        masseMaxi = in.readInt();
        champV9 = in.readString();
        dateMiseAjour = in.readString();
        carrosserie = in.readString();
    }

    public static final Creator<Vehicule> CREATOR = new Creator<Vehicule>() {
        @Override
        public Vehicule createFromParcel(Parcel in) {
            return new Vehicule(in);
        }

        @Override
        public Vehicule[] newArray(int size) {
            return new Vehicule[size];
        }
    };

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModeleDossier() {
        return modeleDossier;
    }

    public void setModeleDossier(String modeleDossier) {
        this.modeleDossier = modeleDossier;
    }

    public String getModeleCommercial() {
        return modeleCommercial;
    }

    public void setModeleCommercial(String modeleCommercial) {
        this.modeleCommercial = modeleCommercial;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCodeNationalIdentificationType() {
        return codeNationalIdentificationType;
    }

    public void setCodeNationalIdentificationType(String codeNationalIdentificationType) {
        this.codeNationalIdentificationType = codeNationalIdentificationType;
    }

    public String getTypeVarianteVersion() {
        return typeVarianteVersion;
    }

    public void setTypeVarianteVersion(String typeVarianteVersion) {
        this.typeVarianteVersion = typeVarianteVersion;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public Boolean getHybride() {
        return hybride;
    }

    public String getAffichageHybride() {
        return hybride?"oui":"non";
    }

    public void setHybride(Boolean hybride) {
        this.hybride = hybride;
    }

    public int getPuissanceAdministrative() {
        return puissanceAdministrative;
    }

    public void setPuissanceAdministrative(int puissanceAdministrative) {
        this.puissanceAdministrative = puissanceAdministrative;
    }

    public int getPuissanceMaximale() {
        return puissanceMaximale;
    }

    public String getPuissanceMaximaleToString() {
        return puissanceMaximale+"KW";
    }

    public void setPuissanceMaximale(int puissanceMaximale) {
        this.puissanceMaximale = puissanceMaximale;
    }

    public String getBoiteDeVitesse() {
        return boiteDeVitesse;
    }

    public void setBoiteDeVitesse(String boiteDeVitesse) {
        this.boiteDeVitesse = boiteDeVitesse;
    }

    public int getConsommationUrbaine() {
        return consommationUrbaine;
    }

    public String getConsommationUrbaineToString() {
        return consommationUrbaine+"L/100Km";
    }

    public void setConsommationUrbaine(int consommationUrbaine) {
        this.consommationUrbaine = consommationUrbaine;
    }

    public int getConsommationMixte() {
        return consommationMixte;
    }

    public String getConsommationMixteToString() {
        return consommationMixte+"L/100Km";
    }

    public void setConsommationMixte(int consommationMixte) {
        this.consommationMixte = consommationMixte;
    }

    public int getConsommationExtraUrbaine() {
        return consommationExtraUrbaine;
    }

    public String getConsommationExtraUrbaineToString() {
        return consommationExtraUrbaine+"L/100Km";
    }

    public void setConsommationExtraUrbaine(int consommationExtraUrbaine) {
        this.consommationExtraUrbaine = consommationExtraUrbaine;
    }

    public int getEmissionCo2() {
        return emissionCo2;
    }

    public String getEmissionCo2ToString() {
        return emissionCo2+"g/100KM";
    }

    public void setEmissionCo2(int emissionCo2) {
        this.emissionCo2 = emissionCo2;
    }

    public int getEssaiCO2() {
        return essaiCO2;
    }

    public String getEssaiCO2ToString() {
        return essaiCO2+"g/100KM";
    }

    public void setEssaiCO2(int essaiCO2) {
        this.essaiCO2 = essaiCO2;
    }

    public int getEssaiHC() {
        return essaiHC;
    }

    public String getEssaiHCToString() {
        return essaiHC+"g/100km";
    }

    public void setEssaiHC(int essaiHC) {
        this.essaiHC = essaiHC;
    }

    public int getEssaiNox() {
        return essaiNox;
    }

    public String getEssaiNoxToString() {
        return essaiNox+"g/100km";
    }

    public void setEssaiNox(int essaiNox) {
        this.essaiNox = essaiNox;
    }

    public int getEssaiHCNOX() {
        return essaiHCNOX;
    }

    public String getEssaiHCNOXToString() {
        return essaiHCNOX+"g/100km";
    }

    public void setEssaiHCNOX(int essaiHCNOX) {
        this.essaiHCNOX = essaiHCNOX;
    }

    public int getEssaiParticule() {
        return essaiParticule;
    }

    public String getEssaiParticuleToString() {
        return essaiParticule+"g/100km";
    }

    public void setEssaiParticule(int essaiParticule) {
        this.essaiParticule = essaiParticule;
    }

    public int getMasseMini() {
        return masseMini;
    }

    public String getMasseMiniToString() {
        return masseMini+"kg";
    }

    public void setMasseMini(int masseMini) {
        this.masseMini = masseMini;
    }

    public int getMasseMaxi() {
        return masseMaxi;
    }

    public String getMasseMaxiToString() {
        return masseMaxi+"kg";
    }

    public void setMasseMaxi(int masseMaxi) {
        this.masseMaxi = masseMaxi;
    }

    public String getChampV9() {
        return champV9;
    }

    public void setChampV9(String champV9) {
        this.champV9 = champV9;
    }

    public String getDateMiseAjour() {
        return dateMiseAjour;
    }

    public void setDateMiseAjour(String dateMiseAjour) {
        this.dateMiseAjour = dateMiseAjour;
    }

    public String getCarrosserie() {
        return carrosserie;
    }

    public void setCarrosserie(String carrosserie) {
        this.carrosserie = carrosserie;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(num);
        parcel.writeString(marque);
        parcel.writeString(modeleDossier);
        parcel.writeString(modeleCommercial);
        parcel.writeString(designation);
        parcel.writeString(codeNationalIdentificationType);
        parcel.writeString(typeVarianteVersion);
        parcel.writeString(carburant);
        parcel.writeString(couleur);
        parcel.writeString(prix);
        parcel.writeInt(puissanceAdministrative);
        parcel.writeInt(puissanceMaximale);
        parcel.writeString(boiteDeVitesse);
        parcel.writeInt(consommationUrbaine);
        parcel.writeInt(consommationMixte);
        parcel.writeInt(consommationExtraUrbaine);
        parcel.writeInt(emissionCo2);
        parcel.writeInt(essaiCO2);
        parcel.writeInt(essaiHC);
        parcel.writeInt(essaiNox);
        parcel.writeInt(essaiHCNOX);
        parcel.writeInt(essaiParticule);
        parcel.writeInt(masseMini);
        parcel.writeInt(masseMaxi);
        parcel.writeString(champV9);
        parcel.writeString(dateMiseAjour);
        parcel.writeString(carrosserie);
    }
}
