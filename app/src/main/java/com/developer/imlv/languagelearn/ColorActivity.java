package com.developer.imlv.languagelearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Blue ","नीला(Neela)",R.drawable.color_brown));
        words.add(new Word("Brown ","भूरा(Bhura)",R.drawable.color_brown));
        words.add(new Word("Green ","हरा(Hra)",R.drawable.color_green));
        words.add(new Word("Grey ","धूसर, स्लेटी(Saleti)",R.drawable.color_gray));
        words.add(new Word("Orange ","नारंगी(Narangi)",R.drawable.color_red));
        words.add(new Word("Pink ","गुलाबी(Gulabi)",R.drawable.color_red));
        words.add(new Word("Purple ","जामुनी रंग(पर्पल्)",R.drawable.color_dusty_yellow));
        words.add(new Word("Red ","लाल(Lal)",R.drawable.color_red));
        words.add(new Word("White ","सफ़ेद(Safed)",R.drawable.color_white));
        words.add(new Word("Yellow ","पीला(Peela)",R.drawable.color_mustard_yellow));
        words.add(new Word("Violet ","बैंगनी(Bengni)",R.drawable.color_brown));
        words.add(new Word("Silver  ","चांदी(Chandi)",R.drawable.color_white));
        words.add(new Word("Golden  ","सुनहरा(Sona)",R.drawable.color_mustard_yellow));
        words.add(new Word(" Dark brown "," गहरा भूरा(Bhura)",R.drawable.color_brown));
        words.add(new Word("Black ","काला(Kala)",R.drawable.color_black));

        WordAdapter adapter =new WordAdapter(this,words,R.color.category_colors);
        ListView listView =(ListView)findViewById(R.id.colorlist);
        listView.setAdapter(adapter);

    }
}
