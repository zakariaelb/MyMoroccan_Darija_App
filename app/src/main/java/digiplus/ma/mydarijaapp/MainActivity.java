package digiplus.ma.mydarijaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Numbers = (TextView) findViewById(R.id.button);
        TextView Family = (TextView) findViewById(R.id.button2);
        TextView Colors = (TextView) findViewById(R.id.button3);
        TextView Phrases = (TextView) findViewById(R.id.button4);

        Numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NumbersIntent = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(NumbersIntent);
            }
        });
            Family.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent FamilyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(FamilyIntent);
            }
        });
                Colors.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ColorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                        startActivity(ColorsIntent);
                    }
                });
                Phrases.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent PhrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                        startActivity(PhrasesIntent);
                    }
                });


    }
}
