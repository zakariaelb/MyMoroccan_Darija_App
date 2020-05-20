package digiplus.ma.mydarijaapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
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
        Colors.add(new Words(R.mipmap.ic_launcher,"Red", "Hmar", R.raw.color_black));
        Colors.add(new Words(R.mipmap.ic_launcher,"Green", "Khdar", R.raw.color_red));
        Colors.add(new Words(R.mipmap.ic_launcher,"Brown", "Kahoui", R.raw.color_white));
        Colors.add(new Words(R.mipmap.ic_launcher,"Gray", "Rmadi", R.raw.color_black));
        Colors.add(new Words(R.mipmap.ic_launcher,"Black", "K hal", R.raw.color_red));
        Colors.add(new Words(R.mipmap.ic_launcher,"White ", "B yad", R.raw.color_white));
        Colors.add(new Words(R.mipmap.ic_launcher,"Yellow", "Ssfar", R.raw.color_black));

        WordAdapter word_Adapter = new WordAdapter(this, Colors, R.color.Colors);

        ListView ColorsView = (ListView) findViewById(R.id.List);
        ColorsView.setAdapter(word_Adapter);

        ColorsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(NumberActivity.this, "Hello ! ", Toast.LENGTH_LONG).show();
                Words Words = Colors.get(position);
                //mediaPlayer = MediaPlayer.create(NumberActivity.this, R.raw.color_red);
                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, Words.getmAudioRES());
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
