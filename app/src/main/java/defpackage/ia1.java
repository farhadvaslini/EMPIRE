package defpackage;

import android.app.Application;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ia1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ int l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(ed edVar, int i, ot2 ot2Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 5;
        this.m = edVar;
        this.l = i;
        this.n = ot2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((ia1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 1:
                return ((ia1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((ia1) m((p40) obj2, Integer.valueOf(((Number) obj).intValue()))).o(dm3Var);
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((ia1) m((p40) obj2, Integer.valueOf(((Number) obj).intValue()))).o(dm3Var);
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((ia1) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((ia1) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        int i2 = this.l;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                return new ia1(this.l, (sa1) this.m, (kq2) obj2, p40Var, 0);
            case 1:
                return new ia1(this.l, (sa1) this.m, (sv2) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ia1 ia1Var = new ia1(this.l, (z60) this.m, (a42) obj2, p40Var, 2);
                ia1Var.k = ((Number) obj).intValue();
                return ia1Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ia1 ia1Var2 = new ia1(this.l, (ns0) this.m, (os1) obj2, p40Var, 3);
                ia1Var2.k = ((Number) obj).intValue();
                return ia1Var2;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new ia1((oa2) obj2, i2, p40Var);
            default:
                return new ia1((ed) this.m, i2, (ot2) obj2, p40Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:20:0x0062, B:51:0x00f8, B:53:0x00fc, B:55:0x0120, B:54:0x010c, B:26:0x0074, B:46:0x00cd, B:27:0x0078, B:36:0x009e, B:41:0x00af, B:43:0x00b5, B:47:0x00d5, B:30:0x0083, B:32:0x008b, B:33:0x0093), top: B:107:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:20:0x0062, B:51:0x00f8, B:53:0x00fc, B:55:0x0120, B:54:0x010c, B:26:0x0074, B:46:0x00cd, B:27:0x0078, B:36:0x009e, B:41:0x00af, B:43:0x00b5, B:47:0x00d5, B:30:0x0083, B:32:0x008b, B:33:0x0093), top: B:107:0x0056 }] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        int i;
        Object objE;
        oa2 oa2Var;
        y72 y72Var;
        Object b82Var;
        tq tqVar;
        p40 p40Var = null;
        switch (this.j) {
            case 0:
                y50 y50Var = y50.f;
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    long j = ((long) this.l) * 300;
                    this.k = 1;
                    if (ur.A(j, this) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i2 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                ((sa1) this.m).t(((kq2) this.n).a);
                return dm3.a;
            case 1:
                y50 y50Var2 = y50.f;
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    long j2 = ((long) this.l) * 300;
                    this.k = 1;
                    if (ur.A(j2, this) == y50Var2) {
                        return y50Var2;
                    }
                } else {
                    if (i3 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                ((sa1) this.m).t((sv2) this.n);
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                a42 a42Var = (a42) this.n;
                int i4 = this.k;
                y02.Q(obj);
                int i5 = this.l - 1;
                i = i4 >= 0 ? i4 : 0;
                if (i <= i5) {
                    i5 = i;
                }
                r93 r93Var = fh1.a;
                if (a42Var.g() != i5) {
                    a42Var.h(i5);
                    ((z60) this.m).a(i5);
                }
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int i6 = this.k;
                y02.Q(obj);
                os1 os1Var = (os1) this.n;
                r93 r93Var2 = fh1.a;
                int iIntValue = ((Number) ((cs0) os1Var.getValue()).a()).intValue();
                int i7 = this.l - 1;
                i = iIntValue >= 0 ? iIntValue : 0;
                if (i <= i7) {
                    i7 = i;
                }
                if (i6 != i7) {
                    ((ns0) this.m).h(new Integer(i6));
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                dm3 dm3Var = dm3.a;
                int i8 = this.l;
                oa2 oa2Var2 = (oa2) this.n;
                i93 i93Var = oa2Var2.m;
                i93 i93Var2 = oa2Var2.k;
                y50 y50Var3 = y50.f;
                int i9 = this.k;
                try {
                    if (i9 == 0) {
                        y02.Q(obj);
                        if (!(i93Var2.getValue() instanceof b82)) {
                            a82 a82Var = a82.a;
                            i93Var2.getClass();
                            i93Var2.j(null, a82Var);
                        }
                        v72 v72Var = v72.a;
                        this.k = 1;
                        objE = v72Var.e(this);
                        if (objE == y50Var3) {
                        }
                        return y50Var3;
                    }
                    if (i9 != 1) {
                        if (i9 == 2) {
                            y72Var = (y72) this.m;
                            y02.Q(obj);
                            b82Var = new b82(y72Var.a, null, false);
                            i93Var2.getClass();
                            i93Var2.j(null, b82Var);
                            if (i8 == oa2Var2.e) {
                            }
                            return dm3Var;
                        }
                        if (i9 != 3) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oa2Var = (oa2) this.m;
                        y02.Q(obj);
                        tqVar = (tq) obj;
                        if (tqVar == null) {
                            b82Var = new b82(tqVar.a, new Long(tqVar.b), true);
                        } else {
                            Application application = oa2Var.b;
                            application.getClass();
                            String string = application.getString(R.string.plugins_error_catalog);
                            string.getClass();
                            b82Var = new z72(string);
                        }
                        i93Var2.getClass();
                        i93Var2.j(null, b82Var);
                        if (i8 == oa2Var2.e) {
                            Boolean bool = Boolean.FALSE;
                            i93Var.getClass();
                            i93Var.j(null, bool);
                        }
                        return dm3Var;
                    }
                    y02.Q(obj);
                    objE = ((rn2) obj).f;
                    int i10 = oa2Var2.e;
                    if (i8 != i10) {
                        if (i8 == i10) {
                        }
                        return dm3Var;
                    }
                    Throwable thA = rn2.a(objE);
                    if (thA == null) {
                        y72Var = (y72) objE;
                        j90 j90Var = ac0.a;
                        x80 x80Var = x80.h;
                        rw rwVar = new rw(oa2Var2, y72Var, p40Var, 6);
                        this.m = y72Var;
                        this.k = 2;
                        if (cl3.G(x80Var, rwVar, this) == y50Var3) {
                        }
                        b82Var = new b82(y72Var.a, null, false);
                        i93Var2.getClass();
                        i93Var2.j(null, b82Var);
                        if (i8 == oa2Var2.e) {
                        }
                        return dm3Var;
                    }
                    ti tiVar = ui.a;
                    ui.c(ti.i, "PluginViewModel", "Unable to load plugin catalog", thA);
                    j90 j90Var2 = ac0.a;
                    x80 x80Var2 = x80.h;
                    hm hmVar = new hm(oa2Var2, p40Var, 8);
                    this.m = oa2Var2;
                    this.k = 3;
                    obj = cl3.G(x80Var2, hmVar, this);
                    if (obj != y50Var3) {
                        oa2Var = oa2Var2;
                        tqVar = (tq) obj;
                        if (tqVar == null) {
                        }
                        i93Var2.getClass();
                        i93Var2.j(null, b82Var);
                        if (i8 == oa2Var2.e) {
                        }
                        return dm3Var;
                    }
                    return y50Var3;
                } finally {
                }
            default:
                y50 y50Var4 = y50.f;
                int i11 = this.k;
                if (i11 == 0) {
                    y02.Q(obj);
                    ed edVar = (ed) this.m;
                    Integer num = new Integer(this.l);
                    s83 s83Var = ((ot2) this.n).b;
                    this.k = 1;
                    if (ed.c(edVar, num, s83Var, null, this, 12) == y50Var4) {
                        return y50Var4;
                    }
                } else {
                    if (i11 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ia1(int i, Object obj, Object obj2, p40 p40Var, int i2) {
        super(2, p40Var);
        this.j = i2;
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(oa2 oa2Var, int i, p40 p40Var) {
        super(2, p40Var);
        this.j = 4;
        this.n = oa2Var;
        this.l = i;
    }
}
