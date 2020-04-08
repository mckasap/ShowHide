package org.kasapbasi.showhide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.theTv);

    }

    public void show(View v){
tv.setVisibility(View.VISIBLE);

    }
    public void hide(View v){

        tv.setVisibility(View.INVISIBLE);
    }

}
