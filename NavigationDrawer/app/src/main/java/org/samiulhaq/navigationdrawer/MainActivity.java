package org.samiulhaq.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;

    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(getApplicationContext(),"End",Toast.LENGTH_LONG).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView=findViewById(R.id.nav_view);
        drawerLayout=findViewById(R.id.drawer);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.nav_book :
                        //Toast.makeText(getApplicationContext(),"Book is Clicked",Toast.LENGTH_LONG).show();
                        Intent intent1 = new Intent(MainActivity.this, BookActivity.class);
                        startActivity(intent1);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_return :
                        //Toast.makeText(getApplicationContext(),"Return is Clicked",Toast.LENGTH_LONG).show();
                        Intent intent2 = new Intent(MainActivity.this, ReturnActivity.class);
                        startActivity(intent2);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_laptop :
                        //Toast.makeText(getApplicationContext(),"Laptop is clicked",Toast.LENGTH_LONG).show();
                        Intent intent3 = new Intent(MainActivity.this, LaptopActivity.class);
                        startActivity(intent3);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_voice :
                        //Toast.makeText(getApplicationContext(),"Voice is clicked",Toast.LENGTH_LONG).show();
                        Intent intent4 = new Intent(MainActivity.this, VoiceActivity.class);
                        startActivity(intent4);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_chrome_reader :
                        //Toast.makeText(getApplicationContext(),"Chrome Reader is clicked",Toast.LENGTH_LONG).show();
                        Intent intent5 = new Intent(MainActivity.this, ChromeReaderActivity.class);
                        startActivity(intent5);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_read_more :
                        //Toast.makeText(getApplicationContext(),"Read More is clicked",Toast.LENGTH_LONG).show();
                        Intent intent6 = new Intent(MainActivity.this, ReadMoreActivity.class);
                        startActivity(intent6);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_add_comment :
                        //Toast.makeText(getApplicationContext(),"Add Comment is clicked",Toast.LENGTH_LONG).show();
                        Intent intent7 = new Intent(MainActivity.this, AddCommentActivity.class);
                        startActivity(intent7);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_insert_comment :
                        //Toast.makeText(getApplicationContext(),"Insert Comment is clicked",Toast.LENGTH_LONG).show();
                        Intent intent8 = new Intent(MainActivity.this, InsertCommentActivity.class);
                        startActivity(intent8);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });




    }
}