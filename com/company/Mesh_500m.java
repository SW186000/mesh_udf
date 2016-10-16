package com.company;

/**
 * Created by sachio on 2016/10/15.
 */
public class Mesh_500m extends Mesh_1km{
    static double lat_cell_500m = (double)(15) / (double) (3600);
    static double lon_cell_500m = (double)(22.5) / (double) (3600);

    double lon_mod_1km;
    double lat_mod_1km;

    Mesh_500m(double lat, double lon){
        super(lat,lon);
        this.lat_mod_1km = lat_mod_2nd  - mesh_lat_1km() * lat_cell_1km;
        this.lon_mod_1km = lon_mod_2nd  - mesh_lon_1km() * lon_cell_1km;
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
            String mesh_1km = mesh_1km();
            String mlatlon1 = mesh_latlon_500m();
            StringBuilder ans = new StringBuilder();
            ans.append(mesh_1km);
            ans.append(mlatlon1);
            return ans.toString();
        }
        else return null;


    }

}
