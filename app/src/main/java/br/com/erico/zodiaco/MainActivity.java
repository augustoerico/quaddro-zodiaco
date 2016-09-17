package br.com.erico.zodiaco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.erico.zodiaco.model.Sign;
import br.com.erico.zodiaco.services.SignService;

public class MainActivity extends AppCompatActivity {

    private TextView signDate;
    private ImageView signImage;
    private CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signDate = (TextView) findViewById(R.id.signDate);
        signImage = (ImageView) findViewById(R.id.signImage);
        calendarView = (CalendarView) findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int day) {
                Log.i("onSelectedDayChange", "" + year + "/" + month + "/" + day);
                Sign sign = SignService.getSign(day, month);
                Log.i("onSelectedDayChange", sign.getName());
                signImage.setImageResource(sign.getImage());
            }
        });

    }

}
