package com.example.ciro.entregableandroid.Activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.ciro.entregableandroid.Fragments.FragmentAboutUs;
import com.example.ciro.entregableandroid.Fragments.FragmentHome;
import com.example.ciro.entregableandroid.Fragments.FragmentReceta;
import com.example.ciro.entregableandroid.R;

public class MainActivity extends AppCompatActivity implements FragmentReceta.ComunicadorFragment2Activity {

    FragmentManager fragmentManager;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        cargarFragment(new FragmentHome());

        navigationView = findViewById(R.id.navigationViewMain);
        navigationView.setNavigationItemSelectedListener(new ListenerNavigation());

    }

    //CLICKEARON EN LA CELDA DEL FRAGMENT
    @Override
    public void clickOnCelda(Integer pos) {
        Intent unIntent = new Intent(this, DetalleActivity.class);
        Bundle unBundle = new Bundle();

        unBundle.putInt("pos", pos);
        unIntent.putExtras(unBundle);

        startActivity(unIntent);

    }

    //CLASE PRIVADA ESCUCHADOR DEL NAVIGATION
    private class ListenerNavigation implements NavigationView.OnNavigationItemSelectedListener {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            selectedItem(item);
            return true;
        }
    }

    //NavigationMenu
    public void selectedItem(MenuItem item) {

        DrawerLayout drawerLayout = findViewById(R.id.drawLayoutMain);

        switch (item.getItemId()) {
            case R.id.itemRecetas:

                cargarFragment(new FragmentReceta());
                drawerLayout.closeDrawers();


                break;
            case R.id.itemAboutUs:

                cargarFragment(new FragmentAboutUs());
                drawerLayout.closeDrawers();

                break;
        }


    }
    /////////////////////////////////////////


    //METODO PARA HACER EL REPLACE
    private void cargarFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
        fragmentTransaction1.replace(R.id.contenedorMainFragment, fragment);
        fragmentTransaction1.addToBackStack(null).commit();
    }


}
