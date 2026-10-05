package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class z93 extends y02 {
    public static String U(String str) {
        Comparable comparable;
        String strSubstring;
        List listS0 = y93.s0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS0) {
            if (!y93.q0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(rx.d0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!ur.I(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listS0.size();
        int size2 = listS0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listS0) {
            int i3 = i + 1;
            if (i < 0) {
                vr.b0();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i == 0 || i == size2) && y93.q0(str3)) {
                strSubstring = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    c.g(by1.h("Requested character count ", " is less than zero.", iIntValue));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        qx.w0(arrayList3, sb, "\n", null, 124);
        return sb.toString();
    }

    public static String V(String str) {
        if (y93.q0("|")) {
            c.p("marginPrefix must be non-blank string.");
            return null;
        }
        List listS0 = y93.s0(str);
        int length = str.length();
        listS0.size();
        int size = listS0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listS0) {
            int i2 = i + 1;
            if (i < 0) {
                vr.b0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && y93.q0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!ur.I(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && fa3.d0(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        qx.w0(arrayList, sb, "\n", null, 124);
        return sb.toString();
    }
}
