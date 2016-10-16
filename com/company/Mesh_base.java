package com.company;

/**
 * Created by sachio on 2016/10/15.
 */
public class Mesh_base  {

    double lat;
    double lon;

    Mesh_base(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    boolean validate_chk(){
        return !(lat < 22 || lon < 132 || lat > 55 || lon > 155);

    }

    int to_minute(double rad){
        int minute;
        if (rad < 0) {
            return 0;
        }

        /* 度について、整数部分を取り出して、小数部分だけを60倍して整数 */
        minute = (int)((rad - (int) (rad) ) * 60);
        return minute;

    }

    int to_second(double rad){
        int second;
        if (rad < 0) {
            return 0;
        }

        int minute = to_minute(rad);

        /* 度について、整数部を引いて、分の60分の1を引いて、小数部分だけを60倍して整数 */
        second = (int) ((rad - (int) (rad) - ((minute) / 60)) * 60);

        return second;

    }

}
