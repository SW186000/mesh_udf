package com.company;

/**
 * Created by sachio on 2016/10/16.
 */
public class Mesh_100m extends Mesh_1km {
    static double lat_cell_100m = (double)(3) / (double) (3600);
    static double lon_cell_100m = (4.5) / (double) (3600);

    double lon_mod_100m;
    double lat_mod_100m;
    String mesh_100m;

    Mesh_100m(double lat, double lon){
        super(lat,lon);
        this.mesh_100m = mesh_100m();
        this.lat_mod_100m = this.lat_mod_1km - mesh_lat_100m() * lat_cell_100m;
        this.lon_mod_100m = this.lon_mod_1km - mesh_lon_100m() * lon_cell_100m;
    }

    int mesh_lat_100m(){
        return (int)(lat_mod_1km / lat_cell_100m);
    }

    int mesh_lon_100m(){

        return (int)(lat_mod_1km / lat_cell_100m);
    }

    String mesh_100m(){
        if (validate_chk() ) {
            String mlon3 = Integer.toString(mesh_lon_100m());
            String mlat3 = Integer.toString(mesh_lat_100m());
            StringBuilder ans = new StringBuilder();
            ans.append(mesh_1km);
            ans.append(mlat3);
            ans.append(mlon3);
            return ans.toString();
        }
        else return null;

    }

}
