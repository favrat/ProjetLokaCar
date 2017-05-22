package eni.fr.lokacar.serveur;

/**
 * Created by Administrateur on 17/05/2017.
 */

public abstract class ParametresServeur {

    private static final String protocoleServeur="http://";
    private static final String ipServeur="10.147.0.254:";
    private static final String portServeur="8080/";
    private static final String dirServeur="BeDeveloper/";


    public static String getProtocoleServeur() {
        return protocoleServeur;
    }

    public static String getIpServeur() {
        return ipServeur;
    }

    public static String getPortServeur() {
        return portServeur;
    }

    public static String getDirServeur() {
        return dirServeur;
    }

    public static String getMainUrl()
    {
        return protocoleServeur+ipServeur+portServeur+dirServeur;
    }
}
