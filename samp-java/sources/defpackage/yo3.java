package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yo3 extends wo3 {
    public final String f;
    public final List g;
    public final int h;
    public final dp i;
    public final float j;
    public final dp k;
    public final float l;
    public final float m;
    public final int n;
    public final int o;
    public final float p;
    public final float q;
    public final float r;
    public final float s;

    public yo3(String str, List list, int i, dp dpVar, float f, dp dpVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.f = str;
        this.g = list;
        this.h = i;
        this.i = dpVar;
        this.j = f;
        this.k = dpVar2;
        this.l = f2;
        this.m = f3;
        this.n = i2;
        this.o = i3;
        this.p = f4;
        this.q = f5;
        this.r = f6;
        this.s = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yo3.class != obj.getClass()) {
            return false;
        }
        yo3 yo3Var = (yo3) obj;
        return this.f.equals(yo3Var.f) && s51.n(this.i, yo3Var.i) && this.j == yo3Var.j && s51.n(this.k, yo3Var.k) && this.l == yo3Var.l && this.m == yo3Var.m && this.n == yo3Var.n && this.o == yo3Var.o && this.p == yo3Var.p && this.q == yo3Var.q && this.r == yo3Var.r && this.s == yo3Var.s && this.h == yo3Var.h && s51.n(this.g, yo3Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + (this.f.hashCode() * 31)) * 31;
        dp dpVar = this.i;
        int iA = nc2.a((iHashCode + (dpVar != null ? dpVar.hashCode() : 0)) * 31, this.j, 31);
        dp dpVar2 = this.k;
        return Integer.hashCode(this.h) + nc2.a(nc2.a(nc2.a(nc2.a(nc2.b(this.o, nc2.b(this.n, nc2.a(nc2.a((iA + (dpVar2 != null ? dpVar2.hashCode() : 0)) * 31, this.l, 31), this.m, 31), 31), 31), this.p, 31), this.q, 31), this.r, 31), this.s, 31);
    }
}
