package com.xy.demo;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Spittle {

    private final Long id;
    private final String message;
    private final Date date;
    private Double latitude;
    private Double longtitude;

    public Spittle(String message, Date date) {
        this(message, date, null, null);
    }

    public Spittle(String message, Date date, Double latitude, Double longtitude) {
        this.id = null;
        this.date = date;
        this.message = message;
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    @NotNull
    public long getId() {
        return id;
    }

    @NotNull
    public String getMessage() {
        return message;
    }

    @NotNull
    public Date getDate() {
        return date;
    }

    @NotNull
    public Double getLatitude() {
        return latitude;
    }

    @NotNull
    public Double getLongtitude() {
        return longtitude;
    }

//    @Override
//    public boolean equals(Object that) {
//        if (!(that instanceof Spittle)) {
//            return false;
//        }
//
//        Spittle rhs = (Spittle)that;
//
//        return true;
//    }
}
