package com.developer.imlv.languagelearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> words =new ArrayList<>();
        words.add(new Word("Hello  ","नमस्कार (namaskar)"));
        words.add(new Word("Goodbye  ","अलविदा (Alvida)"));
        words.add(new Word("Please be seated ","पधारिये(Padhāriye)"));
        words.add(new Word("See you again ","फिर मिलेंगे(Phir milenge)"));
        words.add(new Word("Thank you ","धन्यवाद (dhanyavād)"));
        words.add(new Word("It is nice to meet you, I felt good meeting you. ","आप से मिल के ख़ुशी हुई, आप से मिल के अच्छा लगा(Āp se mil ke ḫuśī huī, āp se mil ke acchā lagā)"));
        words.add(new Word("Please take me to my hotel. ","कृप्या मुझे मेरे होटल ले(kripyā mujhe mere hoṭel le CH-LI-YE)"));
        words.add(new Word("How is your health? How is it? What is going on? ","क्या हाल है? कैसे हो/हैं? क्या चल रहा है?(Kyā hāl hai? Kaise ho/hain? Kyā chal rahā hai?)"));
        words.add(new Word("Where's the phone? ","फ़ोन कहाँ है?(Fon kahān hai?)"));
        words.add(new Word("Can I sit here? ","क्या मैं यहाँ बैठ सकता हूँ?(Kyā main yahān baiṭ saktā hūn?)"));
        words.add(new Word("I need a (taxi, car, telephone, pen) ","मुझे एक (टैक्सि, कार/गाड़ी, फ़ोन, क़लम/पेन) चाहिये(Mujhe ek (ṭāksi, kār/gaṛī, fon, qalam/pen) cāhiye)"));
        words.add(new Word("You need/have to go   ","आपको जाना है(aap ko jaana hai)"));
        words.add(new Word("Hello(Muslim)  ","अस्सलाम अलैकुम(assalām alaikum)"));
        words.add(new Word(" hello/goodbye (Sikh) "," सत श्री अकाल(sat śrī akāl)"));
        words.add(new Word("please ","कृपया(kṛipaya)"));

        WordAdapter adapter =new WordAdapter(this,words,R.color.category_phrases);
        ListView listView =(ListView)findViewById(R.id.phraseslist);
        listView.setAdapter(adapter);
    }
}
