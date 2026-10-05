package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k50 extends ja0 implements tu2 {
    public boolean A;
    public iy1 B;
    public sf3 C;
    public b11 D;
    public ip0 E;
    public xj3 v;
    public bg3 w;
    public ye1 x;
    public boolean y;
    public boolean z;

    public static void s1(ye1 ye1Var, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        jg3 jg3Var = ye1Var.e;
        w40 w40Var = ye1Var.v;
        if (jg3Var == null) {
            int length = str.length();
            w40Var.h(new bg3(str, d32.f(length, length), 4));
        } else {
            bg3 bg3VarN = ye1Var.d.n(vr.L(new oa0(), new dz(1, str)));
            jg3Var.a(null, bg3VarN);
            w40Var.h(bg3VarN);
        }
    }

    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        boolean z = this.A;
        af afVar = this.w.a;
        a71[] a71VarArr = bv2.a;
        cv2 cv2Var = zu2.F;
        a71[] a71VarArr2 = bv2.a;
        a71 a71Var = a71VarArr2[18];
        cv2Var.getClass();
        dv2Var.a(cv2Var, afVar);
        af afVar2 = this.v.a;
        cv2 cv2Var2 = zu2.G;
        a71 a71Var2 = a71VarArr2[19];
        cv2Var2.getClass();
        dv2Var.a(cv2Var2, afVar2);
        long j = this.w.b;
        cv2 cv2Var3 = zu2.H;
        a71 a71Var3 = a71VarArr2[20];
        yg3 yg3Var = new yg3(j);
        cv2Var3.getClass();
        dv2Var.a(cv2Var3, yg3Var);
        bv2.c(dv2Var, f5.J);
        bv2.f(dv2Var, new z8(AutofillValue.forText(n92.G(this.w.a))));
        boolean z2 = false;
        bv2.b(dv2Var, new j50(this, 0));
        int i = this.D.d;
        if (i == 6) {
            g40.a.getClass();
            bv2.e(dv2Var, f40.c);
        } else if (i == 7 || i == 8) {
            g40.a.getClass();
            bv2.e(dv2Var, f40.b);
        } else if (i == 4) {
            g40.a.getClass();
            bv2.e(dv2Var, f40.d);
        }
        boolean z3 = this.z;
        dm3 dm3Var = dm3.a;
        if (!z3) {
            dv2Var.a(zu2.j, dm3Var);
        }
        if (z) {
            dv2Var.a(zu2.N, dm3Var);
        }
        if (this.z && !this.y) {
            z2 = true;
        }
        cv2 cv2Var4 = zu2.Q;
        a71 a71Var4 = a71VarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z2);
        cv2Var4.getClass();
        dv2Var.a(cv2Var4, boolValueOf);
        bv2.a(dv2Var, new j50(this, 1));
        if (z2) {
            dv2Var.a(pu2.k, new y0(null, new j50(this, 2)));
            dv2Var.a(pu2.o, new y0(null, new j50(this, dv2Var)));
        }
        dv2Var.a(pu2.j, new y0(null, new ir(2, this)));
        int i2 = this.D.e;
        i50 i50Var = new i50(this, 6);
        dv2Var.a(zu2.J, new a11(i2));
        dv2Var.a(pu2.p, new y0(null, i50Var));
        dv2Var.a(pu2.b, new y0(null, new i50(this, 7)));
        dv2Var.a(pu2.c, new y0(null, new i50(this, 1)));
        if (!yg3.c(this.w.b) && !z) {
            dv2Var.a(pu2.q, new y0(null, new i50(this, 2)));
            if (this.z && !this.y) {
                dv2Var.a(pu2.r, new y0(null, new i50(this, 3)));
            }
        }
        if (!this.z || this.y) {
            return;
        }
        dv2Var.a(pu2.s, new y0(null, new i50(this, 5)));
    }

    @Override // defpackage.tu2
    public final boolean N0() {
        return true;
    }
}
