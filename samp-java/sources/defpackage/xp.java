package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class xp {
    public static final b22 a;
    public static final b22 b;
    public static final float c;
    public static final float d;

    static {
        float f = f80.G0;
        float f2 = f80.H0;
        a = new b22(f, 8.0f, f2, 8.0f);
        f80.f(16.0f, 8.0f, f2, 8.0f);
        b = new b22(12.0f, 8.0f, 12.0f, 8.0f);
        f80.f(12.0f, 8.0f, 16.0f, 8.0f);
        c = 58.0f;
        d = 40.0f;
    }

    public static wp a(long j, long j2, long j3, long j4, nv0 nv0Var, int i) {
        return b((fy) nv0Var.j(hy.a)).a(j, j2, (i & 4) != 0 ? wx.g : j3, (i & 8) != 0 ? wx.g : j4);
    }

    public static wp b(fy fyVar) {
        wp wpVar = fyVar.W;
        if (wpVar != null) {
            return wpVar;
        }
        wp wpVar2 = new wp(hy.d(fyVar, vm1.R), hy.d(fyVar, vm1.X), wx.b(vm1.T, hy.d(fyVar, vm1.S)), wx.b(vm1.V, hy.d(fyVar, vm1.U)));
        fyVar.W = wpVar2;
        return wpVar2;
    }

    public static wp c(fy fyVar) {
        wp wpVar = fyVar.Y;
        if (wpVar != null) {
            return wpVar;
        }
        long j = wx.f;
        wp wpVar2 = new wp(j, hy.d(fyVar, gv3.E), j, wx.b(gv3.D, hy.d(fyVar, gv3.C)));
        fyVar.Y = wpVar2;
        return wpVar2;
    }

    public static wp d(fy fyVar) {
        wp wpVar = fyVar.Z;
        if (wpVar != null) {
            return wpVar;
        }
        long j = wx.f;
        wp wpVar2 = new wp(j, hy.d(fyVar, gy.q), j, wx.b(rn.e1, hy.d(fyVar, rn.d1)));
        fyVar.Z = wpVar2;
        return wpVar2;
    }

    public static wp e(long j, long j2, nv0 nv0Var, int i) {
        if ((i & 1) != 0) {
            j = wx.g;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = wx.g;
        }
        long j4 = wx.g;
        return d((fy) nv0Var.j(hy.a)).a(j3, j2, j4, j4);
    }
}
