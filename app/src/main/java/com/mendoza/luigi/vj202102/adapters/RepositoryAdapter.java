package com.mendoza.luigi.vj202102.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.mendoza.luigi.vj202102.R;
import com.mendoza.luigi.vj202102.entities.Repository;

import java.util.List;

public class RepositoryAdapter extends RecyclerView.Adapter<RepositoryAdapter.NameViewHolder> {

    private List<Repository> data;

    public RepositoryAdapter(List<Repository> data) {
        this.data = data;
    }

    @Override
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_name, parent, false);

        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NameViewHolder holder, int position) {



        TextView tvimagen= holder.itemView.findViewById(R.id.tximagen);


        TextView tvestrella = holder.itemView.findViewById(R.id.txestrella);
        Repository repo = data.get(position);
        tvimagen.setText(repo.getImagen());


        tvestrella.setText(repo.getEstrella());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class NameViewHolder extends RecyclerView.ViewHolder {

        public NameViewHolder(View itemView) {
            super(itemView);
        }
    }
}
