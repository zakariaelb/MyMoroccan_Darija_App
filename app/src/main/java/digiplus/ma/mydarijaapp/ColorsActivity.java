package digiplus.ma.mydarijaapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        ArrayList<Words> Colors = new ArrayList<Words>();
        Colors.add(new Words("Red", "Hmar"));
        Colors.add(new Words("Green", "Khdar"));
        Colors.add(new Words("Brown", "Kahoui"));
        Colors.add(new Words("Gray", "Rmadi"));
        Colors.add(new Words("Black", "K hal"));
        Colors.add(new Words("White ", "B yad"));
        Colors.add(new Words("Yellow", "Ssfar"));

        WordAdapter word_Adapter = new WordAdapter(this, Colors);

        ListView ColorsView = (ListView) findViewById(R.id.List);
        ColorsView.setAdapter(word_Adapter);
    }
}
