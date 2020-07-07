package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfopener extends AppCompatActivity {

    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);
        myPDFViewer=(PDFView)findViewById(R.id.pdf);
        String getItem=getIntent().getStringExtra("pdffilename");
        if(getItem.equals("Mathematics"))
        {
            myPDFViewer.fromAsset("Discrete_Mathematics_7th_Edition_Kenneth (1).pdf").load();
        }
        if(getItem.equals("Electronics"))
        {
            myPDFViewer.fromAsset("Electronic-Devices-and-Circuit-Theory-Robert-Boylestad-Louis-Nashelsky-7th-Edition.pdf").load();
        }
        if(getItem.equals("RealAnalysis"))
        {
            myPDFViewer.fromAsset("Real Analysis by Bartle and Sherbert.pdf").load();
        }
    }
}