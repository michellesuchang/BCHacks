package com.example.user.myfirstapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView Name;

    private Friend myFriend;

    Spinner myFriendContianer;

    private ArrayList<Friend> myFriendList = new ArrayList<Friend>();

    private String[] myFriendNamesList = new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        myFriend = new Friend("Bob");


        myFriendList.add(new Friend("Bob"));
        myFriendList.add(new Friend("Steve"));
        myFriendList.add(new Friend("Kevin"));
        myFriendList.add(new Friend("Jill"));
        myFriendList.add(new Friend("Emilia"));
        myFriendList.add(new Friend("Witney"));
        myFriendList.add(new Friend("Brintey"));
        myFriendList.add(new Friend("Ashly"));
        myFriendList.add(new Friend("Richard"));
        myFriendList.add(new Friend("Jeffry"));
        myFriendList.add(new Friend("Bob"));
        myFriendList.add(new Friend("Steve"));
        myFriendList.add(new Friend("Kevin"));
        myFriendList.add(new Friend("Jill"));
        myFriendList.add(new Friend("Emilia"));
        myFriendList.add(new Friend("Witney"));
        myFriendList.add(new Friend("Brintey"));
        myFriendList.add(new Friend("Ashly"));
        myFriendList.add(new Friend("Richard"));
        myFriendList.add(new Friend("Jeffry"));

        for (int i = 0; i < myFriendList.size(); i++) {
            myFriendNamesList[i] = myFriendList.get(i).getName();
        }


        Spinner FriendContainer = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, myFriendNamesList);
        FriendContainer.setAdapter(adapter);


        final TextView nameText = (TextView) findViewById(R.id.textView2);
        final TextView levelText = (TextView) findViewById(R.id.textView5);
        String temp = Integer.toString(myFriend.getPoints());
        nameText.setText(myFriend.getName());
        levelText.setText(temp);


        FriendContainer.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Friend temp = myFriendList.get(position);
                nameText.setText(temp.getName());
                levelText.setText(Integer.toString(temp.getPoints()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private class myOnItemSelctedListener implements AdapterView.OnItemSelectedListener {


        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            System.out.print("EVENT");
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

}
