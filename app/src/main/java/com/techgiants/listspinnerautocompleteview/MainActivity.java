package com.techgiants.listspinnerautocompleteview;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView list;
Spinner spinner;
//int [] arr=new int[]{1,2,3,4,};
    AutoCompleteTextView actw;
ArrayList<String>arr=new ArrayList<>();
ArrayList<String> ids=new ArrayList<>();
ArrayList<String> lang=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        spinner=findViewById(R.id.spinner);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        list=findViewById(R.id.list);
        arr.add("Akash");
        arr.add("Love");
        arr.add("Sakshi");
        arr.add("Aman");
        arr.add("Akshit");
        arr.add("Vickey");
        arr.add("Amit");
        arr.add("Ananya");
        arr.add("Lavi");
        arr.add("Rohit");
        arr.add("Akash");
        arr.add("Love");
        arr.add("Sakshi");
        arr.add("Aman");
        arr.add("Akshit");
        arr.add("Vickey");
        arr.add("Amit");
        arr.add("Ananya");
        arr.add("Lavi");
        arr.add("Rohit");
        arr.add("Akash");
        arr.add("Love");
        arr.add("Sakshi");
        arr.add("Aman");
        arr.add("Akshit");
        arr.add("Vickey");
        arr.add("Amit");
        arr.add("Ananya");
        arr.add("Lavi");
        arr.add("Rohit");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,arr);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(MainActivity.this,"This is the first Item",Toast.LENGTH_SHORT).show();
                }
            }
        });
        ids.add("Adhar card");
        ids.add("rashion card");
        ids.add("pan card");
        ids.add("voter id");
        ids.add("driving licence");
        ids.add("atm card");
        ids.add("bank card");
        ids.add("Birth certificate");
        ids.add("Marriage certificate");
        ids.add("10th markSheet");
        ids.add("12th markSheet");
        ArrayAdapter<String> id=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,ids);
        spinner.setAdapter(id);
        lang.add("c#");
        lang.add("cpp");
        lang.add("python#");
        lang.add("java");
        lang.add("go");
        lang.add("rust");
        lang.add("dirt");
        lang.add("c");
        actw=findViewById(R.id.autocomp);
        ArrayAdapter<String> lan=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,lang);
        actw.setAdapter(lan);
    }
}