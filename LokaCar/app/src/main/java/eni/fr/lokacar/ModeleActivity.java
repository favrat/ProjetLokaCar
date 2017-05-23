package eni.fr.lokacar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import eni.fr.lokacar.model.Marque;
import eni.fr.lokacar.model.VehiculeAdapter;
import eni.fr.lokacar.serveur.AccessServeur;

public class ModeleActivity extends AppCompatActivity {

    private VehiculeAdapter adapter;
    private Marque marque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modele);

        marque=getIntent().getParcelableExtra("marque");

        adapter = new VehiculeAdapter();

        AccessServeur.TaskAllModelesByMarque task= new AccessServeur.TaskAllModelesByMarque(adapter);

        task.execute(marque);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rv_modeles);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(adapter);
    }
}
