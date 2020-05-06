package digiplus.ma.mydarijaapp;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        LinearLayout NumRootView = (LinearLayout) findViewById(R.id.RootView);
        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        for ( int Idx = 0; Idx < words.size(); Idx++){
            TextView N_wordView = new TextView(this);
            N_wordView.setText(words.get(Idx));
            NumRootView.addView(N_wordView);
        }

    }
}
