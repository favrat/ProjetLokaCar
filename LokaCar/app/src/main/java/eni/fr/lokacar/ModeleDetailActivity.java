package eni.fr.lokacar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import eni.fr.lokacar.dao.VehiculeDao;
import eni.fr.lokacar.model.Vehicule;

public class ModeleDetailActivity extends AppCompatActivity {

    private Vehicule vehicule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modele_detail);
        Intent i = new Intent(ModeleDetailActivity.this, MainActivity.class);
        vehicule = getIntent().getParcelableExtra("vehicule");

        TextView tvModeleDetail = (TextView) findViewById(R.id.et_modeleDetail);
        tvModeleDetail.setText(vehicule.getDesignation());
        //TextView tvMarque = (TextView) findViewById(R.id.et_marque);
        //tvMarque.setText(vehicule.getMarque());
        TextView tvImmat = (TextView) findViewById(R.id.et_immatDetail);
        tvImmat.setText(vehicule.getCodeNationalIdentificationType());
        TextView tvCouleur = (TextView) findViewById(R.id.et_couleurDetail);
        tvCouleur.setText(vehicule.getCouleur());
        TextView tvPrix = (TextView) findViewById(R.id.et_prixDetail);
        tvPrix.setText(vehicule.getPrix());
        //i.putExtra("designation", String.valueOf(vehicule.getDesignation()));
        /*VehiculeDao dao = new VehiculeDao(this);
        final List<Vehicule> listeVehicule = dao.get();*/
        Toast.makeText(this, String.valueOf(vehicule.getDesignation()), Toast.LENGTH_SHORT).show();
    }
}
