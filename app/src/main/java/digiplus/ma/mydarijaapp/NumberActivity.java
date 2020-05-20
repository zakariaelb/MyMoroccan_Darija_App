package digiplus.ma.mydarijaapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
        }
    };

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
                releaseMediaPlayer();

                //mediaPlayer = MediaPlayer.create(NumberActivity.this, R.raw.color_red);
                mMediaPlayer = MediaPlayer.create(NumberActivity.this, Words.getmAudioRES());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    /**
         * HELPER METHOD Clean up the media player by releasing its resources.
         */

        private void releaseMediaPlayer(){
            // If the media player is not null, then it may be currently playing a sound.
            if (mMediaPlayer != null) {
                // Regardless of the current state of the media player, release its resources
                // because we no longer need it.
                mMediaPlayer.release();

                // Set the media player back to null. For our code, we've decided that
                // setting the media player to null is an easy way to tell that the media player
                // is not configured to play an audio file at the moment.
                mMediaPlayer = null;

        }
    }
}
