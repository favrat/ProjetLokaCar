package eni.fr.lokacar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        vehicule=getIntent().getParcelableExtra("vehicule");
        VehiculeDao dao = new VehiculeDao(this);
        final List<Vehicule> listeVehicule = dao.get();
        Toast.makeText(this, String.valueOf(vehicule.getMarque()), Toast.LENGTH_SHORT).show();
    }
}
