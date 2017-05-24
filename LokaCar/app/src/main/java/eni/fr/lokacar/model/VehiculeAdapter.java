package eni.fr.lokacar.model;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import eni.fr.lokacar.ModeleDetailActivity;
import eni.fr.lokacar.R;

public class VehiculeAdapter extends RecyclerView.Adapter<VehiculeAdapter.VehiculeHolder>{

    private List<Vehicule> listeVehicules;
    public VehiculeAdapter() {
        listeVehicules=new ArrayList();
    }

    public static class VehiculeHolder extends RecyclerView.ViewHolder {

        private TextView tvVehicule;
        private Vehicule vehicule;
        private Marque marque;

        public VehiculeHolder(View itemView) {
            super(itemView);
            tvVehicule= (TextView) itemView.findViewById(R.id.tv_main_vehicule);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i("VEHICULE", "CLic sur " + marque.getLibelle());
                    Intent intent=new Intent(view.getContext(), ModeleDetailActivity.class);
                    intent.putExtra("vehicule",vehicule);
                    view.getContext().startActivity(intent);
                }
            });
        }

        public Vehicule getVehicule() {
            return vehicule;
        }

        public void setVehicule(Vehicule vehicule) {
            this.vehicule = vehicule;
        }

        public void bind(Vehicule vehicule) {
            if (vehicule != null) {
                tvVehicule.setText(vehicule.getDesignation());
            }
        }
    }

    public List<Vehicule> getListeVehicules() {
        return listeVehicules;
    }

    public void setListeVehicules(List<Vehicule> listeVehicules) {
        this.listeVehicules = listeVehicules;
    }

    @Override
    public VehiculeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vehicule_main, parent, false);
        return new VehiculeHolder(view);
    }

    @Override
    public void onBindViewHolder(VehiculeHolder holder, int position) {
        holder.bind(listeVehicules.get(position));
        holder.setVehicule(listeVehicules.get(position));
    }

    @Override
    public int getItemCount() {
        return listeVehicules.size();
    }


}