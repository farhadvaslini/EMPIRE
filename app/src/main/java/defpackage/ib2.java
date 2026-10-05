package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ib2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public ib2(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib2)) {
            return false;
        }
        ib2 ib2Var = (ib2) obj;
        return d32.l(this.a, ib2Var.a) && this.b == ib2Var.b && gy1.b(this.c, ib2Var.c) && gy1.b(this.d, ib2Var.d) && this.e == ib2Var.e && Float.compare(this.f, ib2Var.f) == 0 && this.g == ib2Var.g && this.h == ib2Var.h && this.i.equals(ib2Var.i) && gy1.b(this.j, ib2Var.j) && Float.compare(this.k, ib2Var.k) == 0 && gy1.b(this.l, ib2Var.l) && gy1.b(this.m, ib2Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + nc2.c(this.l, nc2.a(nc2.c(this.j, (this.i.hashCode() + by1.b(nc2.b(this.g, nc2.a(by1.b(nc2.c(this.d, nc2.c(this.c, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), this.f, 31), 31), 31, this.h)) * 31, 31), this.k, 31), 31);
    }

    public final String toString() {
        String strZ = d32.z(this.a);
        String strG = gy1.g(this.c);
        String strG2 = gy1.g(this.d);
        String strA = ob2.a(this.g);
        String strG3 = gy1.g(this.j);
        String strG4 = gy1.g(this.l);
        String strG5 = gy1.g(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(strZ);
        sb.append(", uptime=");
        sb.append(this.b);
        nc2.w(sb, ", positionOnScreen=", strG, ", position=", strG2);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(strA);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(strG3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(strG4);
        sb.append(", originalEventPosition=");
        sb.append(strG5);
        sb.append(")");
        return sb.toString();
    }
}
