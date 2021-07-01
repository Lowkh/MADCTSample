package sg.edu.np.mad.mad2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getSharedPreferences("mad2021", Context.MODE_PRIVATE);
        boolean toSkip = preferences.getBoolean("skip", false);

        CheckBox skipSwitch = findViewById(R.id.checkBoxSkip);
        skipSwitch.setChecked(toSkip);
        skipSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            preferences.edit().putBoolean("skip", isChecked).apply();
            goNext();
        });

        if (toSkip) {
            goNext();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                goNext();
            }
        }, 3000);
    }

    private void goNext() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
        Intent intent = new Intent(MainActivity.this, CatalogueActivity.class);
        startActivity(intent);
    }
}