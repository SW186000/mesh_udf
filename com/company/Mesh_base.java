package com.company;

/**
 * Created by sachio on 2016/10/15.
 */
public class Mesh_base  {
    /* 日本の最大最小緯度経度 */
    static int max_degree_lat = 46;
    static int min_degree_lat = 21;
    static int max_degree_lon = 154;
    static int min_degree_lon = 123;

    double lat;
    double lon;

    Mesh_base(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    boolean validate_chk(){
        int degree_lat = to_degree(lat);
        int degree_lon = to_degree(lon);
        return !(lat < min_degree_lat || lon < min_degree_lon || lat > max_degree_lat || lon > max_degree_lon);

    }

    int to_degree(double rad){
        int degree;
        degree = (int)(rad);
        return degree;
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
