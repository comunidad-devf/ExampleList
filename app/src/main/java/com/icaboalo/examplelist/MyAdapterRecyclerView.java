package com.icaboalo.examplelist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.ref.PhantomReference;
import java.util.List;

/**
 * Created by Edgar Salvador Maurilio on 10/09/2015.
 */
public class MyAdapterRecyclerView extends
        RecyclerView.Adapter<MyAdapterRecyclerView.ViewHolder>{

    private List<JusticeLeague> justiceLeagueList;
    private LayoutInflater inflater;

    public MyAdapterRecyclerView(Context context, List<JusticeLeague> justiceLeagueList) {
        this.justiceLeagueList = justiceLeagueList;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_row, parent, false);

        ViewHolder viewHolder = new ViewHolder(view, R.id.imageViewSuperHeroe,
                R.id.textViewSuperHeroe);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        JusticeLeague justiceLeague = justiceLeagueList.get(position);

        holder.setNombre(justiceLeague.getName());
        holder.setImagen(justiceLeague.getImage());

    }

    @Override
    public int getItemCount() {
        return justiceLeagueList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewSuperHeroe;
        TextView textViewSuperHeroe;


        public ViewHolder(View itemView, int idImagenSuperHeroe,
                          int idTextViewSuperHeroe) {

            super(itemView);
            imageViewSuperHeroe = (ImageView) itemView.findViewById(idImagenSuperHeroe);

            textViewSuperHeroe = (TextView) itemView.findViewById(idTextViewSuperHeroe);

        }

        public void setNombre(String nombre) {
            textViewSuperHeroe.setText(nombre);
        }

        public void setImagen(int resourceImage) {
            imageViewSuperHeroe.setImageResource(resourceImage);
        }
    }

}
