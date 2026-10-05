package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONObject;
import top.th1nk.samp.R;
import top.th1nk.samp.feature.update.UpdateForegroundService;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m9 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(String str, int i, String str2, xy2 xy2Var, String str3, p40 p40Var) {
        super(2, p40Var);
        this.j = 9;
        this.m = str;
        this.k = i;
        this.n = str2;
        this.o = xy2Var;
        this.p = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object q(Object obj) throws Throwable {
        j61 j61VarG;
        i93 i93Var;
        x52 x52Var;
        x52 x52Var2;
        b4 b4Var;
        Throwable th;
        List listD;
        l20 l20Var;
        ek2 ek2Var;
        ek2 ek2Var2;
        y50 y50Var = y50.f;
        int i = this.k;
        p40 p40Var = null;
        int i2 = 1;
        if (i == 0) {
            y02.Q(obj);
            j61VarG = lq.G(((x50) this.l).h());
            ek2 ek2Var3 = (ek2) this.n;
            synchronized (ek2Var3.c) {
                Throwable th2 = ek2Var3.e;
                if (th2 != null) {
                    throw th2;
                }
                if (((bk2) ek2Var3.u.getValue()).compareTo(bk2.g) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (ek2Var3.d != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                ek2Var3.d = j61VarG;
                if (ek2Var3.y() != null) {
                    e20.a("called outside of runRecomposeAndApplyChanges");
                }
            }
            u uVar = new u(27, (ek2) this.n);
            a73.e(a73.a);
            synchronized (a73.c) {
                a73.h = qx.E0(a73.h, uVar);
            }
            b4 b4Var2 = new b4(4, uVar);
            i93 i93Var2 = ek2.z;
            ak2 ak2Var = ((ek2) this.n).y;
            try {
                do {
                    i93Var = ek2.z;
                    x52Var = (x52) i93Var.getValue();
                    f5 f5Var = f5.V;
                    o52 o52Var = x52Var.h;
                    if (o52Var.containsKey(ak2Var)) {
                        x52Var2 = x52Var;
                    } else if (x52Var.isEmpty()) {
                        x52Var2 = new x52(ak2Var, ak2Var, o52Var.c(ak2Var, new qg1(f5Var, f5Var)));
                    } else {
                        Object obj2 = x52Var.g;
                        Object obj3 = o52Var.get(obj2);
                        obj3.getClass();
                        x52Var2 = new x52(x52Var.f, ak2Var, o52Var.c(obj2, new qg1(((qg1) obj3).a, ak2Var)).c(ak2Var, new qg1(obj2, f5Var)));
                    }
                    if (x52Var != x52Var2) {
                    }
                    break;
                } while (!i93Var.h(x52Var, x52Var2));
                break;
                ek2 ek2Var4 = (ek2) this.n;
                synchronized (ek2Var4.c) {
                    listD = ek2Var4.D();
                }
                int size = listD.size();
                for (int i3 = 0; i3 < size; i3++) {
                    for (Object obj4 : ((l20) listD.get(i3)).k.h) {
                        xj2 xj2Var = obj4 instanceof xj2 ? (xj2) obj4 : null;
                        if (xj2Var != null && (l20Var = xj2Var.a) != null) {
                            l20Var.s(xj2Var, null);
                        }
                    }
                }
                ri2 ri2Var = new ri2((dk2) this.o, (ic) this.p, p40Var, i2);
                this.l = j61VarG;
                this.m = b4Var2;
                this.k = 1;
                if (ur.w(ri2Var, this) == y50Var) {
                    return y50Var;
                }
                b4Var = b4Var2;
                b4Var.b();
                ek2Var2 = (ek2) this.n;
                synchronized (ek2Var2.c) {
                }
            } catch (Throwable th3) {
                b4Var = b4Var2;
                th = th3;
                b4Var.b();
                ek2Var = (ek2) this.n;
                synchronized (ek2Var.c) {
                    try {
                        if (ek2Var.d == j61VarG) {
                            ek2Var.d = null;
                        }
                        if (ek2Var.y() != null) {
                            e20.a("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                i93 i93Var3 = ek2.z;
                h01.j(((ek2) this.n).y);
                throw th;
            }
        } else {
            if (i != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b4Var = (b4) this.m;
            j61VarG = (j61) this.l;
            try {
                y02.Q(obj);
                b4Var.b();
                ek2Var2 = (ek2) this.n;
                synchronized (ek2Var2.c) {
                    try {
                        if (ek2Var2.d == j61VarG) {
                            ek2Var2.d = null;
                        }
                        if (ek2Var2.y() != null) {
                            e20.a("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                i93 i93Var4 = ek2.z;
                h01.j(((ek2) this.n).y);
                return dm3.a;
            } catch (Throwable th6) {
                th = th6;
                b4Var.b();
                ek2Var = (ek2) this.n;
                synchronized (ek2Var.c) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object r(Object obj) {
        dt1 dt1Var;
        it2 it2Var;
        Object objT;
        d42 d42Var;
        float f;
        bt2 bt2Var;
        gk3 gk3Var = (gk3) this.p;
        Object obj2 = this.l;
        it2 it2Var2 = (it2) this.o;
        int i = this.k;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        try {
            if (i == 0) {
                y02.Q(obj);
                Object value = it2Var2.b.getValue();
                if (!obj2.equals(value)) {
                    it2.p(it2Var2);
                    it2Var2.y(0.0f);
                    gk3Var.r(obj2);
                    gk3Var.n(0L);
                    it2Var2.m(value);
                    it2Var2.b.setValue(obj2);
                }
                dt1 dt1Var2 = it2Var2.k;
                this.m = dt1Var2;
                this.n = it2Var2;
                this.k = 1;
                if (dt1Var2.f(this) != y50Var) {
                    dt1Var = dt1Var2;
                    it2Var = it2Var2;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    y02.Q(obj);
                    this.k = 3;
                    if (it2.s(it2Var2, this) != y50Var) {
                        d42Var = it2Var2.c;
                        z32 z32Var = it2Var2.i;
                        if (!s51.n(d42Var.getValue(), obj2)) {
                        }
                    }
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            y02.Q(obj);
                            return dm3Var;
                        }
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    f = 0.0f;
                    it2Var2.m(obj2);
                    it2Var2.y(f);
                    gk3Var.i();
                    this.k = 5;
                    return it2.r(it2Var2, this) != y50Var ? y50Var : dm3Var;
                }
                y02.Q(obj);
                d42Var = it2Var2.c;
                z32 z32Var2 = it2Var2.i;
                if (!s51.n(d42Var.getValue(), obj2)) {
                    if (z32Var2.g() >= 1.0f || ((bt2Var = it2Var2.o) != null && s51.n(null, bt2Var.b))) {
                        f = 0.0f;
                    } else {
                        cp3 cp3Var = bt2Var != null ? bt2Var.b : null;
                        qe qeVar = it2.s;
                        if (cp3Var != null) {
                            long j = bt2Var.a;
                            qe qeVar2 = bt2Var.e;
                            f = 0.0f;
                            qe qeVar3 = bt2Var.f;
                            qeVar = (qe) cp3Var.l(j, qeVar2, it2.t, qeVar3 == null ? qeVar : qeVar3);
                        } else {
                            f = 0.0f;
                            if (bt2Var != null && bt2Var.a != 0) {
                                long j2 = bt2Var.g;
                                if (j2 == Long.MIN_VALUE) {
                                    j2 = it2Var2.f;
                                }
                                float f2 = j2 / 1.0E9f;
                                if (f2 > 0.0f) {
                                    qeVar = new qe(1.0f / f2);
                                }
                            }
                        }
                        if (bt2Var == null) {
                            bt2Var = new bt2();
                        }
                        qe qeVar4 = bt2Var.e;
                        bt2Var.b = null;
                        bt2Var.c = false;
                        bt2Var.d = z32Var2.g();
                        qeVar4.e(z32Var2.g(), 0);
                        long j3 = it2Var2.f;
                        bt2Var.g = j3;
                        bt2Var.a = 0L;
                        bt2Var.f = qeVar;
                        bt2Var.h = vm1.N((1.0d - ((double) z32Var2.g())) * j3);
                        it2Var2.o = bt2Var;
                    }
                    this.m = null;
                    this.n = null;
                    this.k = 4;
                    if (it2.q(it2Var2, this) != y50Var) {
                        it2Var2.m(obj2);
                        it2Var2.y(f);
                        gk3Var.i();
                        this.k = 5;
                        if (it2.r(it2Var2, this) != y50Var) {
                        }
                    }
                }
            }
            it2Var = (it2) this.n;
            dt1Var = (dt1) this.m;
            y02.Q(obj);
            Object obj3 = it2Var.d;
            dt1Var.i(null);
            if (!obj2.equals(obj3)) {
                this.m = null;
                this.n = null;
                this.k = 2;
                if (it2Var2.m == Long.MIN_VALUE) {
                    objT = lq.I(i()).a(it2Var2.p, this);
                    if (objT != y50Var) {
                        objT = dm3Var;
                    }
                    if (objT != y50Var) {
                        this.k = 3;
                        if (it2.s(it2Var2, this) != y50Var) {
                        }
                    }
                } else {
                    objT = it2Var2.t(this);
                    if (objT != y50Var) {
                    }
                    if (objT != y50Var) {
                    }
                }
            }
        } catch (Throwable th) {
            dt1Var.i(null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:22:0x0073, B:27:0x008e], limit reached: 41 */
    /* JADX WARN: Path cross not found for [B:27:0x008e, B:22:0x0073], limit reached: 41 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[Catch: all -> 0x0026, PHI: r1 r4 r7 r8
      0x0084: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v8 java.lang.Object) binds: [B:23:0x0081, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r4v7 ??) = (r4v12 ??), (r4v13 ??) binds: [B:23:0x0081, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r7v4 ??) = (r7v9 ??), (r7v10 ??) binds: [B:23:0x0081, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r8v3 gn0) = (r8v2 gn0), (r8v7 gn0) binds: [B:23:0x0081, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0026, blocks: (B:15:0x003d, B:25:0x0084, B:22:0x0073, B:27:0x008e, B:8:0x0022), top: B:44:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #1 {all -> 0x0026, blocks: (B:15:0x003d, B:25:0x0084, B:22:0x0073, B:27:0x008e, B:8:0x0022), top: B:44:0x000c }] */
    /* JADX WARN: Type inference failed for: r11v2, types: [u10] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [js] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, js] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, js] */
    /* JADX WARN: Type inference failed for: r7v1, types: [k71] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, k71] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, k71] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008c -> B:22:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009f -> B:22:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object s(Object obj) throws Throwable {
        ?? k71Var;
        gn0 gn0Var;
        Object objM;
        ?? r4;
        ?? r7;
        Object objM2;
        cs0 cs0Var = (cs0) this.p;
        int i = this.k;
        ?? r42 = 1;
        y50 y50Var = y50.f;
        try {
            if (i == 0) {
                y02.Q(obj);
                gn0Var = (gn0) this.o;
                k71Var = new k71(15, false);
                k71Var.g = new e43();
                np npVarA = lr.a(1, 6, null);
                try {
                    objM = k71Var.m(npVarA, cs0Var);
                    this.o = gn0Var;
                    this.m = k71Var;
                    this.n = npVarA;
                    this.l = objM;
                    this.k = 1;
                    if (gn0Var.k(objM, this) != y50Var) {
                        r4 = npVarA;
                        r7 = k71Var;
                    }
                    return y50Var;
                } catch (Throwable th) {
                    th = th;
                    r42 = npVarA;
                    ?? r11 = (u10) k71Var.g;
                    if (r11 != 0) {
                        r11.l(r42);
                    }
                    u10 u10Var = (u10) k71Var.g;
                    if (u10Var == null) {
                        yb2.b("Called dispose on a manager that has been disposed of");
                    }
                    u10Var.g();
                    k71Var.g = null;
                    throw th;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    objM = this.l;
                    js jsVar = (js) this.n;
                    k71 k71Var2 = (k71) this.m;
                    gn0Var = (gn0) this.o;
                    y02.Q(obj);
                    r42 = jsVar;
                    k71Var = k71Var2;
                    objM2 = k71Var.m(r42, cs0Var);
                    r4 = r42;
                    r7 = k71Var;
                    if (!s51.n(objM2, objM)) {
                        this.o = gn0Var;
                        this.m = k71Var;
                        this.n = r42;
                        this.l = objM2;
                        this.k = 3;
                        if (gn0Var.k(objM2, this) != y50Var) {
                            objM = objM2;
                            r4 = r42;
                            r7 = k71Var;
                        }
                        return y50Var;
                    }
                } else if (i != 3) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            objM = this.l;
            js jsVar2 = (js) this.n;
            k71 k71Var3 = (k71) this.m;
            gn0Var = (gn0) this.o;
            y02.Q(obj);
            r4 = jsVar2;
            r7 = k71Var3;
            this.o = gn0Var;
            this.m = r7;
            this.n = r4;
            this.l = objM;
            this.k = 2;
            Object objE = r4.e(this);
            r42 = r4;
            k71Var = r7;
            if (objE == y50Var) {
                objM2 = k71Var.m(r42, cs0Var);
                r4 = r42;
                r7 = k71Var;
                if (!s51.n(objM2, objM)) {
                }
                this.o = gn0Var;
                this.m = r7;
                this.n = r4;
                this.l = objM;
                this.k = 2;
                Object objE2 = r4.e(this);
                r42 = r4;
                k71Var = r7;
                if (objE2 == y50Var) {
                }
            }
            return y50Var;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0104  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0077 -> B:15:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object u(Object obj) {
        us2 us2Var;
        ws2 ws2Var = (ws2) this.o;
        qk2 qk2Var = (qk2) this.p;
        tj3 tj3Var = (tj3) this.n;
        int i = this.k;
        p40 p40Var = null;
        if (i == 0) {
            y02.Q(obj);
            us2 us2Var2 = (us2) this.l;
            float fJ = ws2Var.j(ws2Var.f(((rj3) qk2Var.f).a));
            ws2 ws2Var2 = tj3Var.a;
            ws2Var2.h(ws2Var2.f(us2Var2.a(1, ws2Var2.i(ws2Var2.e(fJ)))));
            us2Var = us2Var2;
            if (!((rj3) qk2Var.f).c) {
            }
        } else {
            if (i != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qk2 qk2Var2 = (qk2) this.m;
            us2 us2Var3 = (us2) this.l;
            y02.Q(obj);
            us2 us2Var4 = us2Var3;
            qk2 qk2Var3 = qk2Var2;
            Object objW = obj;
            qk2Var3.f = objW;
            rj3 rj3Var = (rj3) qk2Var.f;
            a31 a31Var = tj3Var.e;
            long j = rj3Var.b;
            long j2 = rj3Var.a;
            ((np3) a31Var.g).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((np3) a31Var.h).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            rj3 rj3VarE = tj3.e(tj3Var.f);
            if (rj3VarE != null) {
                a31 a31Var2 = tj3Var.e;
                long j3 = rj3VarE.b;
                long j4 = rj3VarE.a;
                ((np3) a31Var2.g).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((np3) a31Var2.h).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                qk2Var.f = ((rj3) qk2Var.f).a(rj3VarE);
            }
            float fJ2 = ws2Var.j(ws2Var.f(((rj3) qk2Var.f).a));
            ws2 ws2Var3 = tj3Var.a;
            ws2Var3.h(ws2Var3.f(us2Var4.a(1, ws2Var3.i(ws2Var3.e(fJ2)))));
            us2Var = us2Var4;
            p40Var = null;
            if (!((rj3) qk2Var.f).c) {
                np npVar = tj3Var.f;
                this.l = us2Var;
                this.m = qk2Var;
                this.k = 1;
                objW = ur.w(new hd1(npVar, p40Var, 9), this);
                y50 y50Var = y50.f;
                if (objW == y50Var) {
                    return y50Var;
                }
                us2Var4 = us2Var;
                qk2Var3 = qk2Var;
                qk2Var3.f = objW;
                rj3 rj3Var2 = (rj3) qk2Var.f;
                a31 a31Var3 = tj3Var.e;
                long j5 = rj3Var2.b;
                long j22 = rj3Var2.a;
                ((np3) a31Var3.g).a(Float.intBitsToFloat((int) (j22 >> 32)), j5);
                ((np3) a31Var3.h).a(Float.intBitsToFloat((int) (j22 & 4294967295L)), j5);
                rj3 rj3VarE2 = tj3.e(tj3Var.f);
                if (rj3VarE2 != null) {
                }
                float fJ22 = ws2Var.j(ws2Var.f(((rj3) qk2Var.f).a));
                ws2 ws2Var32 = tj3Var.a;
                ws2Var32.h(ws2Var32.f(us2Var4.a(1, ws2Var32.i(ws2Var32.e(fJ22)))));
                us2Var = us2Var4;
                p40Var = null;
                if (!((rj3) qk2Var.f).c) {
                    return dm3.a;
                }
            }
        }
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) throws Throwable {
        int i = this.j;
        y50 y50Var = y50.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                ((m9) m((p40) obj2, (x50) obj)).o(dm3Var);
                return y50Var;
            case 1:
                return ((m9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((m9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return ((m9) m((p40) obj2, obj)).o(dm3Var);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((m9) m((p40) obj2, (jd2) obj)).o(dm3Var);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ((m9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((m9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((m9) m((p40) obj2, (fn0) obj)).o(dm3Var);
            case 8:
                return ((m9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.g /* 9 */:
                ((m9) m((p40) obj2, (es1) obj)).o(dm3Var);
                return dm3Var;
            case vr.h /* 10 */:
                return ((m9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 11:
                return ((m9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.i /* 12 */:
                return ((m9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 13:
                ((m9) m((p40) obj2, (gn0) obj)).o(dm3Var);
                return y50Var;
            case 14:
                return ((m9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case jo3.g /* 15 */:
                return ((m9) m((p40) obj2, (us2) obj)).o(dm3Var);
            default:
                return ((m9) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                m9 m9Var = new m9((ma) this.m, (ns0) this.n, (o9) this.o, (te1) obj2, p40Var, 0);
                m9Var.l = obj;
                return m9Var;
            case 1:
                return new m9((ye1) this.l, (os1) this.m, (gg3) this.n, (sf3) this.o, (b11) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new m9((so) this.l, (bg3) this.m, (ye1) this.n, (qg3) this.o, (iy1) obj2, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                m9 m9Var2 = new m9((List) this.o, (ArrayList) obj2, p40Var, 3);
                m9Var2.n = obj;
                return m9Var2;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                m9 m9Var3 = new m9((gf1) this.m, (ff1) this.n, (o50) this.o, (fn0) obj2, p40Var, 4);
                m9Var3.l = obj;
                return m9Var3;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new m9((sa1) this.m, (kq2) this.n, (v71) this.o, (String) obj2, p40Var, 5);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new m9((sa1) this.l, (kq2) this.m, (v71) this.n, (ts0) this.o, (String) obj2, p40Var, 6);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                m9 m9Var4 = new m9((h10) this.m, (os1) this.n, (z32) this.o, (os1) obj2, p40Var, 7);
                m9Var4.l = obj;
                return m9Var4;
            case 8:
                return new m9((oa2) this.o, (w72) obj2, p40Var, 8);
            case vr.g /* 9 */:
                m9 m9Var5 = new m9((String) this.m, this.k, (String) this.n, (xy2) this.o, (String) obj2, p40Var);
                m9Var5.l = obj;
                return m9Var5;
            case vr.h /* 10 */:
                m9 m9Var6 = new m9((ek2) this.n, (dk2) this.o, (ic) obj2, p40Var, 10);
                m9Var6.l = obj;
                return m9Var6;
            case 11:
                return new m9((sm2) this.o, (Uri) obj2, p40Var, 11);
            case vr.i /* 12 */:
                return new m9((it2) this.o, this.l, (gk3) obj2, p40Var);
            case 13:
                m9 m9Var7 = new m9((cs0) obj2, p40Var);
                m9Var7.o = obj;
                return m9Var7;
            case 14:
                m9 m9Var8 = new m9((kb2) this.m, (hf3) this.n, (zb) this.o, (xc2) obj2, p40Var, 14);
                m9Var8.l = obj;
                return m9Var8;
            case jo3.g /* 15 */:
                m9 m9Var9 = new m9((tj3) this.n, (ws2) this.o, (qk2) obj2, p40Var, 15);
                m9Var9.l = obj;
                return m9Var9;
            default:
                return new m9((File) this.l, (File) this.m, (go3) this.n, (qn3) this.o, (Application) obj2, p40Var, 16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x04bc, code lost:
    
        if (defpackage.cl3.G(r3, r4, r26) == r6) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04f0, code lost:
    
        if (defpackage.cl3.G(r3, r5, r26) == r6) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x056c, code lost:
    
        if (r8.a(r0, r26) == r11) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0600, code lost:
    
        if (r0.v(r6, r3, r26) == r5) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0681, code lost:
    
        if (r5.c(r26) != r6) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0294, code lost:
    
        if (defpackage.cl3.G(r3, r11, r26) == r0) goto L93;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0675 A[PHI: r0
      0x0675: PHI (r0v26 java.lang.Object) = (r0v25 java.lang.Object), (r0v30 java.lang.Object) binds: [B:263:0x0672, B:253:0x063b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:406:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019c A[PHI: r3 r6 r7 r8
      0x019c: PHI (r3v62 java.io.File) = (r3v61 java.io.File), (r3v71 java.io.File) binds: [B:74:0x0215, B:59:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r6v20 java.io.File) = (r6v19 java.io.File), (r6v24 java.io.File) binds: [B:74:0x0215, B:59:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r7v22 java.lang.Object) = (r7v21 java.lang.Object), (r7v27 java.lang.Object) binds: [B:74:0x0215, B:59:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r8v33 android.app.Application) = (r8v32 android.app.Application), (r8v36 android.app.Application) binds: [B:74:0x0215, B:59:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021f A[Catch: Exception -> 0x023d, TryCatch #12 {Exception -> 0x023d, blocks: (B:76:0x0219, B:78:0x021f, B:80:0x0223, B:83:0x0241, B:85:0x0245, B:86:0x025f, B:88:0x0263, B:89:0x0277, B:90:0x027c, B:91:0x027d), top: B:378:0x0219 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027d A[Catch: Exception -> 0x023d, TRY_LEAVE, TryCatch #12 {Exception -> 0x023d, blocks: (B:76:0x0219, B:78:0x021f, B:80:0x0223, B:83:0x0241, B:85:0x0245, B:86:0x025f, B:88:0x0263, B:89:0x0277, B:90:0x027c, B:91:0x027d), top: B:378:0x0219 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a1  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        Object obj2;
        List list;
        Iterator it;
        Object objW;
        Object objE;
        String str;
        qt1 qt1Var;
        j82 h82Var;
        o50 o50VarQ;
        sw swVar;
        File file;
        Object objB;
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2;
        Object objG;
        File file2;
        FileInputStream fileInputStream3;
        JSONArray jSONArray;
        Application application;
        Application application2;
        File file3;
        File file4;
        Object objG2;
        File file5;
        File file6;
        fv3 fv3Var;
        String message;
        String str2 = "";
        int i = 4;
        int i2 = 0;
        int i3 = 2;
        File file7 = "call to 'resume' before 'invoke' with coroutine";
        int i4 = 1;
        switch (this.j) {
            case 0:
                o9 o9Var = (o9) this.o;
                ma maVar = (ma) this.m;
                y50 y50Var = y50.f;
                int i5 = this.k;
                try {
                    if (i5 != 0) {
                        if (i5 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                        throw new kz();
                    }
                    y02.Q(obj);
                    x50 x50Var = (x50) this.l;
                    ve1 ve1Var = we1.a;
                    View view = maVar.f;
                    ve1Var.getClass();
                    a31 a31Var = new a31(view);
                    ze1 ze1Var = new ze1(maVar.f, new l9((te1) this.p), a31Var);
                    if (ja3.a) {
                        cl3.t(x50Var, null, new j(o9Var, a31Var, null, i3), 3);
                    }
                    ns0 ns0Var = (ns0) this.n;
                    if (ns0Var != null) {
                        ns0Var.h(ze1Var);
                    }
                    o9Var.c = ze1Var;
                    this.k = 1;
                    maVar.a(ze1Var, this);
                    return y50Var;
                } catch (Throwable th2) {
                    o9Var.c = null;
                    throw th2;
                }
            case 1:
                ye1 ye1Var = (ye1) this.l;
                y50 y50Var2 = y50.f;
                int i6 = this.k;
                try {
                    if (i6 == 0) {
                        y02.Q(obj);
                        p70 p70VarB = b32.B(new yb((os1) this.m, i));
                        rs rsVar = new rs(ye1Var, (gg3) this.n, (sf3) this.o, (b11) this.p, 1);
                        this.k = 1;
                        if (p70VarB.a(rsVar, this) == y50Var2) {
                            return y50Var2;
                        }
                    } else {
                        if (i6 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    gq.x(ye1Var);
                    return dm3.a;
                } catch (Throwable th3) {
                    gq.x(ye1Var);
                    throw th3;
                }
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                dm3 dm3Var = dm3.a;
                y50 y50Var3 = y50.f;
                int i7 = this.k;
                if (i7 == 0) {
                    y02.Q(obj);
                    so soVar = (so) this.l;
                    bg3 bg3Var = (bg3) this.m;
                    db0 db0Var = ((ye1) this.n).a;
                    pg3 pg3Var = ((qg3) this.o).a;
                    iy1 iy1Var = (iy1) this.p;
                    this.k = 1;
                    int iR = iy1Var.r(yg3.e(bg3Var.b));
                    Object objA = soVar.a(iR < pg3Var.a.a.g.length() ? pg3Var.b(iR) : iR != 0 ? pg3Var.b(iR - 1) : new jk2(0.0f, 0.0f, 1.0f, (int) (ue3.a((gh3) db0Var.c, (ua0) db0Var.d, (zp0) db0Var.e) & 4294967295L)), this);
                    if (objA != y50Var3) {
                        objA = dm3Var;
                    }
                    if (objA == y50Var3) {
                        return y50Var3;
                    }
                } else {
                    if (i7 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int i8 = this.k;
                if (i8 == 0) {
                    y02.Q(obj);
                    obj2 = this.n;
                    List list2 = (List) this.o;
                    list = (ArrayList) this.p;
                    it = list2.iterator();
                } else if (i8 == 1) {
                    obj2 = this.l;
                    it = (Iterator) this.m;
                    list = (List) this.n;
                    y02.Q(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list.add(new c70(1, null));
                        this.n = list;
                        this.m = it;
                        this.l = null;
                        this.k = 2;
                        throw null;
                    }
                } else {
                    if (i8 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it2 = (Iterator) this.m;
                    List list3 = (List) this.n;
                    y02.Q(obj);
                    list = list3;
                    it = it2;
                    obj2 = obj;
                }
                if (!it.hasNext()) {
                    return obj2;
                }
                if (it.next() != null) {
                    qn1.b();
                    return null;
                }
                this.n = list;
                this.m = it;
                this.l = obj2;
                this.k = 1;
                throw null;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                dm3 dm3Var2 = dm3.a;
                y50 y50Var4 = y50.f;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y02.Q(obj);
                        return dm3Var2;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                jd2 jd2Var = (jd2) this.l;
                gf1 gf1Var = (gf1) this.m;
                ff1 ff1Var = (ff1) this.n;
                p40 p40Var = null;
                l lVar = new l((o50) this.o, (fn0) this.p, jd2Var, p40Var, 15);
                this.k = 1;
                if (ff1Var == ff1.g) {
                    c.p("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
                    return null;
                }
                if (((rf1) gf1Var).i == ff1.f || (objW = ur.w(new n9(gf1Var, ff1Var, lVar, p40Var, 14), this)) != y50Var4) {
                    objW = dm3Var2;
                }
                if (objW == y50Var4) {
                    return y50Var4;
                }
                return dm3Var2;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                kq2 kq2Var = (kq2) this.n;
                v71 v71Var = (v71) this.o;
                sa1 sa1Var = (sa1) this.m;
                y50 y50Var5 = y50.f;
                int i10 = this.k;
                if (i10 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var = sa1Var.c;
                    String str3 = kq2Var.e;
                    xy2 xy2Var = v71Var.g;
                    this.k = 1;
                    if (qy2Var.w(str3, xy2Var, this) != y50Var5) {
                    }
                    return y50Var5;
                }
                if (i10 == 1) {
                    y02.Q(obj);
                } else {
                    if (i10 == 2) {
                        y02.Q(obj);
                        qy2 qy2Var2 = sa1Var.c;
                        this.k = 3;
                        objE = qy2Var2.e(this);
                        if (objE != y50Var5) {
                            str = (String) objE;
                            y92 y92Var = sa1Var.g;
                            this.l = str;
                            this.k = 4;
                            break;
                        }
                        return y50Var5;
                    }
                    if (i10 != 3) {
                        if (i10 != 4) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) this.l;
                        y02.Q(obj);
                        String str4 = str;
                        Application application3 = sa1Var.b;
                        application3.getClass();
                        application3.startActivity(sa1.e((sa1) this.m, (kq2) this.n, (String) this.p, v71Var.g, v71Var.e, str4));
                        return dm3.a;
                    }
                    y02.Q(obj);
                    objE = obj;
                    str = (String) objE;
                    y92 y92Var2 = sa1Var.g;
                    this.l = str;
                    this.k = 4;
                }
                break;
                qy2 qy2Var3 = sa1Var.c;
                String str5 = kq2Var.e;
                String str6 = v71Var.e;
                this.k = 2;
                if (qy2Var3.v(str5, str6, this) != y50Var5) {
                    qy2 qy2Var22 = sa1Var.c;
                    this.k = 3;
                    objE = qy2Var22.e(this);
                    if (objE != y50Var5) {
                    }
                }
                return y50Var5;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                sa1 sa1Var2 = (sa1) this.l;
                v71 v71Var2 = (v71) this.n;
                String str7 = v71Var2.e;
                xy2 xy2Var2 = v71Var2.g;
                kq2 kq2Var2 = (kq2) this.m;
                y50 y50Var6 = y50.f;
                int i11 = this.k;
                if (i11 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var4 = sa1Var2.c;
                    String str8 = kq2Var2.e;
                    this.k = 1;
                    if (qy2Var4.w(str8, xy2Var2, this) != y50Var6) {
                    }
                    return y50Var6;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    ((ts0) this.o).l(kq2Var2, (String) this.p, xy2Var2, str7);
                    return dm3.a;
                }
                y02.Q(obj);
                qy2 qy2Var5 = sa1Var2.c;
                String str9 = kq2Var2.e;
                this.k = 2;
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                z32 z32Var = (z32) this.o;
                dm3 dm3Var3 = dm3.a;
                os1 os1Var = (os1) this.p;
                h10 h10Var = (h10) this.m;
                os1 os1Var2 = (os1) this.n;
                y50 y50Var7 = y50.f;
                int i12 = this.k;
                try {
                    if (i12 == 0) {
                        y02.Q(obj);
                        fn0 fn0Var = (fn0) this.l;
                        if (((List) os1Var2.getValue()).size() < 2) {
                            su1 su1Var = su1.f;
                            this.k = 1;
                            break;
                        } else {
                            z32Var.h(0.0f);
                            qt1 qt1Var2 = (qt1) qx.y0((List) os1Var2.getValue());
                            h10Var.g(qt1Var2);
                            h10Var.g((qt1) ((List) os1Var2.getValue()).get(((List) os1Var2.getValue()).size() - 2));
                            yn0 yn0Var = new yn0(8, os1Var, z32Var);
                            this.l = qt1Var2;
                            this.k = 2;
                            if (fn0Var.a(yn0Var, this) != y50Var7) {
                                qt1Var = qt1Var2;
                                h10Var.e(qt1Var, false);
                            }
                        }
                        return y50Var7;
                    }
                    if (i12 == 1) {
                        y02.Q(obj);
                    } else {
                        if (i12 != 2) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qt1Var = (qt1) this.l;
                        y02.Q(obj);
                        h10Var.e(qt1Var, false);
                    }
                    return dm3Var3;
                } finally {
                    os1Var.setValue(Boolean.FALSE);
                }
            case 8:
                w72 w72Var = (w72) this.p;
                oa2 oa2Var = (oa2) this.o;
                y50 y50Var8 = y50.f;
                int i13 = this.k;
                try {
                    try {
                        try {
                        } catch (Throwable th4) {
                            th = th4;
                            kx1 kx1Var = kx1.g;
                            j90 j90Var = ac0.a;
                            x80 x80Var = x80.h;
                            kx1Var.getClass();
                            o50VarQ = pq.Q(kx1Var, x80Var);
                            swVar = new sw(file7, null, i4);
                            this.m = null;
                            this.l = th;
                            this.n = null;
                            this.k = 5;
                            if (cl3.G(o50VarQ, swVar, this) != y50Var8) {
                                throw th;
                            }
                            return y50Var8;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        e = e2;
                        ti tiVar = ui.a;
                        ui.c(ti.i, "PluginViewModel", "Plugin installation failed unexpectedly", e);
                        h82Var = new h82(g82.u);
                        kx1 kx1Var2 = kx1.g;
                        j90 j90Var2 = ac0.a;
                        x80 x80Var2 = x80.h;
                        kx1Var2.getClass();
                        o50 o50VarQ2 = pq.Q(kx1Var2, x80Var2);
                        sw swVar2 = new sw(file7, null, i4);
                        this.m = null;
                        this.l = h82Var;
                        this.n = null;
                        this.k = 4;
                        break;
                    }
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    e = e4;
                    file7 = 2;
                    ti tiVar2 = ui.a;
                    ui.c(ti.i, "PluginViewModel", "Plugin installation failed unexpectedly", e);
                    h82Var = new h82(g82.u);
                    kx1 kx1Var22 = kx1.g;
                    j90 j90Var22 = ac0.a;
                    x80 x80Var22 = x80.h;
                    kx1Var22.getClass();
                    o50 o50VarQ22 = pq.Q(kx1Var22, x80Var22);
                    sw swVar22 = new sw(file7, null, i4);
                    this.m = null;
                    this.l = h82Var;
                    this.n = null;
                    this.k = 4;
                    break;
                } catch (Throwable th5) {
                    th = th5;
                    file7 = 2;
                    kx1 kx1Var3 = kx1.g;
                    j90 j90Var3 = ac0.a;
                    x80 x80Var3 = x80.h;
                    kx1Var3.getClass();
                    o50VarQ = pq.Q(kx1Var3, x80Var3);
                    swVar = new sw(file7, null, i4);
                    this.m = null;
                    this.l = th;
                    this.n = null;
                    this.k = 5;
                    if (cl3.G(o50VarQ, swVar, this) != y50Var8) {
                    }
                    return y50Var8;
                }
                if (i13 == 0) {
                    y02.Q(obj);
                    Application application4 = oa2Var.b;
                    application4.getClass();
                    file = new File(application4.getCacheDir(), "plugin-" + UUID.randomUUID() + ".splug");
                    v72 v72Var = v72.a;
                    String str10 = w72Var.g;
                    this.m = file;
                    this.k = 1;
                    objB = v72Var.b(str10, file, this);
                    if (objB == y50Var8) {
                    }
                    return y50Var8;
                }
                if (i13 == 1) {
                    file = (File) this.m;
                    y02.Q(obj);
                    objB = ((rn2) obj).f;
                } else {
                    if (i13 != 2) {
                        if (i13 == 3 || i13 == 4) {
                            h82Var = (j82) this.l;
                            y02.Q(obj);
                            oa2.e(oa2Var, h82Var);
                            return dm3.a;
                        }
                        if (i13 != 5) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th6 = (Throwable) this.l;
                        y02.Q(obj);
                        throw th6;
                    }
                    fileInputStream3 = (FileInputStream) this.n;
                    file2 = (File) this.m;
                    try {
                        y02.Q(obj);
                        objG = obj;
                        h82Var = (j82) objG;
                        uq.l(fileInputStream3, null);
                        file = file2;
                        kx1 kx1Var4 = kx1.g;
                        j90 j90Var4 = ac0.a;
                        x80 x80Var4 = x80.h;
                        kx1Var4.getClass();
                        o50 o50VarQ3 = pq.Q(kx1Var4, x80Var4);
                        sw swVar3 = new sw(file, null, i4);
                        this.m = null;
                        this.l = h82Var;
                        this.n = null;
                        this.k = 3;
                        break;
                    } catch (Throwable th7) {
                        fileInputStream2 = fileInputStream3;
                        th = th7;
                        try {
                            throw th;
                        } catch (Throwable th8) {
                            uq.l(fileInputStream2, th);
                            throw th8;
                        }
                    }
                }
                Throwable thA = rn2.a(objB);
                if (thA != null) {
                    String message2 = thA.getMessage();
                    if (message2 != null) {
                        str2 = message2;
                    }
                    h82Var = new h82(y93.h0(str2, "too large", true) ? g82.i : g82.h);
                    kx1 kx1Var42 = kx1.g;
                    j90 j90Var42 = ac0.a;
                    x80 x80Var42 = x80.h;
                    kx1Var42.getClass();
                    o50 o50VarQ32 = pq.Q(kx1Var42, x80Var42);
                    sw swVar32 = new sw(file, null, i4);
                    this.m = null;
                    this.l = h82Var;
                    this.n = null;
                    this.k = 3;
                    break;
                } else {
                    i93 i93Var = oa2Var.o;
                    i92 i92Var = new i92(f92.h, w72Var.a);
                    i93Var.getClass();
                    i93Var.j(null, i92Var);
                    FileInputStream fileInputStream4 = new FileInputStream(file);
                    try {
                        y92 y92Var3 = oa2Var.c;
                        String path = new URI(w72Var.g).getPath();
                        path.getClass();
                        String strD0 = y93.D0(path, '/', path);
                        String str11 = w72Var.h;
                        String str12 = w72Var.a;
                        String str13 = w72Var.c;
                        String str14 = w72Var.d;
                        this.m = file;
                        this.l = null;
                        this.n = fileInputStream4;
                        this.k = 2;
                        y92Var3.getClass();
                        j90 j90Var5 = ac0.a;
                        fileInputStream = fileInputStream4;
                        try {
                            objG = cl3.G(x80.h, new v92(y92Var3, fileInputStream, strD0, str11, str12, str13, str14, null), this);
                            if (objG != y50Var8) {
                                file2 = file;
                                fileInputStream3 = fileInputStream;
                                h82Var = (j82) objG;
                                uq.l(fileInputStream3, null);
                                file = file2;
                                kx1 kx1Var422 = kx1.g;
                                j90 j90Var422 = ac0.a;
                                x80 x80Var422 = x80.h;
                                kx1Var422.getClass();
                                o50 o50VarQ322 = pq.Q(kx1Var422, x80Var422);
                                sw swVar322 = new sw(file, null, i4);
                                this.m = null;
                                this.l = h82Var;
                                this.n = null;
                                this.k = 3;
                                break;
                            }
                            return y50Var8;
                        } catch (Throwable th9) {
                            th = th9;
                            th = th;
                            fileInputStream2 = fileInputStream;
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        fileInputStream = fileInputStream4;
                    }
                }
                break;
            case vr.g /* 9 */:
                dm3 dm3Var4 = dm3.a;
                String str15 = (String) this.p;
                xy2 xy2Var3 = (xy2) this.o;
                String str16 = (String) this.n;
                int i14 = this.k;
                String str17 = (String) this.m;
                es1 es1Var = (es1) this.l;
                y02.Q(obj);
                ec2 ec2Var = ih2.b;
                String str18 = (String) es1Var.c(ec2Var);
                if (str18 == null) {
                    str18 = "[]";
                }
                try {
                    jSONArray = new JSONArray(str18);
                    break;
                } catch (Exception unused) {
                    jSONArray = new JSONArray();
                }
                int length = jSONArray.length();
                while (i2 < length) {
                    dm3 dm3Var5 = dm3Var4;
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                    if (s51.n(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("host") : null, str17) && jSONObjectOptJSONObject.optInt("port") == i14) {
                        jSONObjectOptJSONObject.put("nickname", str16);
                        jSONObjectOptJSONObject.put("textEncoding", xy2Var3.f);
                        jSONObjectOptJSONObject.put("password", str15);
                        es1Var.d(ec2Var, jSONArray.toString());
                        return dm3Var5;
                    }
                    i2++;
                    dm3Var4 = dm3Var5;
                }
                dm3 dm3Var6 = dm3Var4;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("host", str17);
                jSONObject.put("port", i14);
                jSONObject.put("nickname", str16);
                jSONObject.put("textEncoding", xy2Var3.f);
                jSONObject.put("password", str15);
                jSONArray.put(jSONObject);
                es1Var.d(ec2Var, jSONArray.toString());
                return dm3Var6;
            case vr.h /* 10 */:
                return q(obj);
            case 11:
                dm3 dm3Var7 = dm3.a;
                sm2 sm2Var = (sm2) this.o;
                i93 i93Var2 = sm2Var.r;
                y50 y50Var9 = y50.f;
                int i15 = this.k;
                p40 p40Var2 = null;
                if (i15 == 0) {
                    y02.Q(obj);
                    sm2Var.k = 0L;
                    application = sm2Var.b;
                    application.getClass();
                    File fileR = sm2Var.c.r();
                    File file8 = new File(fileR, "local_import.zip");
                    xk0 xk0Var = new xk0(new vk0(0, 0, ""));
                    i93Var2.getClass();
                    i93Var2.j(null, xk0Var);
                    try {
                        j90 j90Var6 = ac0.a;
                        x80 x80Var5 = x80.h;
                        rw rwVar = new rw(application, (Uri) this.p, file8, (p40) null);
                        this.l = application;
                        this.m = fileR;
                        this.n = file8;
                        this.k = 1;
                        if (cl3.G(x80Var5, rwVar, this) != y50Var9) {
                            file4 = fileR;
                            file3 = file8;
                            j90 j90Var7 = ac0.a;
                            x80 x80Var6 = x80.h;
                            sw swVar4 = new sw(file3, p40Var2, i3);
                            this.l = application;
                            this.m = file4;
                            this.n = file3;
                            this.k = 2;
                            objG2 = cl3.G(x80Var6, swVar4, this);
                            if (objG2 != y50Var9) {
                            }
                        }
                        return y50Var9;
                    } catch (Exception e5) {
                        e = e5;
                        application2 = application;
                        file3 = file8;
                    }
                } else if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        file3 = (File) this.n;
                        application2 = (Application) this.l;
                        try {
                            y02.Q(obj);
                        } catch (Exception e6) {
                            e = e6;
                            message = e.getMessage();
                            if (message == null) {
                            }
                            yk0 yk0Var = new yk0(message);
                            i93Var2.getClass();
                            i93Var2.j(null, yk0Var);
                            file3.delete();
                        }
                        break;
                    } else {
                        file3 = (File) this.n;
                        file4 = (File) this.m;
                        Application application5 = (Application) this.l;
                        try {
                            y02.Q(obj);
                            application = application5;
                            objG2 = obj;
                            file5 = file3;
                            file6 = file4;
                        } catch (Exception e7) {
                            e = e7;
                            application2 = application5;
                        }
                        try {
                            fv3Var = (fv3) objG2;
                            if (!(fv3Var instanceof ev3)) {
                                j90 j90Var8 = ac0.a;
                                x80 x80Var7 = x80.h;
                                qm2 qm2Var = new qm2(sm2Var, file5, file6, p40Var2, 0);
                                this.l = application;
                                this.m = null;
                                this.n = file5;
                                this.k = 3;
                                break;
                            } else if (fv3Var instanceof bv3) {
                                String string = application.getString(R.string.download_snackbar_invalid_zip_empty);
                                string.getClass();
                                yk0 yk0Var2 = new yk0(string);
                                i93Var2.getClass();
                                i93Var2.j(null, yk0Var2);
                                file5.delete();
                            } else if (fv3Var instanceof dv3) {
                                String string2 = application.getString(R.string.download_snackbar_invalid_zip);
                                string2.getClass();
                                yk0 yk0Var3 = new yk0(string2);
                                i93Var2.getClass();
                                i93Var2.j(null, yk0Var3);
                                file5.delete();
                            } else {
                                if (!(fv3Var instanceof cv3)) {
                                    throw new kz();
                                }
                                yk0 yk0Var4 = new yk0(((cv3) fv3Var).a);
                                i93Var2.getClass();
                                i93Var2.j(null, yk0Var4);
                                file5.delete();
                            }
                        } catch (Exception e8) {
                            e = e8;
                            application2 = application;
                            file3 = file5;
                            message = e.getMessage();
                            if (message == null) {
                            }
                            yk0 yk0Var5 = new yk0(message);
                            i93Var2.getClass();
                            i93Var2.j(null, yk0Var5);
                            file3.delete();
                        }
                    }
                    message = e.getMessage();
                    if (message == null) {
                        message = application2.getString(R.string.download_snackbar_import_failed);
                        message.getClass();
                    }
                    yk0 yk0Var52 = new yk0(message);
                    i93Var2.getClass();
                    i93Var2.j(null, yk0Var52);
                    file3.delete();
                } else {
                    file3 = (File) this.n;
                    file4 = (File) this.m;
                    application = (Application) this.l;
                    try {
                        y02.Q(obj);
                        j90 j90Var72 = ac0.a;
                        x80 x80Var62 = x80.h;
                        sw swVar42 = new sw(file3, p40Var2, i3);
                        this.l = application;
                        this.m = file4;
                        this.n = file3;
                        this.k = 2;
                        objG2 = cl3.G(x80Var62, swVar42, this);
                        if (objG2 != y50Var9) {
                            file5 = file3;
                            file6 = file4;
                            fv3Var = (fv3) objG2;
                            if (!(fv3Var instanceof ev3)) {
                            }
                        }
                        return y50Var9;
                    } catch (Exception e9) {
                        e = e9;
                        application2 = application;
                    }
                }
                return dm3Var7;
            case vr.i /* 12 */:
                return r(obj);
            case 13:
                return s(obj);
            case 14:
                y50 y50Var10 = y50.f;
                int i16 = this.k;
                if (i16 == 0) {
                    y02.Q(obj);
                    x50 x50Var2 = (x50) this.l;
                    kb2 kb2Var = (kb2) this.m;
                    he0 he0Var = new he0(x50Var2, (hf3) this.n, (zb) this.o, (xc2) this.p, (p40) null, 2);
                    this.k = 1;
                    if (vp.t(kb2Var, he0Var, this) == y50Var10) {
                        return y50Var10;
                    }
                } else {
                    if (i16 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case jo3.g /* 15 */:
                return u(obj);
            default:
                y50 y50Var11 = y50.f;
                int i17 = this.k;
                if (i17 == 0) {
                    y02.Q(obj);
                    ((File) this.l).mkdirs();
                    new File((File) this.l, ((File) this.m).getName() + ".tmp").delete();
                    ((File) this.m).delete();
                    i93 i93Var3 = ((go3) this.n).k;
                    ln3 ln3Var = new ln3(new cd0(0L, ((qn3) this.o).e, 0L));
                    i93Var3.getClass();
                    i93Var3.j(null, ln3Var);
                    ((go3) this.n).o = Build.VERSION.SDK_INT < 33 || n92.h((Application) this.p, "android.permission.POST_NOTIFICATIONS") == 0;
                    if (((go3) this.n).o) {
                        try {
                            boolean z = UpdateForegroundService.f;
                            Application application6 = (Application) this.p;
                            application6.getClass();
                            UpdateForegroundService.f = false;
                            Intent intent = new Intent(application6, (Class<?>) UpdateForegroundService.class);
                            intent.setAction("top.th1nk.samp.update.START");
                            application6.startForegroundService(intent);
                        } catch (Exception e10) {
                            ((go3) this.n).o = false;
                            ti tiVar3 = ui.a;
                            ui.c(ti.i, "UpdateViewModel", "Unable to start update notification service", e10);
                        }
                    }
                    j90 j90Var9 = ac0.a;
                    x80 x80Var8 = x80.h;
                    f50 f50Var = new f50((go3) this.n, (qn3) this.o, (File) this.m, (Application) this.p, null, 5);
                    this.k = 1;
                    if (cl3.G(x80Var8, f50Var, this) == y50Var11) {
                        return y50Var11;
                    }
                    break;
                } else {
                    if (i17 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                if (((go3) this.n).k.getValue() instanceof on3) {
                    ((go3) this.n).h();
                }
                return dm3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(it2 it2Var, Object obj, gk3 gk3Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 12;
        this.o = it2Var;
        this.l = obj;
        this.p = gk3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9(Object obj, Object obj2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9(Object obj, Object obj2, Object obj3, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9(Object obj, Object obj2, Object obj3, Object obj4, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
        this.p = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(cs0 cs0Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 13;
        this.p = cs0Var;
    }
}
