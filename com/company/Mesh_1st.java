package com.company;

/**
 * Created by sachio on 2016/10/15.
 */
public class Mesh_1st extends Mesh_base {

    Mesh_1st(double lat, double lon){
        super(lat,lon);
    }

    int mesh_lon_1st() {
        /* 経度から100を除算 */
        return (int) (lon - 100);
    }

    int mesh_lat_1st(){
        /* 緯度を1.5倍した値の上2桁 */
        return (int)((lat * 1.5));
    }

    double lon_mod_1st(){
        /* 経度からの余りを取得する(単位：度) */
        return (double) (lon - mesh_lon_1st() + 100);
    }

    double lat_mod_1st(){
        /* 緯度からの余りを取得する(単位：度) */
        return (double) (lat - mesh_lat_1st() / 1.5);
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
