package com.company;

/**
 * Created by sachio on 2016/10/15.
 */
public class Mesh_250m extends Mesh_500m{
    static double lat_cell_250m = 7.5 / (double) (3600);
    static double lon_cell_250m = 11.25 / (double) (3600);

    String mesh_250m;
    double lon_mod_500m;
    double lat_mod_500m;

    Mesh_250m(double lat, double lon){
        super(lat,lon);
        this.mesh_250m = mesh_250m();
    }

    String mesh_latlon_250m(){
        int mesh_250m_lat;
        int mesh_250m_lon;
        if (lat_mod_500m > lat_cell_250m) {
            mesh_250m_lat = 1;
        }
        else {
            mesh_250m_lat = 0;
        };
        if ( lon_mod_500m > lon_cell_250m){
            mesh_250m_lon = 2;
        }
        else {
            mesh_250m_lon = 0;
        };

        String mesh_latlon_250m = Integer.toString(mesh_250m_lat + mesh_250m_lon);

        return mesh_latlon_250m;
    }

    String mesh_250m(){
        if (validate_chk() ) {
            String mlatlon1 = mesh_latlon_250m();
        /* String mlat2 = Integer.toString(mesh_lon_2nd()); */
            StringBuilder ans = new StringBuilder();
            ans.append(mesh_500m);
            ans.append(mlatlon1);
            return ans.toString();
        }
        else return null;

    }
}
