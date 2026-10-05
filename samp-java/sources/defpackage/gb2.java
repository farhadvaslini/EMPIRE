package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gb2 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public gb2 q;

    public gb2(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        gb2 gb2Var = this.q;
        if (gb2Var == null) {
            this.o = true;
            this.p = true;
        } else if (gb2Var != null) {
            gb2Var.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        return arrayList == null ? ni0.f : arrayList;
    }

    public final boolean c() {
        gb2 gb2Var = this.q;
        return gb2Var != null ? gb2Var.c() : this.o || this.p;
    }

    public final String toString() {
        return "PointerInputChange(id=" + d32.z(this.a) + ", uptimeMillis=" + this.b + ", position=" + gy1.g(this.c) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + gy1.g(this.g) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + ob2.a(this.i) + ", historical=" + b() + ", scrollDelta=" + gy1.g(this.j) + ", scaleFactor=" + this.k + ", panOffset=" + gy1.g(this.l) + ")";
    }

    public gb2(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
