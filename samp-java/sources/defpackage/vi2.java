package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import top.th1nk.samp.feature.raksamp.RaksampNativeBridge;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vi2 extends vc {
    public final i93 A;
    public final i93 B;
    public final i93 C;
    public final i93 D;
    public final i93 E;
    public final i93 F;
    public final i93 G;
    public final i93 H;
    public final i93 I;
    public lf2 J;
    public w83 K;
    public String L;
    public int M;
    public final int c;
    public final qy2 d;
    public final i93 e;
    public final i93 f;
    public final i93 g;
    public final i93 h;
    public final i93 i;
    public final i93 j;
    public final i93 k;
    public final i93 l;
    public final i93 m;
    public final i93 n;
    public final i93 o;
    public final i93 p;
    public final i93 q;
    public final i93 r;
    public final i93 s;
    public final i93 t;
    public final i93 u;
    public final i93 v;
    public final i93 w;
    public final i93 x;
    public final i93 y;
    public final i93 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi2(Application application) {
        super(application);
        application.getClass();
        this.c = RaksampNativeBridge.INSTANCE.nextInstanceId();
        this.d = new qy2(application);
        i93 i93VarE = s51.e(kg2.a);
        this.e = i93VarE;
        this.f = i93VarE;
        ni0 ni0Var = ni0.f;
        i93 i93VarE2 = s51.e(ni0Var);
        this.g = i93VarE2;
        this.h = i93VarE2;
        i93 i93VarE3 = s51.e(ni0Var);
        this.i = i93VarE3;
        this.j = i93VarE3;
        i93 i93VarE4 = s51.e(ni0Var);
        this.k = i93VarE4;
        this.l = i93VarE4;
        i93 i93VarE5 = s51.e(null);
        this.m = i93VarE5;
        this.n = i93VarE5;
        i93 i93VarE6 = s51.e(ni0Var);
        this.o = i93VarE6;
        this.p = i93VarE6;
        i93 i93VarE7 = s51.e(ni0Var);
        this.q = i93VarE7;
        this.r = i93VarE7;
        i93 i93VarE8 = s51.e(ni0Var);
        this.s = i93VarE8;
        this.t = i93VarE8;
        i93 i93VarE9 = s51.e(ni0Var);
        this.u = i93VarE9;
        this.v = i93VarE9;
        i93 i93VarE10 = s51.e(new hp3());
        this.w = i93VarE10;
        this.x = i93VarE10;
        this.y = s51.e(new lj1());
        i93 i93VarE11 = s51.e("");
        this.z = i93VarE11;
        this.A = i93VarE11;
        i93 i93VarE12 = s51.e(0);
        this.B = i93VarE12;
        this.C = i93VarE12;
        Boolean bool = Boolean.FALSE;
        this.D = s51.e(bool);
        this.E = s51.e(0);
        i93 i93VarE13 = s51.e(bool);
        this.F = i93VarE13;
        this.G = i93VarE13;
        i93 i93VarE14 = s51.e(ni0Var);
        this.H = i93VarE14;
        this.I = i93VarE14;
        this.L = "";
        this.M = -1;
    }

    public final void e(re3 re3Var, int i) {
        i93 i93Var;
        Object value;
        ArrayList arrayListE0;
        do {
            i93Var = this.i;
            value = i93Var.getValue();
            List list = (List) value;
            if (re3Var == null) {
                arrayListE0 = new ArrayList();
                for (Object obj : list) {
                    if (((re3) obj).a != i) {
                        arrayListE0.add(obj);
                    }
                }
            } else {
                Iterator it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (((re3) it.next()).a == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    arrayListE0 = new ArrayList(list);
                    arrayListE0.set(i2, re3Var);
                } else {
                    arrayListE0 = qx.E0(list, re3Var);
                }
            }
        } while (!i93Var.h(value, arrayListE0));
    }

    public final void f() {
        int i = this.c;
        try {
            RaksampNativeBridge.INSTANCE.disconnect(i);
        } catch (Throwable unused) {
        }
        try {
            RaksampNativeBridge.INSTANCE.destroyContext(i);
        } catch (Throwable unused2) {
        }
        try {
            RaksampNativeBridge.INSTANCE.unregister(i);
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r29, int r30, java.lang.String r31, defpackage.xy2 r32, java.lang.String r33, defpackage.q40 r34) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi2.g(java.lang.String, int, java.lang.String, xy2, java.lang.String, q40):java.lang.Object");
    }

    public final void h() {
        w83 w83Var = this.K;
        if (w83Var != null) {
            w83Var.c(null);
        }
        this.K = null;
        this.J = null;
        RaksampNativeBridge raksampNativeBridge = RaksampNativeBridge.INSTANCE;
        int i = this.c;
        raksampNativeBridge.disconnect(i);
        raksampNativeBridge.unregister(i);
        i93 i93Var = this.e;
        i93Var.getClass();
        i93Var.j(null, kg2.a);
        i93 i93Var2 = this.g;
        i93Var2.getClass();
        ni0 ni0Var = ni0.f;
        i93Var2.j(null, ni0Var);
        i93 i93Var3 = this.i;
        i93Var3.getClass();
        i93Var3.j(null, ni0Var);
        i93 i93Var4 = this.k;
        i93Var4.getClass();
        i93Var4.j(null, ni0Var);
        i93 i93Var5 = this.o;
        i93Var5.getClass();
        i93Var5.j(null, ni0Var);
        i93 i93Var6 = this.q;
        i93Var6.getClass();
        i93Var6.j(null, ni0Var);
        i93 i93Var7 = this.s;
        i93Var7.getClass();
        i93Var7.j(null, ni0Var);
        i93 i93Var8 = this.u;
        i93Var8.getClass();
        i93Var8.j(null, ni0Var);
        hp3 hp3Var = new hp3();
        i93 i93Var9 = this.w;
        i93Var9.getClass();
        i93Var9.j(null, hp3Var);
        lj1 lj1Var = new lj1();
        i93 i93Var10 = this.y;
        i93Var10.getClass();
        i93Var10.j(null, lj1Var);
        this.M = -1;
        this.m.i(null);
        i93 i93Var11 = this.E;
        i93Var11.getClass();
        i93Var11.j(null, 0);
        Boolean bool = Boolean.FALSE;
        i93 i93Var12 = this.F;
        i93Var12.getClass();
        i93Var12.j(null, bool);
    }

    public final void i(hb0 hb0Var) {
        i93 i93Var;
        Object value;
        ArrayList arrayList;
        hb0Var.getClass();
        do {
            i93Var = this.k;
            value = i93Var.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (((hb0) obj).a != hb0Var.a) {
                    arrayList.add(obj);
                }
            }
        } while (!i93Var.h(value, arrayList));
    }

    public final void j(hb0 hb0Var) {
        i93 i93Var;
        Object value;
        ArrayList arrayList;
        hb0Var.getClass();
        i93 i93Var2 = this.m;
        i93Var2.getClass();
        i93Var2.j(null, hb0Var);
        do {
            i93Var = this.k;
            value = i93Var.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (((hb0) obj).a != hb0Var.a) {
                    arrayList.add(obj);
                }
            }
        } while (!i93Var.h(value, arrayList));
    }

    public final void k(mg2 mg2Var) {
        i93 i93Var = this.e;
        i93Var.getClass();
        i93Var.j(null, mg2Var);
    }
}
