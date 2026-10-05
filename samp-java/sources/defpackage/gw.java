package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gw implements cs0 {
    public final /* synthetic */ int f;
    public final Object g;
    public final /* synthetic */ Object h;

    public gw(wz0 wz0Var, zz0 zz0Var) {
        this.f = 2;
        this.h = wz0Var;
        this.g = zz0Var;
    }

    @Override // defpackage.cs0
    public final Object a() throws Throwable {
        Throwable th;
        nj0 nj0Var;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ((ns0) obj2).h((vu) obj);
                return dm3Var;
            case 1:
                ((ns0) obj2).h((x31) obj);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                wz0 wz0Var = (wz0) obj;
                zz0 zz0Var = (zz0) obj2;
                nj0 nj0Var2 = nj0.j;
                IOException iOException = null;
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e) {
                    iOException = e;
                }
                if (!zz0Var.b(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } while (zz0Var.b(false, this));
                nj0Var = nj0.h;
                try {
                    try {
                        wz0Var.b(nj0Var, nj0.m, null);
                    } catch (IOException e2) {
                        iOException = e2;
                        nj0 nj0Var3 = nj0.i;
                        wz0Var.b(nj0Var3, nj0Var3, iOException);
                    }
                    jv3.a(zz0Var);
                    return dm3Var;
                } catch (Throwable th4) {
                    th = th4;
                }
                nj0Var = nj0Var2;
                wz0Var.b(nj0Var, nj0Var2, iOException);
                jv3.a(zz0Var);
                throw th;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((ns0) obj2).h(((vg2) obj).a);
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((os1) obj).setValue((vg2) obj2);
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((ns0) obj2).h(Integer.valueOf(((yj1) obj).a));
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((ns0) obj2).h((w72) obj);
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                ((ns0) obj2).h((y31) obj);
                return dm3Var;
            default:
                ((ns0) obj2).h(((qj2) obj).a);
                return dm3Var;
        }
    }

    public /* synthetic */ gw(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
