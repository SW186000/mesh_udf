package com.company;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * Created by sachio on 2016/10/15.
 */

public final class MeshUtil extends UDF {
    public String evaluate(final double lat, final double lon, String mesh_size)
    {
        Mesh_base chk_data = new Mesh_base(lat, lon);

        if (chk_data.validate_chk()) {
            if (mesh_size.equals("1st")) {
                Mesh_1st mesh = new Mesh_1st(lat,lon);
                return mesh.mesh_1st();
            }
            else if (mesh_size.equals("2nd")){
                Mesh_2nd mesh = new Mesh_2nd(lat,lon);
                return mesh.mesh_2nd();
            }
            else if (mesh_size.equals("1km")){
                Mesh_1km mesh = new Mesh_1km(lat,lon);
                return mesh.mesh_1km();
            }
            else if (mesh_size.equals("500m")){
                Mesh_500m mesh = new Mesh_500m(lat,lon);
                return mesh.mesh_500m();
            }
            else if (mesh_size.equals("250m")){
                Mesh_250m mesh = new Mesh_250m(lat,lon);
                return mesh.mesh_250m();
            }
            else return null;
        }
        else return null;
    }

}