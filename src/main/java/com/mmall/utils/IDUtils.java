package com.mmall.utils;

import java.text.NumberFormat;

public class IDUtils {

    public static int archives_no(int length,String s) {
            // StringBuilder sb=new StringBuilder();
            int old = s.length();
            if (length > old) {
                char[] c = new char[length];
                char[] x = s.toCharArray();
                if (x.length > length) {
                    throw new IllegalArgumentException(
                            "Numeric value is larger than intended length: " + s
                                    + " LEN " + length);
                }
                int lim = c.length - x.length;
                for (int i = 0; i < lim; i++) {
                    c[i] = '0';
                }
                System.arraycopy(x, 0, c, lim, x.length);
                return Integer.parseInt(new String(c));
            }
            return Integer.parseInt(s.substring(0, length));

        }

}
