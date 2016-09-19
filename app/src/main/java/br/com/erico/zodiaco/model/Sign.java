package br.com.erico.zodiaco.model;

import java.util.Calendar;

import br.com.erico.zodiaco.R;

/**
 * Created by erico on 9/17/16.
 */
public enum Sign {

    AQUARIUS("aquarius", R.drawable.aquario, 20, Calendar.JANUARY, 18, Calendar.FEBRUARY),
    PISCES("pisces", R.drawable.peixes, 19, Calendar.FEBRUARY, 20, Calendar.MARCH),
    ARIES("aries", R.drawable.aries, 21, Calendar.MARCH, 19, Calendar.APRIL),
    TAUROS("tauros", R.drawable.touro, 20, Calendar.APRIL, 20, Calendar.MAY),
    GEMINI("gemini", R.drawable.gemeos, 21, Calendar.MAY, 20, Calendar.JUNE),
    CANCER("cancer", R.drawable.cancer, 21, Calendar.JUNE, 22, Calendar.JULY),
    LEO("leo", R.drawable.leao, 23, Calendar.JULY, 22, Calendar.AUGUST),
    VIRGO("virgo", R.drawable.virgem, 23, Calendar.AUGUST, 22, Calendar.SEPTEMBER),
    LIBRA("libra", R.drawable.libra, 23, Calendar.SEPTEMBER, 22, Calendar.OCTOBER),
    SCORPIO("scorpio", R.drawable.escorpiao, 23, Calendar.OCTOBER, 21, Calendar.NOVEMBER),
    SAGITTARIUS("sagittarius", R.drawable.sagitario, 22, Calendar.NOVEMBER, 21, Calendar.DECEMBER),
    CAPRICORN("capricorn", R.drawable.capricornio, 22, Calendar.DECEMBER, 19, Calendar.JANUARY);


    private String name;
    private int image;
    private Calendar startDate;
    private Calendar endDate;

    Sign(String name, int image, int startDay, int startMonth, int endDay, int endMonth) {
        Calendar startDate = Calendar.getInstance();
        startDate.set(Calendar.MONTH, startMonth);
        startDate.set(Calendar.DAY_OF_MONTH, startDay);
        this.startDate = startDate;

        Calendar endDate = Calendar.getInstance();
        endDate.set(Calendar.MONTH, endMonth);
        endDate.set(Calendar.DAY_OF_MONTH, endDay);
        this.endDate = endDate;

        this.name = name;
        this.image = image;
    }

    public boolean isSign(int day, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month);
        return !(calendar.before(startDate) || calendar.after(endDate));
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
