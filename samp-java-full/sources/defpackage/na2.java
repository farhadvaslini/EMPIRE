package defpackage;

import android.app.Application;
import java.util.List;
import java.util.concurrent.CancellationException;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class na2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ boolean l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na2(Object obj, boolean z, Object obj2, Object obj3, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
        this.l = z;
        this.n = obj2;
        this.o = obj3;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((na2) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        boolean z = this.l;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                na2 na2Var = new na2((oa2) obj3, (String) obj2, z, p40Var);
                na2Var.m = obj;
                return na2Var;
            case 1:
                return new na2((Long) this.m, this.l, (ie1) obj3, (List) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new na2((ed) this.m, this.l, (s83) obj3, (cs0) obj2, p40Var, 2);
            default:
                return new na2((os1) obj3, z, (qr1) obj2, p40Var);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) throws Throwable {
        Object qn2Var;
        Object j92Var;
        na2 na2Var;
        switch (this.j) {
            case 0:
                oa2 oa2Var = (oa2) this.n;
                Application application = oa2Var.b;
                y50 y50Var = y50.f;
                int i = this.k;
                try {
                    if (i == 0) {
                        y02.Q(obj);
                        String str = (String) this.o;
                        boolean z = this.l;
                        y92 y92Var = oa2Var.c;
                        this.m = null;
                        this.k = 1;
                        y92Var.getClass();
                        j90 j90Var = ac0.a;
                        obj = cl3.G(x80.h, new x92(y92Var, z, str, null), this);
                        if (obj == y50Var) {
                            return y50Var;
                        }
                    } else {
                        if (i != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    qn2Var = (ka2) obj;
                    break;
                } catch (Throwable th) {
                    qn2Var = new qn2(th);
                }
                Throwable thA = rn2.a(qn2Var);
                if (thA != null) {
                    if (thA instanceof CancellationException) {
                        throw thA;
                    }
                    ti tiVar = ui.a;
                    ui.c(ti.i, "PluginViewModel", "Plugin uninstallation failed", thA);
                    qn2Var = ka2.g;
                }
                i93 i93Var = oa2Var.o;
                int iOrdinal = ((ka2) qn2Var).ordinal();
                if (iOrdinal == 0) {
                    application.getClass();
                    String string = application.getString(R.string.plugins_message_uninstalled);
                    string.getClass();
                    j92Var = new j92(string);
                } else if (iOrdinal == 1) {
                    application.getClass();
                    String string2 = application.getString(R.string.plugins_error_uninstall);
                    string2.getClass();
                    j92Var = new g92(string2);
                } else {
                    if (iOrdinal != 2) {
                        c.k();
                        return null;
                    }
                    application.getClass();
                    String string3 = application.getString(R.string.plugins_error_uninstall_data);
                    string3.getClass();
                    j92Var = new g92(string3);
                }
                i93Var.getClass();
                i93Var.j(null, j92Var);
                return dm3.a;
            case 1:
                dm3 dm3Var = dm3.a;
                y50 y50Var2 = y50.f;
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    if (((Long) this.m) != null && this.l) {
                        ie1 ie1Var = (ie1) this.n;
                        int size = ((List) this.o).size();
                        this.k = 1;
                        ar2 ar2Var = ie1.x;
                        ie1Var.getClass();
                        Object objD = ie1Var.d(ts1.f, new wd1(ie1Var, size, 0, (p40) null), this);
                        if (objD != y50Var2) {
                            objD = dm3Var;
                        }
                        if (objD == y50Var2) {
                            return y50Var2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y50 y50Var3 = y50.f;
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    ed edVar = (ed) this.m;
                    Float f = new Float(this.l ? 1.0f : 0.0f);
                    s83 s83Var = (s83) this.n;
                    this.k = 1;
                    na2Var = this;
                    if (ed.c(edVar, f, s83Var, null, na2Var, 12) == y50Var3) {
                        return y50Var3;
                    }
                } else {
                    if (i3 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    na2Var = this;
                }
                ((cs0) na2Var.o).a();
                return dm3.a;
            default:
                os1 os1Var = (os1) this.n;
                y50 y50Var4 = y50.f;
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    zc2 zc2Var = (zc2) os1Var.getValue();
                    if (zc2Var != null) {
                        boolean z2 = this.l;
                        qr1 qr1Var = (qr1) this.o;
                        s41 ad2Var = z2 ? new ad2(zc2Var) : new yc2(zc2Var);
                        if (qr1Var != null) {
                            this.m = os1Var;
                            this.k = 1;
                            if (qr1Var.b(ad2Var, this) == y50Var4) {
                                return y50Var4;
                            }
                        }
                    }
                    return dm3.a;
                }
                if (i4 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                os1Var = (os1) this.m;
                y02.Q(obj);
                os1Var.setValue(null);
                return dm3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na2(oa2 oa2Var, String str, boolean z, p40 p40Var) {
        super(2, p40Var);
        this.j = 0;
        this.n = oa2Var;
        this.o = str;
        this.l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na2(os1 os1Var, boolean z, qr1 qr1Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 3;
        this.n = os1Var;
        this.l = z;
        this.o = qr1Var;
    }
}
