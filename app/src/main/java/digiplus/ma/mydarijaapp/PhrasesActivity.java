package digiplus.ma.mydarijaapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Words> Colors = new ArrayList<Words>();
        Colors.add(new Words("Where are you going?", "Kidayer ?"));
        Colors.add(new Words("What is your name?", "Chno smitek ?"));
        Colors.add(new Words("My name is...", "Smiyti ..."));
        Colors.add(new Words("How are you feeling?", "Kidayer ?"));
        Colors.add(new Words("I’m feeling good.", "Labass."));
        Colors.add(new Words("Are you coming?", "Wach radi tji ?"));
        Colors.add(new Words("Yes, I’m coming.", "ah, ana jay."));
        Colors.add(new Words("I’m coming.", "Ana jay"));
        Colors.add(new Words("Let’s go.", "Yalah."));
        Colors.add(new Words("Come here", "Aji hna"));

        WordAdapter word_Adapter = new WordAdapter(this, Colors, R.color.Phrases);

        ListView PhrasesView = (ListView) findViewById(R.id.List);
        PhrasesView.setAdapter(word_Adapter);
    }
}
