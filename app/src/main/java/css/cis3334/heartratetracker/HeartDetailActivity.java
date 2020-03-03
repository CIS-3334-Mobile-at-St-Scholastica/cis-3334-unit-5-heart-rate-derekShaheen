package css.cis3334.heartratetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HeartDetailActivity extends AppCompatActivity {

    TextView tvPulseDet;
    TextView tvRangeDet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_detail);

        tvPulseDet = (TextView) findViewById(R.id.tvPulseDet);
        tvRangeDet = (TextView) findViewById(R.id.tvRangeDet);

        Bundle extras = getIntent().getExtras();
        HeartRate hr = (HeartRate) extras.getSerializable(MainActivity.HEARTRATE_KEY);
        tvPulseDet.setText(String.valueOf(hr.getPulse()));
        tvRangeDet.setText(hr.getRangeName());
    }
}
