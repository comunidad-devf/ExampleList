package com.icaboalo.examplelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Edgar Salvador Maurilio on 09/09/2015.
 */
public class MyAdapter extends ArrayAdapter<JusticeLeague> {

    private List<JusticeLeague> justiceLeagueList;
    private LayoutInflater inflater;

    public MyAdapter(Context context, int resource,
                     List<JusticeLeague> objects) {
        super(context, resource, objects);

        justiceLeagueList = objects;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = inflater.inflate(R.layout.list_row, parent, false);

            viewHolder = new ViewHolder(view, R.id.imageViewSuperHeroe,
                    R.id.textViewSuperHeroe);

            view.setTag(viewHolder);

        } else {
            view = convertView;

            viewHolder = (ViewHolder) view.getTag();
        }

        JusticeLeague justiceLeague = justiceLeagueList.get(position);

        viewHolder.setNombre(justiceLeague.getName());

        viewHolder.setImagen(justiceLeague.getImage());

        return view;
    }

    private static class ViewHolder {

        ImageView imageViewSuperHeroe;
        TextView textViewSuperHeroe;


        public ViewHolder(View itemView, int idImagenSuperHeroe,
                          int idTextViewSuperHeroe) {

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
