package com.example.ilhamfaridll.botolputar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class BotolActivity extends AppCompatActivity {

    ImageView botol;

    Button putar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botol);

        botol = (ImageView) findViewById(R.id.botol);

        putar = (Button) findViewById(R.id.putar);

        putar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RotateAnimation rotate = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setFillAfter(true);
                rotate.setDuration(1000);
                rotate.setInterpolator(new AccelerateDecelerateInterpolator());

                botol.startAnimation(rotate);

            }
        });
    }
}
