package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class g01 {
    public String a;
    public String d;
    public ArrayList g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;
    public final ArrayList f = vr.N("");

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iN0 = y93.n0(str, '&', i, 4);
            if (iN0 == -1) {
                iN0 = str.length();
            }
            int iN02 = y93.n0(str, '=', i, 4);
            if (iN02 == -1 || iN02 > iN0) {
                arrayList.add(str.substring(i, iN0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iN02));
                arrayList.add(str.substring(iN02 + 1, iN0));
            }
            i = iN0 + 1;
        }
        return arrayList;
    }

    public final i01 a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            c.q("scheme == null");
            return null;
        }
        String strX = cl3.x(this.b, 0, 0, 7);
        String strX2 = cl3.x(this.c, 0, 0, 7);
        String str2 = this.d;
        if (str2 == null) {
            c.q("host == null");
            return null;
        }
        int iB = b();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(rx.d0(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(cl3.x((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(rx.d0(arrayList4, 10));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? cl3.x(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new i01(str, strX, strX2, str2, iB, arrayList3, arrayList, str4 != null ? cl3.x(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.i01 r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g01.c(i01, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g01.toString():java.lang.String");
    }
}
