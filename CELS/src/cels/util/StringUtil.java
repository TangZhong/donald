package cels.util;

/**
 * Created by donald.tang on 2019/5/30.
 */
public class StringUtil {

    public static String join(Object[] array, char separator, int startIndex, int endIndex) {
        if(array == null) {
            return null;
        } else {
            int noOfItems = endIndex - startIndex;
            if(noOfItems <= 0) {
                return "";
            } else {
                StringBuilder buf = new StringBuilder(noOfItems * 16);

                for(int i = startIndex; i < endIndex; ++i) {
                    if(i > startIndex) {
                        buf.append(separator);
                    }

                    if(array[i] != null) {
                        buf.append(array[i]);
                    }
                }

                return buf.toString();
            }
        }
    }

    public static String toString(String[] strArr) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < strArr.length; ++i) {
            if(strArr[i].trim().length() == 0) {
                System.out.println("---------------------" + strArr[i]);
            }

            builder.append(strArr[i]);
            if(i != strArr.length - 1) {
                builder.append(",");
            }
        }

        return builder.toString();
    }

    public static String[] toStringArray(String str) {
        return str.split(",");
    }

}
