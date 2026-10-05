package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class on1 {
    public static final float a = s51.v;
    public static final b22 b = new b22(12.0f, 0.0f, 12.0f, 0.0f);

    public static un1 a(fy fyVar) {
        un1 un1Var = fyVar.i0;
        if (un1Var != null) {
            return un1Var;
        }
        un1 un1Var2 = new un1(hy.d(fyVar, f80.m0), hy.d(fyVar, f80.o0), hy.d(fyVar, f80.u0), wx.b(f80.h0, hy.d(fyVar, f80.g0)), wx.b(f80.j0, hy.d(fyVar, f80.i0)), wx.b(f80.l0, hy.d(fyVar, f80.k0)));
        fyVar.i0 = un1Var2;
        return un1Var2;
    }
}
