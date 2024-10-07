package com.example.tppizza;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private ImageView photo;
    private TextView nom;
    private TextView desc;
    private TextView ingred;
    private TextView prepa;


    @Override
    protected void onCreate( Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_info);

        photo = findViewById(R.id.photopizza2);
        nom = findViewById(R.id.nompizza2);
        desc = findViewById(R.id.description2);
        ingred = findViewById(R.id.ingredient2);
        prepa = findViewById(R.id.preparation2);

        photo.setImageResource(getIntent().getIntExtra("photo",R.drawable.ic_launcher_background));
        nom.setText(getIntent().getStringExtra("nom"));
        desc.setText(getIntent().getStringExtra("desc"));
        ingred.setText(getIntent().getStringExtra("ingred"));
        prepa.setText(getIntent().getStringExtra("prepa"));
    }
}
