package com.example.android.solucionesdigitales;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        InicioFragment.OnFragmentInteractionListener,
        WindowsFragment.OnFragmentInteractionListener,
        LinuxFragment.OnFragmentInteractionListener,
        AnddroidFragment.OnFragmentInteractionListener,
        UbicacionFragment.OnFragmentInteractionListener,
        ContactoFragment.OnFragmentInteractionListener{

    Fragment fragment = null;
    Boolean fragSelect = false;

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
              //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                fragment = new ContactoFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();
                ((FrameLayout) findViewById(R.id.contenedor)).removeAllViews();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case R.id.acercaDe:
                Intent i = new Intent(this,AcercaDeActivity.class);
                startActivity(i);
                break;
        }


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.inicio) {
            fragment = new InicioFragment();
            fragSelect = true;
        } else if (id == R.id.windows) {
            fragment = new WindowsFragment();
            fragSelect = true;
        } else if (id == R.id.linux) {
            fragment = new LinuxFragment();
            fragSelect = true;
        } else if (id == R.id.android) {
            fragment = new AnddroidFragment();
            fragSelect = true;
        } else if (id == R.id.ubicacion) {
            fragment = new UbicacionFragment();
            fragSelect = true;
        } else if (id == R.id.contacto) {
            fragment = new ContactoFragment();
            fragSelect = true;
        }

        ((FrameLayout) findViewById(R.id.contenedor)).removeAllViews();

        if(fragSelect){
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragment).commit();

            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());
        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    void inicio(View v){
        Intent i = new Intent(this,SegundaActivity.class);
        switch (v.getId()){
            case R.id.prob1:
                i.putExtra("DATO",1);
                startActivity(i);
                break;
            case R.id.prob2:
                i.putExtra("DATO",2);
                startActivity(i);
                break;
            case R.id.prob3:
                i.putExtra("DATO",3);
                startActivity(i);
                break;
        }
    }

    void win(View v){
        Intent i = new Intent(this,SegundaActivity.class);
        switch (v.getId()){
            case R.id.win1:
                i.putExtra("DATO",4);
                startActivity(i);
                break;
            case R.id.winp2:
                i.putExtra("DATO",5);
                startActivity(i);
                break;
            case R.id.win3:
                i.putExtra("DATO",6);
                startActivity(i);
                break;
            case R.id.win4:
                i.putExtra("DATO",7);
                startActivity(i);
                break;
            case R.id.win5:
                i.putExtra("DATO",8);
                startActivity(i);
                break;
        }
    }

    void lin(View v){
        Intent i = new Intent(this,SegundaActivity.class);
        switch (v.getId()){
            case R.id.lin1:
                i.putExtra("DATO",9);
                startActivity(i);
                break;
            case R.id.lin2:
                i.putExtra("DATO",10);
                startActivity(i);
                break;
            case R.id.lin3:
                i.putExtra("DATO",11);
                startActivity(i);
                break;
            case R.id.lin4:
                i.putExtra("DATO",12);
                startActivity(i);
                break;
            case R.id.lin5:
                i.putExtra("DATO",13);
                startActivity(i);
                break;
        }
    }

    void appl(View v){
        Intent i = new Intent(this,SegundaActivity.class);
        switch (v.getId()){
            case R.id.app1:
                i.putExtra("DATO",14);
                startActivity(i);
                break;
            case R.id.app2:
                i.putExtra("DATO",15);
                startActivity(i);
                break;
            case R.id.app3:
                i.putExtra("DATO",16);
                startActivity(i);
                break;
            case R.id.app4:
                i.putExtra("DATO",17);
                startActivity(i);
                break;
            case R.id.app5:
                i.putExtra("DATO",18);
                startActivity(i);
                break;
        }
    }

    void envio(View v){
        EditText e = (EditText)findViewById(R.id.nombre);
        String nom = e.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Reporte de problema: "+nom);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }}

    void mapa(View v){
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}
