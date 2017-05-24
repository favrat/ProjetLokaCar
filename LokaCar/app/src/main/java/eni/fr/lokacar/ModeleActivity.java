package eni.fr.lokacar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import eni.fr.lokacar.dao.VehiculeDao;
import eni.fr.lokacar.model.Marque;
import eni.fr.lokacar.model.Vehicule;
import eni.fr.lokacar.model.VehiculeAdapter;
import eni.fr.lokacar.serveur.AccessServeur;

public class ModeleActivity extends AppCompatActivity {

    private VehiculeAdapter adapter;
    private Marque marque;
    private TextView tvMarque;

    public void onItemClickListener(Vehicule vehicule){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modele);

        marque=getIntent().getParcelableExtra("marque");

        adapter = new VehiculeAdapter();

        AccessServeur.TaskAllModelesByMarque task= new AccessServeur.TaskAllModelesByMarque(adapter);

        task.execute(marque);

        Toast.makeText(this, String.valueOf(marque.getLibelle()), Toast.LENGTH_SHORT).show();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rv_modeles);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(adapter);
    }
}
