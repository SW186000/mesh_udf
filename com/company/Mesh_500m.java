package com.company;

/**
 * Created by sachio on 2016/10/15.
 */
public class Mesh_500m extends Mesh_1km{
    static double lat_cell_500m = (double)(15) / (double) (3600);
    static double lon_cell_500m = 22.5 / (double) (3600);

    String mesh_500m;
    double lon_mod_500m;
    double lat_mod_500m;

    Mesh_500m(double lat, double lon){
        super(lat,lon);
        this.mesh_500m = mesh_500m();
        if (lat_mod_1km > lat_cell_500m) { this.lat_mod_500m = lat_mod_1km - lat_cell_500m; } else {this.lat_mod_500m = lat_mod_1km;}
        if (lon_mod_1km > lon_cell_500m) { this.lon_mod_500m = lon_mod_1km - lon_cell_500m; } else {this.lon_mod_500m = lon_mod_1km;}
    }

    String mesh_latlon_500m(){
        int mesh_500m_lat;
        int mesh_500m_lon;
        if (lat_mod_1km > lat_cell_500m) {
            mesh_500m_lat = 1;
        }
        else {
            mesh_500m_lat = 0;
        };
        if ( lon_mod_1km > lon_cell_500m){
            mesh_500m_lon = 2;
        }
        else {
            mesh_500m_lon = 0;
        };

        String mesh_latlon_500m = Integer.toString(mesh_500m_lat + mesh_500m_lon);

        return mesh_latlon_500m;
    }

    String mesh_500m(){
        if (validate_chk() ) {
            String mlatlon1 = mesh_latlon_500m();
            StringBuilder ans = new StringBuilder();
            ans.append(this.mesh_1km);
            ans.append(mlatlon1);
            return ans.toString();
        }
        else return null;


    }

}
