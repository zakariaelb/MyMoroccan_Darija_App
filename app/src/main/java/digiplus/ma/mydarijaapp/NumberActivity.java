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
        ArrayList<Words> word_s = new ArrayList<Words>();
        //Words w = new Words("One, Ouahed");
        //Word_s.add(w);
        word_s.add(new Words(R.mipmap.ic_launcher,"One", "Ouahed"));
        word_s.add(new Words(R.mipmap.ic_launcher,"Tow", "Jouj"));
        word_s.add(new Words(R.mipmap.ic_launcher,"Three", "Talata"));
        word_s.add(new Words(R.mipmap.ic_launcher,"Four", "Rabaa"));
        word_s.add(new Words(R.mipmap.ic_launcher,"Five", "Khamssa"));
        word_s.add(new Words(R.mipmap.ic_launcher,"Six", "Sst'a"));
        word_s.add(new Words(R.mipmap.ic_launcher,"Seven", "Sab'a"));
        word_s.add(new Words(R.mipmap.ic_launcher,"Eight", "Tmaniya"));
        word_s.add(new Words(R.mipmap.ic_launcher,"Nine", "Tiss'a"));
        word_s.add(new Words(R.mipmap.ic_launcher,"Ten", "Achara"));
        //words.add("One");
        //words.add("Two");

        WordAdapter itemsAdapter = new WordAdapter(this, word_s, R.color.Number);
        ListView listView = (ListView) findViewById(R.id.List);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(NumberActivity.this, "Hello ! ", Toast.LENGTH_LONG).show();
                mediaPlayer = MediaPlayer.create(NumberActivity.this, R.raw.color_red);
                mediaPlayer.start();
            }
        });
    }
}
