package digiplus.ma.mydarijaapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        //LinearLayout NumRootView = (LinearLayout) findViewById(R.id.RootView);
        final ArrayList<Words> word_s = new ArrayList<Words>();
        //Words w = new Words("One, Ouahed");
        //Word_s.add(w);
        word_s.add(new Words(R.mipmap.ic_launcher,"One", "Ouahed", R.raw.color_black));
        word_s.add(new Words(R.mipmap.ic_launcher,"Tow", "Jouj", R.raw.color_red));
        word_s.add(new Words(R.mipmap.ic_launcher,"Three", "Talata", R.raw.color_white));
        word_s.add(new Words(R.mipmap.ic_launcher,"Four", "Rabaa", R.raw.color_black));
        word_s.add(new Words(R.mipmap.ic_launcher,"Five", "Khamssa", R.raw.color_red));
        word_s.add(new Words(R.mipmap.ic_launcher,"Six", "Sst'a", R.raw.color_white));
        word_s.add(new Words(R.mipmap.ic_launcher,"Seven", "Sab'a", R.raw.color_black));
        word_s.add(new Words(R.mipmap.ic_launcher,"Eight", "Tmaniya", R.raw.color_red));
        word_s.add(new Words(R.mipmap.ic_launcher,"Nine", "Tiss'a", R.raw.color_white));
        word_s.add(new Words(R.mipmap.ic_launcher,"Ten", "Achara", R.raw.color_black));
        //words.add("One");
        //words.add("Two");

        WordAdapter itemsAdapter = new WordAdapter(this, word_s, R.color.Number);
        ListView ListView = (ListView) findViewById(R.id.List);
        ListView.setAdapter(itemsAdapter);
        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(NumberActivity.this, "Hello ! ", Toast.LENGTH_LONG).show();
                Words Words = word_s.get(position);
                //mediaPlayer = MediaPlayer.create(NumberActivity.this, R.raw.color_red);
                mediaPlayer = MediaPlayer.create(NumberActivity.this, Words.getmAudioRES());
                mediaPlayer.start();
            }
        });
    }
}
