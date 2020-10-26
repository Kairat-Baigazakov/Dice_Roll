package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static int random;
    //public static int random2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int random() {
        int random = (int) (1 + (Math.random() * 6));
        return this.random = random;
    }

    public void diceRoll(View view) {
        random();
        ImageView diceImage1 = findViewById(R.id.imageView);

        switch (random) {
            case 1:
                diceImage1.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                diceImage1.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                diceImage1.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                diceImage1.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                diceImage1.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                diceImage1.setImageResource(R.drawable.dice_6);
                break;
        }

        random();
        ImageView diceImage2 = findViewById(R.id.imageView2);

        switch (random) {
            case 1:
                diceImage2.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                diceImage2.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                diceImage2.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                diceImage2.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                diceImage2.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                diceImage2.setImageResource(R.drawable.dice_6);
                break;
        }
    }
}