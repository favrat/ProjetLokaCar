package eni.fr.lokacar;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import eni.fr.lokacar.model.MarqueAdapter;
import eni.fr.lokacar.serveur.AccessServeur;

public class MainActivity extends AppCompatActivity {

    private MarqueAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adapter = new MarqueAdapter();

        AccessServeur.TaskAllMarques task= new AccessServeur.TaskAllMarques(adapter, this);

        task.execute();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rv_main);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(adapter);

    }

    public void onClickBtnAddVehicule(View view) {
        Intent intent=new Intent(this, FormVehiculeActivity.class);
        view.getContext().startActivity(intent);
    }
}
