package digiplus.ma.mydarijaapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        //LinearLayout NumRootView = (LinearLayout) findViewById(R.id.RootView);
        ArrayList<Words> word_s = new ArrayList<Words>();
        //Words w = new Words("One, Ouahed");
        //Word_s.add(w);
        word_s.add(new Words("One", "Ouahed"));
        word_s.add(new Words("Tow", "Jouj"));
        word_s.add(new Words("Three", "Talata"));
        word_s.add(new Words("Four", "Rabaa"));
        word_s.add(new Words("Five", "Khamssa"));
        word_s.add(new Words("Six", "Sst'a"));
        word_s.add(new Words("Seven", "Sab'a"));
        word_s.add(new Words("Eight", "Tmaniya"));
        word_s.add(new Words("Nine", "Tiss'a"));
        word_s.add(new Words("Ten", "Achara"));
        //words.add("One");
        //words.add("Two");

        WordAdapter itemsAdapter = new WordAdapter(this, word_s);
        ListView listView = (ListView) findViewById(R.id.List);
        listView.setAdapter(itemsAdapter);
    }
}
