package digiplus.ma.mydarijaapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        ArrayList<Words> Colors = new ArrayList<Words>();
        Colors.add(new Words("Father", "abb"));
        Colors.add(new Words("Mother", "Omm"));
        Colors.add(new Words("Son", "Oueld"));
        Colors.add(new Words("Daughter", "Bent"));
        Colors.add(new Words("Older brother", "lkho lekbir"));
        Colors.add(new Words("Younger brother", "lkho seghir"));
        Colors.add(new Words("Older sister", "okht lkbira"));
        Colors.add(new Words("Younger sister", "okht seghira"));
        Colors.add(new Words("Grandmother", "Jjda"));
        Colors.add(new Words("grandfather", "Jjdi"));

        WordAdapter word_Adapter = new WordAdapter(this, Colors);

        ListView FamilyView = (ListView) findViewById(R.id.List);
        FamilyView.setAdapter(word_Adapter);
    }
}



