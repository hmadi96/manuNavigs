package com.mohammed.manunavig;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuInflater;
import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private DrawerLayout myDrawer ;
 private ActionBarDrawerToggle mToggle ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDrawer =(DrawerLayout)findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this,myDrawer,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        myDrawer.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true)
    }
  //  @Override
   // public boolean onCreateOptionsMenu(Menu menu) {
   //     MenuInflater inflater= getMenuInflater();
   //     inflater.inflate(R.menu.activity_main_drawer, menu);
  //      return true;
 //   }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
       switch (item.getItemId()){

           case R.id.nav_home:
               Toast.makeText(this, "my Toast", Toast.LENGTH_SHORT).show();
               return true;
default:

    return super.onOptionsItemSelected(item);

       }

     }

}
