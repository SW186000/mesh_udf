package com.company;

/**
 * Created by sachio on 2016/10/15.
 */
public class Mesh_1st extends Mesh_base {

    double lat;
    double lon;
    double lat_mod_1st;
    double lon_mod_1st;
    String mesh_1st;

    Mesh_1st(double lat, double lon){
        super(lat,lon);
        this.mesh_1st = mesh_1st();
        this.lat_mod_1st = lat - (mesh_lat_1st() / 1.5);
        this.lon_mod_1st = lon - (mesh_lon_1st() + 100);
    }

    int mesh_lon_1st() {
        /* 経度から100を減算 */
        int degree = to_degree(lon);
        return degree - 100;
    }

    int mesh_lat_1st(){
        /* 緯度を1.5倍した値の上2桁 */
        int degree = to_degree(lat);
        return (int)((degree * 1.5));
    }

    String mesh_1st(){
        if (validate_chk() ) {
            String mlon = Integer.toString(mesh_lon_1st());
            String mlat = Integer.toString(mesh_lat_1st());
            StringBuilder ans = new StringBuilder();
            ans.append(mlat);
            ans.append(mlon);
            return ans.toString();
        }
        else return null;

    }

}
