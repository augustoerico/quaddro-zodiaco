package br.com.erico.zodiaco.services;

import java.util.Calendar;
import java.util.Date;

import br.com.erico.zodiaco.model.Sign;

/**
 * Created by erico on 9/17/16.
 */
public class SignService {

    public static Sign getSign(int day, int month) {
        Sign sign = null;

        if (Sign.AQUARIUS.isSign(day, month)) {
            sign = Sign.AQUARIUS;
        } else if (Sign.ARIES.isSign(day, month)) {
            sign = Sign.ARIES;
        } else if (Sign.CANCER.isSign(day, month)) {
            sign = Sign.CANCER;
        } else if (Sign.CAPRICORN.isSign(day, month)) {
            sign = Sign.CAPRICORN;
        } else if (Sign.GEMINI.isSign(day, month)) {
            sign = Sign.GEMINI;
        } else if (Sign.LEO.isSign(day, month)) {
            sign = Sign.LEO;
        } else if (Sign.LIBRA.isSign(day, month)) {
            sign = Sign.LIBRA;
        } else if (Sign.PISCES.isSign(day, month)) {
            sign = Sign.PISCES;
        } else if (Sign.SAGITTARIUS.isSign(day, month)) {
            sign = Sign.SAGITTARIUS;
        } else if (Sign.SCORPIO.isSign(day, month)) {
            sign = Sign.SCORPIO;
        } else if (Sign.TAUROS.isSign(day, month)) {
            sign = Sign.TAUROS;
        } else if (Sign.VIRGO.isSign(day, month)) {
            sign = Sign.VIRGO;
        }

        return  sign;
    }

}
