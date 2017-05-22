package eni.fr.lokacar.serveur;

import android.util.Log;

/**
 * Created by Administrateur on 17/05/2017.
 */

public abstract class UrlServeur {

    private static final String urlMarques ="MarqueServlet";
    private static final String urlModelesByMarque="ModeleServlet?marque=";
    private static final String urlModele="DetailsModeleServlet?cnit=";

    public static String getUrlMarques() {
        Log.i("URL","urlMarques = "+ eni.fr.lokacar.serveur.ParametresServeur.getMainUrl()+ urlMarques);
        return ParametresServeur.getMainUrl()+ urlMarques;
    }

    public static String getUrlModelesByMarque() {
        Log.i("URL","urlModelesByMarque = "+ParametresServeur.getMainUrl()+urlModelesByMarque);
        return ParametresServeur.getMainUrl()+urlModelesByMarque;
    }

    public static String getUrlModele() {
        Log.i("URL","urlModele = "+ParametresServeur.getMainUrl()+urlModele);
        return ParametresServeur.getMainUrl()+urlModele;
    }
}
