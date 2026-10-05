package defpackage;

import android.app.Application;
import java.io.File;
import java.net.Inet4Address;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class f50 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f50(vc vcVar, Object obj, File file, Application application, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.k = vcVar;
        this.l = obj;
        this.m = file;
        this.n = application;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                ((f50) m((p40) obj2, (x50) obj)).o(dm3Var);
                break;
            case 1:
                ((f50) m((p40) obj2, (x50) obj)).o(dm3Var);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((f50) m((p40) obj2, (es1) obj)).o(dm3Var);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((f50) m((p40) obj2, (es1) obj)).o(dm3Var);
                break;
            default:
                ((f50) m((p40) obj2, (x50) obj)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.n;
        Object obj3 = this.m;
        Object obj4 = this.l;
        switch (i) {
            case 0:
                f50 f50Var = new f50((kb2) obj4, (qe3) obj3, (sf3) obj2, p40Var, 0);
                f50Var.k = obj;
                return f50Var;
            case 1:
                return new f50((sm2) this.k, (bm2) obj4, (File) obj3, (Application) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                f50 f50Var2 = new f50((ak2) obj4, (sv2) obj3, (Inet4Address) obj2, p40Var, 2);
                f50Var2.k = obj;
                return f50Var2;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                f50 f50Var3 = new f50((qy2) obj4, (sv2) obj3, (xy2) obj2, p40Var, 3);
                f50Var3.k = obj;
                return f50Var3;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                f50 f50Var4 = new f50((qy2) obj4, (String) obj3, (xy2) obj2, p40Var, 4);
                f50Var4.k = obj;
                return f50Var4;
            default:
                return new f50((go3) this.k, (qn3) obj4, (File) obj3, (Application) obj2, p40Var, 5);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        Object qn2Var;
        byte[] bArr;
        vp2 vp2VarL;
        int i = 15;
        p40 p40Var = null;
        int i2 = 16;
        int i3 = 0;
        switch (this.j) {
            case 0:
                y02.Q(obj);
                x50 x50Var = (x50) this.k;
                kb2 kb2Var = (kb2) this.l;
                cl3.t(x50Var, null, new e50(kb2Var, (qe3) this.m, p40Var, i3), 1);
                cl3.t(x50Var, null, new j(kb2Var, (sf3) this.n, p40Var, i), 1);
                return dm3.a;
            case 1:
                y02.Q(obj);
                sm2 sm2Var = (sm2) this.k;
                ul2 ul2Var = sm2Var.e;
                bm2 bm2Var = (bm2) this.l;
                String str = bm2Var.b;
                File file = (File) this.m;
                String str2 = bm2Var.d;
                pi piVar = new pi(sm2Var, bm2Var, (Application) this.n, i2);
                uk2 uk2Var = ul2.f;
                ul2Var.a(str, file, str2, Long.MAX_VALUE, false, piVar);
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ti tiVar = ti.g;
                y02.Q(obj);
                ak2 ak2Var = (ak2) this.l;
                sv2 sv2Var = (sv2) this.m;
                String str3 = sv2Var.c;
                Inet4Address inet4Address = (Inet4Address) this.n;
                try {
                    ak2Var.getClass();
                    k0 k0Var = xi2.f;
                    k0 k0Var2 = xi2.f;
                    k0Var2.getClass();
                    bArr = new byte[4];
                    k0Var2.a().nextBytes(bArr);
                    vp2VarL = ak2Var.l(sv2Var, inet4Address, 'p', bArr);
                } catch (Throwable th) {
                    qn2Var = new qn2(th);
                }
                if (!Arrays.equals(uj.M(vp2VarL.a, 11, 15), bArr)) {
                    throw new IllegalArgumentException("Invalid SA-MP ping response payload");
                }
                qn2Var = new Long(vp2VarL.b);
                Throwable thA = rn2.a(qn2Var);
                if (thA != null) {
                    if (thA instanceof SocketTimeoutException) {
                        ti tiVar2 = ui.a;
                        ui.c(tiVar, "SampQuery", "Ping timeout for " + str3, null);
                    } else {
                        ti tiVar3 = ui.a;
                        ui.c(tiVar, "SampQuery", "Ping failed for " + str3, thA);
                    }
                }
                if (qn2Var instanceof qn2) {
                    return null;
                }
                return qn2Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                sv2 sv2Var2 = (sv2) this.m;
                qy2 qy2Var = (qy2) this.l;
                es1 es1Var = (es1) this.k;
                y02.Q(obj);
                ec2 ec2Var = qy2.w;
                String str4 = (String) es1Var.c(ec2Var);
                jm0 jm0Var = new jm0(pv2.J(new vj(4, str4 != null ? str4 : ""), new e91(1, qy2Var, qy2.class, "decodeServer", "decodeServer(Ljava/lang/String;)Ltop/th1nk/samp/core/config/SavedServer;", 0, 0, 25)), false, new aw2(i3, sv2Var2));
                ArrayList arrayList = new ArrayList();
                Iterator it = jm0Var.iterator();
                while (true) {
                    zl0 zl0Var = (zl0) it;
                    if (!zl0Var.hasNext()) {
                        arrayList.add(new kq2(sv2Var2, System.currentTimeMillis(), (xy2) this.n, ""));
                        es1Var.e(ec2Var, qx.x0(arrayList, "\n", null, null, new e91(1, qy2Var, qy2.class, "encodeServer", "encodeServer(Ltop/th1nk/samp/core/config/SavedServer;)Ljava/lang/String;", 0, 0, 24), 30));
                        return dm3.a;
                    }
                    arrayList.add(zl0Var.next());
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                qy2 qy2Var2 = (qy2) this.l;
                es1 es1Var2 = (es1) this.k;
                y02.Q(obj);
                ec2 ec2Var2 = qy2.w;
                String str5 = (String) es1Var2.c(ec2Var2);
                int i4 = 1;
                int i5 = 0;
                es1Var2.e(ec2Var2, qx.x0(pv2.L(new sc3(pv2.J(new vj(4, str5 != null ? str5 : ""), new vw2(i4, qy2Var2, qy2.class, "decodeServer", "decodeServer(Ljava/lang/String;)Ltop/th1nk/samp/core/config/SavedServer;", i5, 0, 3)), new er1(i2, (String) this.m, (xy2) this.n), 1)), "\n", null, null, new vw2(i4, qy2Var2, qy2.class, "encodeServer", "encodeServer(Ltop/th1nk/samp/core/config/SavedServer;)Ljava/lang/String;", i5, 0, 2), 30));
                return dm3.a;
            default:
                y02.Q(obj);
                go3 go3Var = (go3) this.k;
                ul2 ul2Var2 = go3Var.d;
                qn3 qn3Var = (qn3) this.l;
                ul2Var2.a(qn3Var.c, (File) this.m, qn3Var.d, Long.MAX_VALUE, false, new ar2(5, go3Var, (Application) this.n));
                return dm3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f50(Object obj, Object obj2, Object obj3, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }
}
