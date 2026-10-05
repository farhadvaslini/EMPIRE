package defpackage;

import android.app.Application;
import java.io.File;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.CancellationException;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ri2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri2(String str, lf2 lf2Var, os1 os1Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 6;
        this.n = str;
        this.l = lf2Var;
        this.m = os1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 1:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return ((ri2) m((p40) obj2, (us2) obj)).o(dm3Var);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((ri2) m((p40) obj2, (cs2) obj)).o(dm3Var);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((ri2) m((p40) obj2, (jd2) obj)).o(dm3Var);
            case 8:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.g /* 9 */:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.h /* 10 */:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 11:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                return new ri2((vi2) this.l, (vg2) this.m, (String) obj2, p40Var, 0);
            case 1:
                ri2 ri2Var = new ri2((dk2) this.m, (ic) obj2, p40Var, 1);
                ri2Var.l = obj;
                return ri2Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new ri2((ak2) this.l, (sv2) this.m, (xy2) obj2, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ri2 ri2Var2 = new ri2((re0) this.m, (ws2) obj2, p40Var, 3);
                ri2Var2.l = obj;
                return ri2Var2;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ri2 ri2Var3 = new ri2((ws2) this.m, (rs0) obj2, p40Var, 4);
                ri2Var3.l = obj;
                return ri2Var3;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ri2 ri2Var4 = new ri2((e93) this.m, (ed) obj2, p40Var, 5);
                ri2Var4.l = obj;
                return ri2Var4;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new ri2((String) obj2, (lf2) this.l, (os1) this.m, p40Var);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                ri2 ri2Var5 = new ri2((o50) this.m, (fn0) obj2, p40Var, 7);
                ri2Var5.l = obj;
                return ri2Var5;
            case 8:
                return new ri2((hf3) this.l, (xc2) this.m, (gb2) obj2, p40Var, 8);
            case vr.g /* 9 */:
                ri2 ri2Var6 = new ri2((j61) this.m, (rs0) obj2, p40Var, 9);
                ri2Var6.l = obj;
                return ri2Var6;
            case vr.h /* 10 */:
                return new ri2((me3) this.m, (ge3) obj2, p40Var, 10);
            case 11:
                return new ri2((u10) obj2, p40Var);
            default:
                return new ri2((go3) this.m, (File) obj2, p40Var, 12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c6, code lost:
    
        if (r15.f(r1, r14) == r0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0240, code lost:
    
        if (r0.a(r1, r14) == r6) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024e, code lost:
    
        if (defpackage.cl3.G(r1, r3, r14) == r6) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02d5, code lost:
    
        if (r2.a(r15, r14) == r8) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0172, code lost:
    
        if (r6 == r8) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        x50 x50Var;
        Throwable th;
        nf3 nf3Var;
        dt1 dt1Var;
        Application application;
        int i = 1;
        p40 p40Var = null;
        switch (this.j) {
            case 0:
                vi2 vi2Var = (vi2) this.l;
                y50 y50Var = y50.f;
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    vi2Var.h();
                    vg2 vg2Var = (vg2) this.m;
                    String str = vg2Var.b;
                    int i3 = vg2Var.c;
                    String str2 = vg2Var.d;
                    xy2 xy2Var = vg2Var.e;
                    String str3 = (String) this.n;
                    this.k = 1;
                    if (vi2Var.g(str, i3, str2, xy2Var, str3, this) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i2 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 1:
                y50 y50Var2 = y50.f;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y02.Q(obj);
                        return dm3.a;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                x50 x50Var2 = (x50) this.l;
                dk2 dk2Var = (dk2) this.m;
                ic icVar = (ic) this.n;
                this.k = 1;
                dk2Var.e(x50Var2, icVar, this);
                return y50Var2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ti tiVar = ti.g;
                sv2 sv2Var = (sv2) this.m;
                String str4 = sv2Var.c;
                y50 y50Var3 = y50.f;
                int i5 = this.k;
                try {
                    if (i5 == 0) {
                        y02.Q(obj);
                        ys1 ys1Var = new ys1((ak2) this.l, sv2Var, ak2.a((ak2) this.l, sv2Var.a), (xy2) this.n, (p40) null);
                        this.k = 1;
                        obj = ur.w(ys1Var, this);
                        if (obj == y50Var3) {
                            return y50Var3;
                        }
                    } else {
                        if (i5 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    return (zp2) obj;
                } catch (Throwable th2) {
                    if (th2 instanceof CancellationException) {
                        throw th2;
                    }
                    if (th2 instanceof SocketTimeoutException) {
                        ti tiVar2 = ui.a;
                        ui.c(tiVar, "SampQuery", "Query timeout for " + str4, null);
                    } else {
                        ti tiVar3 = ui.a;
                        ui.c(tiVar, "SampQuery", "Query failed for " + str4, th2);
                    }
                    return xp2.a;
                }
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                y50 y50Var4 = y50.f;
                int i6 = this.k;
                if (i6 == 0) {
                    y02.Q(obj);
                    us2 us2Var = (us2) this.l;
                    re0 re0Var = (re0) this.m;
                    er1 er1Var = new er1(14, us2Var, (ws2) this.n);
                    this.k = 1;
                    if (re0Var.f(er1Var, this) == y50Var4) {
                        return y50Var4;
                    }
                } else {
                    if (i6 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                y50 y50Var5 = y50.f;
                int i7 = this.k;
                if (i7 == 0) {
                    y02.Q(obj);
                    cs2 cs2Var = (cs2) this.l;
                    ws2 ws2Var = (ws2) this.m;
                    ws2Var.k = cs2Var;
                    rs0 rs0Var = (rs0) this.n;
                    us2 us2Var2 = ws2Var.l;
                    this.k = 1;
                    if (rs0Var.f(us2Var2, this) == y50Var5) {
                        return y50Var5;
                    }
                } else {
                    if (i7 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                y50 y50Var6 = y50.f;
                int i8 = this.k;
                if (i8 == 0) {
                    y02.Q(obj);
                    x50 x50Var3 = (x50) this.l;
                    p70 p70VarB = b32.B(new qu1((e93) this.m, 6));
                    yn0 yn0Var = new yn0(12, (ed) this.n, x50Var3);
                    this.k = 1;
                    if (p70VarB.a(yn0Var, this) == y50Var6) {
                        return y50Var6;
                    }
                } else {
                    if (i8 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                dm3 dm3Var = dm3.a;
                lf2 lf2Var = (lf2) this.l;
                String str5 = (String) this.n;
                y50 y50Var7 = y50.f;
                int i9 = this.k;
                if (i9 == 0) {
                    y02.Q(obj);
                    if (!y93.q0(str5)) {
                        lf2Var.getClass();
                        qn0 qn0Var = new qn0(lf2Var.a.b(), str5, 5);
                        this.k = 1;
                        obj = lr.E(qn0Var, this);
                        if (obj != y50Var7) {
                            if (((List) obj).isEmpty()) {
                            }
                            lf2Var.getClass();
                            str5.getClass();
                            qn0 qn0Var2 = new qn0(lf2Var.a.b(), str5, 5);
                            k9 k9Var = new k9(8, (os1) this.m);
                            this.k = 3;
                            break;
                        }
                        return y50Var7;
                    }
                    return dm3Var;
                }
                if (i9 == 1) {
                    y02.Q(obj);
                    if (((List) obj).isEmpty()) {
                        this.k = 2;
                        if (lf2Var.a(str5, "Help", "/help", this) != y50Var7) {
                        }
                        return y50Var7;
                    }
                    lf2Var.getClass();
                    str5.getClass();
                    qn0 qn0Var22 = new qn0(lf2Var.a.b(), str5, 5);
                    k9 k9Var2 = new k9(8, (os1) this.m);
                    this.k = 3;
                } else {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            y02.Q(obj);
                            return dm3Var;
                        }
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    lf2Var.getClass();
                    str5.getClass();
                    qn0 qn0Var222 = new qn0(lf2Var.a.b(), str5, 5);
                    k9 k9Var22 = new k9(8, (os1) this.m);
                    this.k = 3;
                }
                break;
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                fn0 fn0Var = (fn0) this.n;
                o50 o50Var = (o50) this.m;
                y50 y50Var8 = y50.f;
                int i10 = this.k;
                if (i10 == 0) {
                    y02.Q(obj);
                    jd2 jd2Var = (jd2) this.l;
                    if (!s51.n(o50Var, li0.f)) {
                        kn0 kn0Var = new kn0(fn0Var, jd2Var, p40Var, i);
                        this.k = 2;
                    } else {
                        jn0 jn0Var = new jn0(jd2Var, 2);
                        this.k = 1;
                    }
                    break;
                } else {
                    if (i10 != 1 && i10 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 8:
                dm3 dm3Var2 = dm3.a;
                y50 y50Var9 = y50.f;
                int i11 = this.k;
                if (i11 == 0) {
                    y02.Q(obj);
                    hf3 hf3Var = (hf3) this.l;
                    xc2 xc2Var = (xc2) this.m;
                    long j = ((gb2) this.n).c;
                    this.k = 1;
                    hf3 hf3Var2 = new hf3(hf3Var.m, hf3Var.n, hf3Var.o, this);
                    hf3Var2.k = xc2Var;
                    hf3Var2.l = j;
                    if (hf3Var2.o(dm3Var2) == y50Var9) {
                        return y50Var9;
                    }
                } else {
                    if (i11 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3Var2;
            case vr.g /* 9 */:
                y50 y50Var10 = y50.f;
                int i12 = this.k;
                if (i12 == 0) {
                    y02.Q(obj);
                    x50Var = (x50) this.l;
                    j61 j61Var = (j61) this.m;
                    this.l = x50Var;
                    this.k = 1;
                    if (j61Var.x(this) != y50Var10) {
                    }
                    return y50Var10;
                }
                if (i12 != 1) {
                    if (i12 == 2) {
                        y02.Q(obj);
                        return dm3.a;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x50Var = (x50) this.l;
                y02.Q(obj);
                rs0 rs0Var2 = (rs0) this.n;
                this.l = null;
                this.k = 2;
                break;
            case vr.h /* 10 */:
                dm3 dm3Var3 = dm3.a;
                me3 me3Var = (me3) this.m;
                y50 y50Var11 = y50.f;
                int i13 = this.k;
                try {
                } catch (Throwable th3) {
                    nf3 nf3Var2 = me3Var.x;
                    if (nf3Var2 == null) {
                        throw th3;
                    }
                    this.l = th3;
                    this.k = 4;
                    nf3Var2.h(this);
                    if (dm3Var3 != y50Var11) {
                        th = th3;
                    }
                    return y50Var11;
                }
                if (i13 == 0) {
                    y02.Q(obj);
                    r70 r70Var = me3Var.w;
                    if (r70Var != null) {
                        this.k = 1;
                        if (r70Var.h(this) == y50Var11) {
                        }
                        return y50Var11;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            y02.Q(obj);
                            nf3Var = me3Var.x;
                            if (nf3Var != null) {
                                this.k = 3;
                                nf3Var.h(this);
                                break;
                            }
                            return dm3Var3;
                        }
                        if (i13 == 3) {
                            y02.Q(obj);
                            return dm3Var3;
                        }
                        if (i13 != 4) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.l;
                        y02.Q(obj);
                        throw th;
                    }
                    y02.Q(obj);
                }
                ge3 ge3Var = (ge3) this.n;
                this.k = 2;
                if (ge3Var.a(me3Var, this) != y50Var11) {
                    nf3Var = me3Var.x;
                    if (nf3Var != null) {
                    }
                    return dm3Var3;
                }
                return y50Var11;
            case 11:
                u10 u10Var = (u10) this.n;
                y50 y50Var12 = y50.f;
                int i14 = this.k;
                if (i14 == 0) {
                    y02.Q(obj);
                    it2 it2Var = (it2) u10Var;
                    p73 p73Var = it2Var.h;
                    if (p73Var != null) {
                        p73Var.d(it2Var, w7.i0, it2Var.g);
                    }
                    dt1 dt1Var2 = it2Var.k;
                    this.l = dt1Var2;
                    this.m = u10Var;
                    this.k = 1;
                    if (dt1Var2.f(this) == y50Var12) {
                        return y50Var12;
                    }
                    dt1Var = dt1Var2;
                } else {
                    if (i14 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u10Var = (u10) this.m;
                    dt1Var = (dt1) this.l;
                    y02.Q(obj);
                }
                try {
                    ((it2) u10Var).d = ((it2) u10Var).b.getValue();
                    jr jrVar = ((it2) u10Var).j;
                    if (jrVar != null) {
                        jrVar.t(((it2) u10Var).b.getValue());
                    }
                    ((it2) u10Var).j = null;
                    dt1Var.i(null);
                    return dm3.a;
                } catch (Throwable th4) {
                    dt1Var.i(null);
                    throw th4;
                }
            default:
                File file = (File) this.n;
                go3 go3Var = (go3) this.m;
                i93 i93Var = go3Var.k;
                y50 y50Var13 = y50.f;
                int i15 = this.k;
                if (i15 == 0) {
                    y02.Q(obj);
                    Application application2 = go3Var.b;
                    application2.getClass();
                    qh0 qh0Var = new qh0(application2, 2);
                    this.l = application2;
                    this.k = 1;
                    Object objB = qh0Var.b(file, this);
                    if (objB == y50Var13) {
                        return y50Var13;
                    }
                    obj = objB;
                    application = application2;
                } else {
                    if (i15 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    application = (Application) this.l;
                    y02.Q(obj);
                }
                w31 w31Var = (w31) obj;
                if (s51.n(w31Var, v31.a)) {
                    kn3 kn3Var = kn3.a;
                    i93Var.getClass();
                    i93Var.j(null, kn3Var);
                } else if (w31Var instanceof t31) {
                    String string = ((t31) w31Var).a;
                    if (string == null || y93.q0(string)) {
                        string = null;
                    }
                    if (string == null) {
                        string = application.getString(R.string.update_error_install_failed);
                        string.getClass();
                    }
                    mn3 mn3Var = new mn3(string);
                    i93Var.getClass();
                    i93Var.j(null, mn3Var);
                } else {
                    if (!s51.n(w31Var, u31.a)) {
                        c.k();
                        return null;
                    }
                    file.delete();
                    String string2 = application.getString(R.string.update_error_invalid_package);
                    string2.getClass();
                    mn3 mn3Var2 = new mn3(string2);
                    i93Var.getClass();
                    i93Var.j(null, mn3Var2);
                }
                return dm3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri2(Object obj, Object obj2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri2(Object obj, Object obj2, Object obj3, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri2(u10 u10Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 11;
        this.n = u10Var;
    }
}
