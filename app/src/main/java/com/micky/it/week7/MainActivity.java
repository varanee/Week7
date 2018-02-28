package com.micky.it.week7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);
        db.addContact(new Contact("Ekarat", "0899999999"));
        db.addContact(new Contact("micky", "7777777777"));
        db.addContact(new Contact("Rattagan", "011111111"));
        db.addContact(new Contact("yut", "9236547891"));
        db.addContact(new Contact("manow2", "321654987"));



        List<Contact> contacts = db.getAllContacts();
        String[] datas = new String[contacts.size()];

        for (int i = 0; i < datas.length; i++) {
            datas[i] = contacts.get(i)._name;
        }
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), datas);
        ListView listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(adapter);


        Toast.makeText(this, contacts.get(2)._name, Toast.LENGTH_LONG).show();
    }
}
