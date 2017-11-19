package com.example.league95.listviewapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a reference to list view.
        ListView listView = (ListView) findViewById(R.id.listView);
        //ArrayList
        List<String> friends = new ArrayList<>();
        //Add to list
        friends.add("Joe");
        friends.add("Franky");
        friends.add("Joe");
        friends.add("Franky");
        friends.add("Joe");
        friends.add("Franky");
        friends.add("Joe");
        friends.add("Franky");
        friends.add("Joe");
        friends.add("Franky");
        //Then create the adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friends);

        //Then we need to connect adapter to our list
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long id) {
                String friend = adapterView.getItemAtPosition(index).toString();
                Toast.makeText(MainActivity.this, "Friend: " + friend, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
