package com.opopona.optemis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchActivity extends AppCompatActivity {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        getTheme().applyStyle(new Preferences(this).getFontStyle().getResId(), true);

        // Find the ListView resource.
        mainListView = (ListView) findViewById( R.id.recentSearches );

        String[] searches = new String[] {  };
        ArrayList<String> searchesList = new ArrayList<String>();
        searchesList.addAll( Arrays.asList(searches) );

        searchesList.clear();
        listAdapter = new ArrayAdapter<String>(this, R.layout.simple_list_item, searchesList);

        // Add more planets. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.
        listAdapter.add( "Aseos" );
        listAdapter.add( "Puesto Información" );
        listAdapter.add( "Puerta 45" );

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter( listAdapter );
    }
}