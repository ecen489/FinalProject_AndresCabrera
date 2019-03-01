package com.example.miniproject_andrescabrera;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class AllAnimals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animals_all);
    }

    MediaPlayer mp;
    MediaPlayer mp2;
    Integer animal_count = 0;
    String key = "word";
    Boolean mediaplayeriscreated = false;

    // function to change animal name and picture and play animal sound
    public void pic_and_sound(Integer animal_count) {
        mediaplayeriscreated = true;

        if (animal_count == 0) {
            animal_count = 1;
        }

        if (animal_count == 1) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.alligator_1);
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.alligator_name);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.gator1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Alligator";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 2) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.bear_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.bear1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Bear";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 3) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.bird_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.bird1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Bird";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 4) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.bull_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.bull1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Bull";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 5) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.cat_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.cat1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Cat";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 6) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.cheetah_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.cheetah1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Cheetah";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 7) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.cow_1);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.cow1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Cow";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 8) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.deer_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.deer1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Deer";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 9) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.dog_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.dog1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Dog";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 10) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.dolphin_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.dolphin1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Dolphin";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 11) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.donkey_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.donkey1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Donkey";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 12) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.duck_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.duck1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Duck";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 13) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.eagle_1);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.eagle1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Eagle";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 14) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.elephant_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.elephant1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Elephant";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 15) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.frog_1);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.frog1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Frog";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 16) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.goats_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.goat1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Goat";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 17) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.hen_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.hen1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Hen";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 18) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.horse_1);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.horse1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Horse";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 19) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.lion_1);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.lion1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Lion";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 20) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.monkey_1);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.monkey1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Monkey";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 21) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.mouse_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.mouse1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Mouse";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 22) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.owl_1);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.owl1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Owl";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 23) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.parrot_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.parrot);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Parrot";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 24) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.pig_1);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.pig1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Pig";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 25) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.rabbit_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.rabbit1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Rabbit";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 26) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.raccoon_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.racoon1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Raccoon";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 27) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.rooster_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.rooster1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Rooster";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 28) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.sheep_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.sheep1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Sheep";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 29) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.skunk_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.skunk1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Skunk";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 30) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.snake_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.snake1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Snake";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 31) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.squirrel_);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.squirrel1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Squirrel";
            myButton.setText(animal_name);
            // pronunciation
        }
        else if (animal_count == 32) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp = MediaPlayer.create(AllAnimals.this, R.raw.whale_);
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.whale_name);
            mp.seekTo(0);
            mp.start();
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            myImage.setImageResource(R.drawable.whale1);

            Button myButton = (Button)findViewById(R.id.button11);
            String animal_name = "Whale";
            myButton.setText(animal_name);
            // pronunciation
        }
    }

    // Executed when user presses Button with animal image
    public void animalButton(View view) {
        if (animal_count == 0) {
            animal_count = 1;
            pic_and_sound(animal_count);
        }

        if (animal_count == 1) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("gator")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.alligator_2);
                myImage.setImageResource(R.drawable.gator3);
                key = "gator2";
            }
            else if (key.equals("gator2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.alligator_1);
                myImage.setImageResource(R.drawable.gator2);
                key = "gator";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 2) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("bear")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.bear_);
                myImage.setImageResource(R.drawable.bear3);
                key = "bear";
            }
            else if (key.equals("bear2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.bear_);
                myImage.setImageResource(R.drawable.bear2);
                key = "bear";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 3) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("bird")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.bird_);
                myImage.setImageResource(R.drawable.bird3);
                key = "bird2";
            }
            else if (key.equals("bird2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.bird_);
                myImage.setImageResource(R.drawable.bird2);
                key = "bird";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 4) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("bull")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.bull_);
                myImage.setImageResource(R.drawable.bull3);
                key = "bull2";
            }
            else if (key.equals("bull2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.bull_);
                myImage.setImageResource(R.drawable.bull2);
                key = "bull";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 5) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("cat")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.cat_);
                myImage.setImageResource(R.drawable.cat3);
                key = "cat2";
            }
            else if (key.equals("cat2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.cat_);
                myImage.setImageResource(R.drawable.cat2);
                key = "cat";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 6) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("cheetah")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.cheetah_);
                myImage.setImageResource(R.drawable.cheetah3);
                key = "cheetah2";
            }
            else if (key.equals("cheetah2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.cheetah_);
                myImage.setImageResource(R.drawable.cheetah2);
                key = "cheetah";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 7) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("cow")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.cow_2);
                myImage.setImageResource(R.drawable.cow3);
                key = "cow2";
            }
            else if (key.equals("cow2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.cow_1);
                myImage.setImageResource(R.drawable.cow2);
                key = "cow";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 8) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("deer")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.deer_);
                myImage.setImageResource(R.drawable.deer3);
                key = "deer2";
            }
            else if (key.equals("deer2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.deer_);
                myImage.setImageResource(R.drawable.deer2);
                key = "deer";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 9) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("dog")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.dog_);
                myImage.setImageResource(R.drawable.dog3);
                key = "dog2";
            }
            else if (key.equals("dog2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.dog_);
                myImage.setImageResource(R.drawable.dog2);
                key = "dog";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 10) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("dolphin")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.dolphin_);
                myImage.setImageResource(R.drawable.dolphin3);
                key = "dolphin2";
            }
            else if (key.equals("dolphin2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.dolphin_);
                myImage.setImageResource(R.drawable.dolphin2);
                key = "dolphin";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 11) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("donkey")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.donkey_);
                myImage.setImageResource(R.drawable.donkey3);
                key = "donkey2";
            }
            else if (key.equals("donkey2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.donkey_);
                myImage.setImageResource(R.drawable.donkey2);
                key = "donkey";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 12) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("duck")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.duck_);
                myImage.setImageResource(R.drawable.duck3);
                key = "duck2";
            }
            else if (key.equals("duck2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.duck_);
                myImage.setImageResource(R.drawable.duck2);
                key = "duck";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 13) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("eagle")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.eagle_2);
                myImage.setImageResource(R.drawable.eagle3);
                key = "eagle2";
            }
            else if (key.equals("eagle2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.eagle_1);
                myImage.setImageResource(R.drawable.eagle2);
                key = "eagle";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 14) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("elephant")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.elephant_);
                myImage.setImageResource(R.drawable.elephant3);
                key = "elephant2";
            }
            else if (key.equals("elephant2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.elephant_);
                myImage.setImageResource(R.drawable.elephant2);
                key = "elephant";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 15) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("frog")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.frog_2);
                myImage.setImageResource(R.drawable.frog3);
                key = "frog2";
            }
            else if (key.equals("frog2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.frog_1);
                myImage.setImageResource(R.drawable.frog2);
                key = "frog";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 16) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("goat")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.goats_);
                myImage.setImageResource(R.drawable.goat3);
                key = "goat2";
            }
            else if (key.equals("goat2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.goats_);
                myImage.setImageResource(R.drawable.goat2);
                key = "goat";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 17) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("hen")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.hen_);
                myImage.setImageResource(R.drawable.hen3);
                key = "hen2";
            }
            else if (key.equals("hen2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.hen_);
                myImage.setImageResource(R.drawable.hen2);
                key = "hen";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 18) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("horse")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.horse_3);
                myImage.setImageResource(R.drawable.horse3);
                key = "horse2";
            }
            else if (key.equals("horse2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.horse_2);
                myImage.setImageResource(R.drawable.horse2);
                key = "horse";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 19) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("lion")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.lion_2);
                myImage.setImageResource(R.drawable.lion3);
                key = "lion2";
            }
            else if (key.equals("lion2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.lion_1);
                myImage.setImageResource(R.drawable.lion2);
                key = "lion";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 20) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("monkey")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.monkey_1);
                myImage.setImageResource(R.drawable.monkey3);
                key = "monkey2";
            }
            else if (key.equals("monkey2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.monkey_1);
                myImage.setImageResource(R.drawable.monkey2);
                key = "monkey";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 21) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("mouse")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.mouse_);
                myImage.setImageResource(R.drawable.mouse3);
                key = "mouse2";
            }
            else if (key.equals("mouse2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.mouse_);
                myImage.setImageResource(R.drawable.mouse2);
                key = "mouse";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 22) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("owl")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.owl_3);
                myImage.setImageResource(R.drawable.owl3);
                key = "owl2";
            }
            else if (key.equals("owl2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.owl_2);
                myImage.setImageResource(R.drawable.owl2);
                key = "owl";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 23) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("parrot")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.parrot_);
                myImage.setImageResource(R.drawable.parrot3);
                key = "parrot2";
            }
            else if (key.equals("parrot2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.parrot_);
                myImage.setImageResource(R.drawable.parrot2);
                key = "parrot";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 24) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("pig")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.pig_2);
                myImage.setImageResource(R.drawable.pig3);
                key = "pig2";
            }
            else if (key.equals("pig2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.pig_1);
                myImage.setImageResource(R.drawable.pig2);
                key = "pig";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 25) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("rabbit")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.rabbit_);
                myImage.setImageResource(R.drawable.rabbit2);
                key = "rabbit2";
            }
            else if (key.equals("rabbit2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.rabbit_);
                myImage.setImageResource(R.drawable.rabbit1);
                key = "rabbit";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 26) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("raccoon")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.raccoon_);
                myImage.setImageResource(R.drawable.racoon3);
                key = "raccoon2";
            }
            else if (key.equals("raccoon2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.raccoon_);
                myImage.setImageResource(R.drawable.racoon2);
                key = "raccoon";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 27) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("rooster")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.rooster_);
                myImage.setImageResource(R.drawable.rooster3);
                key = "rooster2";
            }
            else if (key.equals("rooster2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.rooster_);
                myImage.setImageResource(R.drawable.rooster2);
                key = "rooster";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 28) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("sheep")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.sheep_2);
                myImage.setImageResource(R.drawable.sheep3);
                key = "sheep2";
            }
            else if (key.equals("sheep2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.sheep_);
                myImage.setImageResource(R.drawable.sheep2);
                key = "sheep";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 29) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("skunk")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.skunk_);
                myImage.setImageResource(R.drawable.skunk3);
                key = "skunk2";
            }
            else if (key.equals("skunk2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.skunk_);
                myImage.setImageResource(R.drawable.skunk2);
                key = "skunk";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 30) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("snake")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.snake_);
                myImage.setImageResource(R.drawable.snake3);
                key = "snake2";
            }
            else if (key.equals("snake2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.snake_);
                myImage.setImageResource(R.drawable.snake2);
                key = "snake";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 31) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("squirrel")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.squirrel_);
                myImage.setImageResource(R.drawable.squirrel3);
                key = "squirrel2";
            }
            else if (key.equals("squirrel2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.squirrel_);
                myImage.setImageResource(R.drawable.squirrel2);
                key = "squirrel";
            }
            mp.seekTo(0);
            mp.start();
        }
        else if (animal_count == 32) {
            ImageView myImage = (ImageView)findViewById(R.id.imageButton);
            try {
                mp.reset();
            }
            catch (Exception ex) {
            }
            if (key.equals("whale")){
                mp = MediaPlayer.create(AllAnimals.this, R.raw.whale_);
                myImage.setImageResource(R.drawable.whale3);
                key = "whale2";
            }
            else if (key.equals("whale2")) {
                pic_and_sound(animal_count);
                key = "reset";
            }
            else {
                mp = MediaPlayer.create(AllAnimals.this, R.raw.whale_);
                myImage.setImageResource(R.drawable.whale2);
                key = "whale";
            }
            mp.seekTo(0);
            mp.start();
        }
    }

    // Called when the user taps the Animal Name button
    public void animalName(View view) {
        if (animal_count == 0) {
            animal_count = 1;
            pic_and_sound(animal_count);
        }

        if (animal_count == 1) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.alligator_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 2) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.bear_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 3) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.bird_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 4) {
            try {
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.bull_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 5) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.cat_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 6) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.cheetah_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 7) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.cow_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 8) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.deer_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 9) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.dog_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 10) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.dolphin_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 11) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.donkey_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 12) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.duck_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 13) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.eagle_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 14) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.elephant_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 15) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.frog_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 16) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.goat_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 17) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.hen_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 18) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.horse_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 19) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.lion_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 20) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.monkey_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 21) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.mouse_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 22) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.owl_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 23) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.parrot_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 24) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.pig_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 25) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.rabbit_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 26) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.raccoon_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 27) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.rooster_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 28) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.sheep_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 29) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.skunk_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 30) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.snake_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 31) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.squirrel_name);
            mp2.seekTo(0);
            mp2.start();
        }
        else if (animal_count == 32) {
            try {
                mp.reset();
                mp2.reset();
            }
            catch (Exception ex) {
            }
            mp2 = MediaPlayer.create(AllAnimals.this, R.raw.whale_name);
            mp2.seekTo(0);
            mp2.start();
        }
    }

    // Called when the user taps the Go Back button
    public void mediaStop(View view) {
        if (mediaplayeriscreated) {
            mp.release();
            mp2.release();
        }
        finish();
    }

    // Called when the user taps the Stop button
    public void mediaPlay(View view) {
        if (mp.isPlaying() && mp2.isPlaying()) {
            mp.pause();
            mp2.pause();
        }
        else if (mp.isPlaying())
            mp.pause();
        else if (mp2.isPlaying())
            mp2.pause();
        else {}
    }

    // Called when the user taps the Next button
    public void animalNext(View view) {
        if (animal_count == 32) {
            animal_count = 1;
        }
        else {
            animal_count += 1;
        }

        pic_and_sound(animal_count);
    }

    // Called when the user taps the Previous button
    public void animalPrevious(View view) {
        if (animal_count == 1 || animal_count == 0) {
            animal_count = 32;
        }
        else {
            animal_count -= 1;
        }

        pic_and_sound(animal_count);
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("animal_count",animal_count);
    }

    public void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);
        animal_count=inState.getInt("animal_count",animal_count);
        pic_and_sound(animal_count);
    }

}
