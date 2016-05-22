package com.mmucsy.sawn;

/**
 * Created by pyaesone on 5/20/16.
 */
public class Timetable {

    public String day_eng;
    public String day_arabic;
    public String time_start;
    public String time_end;

    public Timetable(String day_eng, String day_arabic, String time_start, String time_end) {
        this.day_eng = day_eng;
        this.day_arabic = day_arabic;
        this.time_start = time_start;
        this.time_end = time_end;
    }


    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getDay_arabic() {
        return day_arabic;
    }

    public void setDay_arabic(String day_arabic) {
        this.day_arabic = day_arabic;
    }

    public String getDay_eng() {
        return day_eng;
    }

    public void setDay_eng(String day_eng) {
        this.day_eng = day_eng;
    }


}
