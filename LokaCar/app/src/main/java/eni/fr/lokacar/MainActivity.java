package eni.fr.lokacar;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import eni.fr.lokacar.model.MarqueAdapter;
import eni.fr.lokacar.serveur.AccessServeur;

public class MainActivity extends AppCompatActivity {

    private MarqueAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adapter = new MarqueAdapter();

        AccessServeur.TaskAllMarques task= new AccessServeur.TaskAllMarques(adapter);

        task.execute();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rv_main);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(adapter);

    }
}
