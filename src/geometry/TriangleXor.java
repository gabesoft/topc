package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 587 Division I Level Two - 550
// geometry, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12528&rd=15699
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+587
public class TriangleXor {
    public int theArea(int W) {
        Triangle[] triangles = new Triangle[W + 1];

        for (int i = 0; i < W + 1; i++) {
            triangles[i] = new Triangle(0, 1, i, 0, W, 1);
        }

        double sum  = triangles[0].area;
        double area = 0;
        double mul  = 1;

        for (int i = 1; i < triangles.length; i++) {
            Triangle intersection = triangles[i].intersect(triangles[0]);

            mul   = -mul;
            area += mul * 2 * intersection.area;
            sum  += triangles[i].area;
            sum  += area;
        }

        return (int)Math.floor(sum);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Triangle {
        double p1[];
        double p2[];
        double p3[];
        public final double area;

        public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
            p1 = new double[] { x1, y1 };
            p2 = new double[] { x2, y2 };
            p3 = new double[] { x3, y3 };
            area = calculateArea();
        }

        private double calculateArea() {
            double[] a = p1;
            double[] b = p2;
            double[] c = p3;

            double[] ab = new double[2];
            double[] ac = new double[2];

            ab[0] = b[0] - a[0];
            ab[1] = b[1] - a[1];

            ac[0] = c[0] - a[0];
            ac[1] = c[1] - a[1];

            return Math.abs(ab[0] * ac[1] - ab[1] * ac[0]) / 2.0;
        }

        public Triangle intersect(Triangle t) {
            Triangle t1 = p2[0] < t.p2[0] ? this : t;
            Triangle t2 = p2[0] > t.p2[0] ? this : t;
            double[] p  = intersection(t1.p2, t1.p3, t2.p1, t2.p2);
            return new Triangle(p1[0], p1[1], p[0], p[1], p3[0], p3[1]);
        }

        private double[] intersection(double[] p1, double[] p2, double[] p3, double[] p4) {
            double a1 = p2[1] - p1[1];
            double b1 = p1[0] - p2[0];
            double c1 = a1 * p1[0] + b1 * p1[1];

            double a2 = p4[1] - p3[1];
            double b2 = p3[0] - p4[0];
            double c2 = a2 * p3[0] + b2 * p3[1];

            double det = a1 * b2 - a2 * b1;
            //debug(p1, p2, p3, p4, det);
            if (det == 0) {
                return null;
            } else {
                return new double[] { (b2 * c1 - b1 * c2) / det, (a1 * c2 - a2 * c1) / det };
            }
        }

        public String toString() {
            return String.format("(%.2f,%.2f)-(%.2f,%.2f)-(%.2f,%.2f)", p1[0], p1[1], p2[0], p2[1], p3[0], p3[1]);
        }
    }
}
