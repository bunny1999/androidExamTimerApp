package in.irotech.examtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1;
    TextView textView;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1=MediaPlayer.create(getApplicationContext(),R.raw.three);
        textView=findViewById(R.id.textView2);
        textView1=findViewById(R.id.textView3);

        new CountDownTimer(10000,1000){
            @Override
            public void onTick(long l) {
                textView.setText(String.valueOf(l/1000));
            }

            @Override
            public void onFinish() {
                textView1.setText("Done!");
                textView1.setTextColor(Color.parseColor("#6AB04A"));
                m1.start();
            }
        }.start();
    }
}
