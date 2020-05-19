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
        Colors.add(new Words(R.mipmap.ic_launcher,"Father", "abb"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Mother", "Omm"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Son", "Oueld"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Daughter", "Bent"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Older brother", "lkho lekbir"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Younger brother", "lkho seghir"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Older sister", "okht lkbira"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Younger sister", "okht seghira"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Grandmother", "Jjda"));
        Colors.add(new Words(R.mipmap.ic_launcher,"grandfather", "Jjdi"));

        WordAdapter word_Adapter = new WordAdapter(this, Colors, R.color.Family);

        ListView FamilyView = (ListView) findViewById(R.id.List);
        FamilyView.setAdapter(word_Adapter);
    }
}



