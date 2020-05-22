package digiplus.ma.mydarijaapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.ViewPager);
        Category_Fragment_Adapter adapter = new Category_Fragment_Adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
