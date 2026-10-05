package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class hy {
    public static final r93 a = new r93(new v3(21));
    public static final r93 b = new r93(new v3(22));

    public static final long a(fy fyVar, long j) {
        long j2 = fyVar.a;
        long j3 = fyVar.U;
        long j4 = fyVar.Q;
        long j5 = fyVar.M;
        long j6 = fyVar.q;
        if (wx.c(j, j2)) {
            return fyVar.b;
        }
        if (wx.c(j, fyVar.f)) {
            return fyVar.g;
        }
        if (wx.c(j, fyVar.j)) {
            return fyVar.k;
        }
        if (wx.c(j, fyVar.n)) {
            return fyVar.o;
        }
        if (wx.c(j, fyVar.w)) {
            return fyVar.x;
        }
        if (wx.c(j, fyVar.c)) {
            return fyVar.d;
        }
        if (wx.c(j, fyVar.h)) {
            return fyVar.i;
        }
        if (wx.c(j, fyVar.l)) {
            return fyVar.m;
        }
        if (wx.c(j, fyVar.y)) {
            return fyVar.z;
        }
        if (wx.c(j, fyVar.u)) {
            return fyVar.v;
        }
        if (wx.c(j, fyVar.p)) {
            return j6;
        }
        if (wx.c(j, fyVar.r)) {
            return fyVar.s;
        }
        if (wx.c(j, fyVar.D) || wx.c(j, fyVar.F) || wx.c(j, fyVar.G) || wx.c(j, fyVar.H) || wx.c(j, fyVar.I) || wx.c(j, fyVar.J) || wx.c(j, fyVar.E)) {
            return j6;
        }
        if (wx.c(j, fyVar.K) || wx.c(j, fyVar.L)) {
            return j5;
        }
        if (wx.c(j, fyVar.O) || wx.c(j, fyVar.P)) {
            return j4;
        }
        if (wx.c(j, fyVar.S) || wx.c(j, fyVar.T)) {
            return j3;
        }
        int i = wx.h;
        return wx.g;
    }

    public static final long b(long j, nv0 nv0Var) {
        nv0Var.a0(89374938);
        long jA = a((fy) nv0Var.j(a), j);
        if (jA == 16) {
            jA = ((wx) nv0Var.j(t30.a)).a;
        }
        nv0Var.p(false);
        return jA;
    }

    public static fy c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i, int i2) {
        long j45 = (i & 1) != 0 ? xx.z : j;
        return new fy(j45, (i & 2) != 0 ? xx.j : j2, (i & 4) != 0 ? xx.A : j3, (i & 8) != 0 ? xx.k : j4, (i & 16) != 0 ? xx.e : j5, (i & 32) != 0 ? xx.E : j6, (i & 64) != 0 ? xx.n : j7, (i & 128) != 0 ? xx.F : j8, (i & 256) != 0 ? xx.o : j9, (i & 512) != 0 ? xx.R : j10, (i & 1024) != 0 ? xx.t : j11, (i & 2048) != 0 ? xx.S : j12, (i & 4096) != 0 ? xx.u : j13, (i & 8192) != 0 ? xx.a : j14, (i & 16384) != 0 ? xx.g : j15, (i & 32768) != 0 ? xx.I : j16, (65536 & i) != 0 ? xx.r : j17, (131072 & i) != 0 ? xx.Q : j18, (262144 & i) != 0 ? xx.s : j19, (524288 & i) != 0 ? j45 : j20, (1048576 & i) != 0 ? xx.f : j21, (2097152 & i) != 0 ? xx.d : j22, xx.b, xx.h, xx.c, xx.i, (67108864 & i) != 0 ? xx.x : j23, (134217728 & i) != 0 ? xx.y : j24, (268435456 & i) != 0 ? xx.D : j25, (536870912 & i) != 0 ? xx.J : j26, (i2 & 8) != 0 ? xx.P : j32, (1073741824 & i) != 0 ? xx.K : j27, (i & Integer.MIN_VALUE) != 0 ? xx.L : j28, (i2 & 1) != 0 ? xx.M : j29, (i2 & 2) != 0 ? xx.N : j30, (i2 & 4) != 0 ? xx.O : j31, (i2 & 16) != 0 ? xx.B : j33, (i2 & 32) != 0 ? xx.C : j34, (i2 & 64) != 0 ? xx.l : j35, (i2 & 128) != 0 ? xx.m : j36, (i2 & 256) != 0 ? xx.G : j37, (i2 & 512) != 0 ? xx.H : j38, (i2 & 1024) != 0 ? xx.p : j39, (i2 & 2048) != 0 ? xx.q : j40, (i2 & 4096) != 0 ? xx.T : j41, (i2 & 8192) != 0 ? xx.U : j42, (i2 & 16384) != 0 ? xx.v : j43, (i2 & 32768) != 0 ? xx.w : j44);
    }

    public static final long d(fy fyVar, gy gyVar) {
        switch (gyVar.ordinal()) {
            case 0:
                return fyVar.n;
            case 1:
                return fyVar.w;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return fyVar.y;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return fyVar.v;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return fyVar.e;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return fyVar.u;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return fyVar.o;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return fyVar.x;
            case 8:
                return fyVar.z;
            case vr.g /* 9 */:
                return fyVar.b;
            case vr.h /* 10 */:
                return fyVar.d;
            case 11:
                return fyVar.M;
            case vr.i /* 12 */:
                return fyVar.N;
            case 13:
                return fyVar.g;
            case 14:
                return fyVar.i;
            case jo3.g /* 15 */:
                return fyVar.Q;
            case 16:
                return fyVar.R;
            case 17:
                return fyVar.q;
            case 18:
                return fyVar.s;
            case 19:
                return fyVar.k;
            case 20:
                return fyVar.m;
            case 21:
                return fyVar.U;
            case 22:
                return fyVar.V;
            case 23:
                return fyVar.A;
            case 24:
                return fyVar.B;
            case 25:
                return fyVar.a;
            case 26:
                return fyVar.c;
            case 27:
                return fyVar.K;
            case 28:
                return fyVar.L;
            case 29:
                return fyVar.C;
            case 30:
                return fyVar.f;
            case 31:
                return fyVar.h;
            case 32:
                return fyVar.O;
            case 33:
                return fyVar.P;
            case 34:
                return fyVar.p;
            case 35:
                return fyVar.D;
            case 36:
                return fyVar.F;
            case 37:
                return fyVar.G;
            case 38:
                return fyVar.H;
            case 39:
                return fyVar.I;
            case 40:
                return fyVar.J;
            case 41:
                return fyVar.E;
            case 42:
                return fyVar.t;
            case 43:
                return fyVar.r;
            case 44:
                return fyVar.j;
            case 45:
                return fyVar.l;
            case 46:
                return fyVar.S;
            case 47:
                return fyVar.T;
            default:
                c.k();
                return 0L;
        }
    }

    public static final long e(gy gyVar, nv0 nv0Var) {
        return d((fy) nv0Var.j(a), gyVar);
    }

    public static fy f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i, int i2) {
        long j45 = (i & 1) != 0 ? ay.z : j;
        return new fy(j45, (i & 2) != 0 ? ay.j : j2, (i & 4) != 0 ? ay.A : j3, (i & 8) != 0 ? ay.k : j4, (i & 16) != 0 ? ay.e : j5, (i & 32) != 0 ? ay.E : j6, (i & 64) != 0 ? ay.n : j7, (i & 128) != 0 ? ay.F : j8, (i & 256) != 0 ? ay.o : j9, (i & 512) != 0 ? ay.R : j10, (i & 1024) != 0 ? ay.t : j11, (i & 2048) != 0 ? ay.S : j12, (i & 4096) != 0 ? ay.u : j13, (i & 8192) != 0 ? ay.a : j14, (i & 16384) != 0 ? ay.g : j15, (i & 32768) != 0 ? ay.I : j16, (65536 & i) != 0 ? ay.r : j17, (131072 & i) != 0 ? ay.Q : j18, (262144 & i) != 0 ? ay.s : j19, (524288 & i) != 0 ? j45 : j20, (1048576 & i) != 0 ? ay.f : j21, (2097152 & i) != 0 ? ay.d : j22, ay.b, ay.h, ay.c, ay.i, (67108864 & i) != 0 ? ay.x : j23, (134217728 & i) != 0 ? ay.y : j24, (268435456 & i) != 0 ? ay.D : j25, (536870912 & i) != 0 ? ay.J : j26, (i2 & 8) != 0 ? ay.P : j32, (1073741824 & i) != 0 ? ay.K : j27, (i & Integer.MIN_VALUE) != 0 ? ay.L : j28, (i2 & 1) != 0 ? ay.M : j29, (i2 & 2) != 0 ? ay.N : j30, (i2 & 4) != 0 ? ay.O : j31, (i2 & 16) != 0 ? ay.B : j33, (i2 & 32) != 0 ? ay.C : j34, (i2 & 64) != 0 ? ay.l : j35, (i2 & 128) != 0 ? ay.m : j36, (i2 & 256) != 0 ? ay.G : j37, (i2 & 512) != 0 ? ay.H : j38, (i2 & 1024) != 0 ? ay.p : j39, (i2 & 2048) != 0 ? ay.q : j40, (i2 & 4096) != 0 ? ay.T : j41, (i2 & 8192) != 0 ? ay.U : j42, (i2 & 16384) != 0 ? ay.v : j43, (i2 & 32768) != 0 ? ay.w : j44);
    }
}
