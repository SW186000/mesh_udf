package com.company;

/**
 * Created by sachio on 2016/10/15.
 */
public class Mesh_2nd extends Mesh_1st {

    static double lat_cell_2nd = (double)(5 * 60) / (double) (3600);
    static double lon_cell_2nd = (double)(7 * 60 + 30) / (double) (3600);

    double lon_mod_1st;
    double lat_mod_1st;

    Mesh_2nd(double lat, double lon){
        super(lat,lon);
        this.lat_mod_1st = lat - (mesh_lat_1st() / 1.5);
        this.lon_mod_1st = lon - (mesh_lon_1st() + 100);
    }

    int mesh_lat_2nd(){
        return (int)(lat_mod_1st / lat_cell_2nd);

    }

    int mesh_lon_2nd(){

        return (int) (lon_mod_1st / lon_cell_2nd);
    }

    String mesh_2nd(){
        if (validate_chk() ) {
            String mesh_1st = mesh_1st();
            String mlon2 = Integer.toString(mesh_lon_2nd());
            String mlat2 = Integer.toString(mesh_lat_2nd());
            StringBuilder ans = new StringBuilder();
            ans.append(mesh_1st);
            ans.append(mlat2);
            ans.append(mlon2);
            return ans.toString();
        }
        else return null;

    }
}
