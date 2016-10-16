package com.company;

/**
 * Created by sachio on 2016/10/15.
 */
public class Mesh_1km extends Mesh_2nd{

    static double lat_cell_1km = (double)(30) / (double) (3600);
    static double lon_cell_1km = (double)(45) / (double) (3600);

    double lon_mod_2nd;
    double lat_mod_2nd;

    Mesh_1km(double lat, double lon){
        super(lat,lon);
        this.lat_mod_2nd = lat_mod_1st - mesh_lat_2nd() * lat_cell_2nd;
        this.lon_mod_2nd = lon_mod_1st - mesh_lon_2nd() * lon_cell_2nd;
    }

    int mesh_lat_1km(){
        return (int)(lat_mod_2nd / lat_cell_1km);
    }

    int mesh_lon_1km(){

        return (int) (lon_mod_2nd / lon_cell_1km);
    }

    String mesh_1km(){
        if (validate_chk() ) {
            String mesh_2nd = mesh_2nd();
            String mlon3 = Integer.toString(mesh_lon_1km());
            String mlat3 = Integer.toString(mesh_lat_1km());
            StringBuilder ans = new StringBuilder();
            ans.append(mesh_2nd);
            ans.append(mlat3);
            ans.append(mlon3);
            return ans.toString();
        }
        else return null;

    }

}
