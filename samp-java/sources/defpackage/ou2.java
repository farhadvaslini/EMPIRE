package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ou2 implements Comparable {
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;

    public ou2(String str, String str2, String str3, List list, List list2) {
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = list;
        this.j = list2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ou2 ou2Var) {
        ou2Var.getClass();
        List list = ou2Var.i;
        int i = n32.i(this.f, ou2Var.f);
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        int i2 = n32.i(this.g, ou2Var.g);
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i2 == 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            return numValueOf2.intValue();
        }
        int i3 = n32.i(this.h, ou2Var.h);
        Integer numValueOf3 = Integer.valueOf(i3);
        if (i3 == 0) {
            numValueOf3 = null;
        }
        if (numValueOf3 != null) {
            return numValueOf3.intValue();
        }
        List list2 = this.i;
        if (list2.isEmpty() && !list.isEmpty()) {
            return 1;
        }
        if (!list2.isEmpty() && list.isEmpty()) {
            return -1;
        }
        int iMin = Math.min(list2.size(), list.size());
        for (int i4 = 0; i4 < iMin; i4++) {
            String str = (String) list2.get(i4);
            String str2 = (String) list.get(i4);
            boolean zR = n32.r(str);
            boolean zR2 = n32.r(str2);
            int i5 = (zR && zR2) ? n32.i(str, str2) : zR != zR2 ? zR ? -1 : 1 : str.compareTo(str2);
            Integer numValueOf4 = Integer.valueOf(i5);
            if (i5 == 0) {
                numValueOf4 = null;
            }
            if (numValueOf4 != null) {
                return numValueOf4.intValue();
            }
        }
        return s51.r(list2.size(), list.size());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou2)) {
            return false;
        }
        ou2 ou2Var = (ou2) obj;
        return s51.n(this.f, ou2Var.f) && s51.n(this.g, ou2Var.g) && s51.n(this.h, ou2Var.h) && this.i.equals(ou2Var.i) && this.j.equals(ou2Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + by1.a(by1.a(this.f.hashCode() * 31, 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('.');
        sb.append(this.g);
        sb.append('.');
        sb.append(this.h);
        List list = this.i;
        if (!list.isEmpty()) {
            sb.append('-');
            sb.append(qx.x0(list, ".", null, null, null, 62));
        }
        List list2 = this.j;
        if (!list2.isEmpty()) {
            sb.append('+');
            sb.append(qx.x0(list2, ".", null, null, null, 62));
        }
        return sb.toString();
    }
}
