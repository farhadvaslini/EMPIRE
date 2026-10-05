package defpackage;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tw extends vc {
    public final nw c;
    public final uu d;
    public int e;
    public w83 f;
    public w83 g;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(Application application) {
        super(application);
        application.getClass();
        this.c = new nw(application);
        this.d = new uu(application, 0);
        i93 i93VarE = s51.e(ni0.f);
        this.h = i93VarE;
        this.i = i93VarE;
        Boolean bool = Boolean.FALSE;
        i93 i93VarE2 = s51.e(bool);
        this.j = i93VarE2;
        this.k = i93VarE2;
        i93 i93VarE3 = s51.e(zu.a);
        this.l = i93VarE3;
        this.m = i93VarE3;
        i93 i93VarE4 = s51.e(bool);
        this.n = i93VarE4;
        this.o = i93VarE4;
        i93 i93VarE5 = s51.e(gv.a);
        this.p = i93VarE5;
        this.q = i93VarE5;
        j();
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.tw r9, defpackage.vu r10, java.io.File r11, defpackage.q40 r12) {
        /*
            r9.getClass()
            boolean r0 = r12 instanceof defpackage.qw
            if (r0 == 0) goto L16
            r0 = r12
            qw r0 = (defpackage.qw) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.k = r1
            goto L1b
        L16:
            qw r0 = new qw
            r0.<init>(r9, r12)
        L1b:
            java.lang.Object r12 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            defpackage.y02.Q(r12)
            goto L4c
        L28:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r9)
            r9 = 0
            return r9
        L2f:
            defpackage.y02.Q(r12)
            j90 r12 = defpackage.ac0.a
            x80 r12 = defpackage.x80.h
            l r3 = new l
            r8 = 10
            r7 = 0
            r6 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.k = r2
            java.lang.Object r12 = defpackage.cl3.G(r12, r3, r0)
            y50 r9 = defpackage.y50.f
            if (r12 != r9) goto L4c
            return r9
        L4c:
            rn2 r12 = (defpackage.rn2) r12
            java.lang.Object r9 = r12.f
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw.e(tw, vu, java.io.File, q40):java.lang.Object");
    }

    public static final void f(tw twVar, Object obj, vu vuVar) {
        Object fvVar;
        i93 i93Var = twVar.p;
        Throwable thA = rn2.a(obj);
        if (thA == null) {
            ((Number) obj).intValue();
            twVar.j();
            Application application = twVar.b;
            application.getClass();
            String string = application.getString(2131624166, vuVar.b);
            string.getClass();
            fvVar = new iv(string);
        } else {
            ti tiVar = ui.a;
            ui.c(ti.i, "CleoViewModel", "CLEO package installation failed", thA);
            fvVar = new fv(twVar.h(thA, 2131624156));
        }
        i93Var.getClass();
        i93Var.j(null, fvVar);
    }

    public final void g() {
        i93 i93Var = this.p;
        Object value = i93Var.getValue();
        hv hvVar = value instanceof hv ? (hv) value : null;
        if ((hvVar != null ? hvVar.a : null) == ev.g) {
            w83 w83Var = this.g;
            if (w83Var != null) {
                w83Var.c(null);
            }
            i93Var.j(null, gv.a);
        }
    }

    public final String h(Throwable th, int i) {
        dv dvVar;
        cv cvVar = th instanceof cv ? (cv) th : null;
        if (cvVar == null || (dvVar = cvVar.f) == null) {
            dvVar = dv.o;
        }
        switch (dvVar.ordinal()) {
            case 0:
                i = 2131624158;
                break;
            case 1:
                i = 2131624150;
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                i = 2131624162;
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                i = 2131624161;
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                i = 2131624157;
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                i = 2131624160;
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                i = 2131624163;
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                i = 2131624154;
                break;
            case 8:
                i = 2131624159;
                break;
            case vr.g /* 9 */:
                break;
            default:
                c.k();
                return null;
        }
        Application application = this.b;
        application.getClass();
        String string = application.getString(i);
        string.getClass();
        return string;
    }

    public final void i() {
        int i = this.e + 1;
        this.e = i;
        Boolean bool = Boolean.TRUE;
        i93 i93Var = this.n;
        i93Var.getClass();
        i93Var.j(null, bool);
        w83 w83Var = this.f;
        if (w83Var != null) {
            w83Var.c(null);
        }
        w83 w83VarT = cl3.t(f80.F(this), null, new wg2(this, i, null), 3);
        this.f = w83VarT;
        w83VarT.r(new ow(this, w83VarT, 0));
    }

    public final void j() {
        Boolean bool = Boolean.TRUE;
        i93 i93Var = this.j;
        i93Var.getClass();
        i93Var.j(null, bool);
        dx dxVarF = f80.F(this);
        j90 j90Var = ac0.a;
        cl3.t(dxVarF, x80.h, new pw(this, null), 2);
    }
}
