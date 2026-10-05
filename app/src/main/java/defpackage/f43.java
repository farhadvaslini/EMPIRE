package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class f43 {
    static {
        n92.F(0.0f, 0.0f, null, 7);
    }

    public static final e93 a(long j, s83 s83Var, nv0 nv0Var) {
        boolean zF = nv0Var.f(wx.f(j));
        Object objO = nv0Var.O();
        if (zF || objO == c20.a) {
            bl3 bl3Var = new bl3(hd.m, new kd(2, wx.f(j)));
            nv0Var.j0(bl3Var);
            objO = bl3Var;
        }
        return gd.c(new wx(j), (bl3) objO, s83Var, null, "ColorAnimation", nv0Var, 0, 8);
    }
}
