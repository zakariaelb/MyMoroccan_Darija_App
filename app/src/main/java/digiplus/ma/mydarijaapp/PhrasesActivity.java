package digiplus.ma.mydarijaapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        final ArrayList<Words> Colors = new ArrayList<Words>();
        Colors.add(new Words("Where are you going?", "Kidayer ?",
                R.raw.color_black));
        Colors.add(new Words("What is your name?", "Chno smitek ?", R.raw.color_red));
        Colors.add(new Words("My name is...", "Smiyti ...", R.raw.color_white));
        Colors.add(new Words("How are you feeling?", "Kidayer ?", R.raw.color_black));
        Colors.add(new Words("I’m feeling good.", "Labass.", R.raw.color_red));
        Colors.add(new Words("Are you coming?", "Wach radi tji ?", R.raw.color_white));
        Colors.add(new Words("Yes, I’m coming.", "ah, ana jay.", R.raw.color_black));
        Colors.add(new Words("I’m coming.", "Ana jay", R.raw.color_red));
        Colors.add(new Words("Let’s go.", "Yalah.", R.raw.color_white));
        Colors.add(new Words("Come here", "Aji hna", R.raw.color_black));

        WordAdapter word_Adapter = new WordAdapter(this, Colors, R.color.Phrases);

        ListView PhrasesView = (ListView) findViewById(R.id.List);
        PhrasesView.setAdapter(word_Adapter);
        PhrasesView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(NumberActivity.this, "Hello ! ", Toast.LENGTH_LONG).show();
                Words Words = Colors.get(position);
                releaseMediaPlayer();
                //mediaPlayer = MediaPlayer.create(NumberActivity.this, R.raw.color_red);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, Words.getmAudioRES());
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
        private void releaseMediaPlayer() {
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
