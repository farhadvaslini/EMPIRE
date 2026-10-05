package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class e51 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public Object k;
    public Object l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e51(ContentResolver contentResolver, Uri uri, fu3 fu3Var, np npVar, Context context, p40 p40Var) {
        super(2, p40Var);
        this.j = 2;
        this.n = contentResolver;
        this.q = uri;
        this.r = fu3Var;
        this.o = npVar;
        this.p = context;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((e51) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 1:
                return ((e51) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((e51) m((p40) obj2, (gn0) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.r;
        switch (i) {
            case 0:
                e51 e51Var = new e51((ts1) obj3, (f51) obj4, (ns0) obj2, p40Var, 0);
                e51Var.n = obj;
                return e51Var;
            case 1:
                e51 e51Var2 = new e51((ts1) obj3, (zs1) obj4, (ns0) obj2, p40Var, 1);
                e51Var2.n = obj;
                return e51Var2;
            default:
                e51 e51Var3 = new e51((ContentResolver) this.n, (Uri) this.q, (fu3) obj4, (np) obj3, (Context) obj2, p40Var);
                e51Var3.l = obj;
                return e51Var3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #4 {all -> 0x002e, blocks: (B:9:0x0028, B:19:0x0058, B:23:0x0069, B:25:0x0071, B:15:0x003e, B:18:0x0051), top: B:131:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:10:0x002b). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        d51 d51Var;
        ns0 ns0Var;
        bt1 bt1Var;
        Throwable th;
        d51 d51Var2;
        f51 f51Var;
        bt1 bt1Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        ws1 ws1Var;
        ns0 ns0Var2;
        bt1 bt1Var3;
        Throwable th2;
        ws1 ws1Var2;
        zs1 zs1Var;
        bt1 bt1Var4;
        AtomicReference atomicReference3;
        AtomicReference atomicReference4;
        gn0 gn0Var;
        kp kpVar;
        gn0 gn0Var2;
        kp kpVar2;
        Object objB;
        int i = this.j;
        Object obj2 = this.p;
        Object obj3 = this.o;
        y50 y50Var = y50.f;
        Object obj4 = this.r;
        switch (i) {
            case 0:
                f51 f51Var2 = (f51) obj4;
                int i2 = this.m;
                try {
                    try {
                        if (i2 == 0) {
                            y02.Q(obj);
                            m50 m50VarM = ((x50) this.n).h().m(f5.b0);
                            m50VarM.getClass();
                            d51Var = new d51((ts1) obj3, (j61) m50VarM);
                            AtomicReference atomicReference5 = f51Var2.a;
                            while (true) {
                                d51 d51Var3 = (d51) atomicReference5.get();
                                if (d51Var3 != null && d51Var.a.compareTo(d51Var3.a) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                                while (!atomicReference5.compareAndSet(d51Var3, d51Var)) {
                                    if (atomicReference5.get() != d51Var3) {
                                    }
                                    break;
                                }
                                if (d51Var3 != null) {
                                    d51Var3.b.c(null);
                                }
                                dt1 dt1Var = f51Var2.b;
                                ns0Var = (ns0) obj2;
                                this.n = d51Var;
                                this.k = dt1Var;
                                this.l = ns0Var;
                                this.q = f51Var2;
                                this.m = 1;
                                Object objF = dt1Var.f(this);
                                bt1Var = dt1Var;
                                if (objF == y50Var) {
                                    return y50Var;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    c.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                f51Var = (f51) this.l;
                                bt1 bt1Var5 = (bt1) this.k;
                                d51Var2 = (d51) this.n;
                                try {
                                    y02.Q(obj);
                                    bt1Var2 = bt1Var5;
                                    atomicReference2 = f51Var.a;
                                    while (!atomicReference2.compareAndSet(d51Var2, null) && atomicReference2.get() == d51Var2) {
                                    }
                                    ((dt1) bt1Var2).i(null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th = th3;
                                    atomicReference = f51Var.a;
                                    while (!atomicReference.compareAndSet(d51Var2, null) && atomicReference.get() == d51Var2) {
                                    }
                                    throw th;
                                }
                            }
                            f51Var2 = (f51) this.q;
                            ns0 ns0Var3 = (ns0) this.l;
                            bt1 bt1Var6 = (bt1) this.k;
                            d51 d51Var4 = (d51) this.n;
                            y02.Q(obj);
                            bt1Var = bt1Var6;
                            ns0Var = ns0Var3;
                            d51Var = d51Var4;
                        }
                        this.n = d51Var;
                        this.k = bt1Var;
                        this.l = f51Var2;
                        this.q = null;
                        this.m = 2;
                        Object objH = ns0Var.h(this);
                        if (objH == y50Var) {
                            return y50Var;
                        }
                        bt1Var2 = bt1Var;
                        obj = objH;
                        d51Var2 = d51Var;
                        f51Var = f51Var2;
                        atomicReference2 = f51Var.a;
                        while (!atomicReference2.compareAndSet(d51Var2, null)) {
                        }
                        ((dt1) bt1Var2).i(null);
                        return obj;
                    } catch (Throwable th4) {
                        th = th4;
                        d51Var2 = d51Var;
                        f51Var = f51Var2;
                        atomicReference = f51Var.a;
                        while (!atomicReference.compareAndSet(d51Var2, null)) {
                        }
                        throw th;
                    }
                } finally {
                }
            case 1:
                zs1 zs1Var2 = (zs1) obj4;
                int i3 = this.m;
                try {
                    try {
                        if (i3 == 0) {
                            y02.Q(obj);
                            m50 m50VarM2 = ((x50) this.n).h().m(f5.b0);
                            m50VarM2.getClass();
                            ws1Var = new ws1((ts1) obj3, (j61) m50VarM2);
                            zs1.a(zs1Var2, ws1Var);
                            dt1 dt1Var2 = zs1Var2.b;
                            ns0Var2 = (ns0) obj2;
                            this.n = ws1Var;
                            this.k = dt1Var2;
                            this.l = ns0Var2;
                            this.q = zs1Var2;
                            this.m = 1;
                            Object objF2 = dt1Var2.f(this);
                            bt1Var3 = dt1Var2;
                            if (objF2 == y50Var) {
                                return y50Var;
                            }
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    c.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                zs1Var = (zs1) this.l;
                                bt1 bt1Var7 = (bt1) this.k;
                                ws1Var2 = (ws1) this.n;
                                try {
                                    y02.Q(obj);
                                    bt1Var4 = bt1Var7;
                                    atomicReference4 = zs1Var.a;
                                    while (!atomicReference4.compareAndSet(ws1Var2, null) && atomicReference4.get() == ws1Var2) {
                                    }
                                    ((dt1) bt1Var4).i(null);
                                    return obj;
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    atomicReference3 = zs1Var.a;
                                    while (!atomicReference3.compareAndSet(ws1Var2, null) && atomicReference3.get() == ws1Var2) {
                                    }
                                    throw th2;
                                }
                            }
                            zs1Var2 = (zs1) this.q;
                            ns0 ns0Var4 = (ns0) this.l;
                            bt1 bt1Var8 = (bt1) this.k;
                            ws1 ws1Var3 = (ws1) this.n;
                            y02.Q(obj);
                            bt1Var3 = bt1Var8;
                            ns0Var2 = ns0Var4;
                            ws1Var = ws1Var3;
                        }
                        this.n = ws1Var;
                        this.k = bt1Var3;
                        this.l = zs1Var2;
                        this.q = null;
                        this.m = 2;
                        Object objH2 = ns0Var2.h(this);
                        if (objH2 == y50Var) {
                            return y50Var;
                        }
                        bt1Var4 = bt1Var3;
                        obj = objH2;
                        ws1Var2 = ws1Var;
                        zs1Var = zs1Var2;
                        atomicReference4 = zs1Var.a;
                        while (!atomicReference4.compareAndSet(ws1Var2, null)) {
                        }
                        ((dt1) bt1Var4).i(null);
                        return obj;
                    } catch (Throwable th6) {
                        th2 = th6;
                        ws1Var2 = ws1Var;
                        zs1Var = zs1Var2;
                        atomicReference3 = zs1Var.a;
                        while (!atomicReference3.compareAndSet(ws1Var2, null)) {
                        }
                        throw th2;
                    }
                } finally {
                }
            default:
                fu3 fu3Var = (fu3) obj4;
                ContentResolver contentResolver = (ContentResolver) this.n;
                int i4 = this.m;
                try {
                    if (i4 == 0) {
                        y02.Q(obj);
                        gn0Var = (gn0) this.l;
                        contentResolver.registerContentObserver((Uri) this.q, false, fu3Var);
                        kpVar = new kp((np) obj3);
                        this.l = gn0Var;
                        this.k = kpVar;
                        this.m = 1;
                        objB = kpVar.b(this);
                        if (objB == y50Var) {
                        }
                    } else if (i4 == 1) {
                        kpVar2 = (kp) this.k;
                        gn0Var2 = (gn0) this.l;
                        y02.Q(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i4 != 2) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kpVar2 = (kp) this.k;
                        gn0Var2 = (gn0) this.l;
                        y02.Q(obj);
                        gn0Var = gn0Var2;
                        kpVar = kpVar2;
                        this.l = gn0Var;
                        this.k = kpVar;
                        this.m = 1;
                        objB = kpVar.b(this);
                        if (objB == y50Var) {
                            return y50Var;
                        }
                        kp kpVar3 = kpVar;
                        gn0Var2 = gn0Var;
                        obj = objB;
                        kpVar2 = kpVar3;
                        if (((Boolean) obj).booleanValue()) {
                            contentResolver.unregisterContentObserver(fu3Var);
                            return dm3.a;
                        }
                        kpVar2.c();
                        is1 is1Var = gu3.a;
                        Float f = new Float(Settings.Global.getFloat(((Context) obj2).getContentResolver(), "animator_duration_scale", 1.0f));
                        this.l = gn0Var2;
                        this.k = kpVar2;
                        this.m = 2;
                        if (gn0Var2.k(f, this) == y50Var) {
                            return y50Var;
                        }
                        gn0Var = gn0Var2;
                        kpVar = kpVar2;
                        this.l = gn0Var;
                        this.k = kpVar;
                        this.m = 1;
                        objB = kpVar.b(this);
                        if (objB == y50Var) {
                        }
                    }
                } catch (Throwable th7) {
                    contentResolver.unregisterContentObserver(fu3Var);
                    throw th7;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e51(ts1 ts1Var, Object obj, ns0 ns0Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.o = ts1Var;
        this.r = obj;
        this.p = ns0Var;
    }
}
