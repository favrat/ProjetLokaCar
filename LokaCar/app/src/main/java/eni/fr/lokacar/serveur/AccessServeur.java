package eni.fr.lokacar.serveur;

import android.os.AsyncTask;
import android.util.Log;

import eni.fr.lokacar.model.Marque;
import eni.fr.lokacar.model.MarqueAdapter;
import eni.fr.lokacar.model.Vehicule;
import eni.fr.lokacar.model.VehiculeAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrateur on 17/05/2017.
 */

public class AccessServeur {

    /**
     * Retourne la liste des marques présentes sur le serveur
     * directement dans la vue via l'objet ArrayAdapter
     */
    public static class TaskAllMarques extends AsyncTask<Void, Void, JSONArray> {
        private MarqueAdapter adapter;
        private List<Marque> listeMarques;

        public TaskAllMarques(MarqueAdapter adapter) {
            Log.i("AUTO", "Constructeur");
            this.adapter = adapter;
            listeMarques = new ArrayList();
        }

        @Override
        protected JSONArray doInBackground(Void... voids) {
            JSONArray resultat = null;

            try {
                String path = UrlServeur.getUrlMarques();
                Log.i("AUTO", "path : " + path);
                JSONObject jsonObject = new JSONObject(connect(path).toString());
                resultat = jsonObject.getJSONArray("Marque");
                Log.i("AUTO", "fin doInBackground()");

            } catch (Exception e) {
                e.printStackTrace();
            }

            return resultat;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.i("AUTO", "préexecution ok ");
        }

        @Override
        protected void onPostExecute(JSONArray jsonArray) {
            super.onPostExecute(jsonArray);
            try {
                for (int i = 0; i < jsonArray.length(); i++) {
                    Marque marque = new Marque();
                    marque.setLibelle(jsonArray.getString(i));
                    listeMarques.add(marque);
                }
                adapter.setListeMarque(listeMarques);
                adapter.notifyDataSetChanged();

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public List<Marque> getListeMarques() {
            return listeMarques;
        }
    }


    public static class TaskAllModelesByMarque extends AsyncTask<Marque, Void, JSONArray> {
        private VehiculeAdapter adapter;
        private List<Vehicule> listeVehicules;

        public TaskAllModelesByMarque(VehiculeAdapter adapter) {
            Log.i("AUTO", "Constructeur");
            this.adapter = adapter;
            listeVehicules = new ArrayList();
        }

        @Override
        protected JSONArray doInBackground(Marque... marques) {
            Log.i("AUTO", "doInBackground()");
            JSONArray resultat = null;

            try {
                String path = UrlServeur.getUrlModelesByMarque();
                path += marques[0].getLibelle();
                Log.i("AUTO", "path : " + path);
                resultat =new JSONArray(connect(path).toString().split(","));
                Log.i("JSONARRAY", String.valueOf(resultat));

            } catch (Exception e) {
                e.printStackTrace();
            }

            return resultat;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.i("AUTO", "préexecution ok ");
        }

        protected void onPostExecute(JSONArray jsonArray) {
            super.onPostExecute(jsonArray);
            try {
                for (int i = 0; i < jsonArray.length(); i++) {
                    Vehicule vehicule = new Vehicule();
                    String json = jsonArray.getString(1).replace('"',' ');
                    String[] res = json.split(":");

                    vehicule.setDesignation(res[1]);

                   // Log.i("Vehicule",jsonArray.getString(1));
                    listeVehicules.add(vehicule);
                }
                adapter.setListeVehicules(listeVehicules);
                adapter.notifyDataSetChanged();

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public List<Vehicule> getListeVehicules() {
            return listeVehicules;
        }
    }

    /**
     * Méthode opérant la connexion au serveur et gérant les erreurs
     * retourne un JSONObject qu'il conviendra de parser par la suite
     */
    private static StringBuilder connect(String path) {
        Log.i("AUTO", "connect()");
        JSONObject jsonObject = null;
        StringBuilder builder = new StringBuilder();
        try {

            URL url = new URL(path);
            Log.i("AUTO", "URL ok");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            Log.i("AUTO", "connection ouverte");

            InputStream is = connection.getInputStream();
            Log.i("AUTO", "stream ouvert");

            InputStreamReader reader = new InputStreamReader(is);
            Log.i("AUTO", "reader ouvert");

            int inChar;
            while ((inChar = reader.read()) != -1) {
                builder.append((char) inChar);
            }
            Log.i("AUTO", "lecture finie");
            connection.disconnect();
            Log.i("AUTO", "connection fermée");

        } catch (Exception e) {
            Log.e("AUTO", e.getMessage());
        }
        Log.i("AUTO", "fin connect");
        return builder;
    }


}
