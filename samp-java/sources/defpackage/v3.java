package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class v3 implements cs0 {
    public final /* synthetic */ int f;

    public /* synthetic */ v3(int i) {
        this.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cs0
    public final Object a() throws Throwable {
        qj0 qj0VarA;
        o50 o50VarP;
        long jI;
        Choreographer choreographer;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = 2;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                k0 k0Var = xi2.f;
                return Integer.valueOf(xi2.f.a().nextInt(2147418112) + 65536);
            case 1:
                return UUID.randomUUID().toString();
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                b22 b22Var = e5.a;
                return k80.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                x7.a("LocalConfiguration");
                throw null;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                x7.a("LocalContext");
                throw null;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                x7.a("LocalImageVectorCache");
                throw null;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                x7.a("LocalResourceIdCache");
                throw null;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                x7.a("LocalView");
                throw null;
            case 8:
                return UUID.randomUUID();
            case vr.g /* 9 */:
                t20 t20Var = xa.a;
                return "DEFAULT_TEST_TAG";
            case vr.h /* 10 */:
                t20 t20Var2 = xa.a;
                return Boolean.FALSE;
            case 11:
                return UUID.randomUUID();
            case vr.i /* 12 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    j90 j90Var = ac0.a;
                    jx0 jx0Var = tl1.a;
                    rs0 dcVar = new dc(i2, objArr == true ? 1 : 0, 0);
                    f5 f5Var = f5.L;
                    q50 q50Var = (q50) jx0Var.m(f5Var);
                    li0 li0Var = li0.f;
                    if (q50Var == null) {
                        qj0VarA = qh3.a();
                        o50VarP = uq.p(li0Var, pq.Q(jx0Var, qj0VarA), true);
                        j90 j90Var2 = ac0.a;
                        if (o50VarP != j90Var2 && o50VarP.m(f5Var) == null) {
                            o50VarP = o50VarP.k(j90Var2);
                        }
                    } else {
                        qj0VarA = (qj0) qh3.a.get();
                        o50VarP = uq.p(li0Var, jx0Var, true);
                        j90 j90Var3 = ac0.a;
                        if (o50VarP != j90Var3 && o50VarP.m(f5Var) == null) {
                            o50VarP = o50VarP.k(j90Var3);
                        }
                    }
                    an anVar = new an(o50VarP, Thread.currentThread(), qj0VarA);
                    anVar.r0(a60.f, anVar, dcVar);
                    qj0 qj0Var = anVar.l;
                    if (qj0Var != null) {
                        int i3 = qj0.k;
                        qj0Var.H(false);
                    }
                    while (true) {
                        if (qj0Var != null) {
                            try {
                                jI = qj0Var.I();
                            } catch (Throwable th) {
                                if (qj0Var != null) {
                                    int i4 = qj0.k;
                                    qj0Var.F(false);
                                }
                                throw th;
                            }
                        } else {
                            jI = Long.MAX_VALUE;
                        }
                        if (anVar.S() instanceof g11) {
                            LockSupport.parkNanos(anVar, jI);
                            if (Thread.interrupted()) {
                                anVar.F(new InterruptedException());
                            }
                        } else {
                            if (qj0Var != null) {
                                int i5 = qj0.k;
                                qj0Var.F(false);
                            }
                            Object objK = s51.K(anVar.S());
                            jz jzVar = objK instanceof jz ? (jz) objK : null;
                            if (jzVar != null) {
                                throw jzVar.a;
                            }
                            choreographer = (Choreographer) objK;
                        }
                    }
                }
                gc gcVar = new gc(choreographer, vp.z(Looper.getMainLooper()));
                return pq.Q(gcVar, gcVar.q);
            case 13:
                u0 u0Var = tc.F;
                return dm3Var;
            case 14:
                t20 t20Var3 = tf.a;
                return q90.a;
            case jo3.g /* 15 */:
                t20 t20Var4 = tf.a;
                return f5.O;
            case 16:
                return new w73(vp.b(1308617531));
            case 17:
                r93 r93Var = em.a;
                return null;
            case 18:
                fe2 fe2Var = r51.c;
                return null;
            case 19:
                return b32.w("");
            case 20:
                return Integer.valueOf(kv.h.a());
            case 21:
                return hy.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
            case 22:
                r93 r93Var2 = hy.a;
                return Boolean.TRUE;
            case 23:
                return dm3Var;
            case 24:
                return new tb1(2);
            case 25:
                r93 r93Var3 = k20.a;
                return null;
            case 26:
                r93 r93Var4 = s20.a;
                return null;
            case 27:
                return new r20();
            case 28:
                r93 r93Var5 = s20.a;
                return Boolean.FALSE;
            default:
                r93 r93Var6 = s20.a;
                return Boolean.TRUE;
        }
    }
}
