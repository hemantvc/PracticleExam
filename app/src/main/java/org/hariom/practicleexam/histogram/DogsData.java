package org.hariom.practicleexam.histogram;

import java.util.Date;

public class DogsData implements Comparable<DogsData> {
    private Date dailyDate;
    private double height;


    public DogsData(Date date, double height) {
        this.dailyDate = date;
        this.height = height;
    }

    public Date getDateTime() {
        return dailyDate;
    }


    @Override
    public int compareTo(DogsData object) {
        return getDateTime().compareTo(object.getDateTime());
    }
}
