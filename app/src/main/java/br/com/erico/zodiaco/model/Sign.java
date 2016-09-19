package br.com.erico.zodiaco.model;

import java.util.Calendar;

import br.com.erico.zodiaco.R;

/**
 * Created by erico on 9/17/16.
 */
public enum Sign {

    AQUARIUS("Aquarius", R.drawable.aquario, 20, Calendar.JANUARY, 18, Calendar.FEBRUARY),
    PISCES("Pisces", R.drawable.peixes, 19, Calendar.FEBRUARY, 20, Calendar.MARCH),
    ARIES("Aries", R.drawable.aries, 21, Calendar.MARCH, 19, Calendar.APRIL),
    TAUROS("Tauros", R.drawable.touro, 20, Calendar.APRIL, 20, Calendar.MAY),
    GEMINI("Gemini", R.drawable.gemeos, 21, Calendar.MAY, 20, Calendar.JUNE),
    CANCER("Cancer", R.drawable.cancer, 21, Calendar.JUNE, 22, Calendar.JULY),
    LEO("Leo", R.drawable.leao, 23, Calendar.JULY, 22, Calendar.AUGUST),
    VIRGO("Virgo", R.drawable.virgem, 23, Calendar.AUGUST, 22, Calendar.SEPTEMBER),
    LIBRA("Libra", R.drawable.libra, 23, Calendar.SEPTEMBER, 22, Calendar.OCTOBER),
    SCORPIO("Scorpio", R.drawable.escorpiao, 23, Calendar.OCTOBER, 21, Calendar.NOVEMBER),
    SAGITTARIUS("Sagittarius", R.drawable.sagitario, 22, Calendar.NOVEMBER, 21, Calendar.DECEMBER),
    CAPRICORN("Capricorn", R.drawable.capricornio, 22, Calendar.DECEMBER, 19, Calendar.JANUARY);


    private String name;
    private int image;
    private int startMonth;
    private int startDay;
    private int endMonth;
    private int endDay;

    Sign(String name, int image, int startDay, int startMonth, int endDay, int endMonth) {
        this.startMonth = startMonth;
        this.startDay = startDay;
        this.endMonth = endMonth;
        this.endDay = endDay;
        this.name = name;
        this.image = image;
    }

    public boolean isSign(int day, int month) {
        if (month == startMonth) {
            return day >= startDay;
        } else if (month == endMonth) {
            return day <= endDay;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getStartDay() {
        return startDay;
    }

    public int getStartMonth() {
        return  startMonth;
    }

    public int getEndDay() {
        return endDay;
    }

    public int getEndMonth() {
        return endMonth;
    }
}
