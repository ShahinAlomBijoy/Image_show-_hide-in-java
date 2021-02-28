package com.example.image_show_hide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView sampleImage;
Button showbtn,hidebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sampleImage=(ImageView)findViewById(R.id.imageView);
        showbtn=findViewById(R.id.show);
        hidebtn=findViewById(R.id.hide);
        hidebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sampleImage.setVisibility(View.INVISIBLE);
                hidebtn.setVisibility(View.INVISIBLE);
                showbtn.setVisibility(View.VISIBLE);
            }
        });
showbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        sampleImage.setVisibility(View.VISIBLE);
        showbtn.setVisibility(View.INVISIBLE);
        hidebtn.setVisibility(View.VISIBLE);
    }
});
    }
}