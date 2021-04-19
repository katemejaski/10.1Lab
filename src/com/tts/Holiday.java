package com.tts;

public class Holiday {

    private String name;
    private int month;
    private int date;


    public String getName() {
        return name;
    }
    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDate(int date) {
        this.date = date;
    }


    public Holiday() {

    }

    public Holiday(String name, int month, int date) {
        this.setName(name);
        this.setMonth(month);
        this.setDate(date);
    }

    public Holiday(String name, int month) {
        this.setName(name);
        this.setMonth(month);
        this.setDate(0);
    }

    public boolean isHoliday(int month, int date) {
        if (this.month == month && this.date == date) {
            return true;
        }else {
            return false;
        }
    }

    public String holidayInfo() {
        return this.name + " is on " + this.month + "/" + this.date + ".";
    }
}
