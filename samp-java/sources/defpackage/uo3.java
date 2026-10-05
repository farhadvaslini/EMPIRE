package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class uo3 extends wo3 implements Iterable, t61 {
    public final String f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final List n;
    public final List o;

    public uo3(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.f = str;
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = f4;
        this.k = f5;
        this.l = f6;
        this.m = f7;
        this.n = list;
        this.o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof uo3)) {
            uo3 uo3Var = (uo3) obj;
            return s51.n(this.f, uo3Var.f) && this.g == uo3Var.g && this.h == uo3Var.h && this.i == uo3Var.i && this.j == uo3Var.j && this.k == uo3Var.k && this.l == uo3Var.l && this.m == uo3Var.m && s51.n(this.n, uo3Var.n) && s51.n(this.o, uo3Var.o);
        }
        return false;
    }

    public final int hashCode() {
        return this.o.hashCode() + ((this.n.hashCode() + nc2.a(nc2.a(nc2.a(nc2.a(nc2.a(nc2.a(nc2.a(this.f.hashCode() * 31, this.g, 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31), this.l, 31), this.m, 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t52(this);
    }
}
