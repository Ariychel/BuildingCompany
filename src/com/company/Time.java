package com.company;

import java.util.Objects;

public class Time {
    private int months, weeks, days, hours, minutes, seconds;
    private double years;

    public Time(){
        days = 365;
        years = days / 365;
        months = days / 30;
        weeks = days / 7;
        hours = days * 24;
        minutes = hours * 60;
        seconds = minutes * 60;
    }

    public Time(int days){
        this.days = days;
        years = days / 365;
        months = days / 30;
        weeks = days / 7;
        hours = days * 24;
        minutes = hours * 60;
        seconds = minutes * 60;
    }

    public void setHowLongItTakes(int days){
        this.days = days;
        years = days / 365;
        months = days / 30;
        weeks = days / 7;
        hours = days * 24;
        minutes = hours * 60;
        seconds = minutes * 60;
    }

    public int getDays(){
        return days;
    }

    public double getYears(){
        return years;
    }

    public int getMonths(){
        return months;
    }

    public int getWeeks(){
        return weeks;
    }

    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    @Override
    public String toString() {
        return "Time{" +
                "months=" + months +
                ", weeks=" + weeks +
                ", days=" + days +
                ", hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                ", years=" + years +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return months == time.months &&
                weeks == time.weeks &&
                days == time.days &&
                hours == time.hours &&
                minutes == time.minutes &&
                seconds == time.seconds &&
                Double.compare(time.years, years) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(months, weeks, days, hours, minutes, seconds, years);
    }

}
