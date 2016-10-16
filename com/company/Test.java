package com.company;

public class Test {

    public static void main(String[] args) {
	// write your code here
        Mesh_base test = new Mesh_base(38.13455658,140.36132813);
        boolean ans = test.validate_chk();
        System.out.println(ans);
        Mesh_250m test2 = new Mesh_250m(38.13455658,140.36132813);
        String mesh_2nd = test2.mesh_250m();
        /* int mesh_1st = test2.mesh_lat_1st(38.13455658); */
        System.out.println(mesh_2nd);

    }

}
