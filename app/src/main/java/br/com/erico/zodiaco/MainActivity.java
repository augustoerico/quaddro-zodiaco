package br.com.erico.zodiaco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

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

        Calendar calendar = Calendar.getInstance();
        Sign sign = SignService.getSign(calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH));

        updateInfo(sign);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int day) {
                Log.i("onSelectedDayChange", "" + year + "/" + month + "/" + day);
                Sign sign = SignService.getSign(day, month);
                Log.i("onSelectedDayChange", sign.getName());
                updateInfo(sign);
            }
        });

    }

    private void updateInfo(Sign sign) {
        signImage.setImageResource(sign.getImage());
        signDate.setText(
                String.format("%s - %s/%s to %s/%s",
                        sign.getName(),
                        sign.getStartDay(),
                        sign.getStartMonth(),
                        sign.getEndDay(),
                        sign.getEndMonth()
                ));
    }

}
