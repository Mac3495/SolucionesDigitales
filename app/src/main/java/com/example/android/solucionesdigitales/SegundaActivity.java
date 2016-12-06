package com.example.android.solucionesdigitales;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    Fragment fragment = null;
    ImageView img;
    TextView inf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                String otro = inf.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, otro);
                intent.putExtra(Intent.EXTRA_STREAM, Uri.parse(otro));
                startActivity(intent);


            }
        });
        img = (ImageView) findViewById(R.id.cabecera);
        inf = (TextView) findViewById(R.id.informacion);
        Intent i = getIntent();
        Bundle extra = i.getExtras();
        int dat = extra.getInt("DATO");
        if(dat==1){
            img.setImageResource(R.drawable.winp4);
            inf.setText(R.string.win4);
        }
        if(dat==2){
            img.setImageResource(R.drawable.linp4);
            inf.setText(R.string.lin4);
        }
        if(dat==3){
            img.setImageResource(R.drawable.appp5);
            inf.setText(R.string.and5);
        }
        if(dat==4){
            img.setImageResource(R.drawable.prob1);
            inf.setText(R.string.win1);
        }
        if(dat==5){
            img.setImageResource(R.drawable.winp2);
            inf.setText(R.string.win2);
        }
        if(dat==6){
            img.setImageResource(R.drawable.winp3);
            inf.setText(R.string.win3);
        }
        if(dat==7){
            img.setImageResource(R.drawable.winp4);
            inf.setText(R.string.win4);
        }
        if(dat==8){
            img.setImageResource(R.drawable.winp5);
            inf.setText(R.string.win5);
        }
        if(dat==9){
            img.setImageResource(R.drawable.linp1);
            inf.setText(R.string.lin1);
        }
        if(dat==10){
            img.setImageResource(R.drawable.linp2);
            inf.setText(R.string.lin2);
        }
        if(dat==11){
            img.setImageResource(R.drawable.linp3);
            inf.setText(R.string.lin3);
        }
        if(dat==12){
            img.setImageResource(R.drawable.linp4);
            inf.setText(R.string.lin4);
        }
        if(dat==13){
            img.setImageResource(R.drawable.linp5);
            inf.setText(R.string.lin5);
        }
        if(dat==14){
            img.setImageResource(R.drawable.appp1);
            inf.setText(R.string.and1);
        }
        if(dat==15){
            img.setImageResource(R.drawable.appp2);
            inf.setText(R.string.and2);
        }
        if(dat==16){
            img.setImageResource(R.drawable.appp3);
            inf.setText(R.string.and3);
        }
        if(dat==17){
            img.setImageResource(R.drawable.appp4);
            inf.setText(R.string.and4);
        }
        if(dat==18){
            img.setImageResource(R.drawable.appp5);
            inf.setText(R.string.and5);
        }
    }
}
