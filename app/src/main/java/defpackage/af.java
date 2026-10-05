package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final af subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            n21.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.g;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        af afVar = bf.a;
        if (i > i2) {
            n21.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.f;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ze zeVar = (ze) list.get(i3);
                int i4 = zeVar.b;
                int i5 = zeVar.c;
                if (bf.b(i, i2, i4, i5)) {
                    arrayList.add(new ze(zeVar.a, Math.max(i, zeVar.b) - i, Math.min(i2, i5) - i, zeVar.d));
                }
            }
            if (arrayList.isEmpty()) {
            }
        }
        return new af(arrayList, strSubstring);
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
