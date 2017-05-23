package eni.fr.lokacar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import eni.fr.lokacar.dao.VehiculeDao;
import eni.fr.lokacar.model.Vehicule;

public class FormVehiculeActivity extends AppCompatActivity {

    EditText etMarque = null;
    EditText etModele = null;
    EditText etTypeVehicule = null;
    EditText etCouleur = null;
    EditText etimmat = null;
    //Spinner spEtat = null;
    EditText etPrix = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_vehicule);

        Spinner dropdown = (Spinner)findViewById(R.id.sp_etat);
        String[] items = new String[]{"Mauvais", "Moyen", "Bon", "Tres bon"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }

    public void onClickBtnAddVehiculeForm(View view) {
        etMarque = (EditText) findViewById(R.id.et_marque);
        etModele = (EditText) findViewById(R.id.et_modele);
        etTypeVehicule = (EditText) findViewById(R.id.et_type_vehicule);
        etCouleur = (EditText) findViewById(R.id.et_couleur);
        etimmat = (EditText) findViewById(R.id.et_immat);
        //spEtat = (Spinner) findViewById(R.id.sp_etat);
        etPrix = (EditText) findViewById(R.id.et_prix);

        Vehicule vehicule = new Vehicule(
                                         String.valueOf(etModele.getText()),
                                         String.valueOf(etTypeVehicule.getText()),
                                         String.valueOf(etCouleur.getText()),
                                         String.valueOf(etimmat.getText()),
                                         //String.valueOf(spEtat.getSelectedItem().toString()),
                                         String.valueOf(etPrix.getText()));
        VehiculeDao dao = new VehiculeDao(this);
        long id = 1;
        try {
            id = dao.insert(vehicule);
            Intent intention = new Intent(this,MainActivity.class);
            startActivity(intention);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Toast.makeText(this, "Insert Ok : " + id, Toast.LENGTH_LONG).show();
    }
}
