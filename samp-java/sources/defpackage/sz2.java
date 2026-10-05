package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.Set;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sz2 {
    public final lf2 a;
    public final y92 b;
    public final ot0 c;
    public final ot0 d;
    public final qt0 e;
    public final ir f;
    public final gt0 g;
    public final pt0 h;
    public final ot0 i;
    public final pt0 j;
    public final pt0 k;
    public final pt0 l;
    public final pt0 m;
    public final ot0 n;
    public final qt0 o;
    public final qt0 p;
    public final ot0 q;
    public final d42 r;
    public final d42 s;
    public final d42 t;
    public long u;
    public final d42 v;
    public final d42 w;
    public final d42 x;
    public String y;
    public final x10 z;

    public sz2(GameActivity gameActivity, lf2 lf2Var, y92 y92Var, Set set, ot0 ot0Var, ot0 ot0Var2, qt0 qt0Var, ir irVar, gt0 gt0Var, pt0 pt0Var, ot0 ot0Var3, pt0 pt0Var2, pt0 pt0Var3, pt0 pt0Var4, pt0 pt0Var5, ot0 ot0Var4, qt0 qt0Var2, qt0 qt0Var3, ot0 ot0Var5) {
        lf2Var.getClass();
        y92Var.getClass();
        set.getClass();
        this.a = lf2Var;
        this.b = y92Var;
        this.c = ot0Var;
        this.d = ot0Var2;
        this.e = qt0Var;
        this.f = irVar;
        this.g = gt0Var;
        this.h = pt0Var;
        this.i = ot0Var3;
        this.j = pt0Var2;
        this.k = pt0Var3;
        this.l = pt0Var4;
        this.m = pt0Var5;
        this.n = ot0Var4;
        this.o = qt0Var2;
        this.p = qt0Var3;
        this.q = ot0Var5;
        this.r = b32.w(Boolean.FALSE);
        this.s = b32.w(k22.a);
        ni0 ni0Var = ni0.f;
        this.t = b32.w(ni0Var);
        this.u = -1L;
        this.v = b32.w(ni0Var);
        this.w = b32.w(ni0Var);
        this.x = b32.w(set);
        this.y = "";
        x10 x10Var = new x10(gameActivity);
        x10Var.setVisibility(8);
        x10Var.setId(View.generateViewId());
        x10Var.setContent(new d00(-222741255, new qz2(this, 0), true));
        this.z = x10Var;
    }

    public final l22 a() {
        return (l22) this.s.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.r.getValue()).booleanValue();
    }

    public final void c() {
        this.r.setValue(Boolean.FALSE);
        d(k22.a);
        new Handler(Looper.getMainLooper()).post(new rz2(this, 0));
    }

    public final void d(l22 l22Var) {
        l22 l22VarA = a();
        h22 h22Var = l22VarA instanceof h22 ? (h22) l22VarA : null;
        String str = h22Var != null ? h22Var.a : null;
        h22 h22Var2 = l22Var instanceof h22 ? (h22) l22Var : null;
        String str2 = h22Var2 != null ? h22Var2.a : null;
        if (!s51.n(str, str2)) {
            qt0 qt0Var = this.o;
            if (str != null) {
                qt0Var.f(str, Boolean.FALSE);
            }
            if (str2 != null) {
                qt0Var.f(str2, Boolean.TRUE);
            }
        }
        this.s.setValue(l22Var);
    }
}
