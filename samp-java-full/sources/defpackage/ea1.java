package defpackage;

import top.th1nk.samp.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ea1 {
    public static final ea1 h;
    public static final ea1 i;
    public static final /* synthetic */ ea1[] j;
    public static final /* synthetic */ mj0 k;
    public final int f;
    public final w01 g;

    static {
        w01 w01VarB = ur.c;
        if (w01VarB == null) {
            v01 v01Var = new v01("Filled.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = vo3.a;
            w73 w73Var = new w73(wx.b);
            tx0 tx0Var = new tx0(1);
            tx0Var.j(10.0f, 20.0f);
            tx0Var.o(-6.0f);
            tx0Var.g(4.0f);
            tx0Var.o(6.0f);
            tx0Var.g(5.0f);
            tx0Var.o(-8.0f);
            tx0Var.g(3.0f);
            tx0Var.h(12.0f, 3.0f);
            tx0Var.h(2.0f, 12.0f);
            tx0Var.g(3.0f);
            tx0Var.o(8.0f);
            tx0Var.c();
            v01.a(v01Var, tx0Var.a, w73Var);
            w01VarB = v01Var.b();
            ur.c = w01VarB;
        }
        ea1 ea1Var = new ea1(0, R.string.launcher_tab_home, w01VarB, "Home");
        ea1 ea1Var2 = new ea1(1, R.string.launcher_tab_servers, lq.E(), "Servers");
        h = ea1Var2;
        w01 w01VarB2 = vp.f;
        if (w01VarB2 == null) {
            v01 v01Var2 = new v01("Filled.Inventory2", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i3 = vo3.a;
            w73 w73Var2 = new w73(wx.b);
            tx0 tx0Var2 = new tx0(1);
            tx0Var2.j(20.0f, 2.0f);
            tx0Var2.f(4.0f);
            tx0Var2.d(3.0f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
            tx0Var2.o(3.01f);
            tx0Var2.d(2.0f, 7.73f, 2.43f, 8.35f, 3.0f, 8.7f);
            tx0Var2.n(20.0f);
            tx0Var2.e(0.0f, 1.1f, 1.1f, 2.0f, 2.0f, 2.0f);
            tx0Var2.g(14.0f);
            tx0Var2.e(0.9f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            tx0Var2.n(8.7f);
            tx0Var2.e(0.57f, -0.35f, 1.0f, -0.97f, 1.0f, -1.69f);
            tx0Var2.n(4.0f);
            tx0Var2.d(22.0f, 2.9f, 21.0f, 2.0f, 20.0f, 2.0f);
            tx0Var2.c();
            tx0Var2.j(15.0f, 14.0f);
            tx0Var2.f(9.0f);
            tx0Var2.o(-2.0f);
            tx0Var2.g(6.0f);
            tx0Var2.n(14.0f);
            tx0Var2.c();
            tx0Var2.j(20.0f, 7.0f);
            tx0Var2.f(4.0f);
            tx0Var2.n(4.0f);
            tx0Var2.g(16.0f);
            tx0Var2.n(7.0f);
            tx0Var2.c();
            v01.a(v01Var2, tx0Var2.a, w73Var2);
            w01VarB2 = v01Var2.b();
            vp.f = w01VarB2;
        }
        ea1 ea1Var3 = new ea1(2, R.string.launcher_tab_resources, w01VarB2, "Resources");
        i = ea1Var3;
        ea1[] ea1VarArr = {ea1Var, ea1Var2, ea1Var3, new ea1(3, R.string.launcher_tab_raksamp, b32.o(), "RakSamp"), new ea1(4, R.string.launcher_tab_settings, y02.s(), "Settings")};
        j = ea1VarArr;
        k = new mj0(ea1VarArr);
    }

    public ea1(int i2, int i3, w01 w01Var, String str) {
        this.f = i3;
        this.g = w01Var;
    }

    public static ea1 valueOf(String str) {
        return (ea1) Enum.valueOf(ea1.class, str);
    }

    public static ea1[] values() {
        return (ea1[]) j.clone();
    }
}
