package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class e53 implements ns0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ns0 g;
    public final /* synthetic */ ex h;
    public final /* synthetic */ int i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ float k;
    public final /* synthetic */ cs0 l;

    public e53(boolean z, ns0 ns0Var, ex exVar, int i, boolean z2, float f, cs0 cs0Var) {
        this.f = z;
        this.g = ns0Var;
        this.h = exVar;
        this.i = i;
        this.j = z2;
        this.k = f;
        this.l = cs0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        KeyEvent keyEvent = ((e71) obj).a;
        ex exVar = this.h;
        float f = exVar.g;
        if (!this.f) {
            return Boolean.FALSE;
        }
        ns0 ns0Var = this.g;
        if (ns0Var == null) {
            return Boolean.FALSE;
        }
        int iG = ur.G(keyEvent);
        boolean z = false;
        if (iG == 2) {
            float f2 = exVar.f;
            float fAbs = Math.abs(f - f2);
            int i = this.i;
            float f3 = fAbs / (i > 0 ? i + 1 : 100);
            int i2 = this.j ? -1 : 1;
            long jH = gq.h(keyEvent.getKeyCode());
            boolean zA = c71.a(jH, c71.d);
            float f4 = this.k;
            if (zA) {
                ns0Var.h(y02.j(Float.valueOf((i2 * f3) + f4), exVar));
            } else if (c71.a(jH, c71.e)) {
                ns0Var.h(y02.j(Float.valueOf(f4 - (i2 * f3)), exVar));
            } else if (c71.a(jH, c71.g)) {
                ns0Var.h(y02.j(Float.valueOf((i2 * f3) + f4), exVar));
            } else if (c71.a(jH, c71.f)) {
                ns0Var.h(y02.j(Float.valueOf(f4 - (i2 * f3)), exVar));
            } else if (c71.a(jH, c71.v)) {
                ns0Var.h(Float.valueOf(f2));
            } else if (c71.a(jH, c71.w)) {
                ns0Var.h(Float.valueOf(f));
            } else if (c71.a(jH, c71.C)) {
                ns0Var.h(y02.j(Float.valueOf(f4 - (y02.h(r7 / 10, 1, 10) * f3)), exVar));
            } else if (c71.a(jH, c71.D)) {
                ns0Var.h(y02.j(Float.valueOf((y02.h(r7 / 10, 1, 10) * f3) + f4), exVar));
            }
            z = true;
        } else if (iG == 1) {
            long jH2 = gq.h(keyEvent.getKeyCode());
            if (c71.a(jH2, c71.d) || c71.a(jH2, c71.e) || c71.a(jH2, c71.g) || c71.a(jH2, c71.f) || c71.a(jH2, c71.v) || c71.a(jH2, c71.w) || c71.a(jH2, c71.C) || c71.a(jH2, c71.D)) {
                cs0 cs0Var = this.l;
                if (cs0Var != null) {
                    cs0Var.a();
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
