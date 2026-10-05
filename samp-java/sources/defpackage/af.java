package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class af implements CharSequence {
    public final List f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    static {
        ar2 ar2Var = er2.a;
    }

    public af(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f = list;
        this.g = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                ze zeVar = (ze) list.get(i);
                Object obj = zeVar.a;
                if (obj instanceof h83) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(zeVar);
                } else if (obj instanceof x32) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(zeVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.h = arrayList;
        this.i = arrayList2;
        List listG0 = arrayList2 != null ? qx.G0(arrayList2, new up0(6)) : null;
        if (listG0 == null || listG0.isEmpty()) {
            return;
        }
        int i2 = ((ze) qx.q0(listG0)).c;
        nr1 nr1Var = f41.a;
        nr1 nr1Var2 = new nr1(1);
        nr1Var2.a(i2);
        int size2 = listG0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            ze zeVar2 = (ze) listG0.get(i3);
            while (true) {
                if (nr1Var2.b == 0) {
                    break;
                }
                int iD = nr1Var2.d();
                if (zeVar2.b >= iD) {
                    nr1Var2.e(nr1Var2.b - 1);
                } else {
                    int i4 = zeVar2.c;
                    if (i4 > iD) {
                        n21.a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iD);
                    }
                }
            }
            nr1Var2.a(zeVar2.c);
        }
    }

    public final List a(int i) {
        List list = this.f;
        if (list == null) {
            return ni0.f;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            ze zeVar = (ze) obj;
            if ((zeVar.a instanceof og1) && bf.b(0, i, zeVar.b, zeVar.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final af b(ns0 ns0Var) {
        ye yeVar = new ye(this);
        ArrayList arrayList = yeVar.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ze zeVar = (ze) ns0Var.h(((xe) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new xe(zeVar.a, zeVar.b, zeVar.c, zeVar.d));
        }
        return yeVar.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.af subSequence(int r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 > r11) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            java.lang.String r2 = ")"
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.n21.a(r1)
        L26:
            java.lang.String r1 = r9.g
            if (r10 != 0) goto L31
            int r4 = r1.length()
            if (r11 != r4) goto L31
            return r9
        L31:
            java.lang.String r1 = r1.substring(r10, r11)
            af r4 = defpackage.bf.a
            if (r10 > r11) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r10)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r11)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.n21.a(r2)
        L54:
            java.util.List r9 = r9.f
            if (r9 != 0) goto L59
            goto L99
        L59:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r9.size()
            r2.<init>(r3)
            int r3 = r9.size()
        L66:
            if (r0 >= r3) goto L93
            java.lang.Object r4 = r9.get(r0)
            ze r4 = (defpackage.ze) r4
            int r5 = r4.b
            int r6 = r4.c
            boolean r5 = defpackage.bf.b(r10, r11, r5, r6)
            if (r5 == 0) goto L90
            ze r5 = new ze
            java.lang.Object r7 = r4.a
            int r8 = r4.b
            int r8 = java.lang.Math.max(r10, r8)
            int r8 = r8 - r10
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r10
            java.lang.String r4 = r4.d
            r5.<init>(r7, r8, r6, r4)
            r2.add(r5)
        L90:
            int r0 = r0 + 1
            goto L66
        L93:
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L9a
        L99:
            r2 = 0
        L9a:
            af r9 = new af
            r9.<init>(r2, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af.subSequence(int, int):af");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.g.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return s51.n(this.g, afVar.g) && s51.n(this.f, afVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        List list = this.f;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.g.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.g;
    }

    public /* synthetic */ af(String str) {
        this(str, ni0.f);
    }

    public af(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
