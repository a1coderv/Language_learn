package com.developer.imlv.languagelearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","पिता (Papa Ji)",R.drawable.family_father));
        words.add(new Word("mother","माँ (Bebe )",R.drawable.family_mother));
        words.add(new Word("son","बेटा (puttar)",R.drawable.family_son));
        words.add(new Word("daughter","बेटी (Dhee)",R.drawable.family_daughter));
        words.add(new Word("Elder Brother","भैया (Bhaa Ji)",R.drawable.family_older_brother));
        words.add(new Word("Younger Brother","छोटा भाई (chhoTii bahan)",R.drawable.family_younger_brother));
        words.add(new Word("Elder Sister","दीदी (BehanJi)",R.drawable.family_younger_sister));
        words.add(new Word("Younger Sister","छोटी बहन(Didi)",R.drawable.family_older_sister));
        words.add(new Word("Grandmother","दादी (Dadi)",R.drawable.family_grandmother));
        words.add(new Word("Grandfather","दादा (Dada)",R.drawable.family_grandfather));
        words.add(new Word("Grandmother","नानी(Nani)",R.drawable.family_grandmother));
        words.add(new Word("Nānā","नाना (Nana )",R.drawable.family_grandfather));
        words.add(new Word("uncle","मामा  (MamaJi)",R.drawable.family_father));
        words.add(new Word("aunt","मामी  (MamiJi)",R.drawable.family_mother));
        words.add(new Word("Mausā","मौसा  (MausaJi)",R.drawable.family_father));
        words.add(new Word("Mausi","मौसी (MaasiJi)",R.drawable.family_mother));
        words.add(new Word("elder brother's wife","भाभी  (BhabhiJi)",R.drawable.family_older_sister));
        words.add(new Word("Mother's brother's son","ममेरा भाई (mameraa bhaaii)",R.drawable.family_younger_brother));
        words.add(new Word("Mother's brother's daughter","ममेरी बहन (mamerii bahan)",R.drawable.family_younger_sister));
        words.add(new Word("Brother's son","भतीजा (bhatiijaa)",R.drawable.family_younger_brother));
//        words.add(new Word("one","एक(ek)"));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_family);
        ListView listView =(ListView) findViewById(R.id.familylsit);
        listView.setAdapter(adapter);

    }
}
