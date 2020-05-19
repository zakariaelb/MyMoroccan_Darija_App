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
        Colors.add(new Words(R.mipmap.ic_launcher,"Red", "Hmar"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Green", "Khdar"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Brown", "Kahoui"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Gray", "Rmadi"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Black", "K hal"));
        Colors.add(new Words(R.mipmap.ic_launcher,"White ", "B yad"));
        Colors.add(new Words(R.mipmap.ic_launcher,"Yellow", "Ssfar"));

        WordAdapter word_Adapter = new WordAdapter(this, Colors);

        ListView ColorsView = (ListView) findViewById(R.id.List);
        ColorsView.setAdapter(word_Adapter);
    }
}
