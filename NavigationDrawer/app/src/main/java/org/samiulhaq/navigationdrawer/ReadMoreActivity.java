package org.samiulhaq.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ReadMoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_more);
        Toast.makeText(getApplicationContext(),"Read More is Clicked",Toast.LENGTH_LONG).show();

    }
}