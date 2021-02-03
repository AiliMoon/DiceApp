package com.example.android.myapplication;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_1;
    ImageView imageView_2;

    private Random dice  = new Random();
    private int random_1;
    private int random_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView_1 = findViewById(R.id.imageView3);
        imageView_2 = findViewById(R.id.imageView2);

        Button rollButton = findViewById(R.id.roll);
        rollButton.setOnClickListener(v -> {
            dice();
        });

        if (savedInstanceState != null) {
            random_1 = savedInstanceState.getInt("key_1");
            random_2 = savedInstanceState.getInt("key_2");
            getDiceImage(random_1);
            getDiceImage_2(random_2);
        }
    }

    public void dice() {
        random_1 = dice.nextInt(6) + 1;
        getDiceImage(random_1);
        random_2 = dice.nextInt(6) + 1;
        getDiceImage_2(random_2);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("key_1", random_1);
        outState.putInt("key_2", random_2);
    }

    public void getDiceImage(int random) {
        switch (random) {
            case 1:
                imageView_1.setImageResource(R.drawable.ic_dice_1);
                break;
            case 2:
                imageView_1.setImageResource(R.drawable.ic_dice_2);
                break;
            case 3:
                imageView_1.setImageResource(R.drawable.ic_dice_3);
                break;
            case 4:
                imageView_1.setImageResource(R.drawable.ic_dice_4);
                break;
            case 5:
                imageView_1.setImageResource(R.drawable.ic_dice_5);
                break;
            case 6:
                imageView_1.setImageResource(R.drawable.ic_dice_6);
                break;
        }
    }

    public void getDiceImage_2(int random1) {
        switch (random1) {
            case 1:
                imageView_2.setImageResource(R.drawable.ic_dice_1);
                break;
            case 2:
                imageView_2.setImageResource(R.drawable.ic_dice_2);
                break;
            case 3:
                imageView_2.setImageResource(R.drawable.ic_dice_3);
                break;
            case 4:
                imageView_2.setImageResource(R.drawable.ic_dice_4);
                break;
            case 5:
                imageView_2.setImageResource(R.drawable.ic_dice_5);
                break;
            case 6:
                imageView_2.setImageResource(R.drawable.ic_dice_6);
                break;
        }
    }
}

// Загрузила свой предыдущий код
/**
 * package com.example.android.myapplication;
 * import androidx.annotation.NonNull;
 * import androidx.appcompat.app.AppCompatActivity;
 * import android.os.Bundle;
 * import android.widget.Button;
 * import android.widget.ImageView;
 *
 * public class MainActivity extends AppCompatActivity {
 *
 *     ImageView imageDiceRoll_1;
 *     ImageView imageDiceRoll_2;
 *
 *     int dice_1;
 *     int dice_2;
 *
 *     private int imageResource_1;
 *     private int imageResource_2;
 *
 *     @Override
 *     protected void onCreate(Bundle savedInstanceState) {
 *         super.onCreate(savedInstanceState);
 *         setContentView(R.layout.activity_main);
 *
 *         Button rollButton = findViewById(R.id.roll);
 *         rollButton.setOnClickListener(v -> {
 *             rollDice();
 *         });
 *     }
 *
 *     public void rollDice() {
 *
 *         dice_1 = (int) (Math.random() * 6 + 1);
 *         dice_2 = (int) (Math.random() * 6 + 1);
 *
 *
 *         imageDiceRoll_1 = findViewById(R.id.imageView2);
 *         imageDiceRoll_2 = findViewById(R.id.imageView3);
 *
 *         imageResource_1 = getResources().getIdentifier("ic_dice_" + dice_1, "drawable", "com.example.android.myapplication");
 *         imageResource_2 = getResources().getIdentifier("ic_dice_" + dice_2, "drawable", "com.example.android.myapplication");
 *
 *         imageDiceRoll_1.setImageResource(imageResource_1);
 *         imageDiceRoll_2.setImageResource(imageResource_2);
 *     }
 *
 *     @Override
 *     public void onSaveInstanceState(@NonNull Bundle outState) {
 *         super.onSaveInstanceState(outState);
 *         outState.putInt("dice1", imageResource_1);
 *         outState.putInt("dice2", imageResource_2);
 *     }
 *
 *     @Override
 *     protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
 *         super.onRestoreInstanceState(savedInstanceState);
 *         imageResource_1 = savedInstanceState.getInt("dice1");
 *         imageResource_2 = savedInstanceState.getInt("dice2");
 *         rollDice();
 *     }
 * }*/



