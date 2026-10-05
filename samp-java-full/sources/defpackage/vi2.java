package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import top.th1nk.samp.feature.raksamp.RaksampNativeBridge;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final Object g(String str, int i, String str2, xy2 xy2Var, String str3, q40 q40Var) {
        ui2 ui2Var;
        xy2 xy2Var2;
        int i2;
        String str4;
        String str5;
        String str6;
        xy2 xy2Var3;
        String str7;
        String str8;
        Object obj;
        int i3;
        String str9;
        String str10;
        int i4;
        xy2 xy2Var4;
        Object obj2;
        String str11;
        xy2 xy2Var5;
        String str12;
        boolean z;
        String str13;
        String str14;
        qp2 qp2Var;
        Application application = this.b;
        if (q40Var instanceof ui2) {
            ui2Var = (ui2) q40Var;
            int i5 = ui2Var.s;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ui2Var.s = i5 - Integer.MIN_VALUE;
            } else {
                ui2Var = new ui2(this, q40Var);
            }
        }
        Object objE = ui2Var.q;
        int i6 = ui2Var.s;
        int i7 = this.c;
        dm3 dm3Var = dm3.a;
        i93 i93Var = this.e;
        qy2 qy2Var = this.d;
        y50 y50Var = y50.f;
        try {
            try {
                if (i6 == 0) {
                    y02.Q(objE);
                    RaksampNativeBridge.INSTANCE.disconnect(i7);
                    w83 w83Var = this.K;
                    if (w83Var != null) {
                        w83Var.c(null);
                    }
                    this.K = null;
                    this.J = null;
                    t92 t92Var = qy2Var.p;
                    ui2Var.i = str;
                    ui2Var.j = str2;
                    xy2Var2 = xy2Var;
                    ui2Var.k = xy2Var2;
                    ui2Var.l = str3;
                    i2 = i;
                    ui2Var.o = i2;
                    ui2Var.s = 1;
                    objE = lr.E(t92Var, ui2Var);
                    if (objE == y50Var) {
                        return y50Var;
                    }
                    str4 = str2;
                    str5 = str3;
                    str6 = str;
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            i3 = ui2Var.o;
                            Object obj3 = ui2Var.m;
                            str7 = ui2Var.l;
                            xy2Var3 = ui2Var.k;
                            String str15 = ui2Var.j;
                            str6 = ui2Var.i;
                            y02.Q(objE);
                            obj = obj3;
                            str8 = str15;
                            zx2 zx2Var = qy2Var.h;
                            ui2Var.i = str6;
                            ui2Var.j = str8;
                            ui2Var.k = xy2Var3;
                            ui2Var.l = str7;
                            ui2Var.m = obj;
                            ui2Var.n = objE;
                            ui2Var.o = i3;
                            Object obj4 = objE;
                            ui2Var.s = 3;
                            objE = lr.E(zx2Var, ui2Var);
                            if (objE != y50Var) {
                                str9 = str7;
                                str10 = str8;
                                i4 = i3;
                                xy2Var4 = xy2Var3;
                                obj2 = obj4;
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                qp2 qp2Var2 = (qp2) obj2;
                                String str16 = (String) objE;
                                ui2Var.i = str6;
                                ui2Var.j = str10;
                                ui2Var.k = xy2Var4;
                                ui2Var.l = str9;
                                ui2Var.m = qp2Var2;
                                ui2Var.n = str16;
                                ui2Var.o = i4;
                                ui2Var.p = zBooleanValue;
                                ui2Var.s = 4;
                                objE = qy2Var.e(ui2Var);
                                if (objE != y50Var) {
                                }
                            }
                            return y50Var;
                        }
                        if (i6 != 3) {
                            if (i6 != 4) {
                                c.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z2 = ui2Var.p;
                            i4 = ui2Var.o;
                            String str17 = (String) ui2Var.n;
                            qp2Var = (qp2) ui2Var.m;
                            String str18 = ui2Var.l;
                            xy2 xy2Var6 = ui2Var.k;
                            String str19 = ui2Var.j;
                            str13 = ui2Var.i;
                            y02.Q(objE);
                            z = z2;
                            str11 = str17;
                            str14 = str18;
                            xy2Var5 = xy2Var6;
                            str12 = str19;
                            String str20 = (String) objE;
                            i93Var.getClass();
                            i93Var.j(null, jg2.a);
                            RaksampNativeBridge raksampNativeBridge = RaksampNativeBridge.INSTANCE;
                            raksampNativeBridge.register(i7, this);
                            try {
                                application.getClass();
                                raksampNativeBridge.nativeInitJavaWrapper(i7, application);
                                this.L = str13 + ":" + i4;
                                lf2 lf2Var = new lf2(application);
                                this.J = lf2Var;
                                this.K = cl3.t(f80.F(this), null, new hd1(lf2Var, this, null, 14), 3);
                                raksampNativeBridge.connect(this.c, str13, i4, str12, xy2Var5, z, str20, str11, qp2Var.g, str14);
                                return dm3Var;
                            } catch (Throwable th) {
                                f();
                                i93Var.j(null, new lg2(by1.g("nativeInitJavaWrapper failed: ", th.getMessage())));
                                return dm3Var;
                            }
                        }
                        int i8 = ui2Var.o;
                        obj2 = ui2Var.n;
                        obj = ui2Var.m;
                        str9 = ui2Var.l;
                        xy2 xy2Var7 = ui2Var.k;
                        str10 = ui2Var.j;
                        str6 = ui2Var.i;
                        y02.Q(objE);
                        i4 = i8;
                        xy2Var4 = xy2Var7;
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        qp2 qp2Var22 = (qp2) obj2;
                        String str162 = (String) objE;
                        ui2Var.i = str6;
                        ui2Var.j = str10;
                        ui2Var.k = xy2Var4;
                        ui2Var.l = str9;
                        ui2Var.m = qp2Var22;
                        ui2Var.n = str162;
                        ui2Var.o = i4;
                        ui2Var.p = zBooleanValue2;
                        ui2Var.s = 4;
                        objE = qy2Var.e(ui2Var);
                        if (objE != y50Var) {
                            str11 = str162;
                            xy2Var5 = xy2Var4;
                            str12 = str10;
                            z = zBooleanValue2;
                            str13 = str6;
                            str14 = str9;
                            qp2Var = qp2Var22;
                            String str202 = (String) objE;
                            i93Var.getClass();
                            i93Var.j(null, jg2.a);
                            RaksampNativeBridge raksampNativeBridge2 = RaksampNativeBridge.INSTANCE;
                            raksampNativeBridge2.register(i7, this);
                            application.getClass();
                            raksampNativeBridge2.nativeInitJavaWrapper(i7, application);
                            this.L = str13 + ":" + i4;
                            lf2 lf2Var2 = new lf2(application);
                            this.J = lf2Var2;
                            this.K = cl3.t(f80.F(this), null, new hd1(lf2Var2, this, null, 14), 3);
                            raksampNativeBridge2.connect(this.c, str13, i4, str12, xy2Var5, z, str202, str11, qp2Var.g, str14);
                            return dm3Var;
                        }
                        return y50Var;
                    }
                    int i9 = ui2Var.o;
                    str5 = ui2Var.l;
                    xy2Var2 = ui2Var.k;
                    str4 = ui2Var.j;
                    str6 = ui2Var.i;
                    y02.Q(objE);
                    i2 = i9;
                }
                t92 t92Var2 = qy2Var.g;
                ui2Var.i = str6;
                ui2Var.j = str4;
                ui2Var.k = xy2Var2;
                ui2Var.l = str5;
                ui2Var.m = objE;
                ui2Var.o = i2;
                ui2Var.s = 2;
                Object objE2 = lr.E(t92Var2, ui2Var);
                if (objE2 == y50Var) {
                    return y50Var;
                }
                xy2Var3 = xy2Var2;
                str7 = str5;
                str8 = str4;
                obj = objE;
                objE = objE2;
                i3 = i2;
                zx2 zx2Var2 = qy2Var.h;
                ui2Var.i = str6;
                ui2Var.j = str8;
                ui2Var.k = xy2Var3;
                ui2Var.l = str7;
                ui2Var.m = obj;
                ui2Var.n = objE;
                ui2Var.o = i3;
                Object obj42 = objE;
                ui2Var.s = 3;
                objE = lr.E(zx2Var2, ui2Var);
                if (objE != y50Var) {
                }
                return y50Var;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                f();
                lg2 lg2Var = new lg2(by1.g("Unable to read client settings: ", e2.getMessage()));
                i93Var.getClass();
                i93Var.j(null, lg2Var);
                return dm3Var;
            }
        } catch (CancellationException e3) {
            throw e3;
        } catch (Exception e4) {
            f();
            lg2 lg2Var2 = new lg2(by1.g("Unable to read client identifier: ", e4.getMessage()));
            i93Var.getClass();
            i93Var.j(null, lg2Var2);
            return dm3Var;
        }
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
