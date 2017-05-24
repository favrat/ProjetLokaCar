package eni.fr.lokacar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import eni.fr.lokacar.dao.LocationDao;
import eni.fr.lokacar.dao.VehiculeDao;
import eni.fr.lokacar.model.Location;
import eni.fr.lokacar.model.Vehicule;

public class LocationActivity extends AppCompatActivity {

    EditText etClient = null;
    EditText etImat = null;
    EditText etDateDebut = null;
    EditText etDateFin = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }

    public void onClickBtnInsertLocation(View view) {
        etClient = (EditText) findViewById(R.id.et_locationIdClient);
        etImat = (EditText) findViewById(R.id.et_locationImatVehicule);
        etDateDebut = (EditText) findViewById(R.id.et_locationDateDebut);
        etDateFin = (EditText) findViewById(R.id.et_locationDateFin);

        Location location = new Location(
                String.valueOf(etClient.getText()),
                String.valueOf(etImat.getText()),
                String.valueOf(etDateDebut.getText()),
                String.valueOf(etDateFin.getText()));

        LocationDao dao = new LocationDao(this);
        long id = 1;
        try {
            id = dao.insert(location);
            Intent intention = new Intent(this,MainActivity.class);
            startActivity(intention);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Toast.makeText(this, "Insert Ok : " + id, Toast.LENGTH_LONG).show();
    }
}
