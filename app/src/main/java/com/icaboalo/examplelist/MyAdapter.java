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
public class MyAdapter extends ArrayAdapter<JusticeLeague>{

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

        View view = inflater.inflate(R.layout.list_row, parent, false);

        ImageView imageViewSuperHeroe = (ImageView) view.findViewById(R.id.imageViewSuperHeroe);
        TextView textViewSuperHeroe = (TextView) view.findViewById(R.id.textViewSuperHeroe);

        JusticeLeague justiceLeague = justiceLeagueList.get(position);

        imageViewSuperHeroe.setImageResource(justiceLeague.getImage());
        textViewSuperHeroe.setText(justiceLeague.getName());

        return view;
    }
}
