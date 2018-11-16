package com.example.vaibhav.news_feed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageDetailsActivity1 extends AppCompatActivity {

    private ImageView imageView;
    private Button button;
    private static final String DRAWABLE_RESOURE = "resource";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image1);

        imageView = (ImageView)findViewById(R.id.img);
        button = (Button)findViewById(R.id.btnClose);

        int drawbleResource = getIntent().getIntExtra(DRAWABLE_RESOURE, 0);
        imageView.setImageResource(drawbleResource);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}



