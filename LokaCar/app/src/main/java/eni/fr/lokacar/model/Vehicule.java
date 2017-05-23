package eni.fr.lokacar.model;
/**
 * Created by Administrateur on 17/05/2017.
 */

public class Vehicule {

    private int num;
    private Marque marque;
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

    public Vehicule(String designation, String codeNationalIdentificationType, String typeVarianteVersion, String couleur, String prix) {
        this.designation = designation;
        this.codeNationalIdentificationType = codeNationalIdentificationType;
        this.typeVarianteVersion = typeVarianteVersion;
        this.couleur = couleur;
        this.prix = prix;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
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
}
