package com.icaboalo.examplelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    private final static String[] Paises = {"Mexico", "Alemania", "España", "Colombia", "Argentina", "Belgica", "Rumania", "Portugal", "Francia", "Estados Unidos"};
    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.my_listview);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,
//                                                          android.R.layout.simple_list_item_1,
//                                                          Paises);

        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_row,
                createJusticeLeague());


        myListView.setAdapter(myAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
    {
        Toast.makeText(this, position+"", Toast.LENGTH_SHORT).show();
    }

    private List<JusticeLeague> createJusticeLeague(){

        List<JusticeLeague> myListJusticeLeague = new ArrayList<>();
        myListJusticeLeague.add(new JusticeLeague("Flash", R.drawable.the_flash_logo));
        myListJusticeLeague.add(new JusticeLeague("Green Arrow", R.drawable.green_arrow_logo));
        myListJusticeLeague.add(new JusticeLeague("Green Lantern", R.drawable.green_lantern_logo));
        myListJusticeLeague.add(new JusticeLeague("Batman", R.drawable.batman_logo));
        return myListJusticeLeague;
    }
}
