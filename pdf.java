package com.example.login;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class pdf extends AppCompatActivity {

    ListView pdfview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        pdfview=(ListView)findViewById(R.id.pdf);

        String[] pdfs={"Mathematics","Electronics","Real Analysis"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pdfs)
        {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                        View view=super.getView(position,convertView,parent);
                        TextView myText=(TextView)view.findViewById(android.R.id.text1);
                        return view;


            }
        };
        pdfview.setAdapter(adapter);
        pdfview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item=pdfview.getItemAtPosition(i).toString();
                Intent start=new Intent(getApplicationContext(),pdfopener.class);
                start.putExtra("pdffilename",item);
                startActivity(start);
            }
        });

    }
}