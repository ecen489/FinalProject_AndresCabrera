package com.example.miniproject_andrescabrera;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Scanner;

public class animal_quiz extends AppCompatActivity {

    // declare arrays
    private static final int[] animal_count = new int[32];
    private static final int[] animal_count2 = new int[32];
    private static final int[] correct_answer = new int[32];

    // declare values
    MediaPlayer mp3;
    MediaPlayer mp4;
    Integer count = 0;
    int score = 0;
    String key = "word";
    Boolean mediaplayeriscreated2 = false;

    // on create of app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        if (animal_count[0] == 0) {
            // arrays filled with 0s and 1s
            int x = 0;
            int y = 1;
            int correctTop = 0;
            int correctBottom = 1;
            while (y < 33) {
                if (y < 17) {
                    correct_answer[x] = correctTop;
                } else {
                    correct_answer[x] = correctBottom;
                }
                animal_count[x] = y;
                x++;
                y++;
            }

            // randomized shuffling of arrays
            shuffleArray(animal_count);
            shuffleArray(correct_answer);

            // makes sure the same animal doesn't appear at the same time
            x = 0;
            y = 0;
            while (y < 32) {
                animal_count2[x] = animal_count[y];
                x++;
                y++;
            }
            shuffleArray(animal_count2);
        }

        // begin program
        rightAnswer(count);
        wrongAnswer(count);

    }

    // shuffle array function (courtesy of stackoverflow)
    private static void shuffleArray(int[] array)
    {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    // rightAnswer() function
    public void rightAnswer(Integer count) {

        if (animal_count[count] == 1) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.alligator_1);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView) findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.gator1);
            }
            else {
                ImageView myImage = (ImageView) findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.gator1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Alligator";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 2) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.bear_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.bear1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.bear1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Bear";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 3) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.bird_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.bird2);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.bird2);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Bird";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 4) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.bull_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.bull1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.bull1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Bull";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 5) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.cat_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.cat1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.cat1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Cat";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 6) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.cheetah_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.cheetah1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.cheetah1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Cheetah";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 7) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.cow_1);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.cow1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.cow1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Cow";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 8) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.deer_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.deer1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.deer1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Deer";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 9) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.dog_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.dog1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.dog1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Dog";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 10) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.dolphin_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.dolphin1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.dolphin1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Dolphin";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 11) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.donkey_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.donkey1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.donkey1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Donkey";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 12) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.duck_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.duck1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.duck1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Duck";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 13) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.eagle_1);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.eagle1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.eagle1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Eagle";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 14) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }

            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.elephant_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.elephant1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.elephant1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Elephant";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 15) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.frog_1);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.frog1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.frog1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Frog";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 16) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.goats_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.goat1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.goat1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Goat";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 17) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.hen_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.hen1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.hen1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Hen";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 18) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.horse_1);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.horse1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.horse1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Horse";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 19) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.lion_1);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.lion1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.lion1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Lion";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 20) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.monkey_1);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.monkey1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.monkey1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Monkey";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 21) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.mouse_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.mouse1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.mouse1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Mouse";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 22) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.owl_1);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.owl1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.owl1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Owl";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 23) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.parrot_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.parrot);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.parrot);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Parrot";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 24) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.pig_1);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.pig1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.pig1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Pig";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 25) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.rabbit_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.rabbit1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.rabbit1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Rabbit";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 26) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.raccoon_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.racoon1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.racoon1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Raccoon";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 27) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.rooster_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.rooster1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.rooster1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Rooster";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 28) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.sheep_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.sheep1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.sheep1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Sheep";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 29) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.skunk_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.skunk1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.skunk1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Skunk";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 30) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.snake_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.snake1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.snake1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Snake";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 31) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.squirrel_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.squirrel1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.squirrel1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Squirrel";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count[count] == 32) {
            try {
                mp3.reset();
            }
            catch (Exception ex) {
            }
            mp3 = MediaPlayer.create(animal_quiz.this, R.raw.whale_);
            mp3.seekTo(0);
            mp3.start();

            if (correct_answer[count] == 0) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.whale1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.whale1);
            }

            Button myButton = (Button)findViewById(R.id.button6);
            String animal_name = "Whale";
            myButton.setText(animal_name);
            // pronunciation
        }
    }

    // wrongAnswer() function
    public void wrongAnswer(Integer count) {

        if (animal_count2[count] == 1) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView) findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.gator1);
            }
            else {
                ImageView myImage = (ImageView) findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.gator1);
            }

        }
        else if (animal_count2[count] == 2) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.bear1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.bear1);
            }

        }
        else if (animal_count2[count] == 3) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.bird2);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.bird2);
            }

        }
        else if (animal_count2[count] == 4) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.bull1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.bull1);
            }

        }
        else if (animal_count2[count] == 5) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.cat1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.cat1);
            }

        }
        else if (animal_count2[count] == 6) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.cheetah1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.cheetah1);
            }

        }
        else if (animal_count2[count] == 7) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.cow1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.cow1);
            }

        }
        else if (animal_count2[count] == 8) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.deer1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.deer1);
            }

        }
        else if (animal_count2[count] == 9) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.dog1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.dog1);
            }

        }
        else if (animal_count2[count] == 10) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.dolphin1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.dolphin1);
            }

        }
        else if (animal_count2[count] == 11) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.donkey1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.donkey1);
            }


        }
        else if (animal_count2[count] == 12) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.duck1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.duck1);
            }

        }
        else if (animal_count2[count] == 13) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.eagle1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.eagle1);
            }

        }
        else if (animal_count2[count] == 14) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.elephant1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.elephant1);
            }

        }
        else if (animal_count2[count] == 15) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.frog1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.frog1);
            }

        }
        else if (animal_count2[count] == 16) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.goat1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.goat1);
            }

        }
        else if (animal_count2[count] == 17) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.hen1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.hen1);
            }

        }
        else if (animal_count2[count] == 18) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.horse1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.horse1);
            }


        }
        else if (animal_count2[count] == 19) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.lion1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.lion1);
            }

        }
        else if (animal_count2[count] == 20) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.monkey1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.monkey1);
            }

        }
        else if (animal_count2[count] == 21) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.mouse1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.mouse1);
            }

        }
        else if (animal_count2[count] == 22) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.owl1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.owl1);
            }

        }
        else if (animal_count2[count] == 23) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.parrot);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.parrot);
            }

        }
        else if (animal_count2[count] == 24) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.pig1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.pig1);
            }

        }
        else if (animal_count2[count] == 25) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.rabbit1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.rabbit1);
            }

        }
        else if (animal_count2[count] == 26) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.racoon1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.racoon1);
            }

        }
        else if (animal_count2[count] == 27) {


            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.rooster1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.rooster1);
            }

        }
        else if (animal_count2[count] == 28) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.sheep1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.sheep1);
            }

        }
        else if (animal_count2[count] == 29) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.skunk1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.skunk1);
            }

        }
        else if (animal_count2[count] == 30) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.snake1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.snake1);
            }

        }
        else if (animal_count2[count] == 31) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.squirrel1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.squirrel1);
            }

        }
        else if (animal_count2[count] == 32) {

            if (correct_answer[count] == 1) {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton2);
                myImage.setImageResource(R.drawable.whale1);
            }
            else {
                ImageView myImage = (ImageView)findViewById(R.id.imageButton3);
                myImage.setImageResource(R.drawable.whale1);
            }

        }
    }

    // Called when the user taps the Animal Name button
    public void animal_Name(View view) {
        mediaplayeriscreated2 = true;

        if (animal_count[count] == 1) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.alligator_1);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.alligator_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 2) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.bear_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.bear_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 3) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.bird_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.bird_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 4) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.bull_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.bull_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 5) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.cat_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.cat_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 6) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.cheetah_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.cheetah_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 7) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.cow_1);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.cow_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 8) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.deer_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.deer_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 9) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.dog_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.dog_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 10) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.dolphin_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.dolphin_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 11) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.donkey_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.donkey_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 12) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.duck_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.duck_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 13) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.eagle_1);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.eagle_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 14) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.elephant_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.elephant_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 15) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.frog_1);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.frog_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 16) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.goats_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.goat_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 17) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.hen_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.hen_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 18) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.horse_1);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.horse_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 19) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.lion_1);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.lion_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 20) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.monkey_1);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.monkey_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 21) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.mouse_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.mouse_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 22) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.owl_1);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.owl_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 23) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.parrot_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.parrot_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 24) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.pig_1);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.pig_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 25) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.rabbit_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.rabbit_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 26) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.raccoon_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.raccoon_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 27) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.rooster_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.rooster_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 28) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.sheep_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.sheep_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 29) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.skunk_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.skunk_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 30) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.snake_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.snake_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 31) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.squirrel_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.squirrel_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
        else if (animal_count[count] == 32) {
            try {
                mp3.reset();
                mp4.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sound")) {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.whale_);
                mp4.seekTo(0);
                mp4.start();
                key = "word";
            }
            else {
                mp4 = MediaPlayer.create(animal_quiz.this, R.raw.whale_name);
                mp4.seekTo(0);
                mp4.start();
                key = "sound";
            }
        }
//        count += 1;
    }

    // Called when the user taps the Top Photo
    public void topButton(View view) {

        if (correct_answer[count] == 0){
            score += 1;
            Toast.makeText(animal_quiz.this, "That's right!! Awesome.",Toast.LENGTH_SHORT).show();
            if (count < 31) {
                count += 1;
            }
            else if (count == 31) {
                end();
            }
            rightAnswer(count);
            wrongAnswer(count);
        }
        else if (correct_answer[count] == 1){
            Toast.makeText(animal_quiz.this, "Oops! Practice makes perfect!",Toast.LENGTH_SHORT).show();
        }
    }

    // Called when the user taps the Bottom Photo
    public void bottomButton(View view) {

        if (correct_answer[count] == 1){
            score += 1;
            Toast.makeText(animal_quiz.this, "That's right!! Awesome.",Toast.LENGTH_SHORT).show();
            if (count < 31) {
                count += 1;
            }
            else if (count == 31) {
                end();
            }
            rightAnswer(count);
            wrongAnswer(count);
        }
        else if (correct_answer[count] == 0){
            Toast.makeText(animal_quiz.this, "Oops! Practice makes perfect!",Toast.LENGTH_SHORT).show();
        }
    }

    // Called when the user taps the Go Back button
    public void goBack(View view) {
        end();
    }

    // end of program function
    public void end() {
        Intent backIntent = new Intent();
        backIntent.putExtra("point", score);
        setResult(RESULT_OK, backIntent);
        animal_count[0] = 0;
        score = 0;
        count = 0;
        finish();
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        for (int counter = 0; counter < animal_count.length; counter++)
        {
            String animal_countArrayCountString = "animal_count" + Integer.toString(counter); //concatenated string
            outState.putInt(animal_countArrayCountString, animal_count[counter]);

            String animal_count2ArrayCountString = "animal_count2" + Integer.toString(counter); //concatenated string
            outState.putInt(animal_count2ArrayCountString, animal_count2[counter]);

            String correct_answerArrayCountString = "correct_answer" + Integer.toString(counter); //concatenated string
            outState.putInt(correct_answerArrayCountString, correct_answer[counter]);
        }
        outState.putInt("points",score);
        outState.putInt("count_num",count);
    }

    public void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);
        for(int counter = 0; counter < animal_count.length; counter++)
        {
            String animal_countArrayCountString = "animal_count" + Integer.toString(counter);
            animal_count[counter] = inState.getInt(animal_countArrayCountString);

            String animal_count2ArrayCountString = "animal_count2" + Integer.toString(counter);
            animal_count2[counter] = inState.getInt(animal_count2ArrayCountString);

            String correct_answerArrayCountString = "correct_answer" + Integer.toString(counter);
            correct_answer[counter] = inState.getInt(correct_answerArrayCountString);
        }
        score = inState.getInt("points",score);
        count = inState.getInt("count_num",count);
        String scoresaved = Integer.toString(score);
        String countsaved = Integer.toString(count);
        rightAnswer(count);
        wrongAnswer(count);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mp3.release();
        if (mediaplayeriscreated2) {
            mp4.release();
        }
    }
}
