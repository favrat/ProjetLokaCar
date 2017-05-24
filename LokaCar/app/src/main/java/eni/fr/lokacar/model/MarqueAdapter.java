package eni.fr.lokacar.model;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import eni.fr.lokacar.ModeleActivity;
import eni.fr.lokacar.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrateur on 18/05/2017.
 */
public class MarqueAdapter extends RecyclerView.Adapter<MarqueAdapter.MarqueHolder>{

    private List<Marque> listeMarque;

    public MarqueAdapter() {
        listeMarque=new ArrayList();
    }

    public List<Marque> getListeMarque() {
        return listeMarque;
    }

    public void setListeMarque(List<Marque> listeMarque) {
        this.listeMarque = listeMarque;
    }

    public static class MarqueHolder extends RecyclerView.ViewHolder{

        private TextView tvMarque;
        private Marque marque;

        public MarqueHolder(View itemView) {
            super(itemView);
            tvMarque = (TextView) itemView.findViewById(R.id.tv_main_marque);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Log.i("AUTO","CLic sur "+marque.getLibelle());
                    Intent intent=new Intent(view.getContext(), ModeleActivity.class);
                    intent.putExtra("marque",marque);
                    view.getContext().startActivity(intent);
                }
            });
        }

        public Marque getMarque() {
            return marque;
        }

        public void setMarque(Marque marque) {
            this.marque = marque;
        }

        public void bind(Marque marque) {
            if(marque != null) {
                tvMarque.setText(marque.getLibelle());
            }
        }
    }

    @Override
    public MarqueHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.marque, parent, false);
        return new MarqueHolder(view);
    }

    @Override
    public void onBindViewHolder(MarqueHolder holder, int position) {
        holder.bind(listeMarque.get(position));
        holder.setMarque(listeMarque.get(position));
    }

    @Override
    public int getItemCount() {
        return listeMarque.size();
    }

}
