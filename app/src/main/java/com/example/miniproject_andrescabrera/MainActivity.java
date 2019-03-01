package com.example.miniproject_andrescabrera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String[] topics = {"All Animals", "Knowledge Game!"};
    private static final int REQUIRED_CODE = 2468;
    String string_score;
    int score = 0;
    Double score2 = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent_quiz  = new Intent(this, animal_quiz.class);
//        final Intent intent_local = new Intent(this, LocalAnimals.class);
//        final Intent intent_wild  = new Intent(this, WildAnimals.class);
        final Intent intent_all   = new Intent(this, AllAnimals.class);



        // Launches activities for app topic list
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, topics);

        ListView topics_list = (ListView) findViewById(R.id.listView);
        topics_list.setAdapter(adapter);

        topics_list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> list, View row, int index, long rowID) {

                        String topic = list.getItemAtPosition(index).toString();

                        if (topic.equals("All Animals")) {
                            startActivity(intent_all);
                        }
                        else if (topic.equals("Knowledge Game!")) {
                            startActivityForResult(intent_quiz,REQUIRED_CODE);
                        }
                    }
                }
        );

    }

    public void restButton(View view) {
        score = 0;
        score2 = (double) 0 * 1.0;
        TextView see_score = (TextView) findViewById(R.id.textView2);
        String string_score = "Animals Learned: " + Double.toString(score2) + "%";
        see_score.setText(string_score);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == REQUIRED_CODE) {
            int point = intent.getIntExtra("point", 0);
            score = score + point;
            Double animals = 32.0;
            Double score2 = ((double) score / animals) * 100;
            TextView see_score = findViewById(R.id.textView2);
            String string_score = "Animals Learned: " + Double.toString(score2) + "%";
            String check_value = Double.toString(score2);
            see_score.setText(string_score);
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        TextView see_score = findViewById(R.id.textView2);
        string_score = see_score.getText().toString();
        outState.putString("savedString", string_score);

    }

    public void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);
        string_score=inState.getString("savedString");
        TextView see_score = (TextView) findViewById(R.id.textView2);
        see_score.setText(string_score);
    }
}