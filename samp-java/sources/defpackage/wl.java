package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class wl {
    public static final /* synthetic */ int a = 0;

    static {
        uq.b(40.0f, 40.0f);
    }

    public static final void a(final String str, final ns0 ns0Var, final bq1 bq1Var, final boolean z, final boolean z2, final gh3 gh3Var, final o71 o71Var, final n71 n71Var, final boolean z3, final int i, final int i2, final nr3 nr3Var, ns0 ns0Var2, final qr1 qr1Var, final w73 w73Var, final d00 d00Var, nv0 nv0Var, final int i3) {
        final ns0 ns0Var3;
        ns0 ns0Var4;
        nv0Var.b0(2026950908);
        int i4 = i3 | (nv0Var.f(str) ? 4 : 2) | (nv0Var.h(ns0Var) ? 32 : 16) | (nv0Var.f(bq1Var) ? 256 : 128) | (nv0Var.g(z) ? 2048 : 1024) | (nv0Var.g(z2) ? 16384 : 8192) | (nv0Var.f(gh3Var) ? 131072 : 65536) | (nv0Var.f(o71Var) ? 1048576 : 524288) | (nv0Var.f(n71Var) ? 8388608 : 4194304) | (nv0Var.g(z3) ? 67108864 : 33554432) | (nv0Var.d(i) ? 536870912 : 268435456);
        int i5 = 196608 | (nv0Var.d(i2) ? 4 : 2) | (nv0Var.f(nr3Var) ? 32 : 16) | 384 | (nv0Var.f(qr1Var) ? 2048 : 1024) | (nv0Var.f(w73Var) ? 16384 : 8192);
        if (nv0Var.R(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 74899) == 74898) ? false : true)) {
            nv0Var.W();
            int i6 = i3 & 1;
            Object obj = c20.a;
            if (i6 == 0 || nv0Var.A()) {
                Object objO = nv0Var.O();
                if (objO == obj) {
                    objO = new u0(17);
                    nv0Var.j0(objO);
                }
                ns0Var4 = (ns0) objO;
            } else {
                nv0Var.U();
                ns0Var4 = ns0Var2;
            }
            nv0Var.q();
            Object objO2 = nv0Var.O();
            if (objO2 == obj) {
                objO2 = b32.w(new bg3(str, 0L, 6));
                nv0Var.j0(objO2);
            }
            os1 os1Var = (os1) objO2;
            bg3 bg3Var = (bg3) os1Var.getValue();
            bg3 bg3Var2 = new bg3(new af(str), bg3Var.b, bg3Var.c);
            boolean zF = nv0Var.f(bg3Var2);
            Object objO3 = nv0Var.O();
            if (zF || objO3 == obj) {
                objO3 = new u1(7, bg3Var2, os1Var);
                nv0Var.j0(objO3);
            }
            rn.t((cs0) objO3, nv0Var);
            boolean z4 = (i4 & 14) == 4;
            Object objO4 = nv0Var.O();
            if (z4 || objO4 == obj) {
                objO4 = b32.w(str);
                nv0Var.j0(objO4);
            }
            os1 os1Var2 = (os1) objO4;
            o71Var.getClass();
            int i7 = o71Var.a;
            p71 p71Var = new p71(i7);
            if (i7 == 0) {
                p71Var = null;
            }
            int i8 = p71Var != null ? p71Var.a : 1;
            int i9 = o71Var.b;
            a11 a11Var = i9 == -1 ? null : new a11(i9);
            b11 b11Var = new b11(z3, 0, true, i8, a11Var != null ? a11Var.a : 1, qj1.h);
            boolean z5 = !z3;
            ns0Var3 = ns0Var4;
            int i10 = z3 ? 1 : i2;
            int i11 = z3 ? 1 : i;
            boolean zF2 = ((i4 & 112) == 32) | nv0Var.f(os1Var2);
            Object objO5 = nv0Var.O();
            if (zF2 || objO5 == obj) {
                objO5 = new v1(ns0Var, os1Var, os1Var2);
                nv0Var.j0(objO5);
            }
            int i12 = i5 << 9;
            gq.b(bg3Var2, (ns0) objO5, bq1Var, gh3Var, nr3Var, ns0Var3, qr1Var, w73Var, z5, i11, i10, b11Var, n71Var, z, z2, d00Var, nv0Var, (i4 & 896) | ((i4 >> 6) & 7168) | (i12 & 57344) | 196608 | (3670016 & i12) | (i12 & 29360128), ((i4 >> 15) & 896) | (i4 & 7168) | (i4 & 57344) | 196608);
        } else {
            nv0Var.U();
            ns0Var3 = ns0Var2;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(str, ns0Var, bq1Var, z, z2, gh3Var, o71Var, n71Var, z3, i, i2, nr3Var, ns0Var3, qr1Var, w73Var, d00Var, i3) { // from class: vl
                public final /* synthetic */ String f;
                public final /* synthetic */ ns0 g;
                public final /* synthetic */ bq1 h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ gh3 k;
                public final /* synthetic */ o71 l;
                public final /* synthetic */ n71 m;
                public final /* synthetic */ boolean n;
                public final /* synthetic */ int o;
                public final /* synthetic */ int p;
                public final /* synthetic */ nr3 q;
                public final /* synthetic */ ns0 r;
                public final /* synthetic */ qr1 s;
                public final /* synthetic */ w73 t;
                public final /* synthetic */ d00 u;

                @Override // defpackage.rs0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = jo3.y(1);
                    wl.a(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (nv0) obj2, iY);
                    return dm3.a;
                }
            };
        }
    }
}
