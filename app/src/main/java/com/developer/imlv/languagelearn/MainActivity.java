package com.developer.imlv.languagelearn;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set the content of layout file to use activity main.xml file

        setContentView(R.layout.activity_main);

        TextView numbers =(TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });
        TextView family =(TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent calender = new Intent(Intent.ACTION_INSERT);
//                calender.setData(CalendarContract.Events.CONTENT_URI);
//                startActivity(calender);
                Intent familyIntent =new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView colors = (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//All commented codes are testings purpose
//                Intent colorsIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCcvNYxWXR_5TjVK7cSCdW-g"));
                Intent colorsIntent =new Intent(MainActivity.this,ColorActivity.class);
                startActivity(colorsIntent);
            }
        });
        TextView phrases = (TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent =new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
//                These all codes below are for testing new things nothing else:

//                Toast.makeText(view.getContext(),"This will show new Activity",Toast.LENGTH_SHORT).show();
//                Intent email = new Intent(Intent.ACTION_SEND);
//                email.putExtra(Intent.EXTRA_EMAIL,new String[]{"bishnoimlv@gmail.com"});
//                email.putExtra(Intent.EXTRA_SUBJECT,"Testing");
//                email.putExtra(Intent.EXTRA_TEXT,"Message");
//                email.setType("message/bishnoi");
//                startActivity(Intent.createChooser(email,"Choose an Email Client"));

            }
        });
    }





}
