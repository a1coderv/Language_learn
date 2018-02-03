package com.developer.imlv.languagelearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.FieldPosition;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        /* create a array of words */
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","एक(ek)",R.drawable.number_one));
        words.add(new Word("Two","दो(do)",R.drawable.number_two));
        words.add(new Word("Three","तीन(teen)",R.drawable.number_three));
        words.add(new Word("Four","चार(chaar)",R.drawable.number_four));
        words.add(new Word("Five","पांच(paanch)",R.drawable.number_five));
        words.add(new Word("Six","छह(chhah)",R.drawable.number_six));
        words.add(new Word("Seven","सात(saat)",R.drawable.number_seven));
        words.add(new Word("Eight","आठ(aaath)",R.drawable.number_eight));
        words.add(new Word("Nine","नौ(nou)",R.drawable.number_nine));
        words.add(new Word("Ten","दस(das)",R.drawable.number_ten));
//        words.add(new Word("one","एक(ek)"));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);
        ListView listView =findViewById(R.id.list);
        listView.setAdapter(adapter);


//        Array instead of ArrayList
//        String [] words = new String[10];
//        words[0]= "one";
//        words[1]= "two";
//        words[2]= "three";
//        words[3]= "four";
//        words[4]= "five";
//        words[5]= "six";
//        words[6]= "seven";
//        words[7]= "eight";
//        words[8]= "nine";
//        words[9]= "ten";
//        Log.v("NumbersActivity","Word at Index 0:" + words[0]);
//        Log.v("NumbersActivity","Word at Index 1:" + words[1]);


    }

}
