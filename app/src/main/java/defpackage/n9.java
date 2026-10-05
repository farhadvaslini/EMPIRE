package defpackage;

import android.app.Application;
import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ScrollCaptureSession;
import android.view.textclassifier.TextClassifier;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import org.json.JSONArray;
import org.json.JSONObject;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class n9 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(String str, int i, String str2, String str3, p40 p40Var) {
        super(2, p40Var);
        this.j = 12;
        this.m = str;
        this.k = i;
        this.n = str2;
        this.o = str3;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) throws Throwable {
        int i = this.j;
        y50 y50Var = y50.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                ((n9) m((p40) obj2, (ma) obj)).o(dm3Var);
                return y50Var;
            case 1:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return ((n9) m((p40) obj2, (c6) obj)).o(dm3Var);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ((n9) m((p40) obj2, (m33) obj)).o(dm3Var);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
                return y50Var;
            case 8:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.g /* 9 */:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.h /* 10 */:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 11:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.i /* 12 */:
                return ((n9) m((p40) obj2, (es1) obj)).o(dm3Var);
            case 13:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 14:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case jo3.g /* 15 */:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 16:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 17:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 18:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((n9) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                n9 n9Var = new n9((ns0) this.m, (o9) this.n, (te1) obj2, p40Var, 0);
                n9Var.l = obj;
                return n9Var;
            case 1:
                return new n9(this.l, (ed) this.m, (os1) this.n, (os1) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new n9((r10) this.l, (ScrollCaptureSession) this.m, (Rect) this.n, (Consumer) obj2, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                n9 n9Var2 = new n9((re0) this.m, (df0) this.n, (t02) obj2, p40Var, 3);
                n9Var2.l = obj;
                return n9Var2;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                n9 n9Var3 = new n9((df0) this.m, (ae0) this.n, (t02) obj2, p40Var, 4);
                n9Var3.l = obj;
                return n9Var3;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                n9 n9Var4 = new n9((fn0) this.m, (i93) this.n, this.o, p40Var, 5);
                n9Var4.l = obj;
                return n9Var4;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new n9((c93) this.m, (fn0) this.n, (i93) obj2, this.l, p40Var);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                n9 n9Var5 = new n9((os1) this.n, (f21) obj2, p40Var, 7);
                n9Var5.l = obj;
                return n9Var5;
            case 8:
                return new n9((ie1) this.l, (a42) this.m, (os1) this.n, (os1) obj2, p40Var, 8);
            case vr.g /* 9 */:
                n9 n9Var6 = new n9((it2) this.m, (qt1) this.n, (gk3) obj2, p40Var, 9);
                n9Var6.l = obj;
                return n9Var6;
            case vr.h /* 10 */:
                return new n9((c72) this.n, (rs0) obj2, p40Var, 10);
            case 11:
                n9 n9Var7 = new n9((oa2) this.n, (Uri) obj2, p40Var, 11);
                n9Var7.l = obj;
                return n9Var7;
            case vr.i /* 12 */:
                n9 n9Var8 = new n9((String) this.m, this.k, (String) this.n, (String) obj2, p40Var);
                n9Var8.l = obj;
                return n9Var8;
            case 13:
                return new n9((dt1) this.n, (l) obj2, p40Var, 13);
            case 14:
                n9 n9Var9 = new n9((gf1) this.m, (ff1) this.n, (l) obj2, p40Var, 14);
                n9Var9.l = obj;
                return n9Var9;
            case jo3.g /* 15 */:
                n9 n9Var10 = new n9((ns0) this.m, (AtomicReference) this.n, (rs0) obj2, p40Var, 15);
                n9Var10.l = obj;
                return n9Var10;
            case 16:
                return new n9((lf2) this.l, (String) this.m, (cf2) this.n, (os1) obj2, p40Var, 16);
            case 17:
                n9 n9Var11 = new n9((kb2) this.n, (ss0) obj2, (ns0) this.m, p40Var);
                n9Var11.l = obj;
                return n9Var11;
            case 18:
                n9 n9Var12 = new n9((tj3) obj2, p40Var);
                n9Var12.l = obj;
                return n9Var12;
            default:
                return new n9((qk2) this.l, (ek2) this.m, (of1) this.n, (eu3) obj2, p40Var, 19);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x027f, code lost:
    
        if (defpackage.ur.w(r2, r23) == r9) goto L138;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:467:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v64, types: [dt1] */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:308:0x05e7 -> B:312:0x0606). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:310:0x0603 -> B:312:0x0606). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00f0 -> B:42:0x00ba). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        Object objA;
        x50 x50Var;
        nk2 nk2Var;
        x50 x50Var2;
        nk2 nk2Var2;
        Object objA2;
        c72 c72Var;
        bt1 bt1Var;
        Object objQ;
        ?? r5;
        Object objQ2;
        i93 i93Var;
        ContentResolver contentResolver;
        String string;
        InputStream inputStreamOpenInputStream;
        Object objG;
        InputStream inputStream;
        Object qn2Var;
        Throwable th;
        Throwable thA;
        bt1 bt1Var2;
        l lVar;
        kz2 kz2Var;
        kz2 kz2Var2;
        Object objF;
        ?? r3;
        x50 x50Var3;
        tj3 tj3Var;
        Object objG2;
        x50 x50Var4;
        ws2 ws2Var;
        int i = this.j;
        ?? r1 = 1065353216;
        ?? r2 = 10;
        char c = '\n';
        char c2 = '\n';
        ?? r52 = 0;
        int i2 = 0;
        int i3 = 2;
        Object obj2 = dm3.a;
        y50 y50Var = y50.f;
        Object obj3 = this.o;
        w83 w83Var = null;
        switch (i) {
            case 0:
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    m9 m9Var = new m9((ma) this.l, (ns0) this.m, (o9) this.n, (te1) obj3, (p40) null, 0);
                    this.k = 1;
                    if (ur.w(m9Var, this) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i4 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                c.d();
                return null;
            case 1:
                ed edVar = (ed) this.m;
                int i5 = this.k;
                if (i5 == 0) {
                    y02.Q(obj);
                    if (s51.n(this.l, edVar.e.getValue())) {
                        return obj2;
                    }
                    ed edVar2 = (ed) this.m;
                    Object obj4 = this.l;
                    os1 os1Var = (os1) this.n;
                    s83 s83Var = gd.a;
                    oe oeVar = (oe) os1Var.getValue();
                    this.k = 1;
                    if (ed.c(edVar2, obj4, oeVar, null, this, 12) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i5 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                s83 s83Var2 = gd.a;
                ns0 ns0Var = (ns0) ((os1) obj3).getValue();
                if (ns0Var == null) {
                    return obj2;
                }
                ns0Var.h(edVar.d());
                return obj2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                int i6 = this.k;
                if (i6 == 0) {
                    y02.Q(obj);
                    r10 r10Var = (r10) this.l;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.m;
                    Rect rect = (Rect) this.n;
                    m41 m41Var = new m41(rect.left, rect.top, rect.right, rect.bottom);
                    this.k = 1;
                    objA = r10.a(r10Var, scrollCaptureSession, m41Var, this);
                    if (objA == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i6 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    objA = obj;
                }
                ((Consumer) obj3).accept(w22.F((m41) objA));
                return obj2;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y02.Q(obj);
                        return obj2;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                c6 c6Var = (c6) this.l;
                re0 re0Var = (re0) this.m;
                v1 v1Var = new v1(c6Var, (df0) this.n, (t02) obj3, c);
                this.k = 1;
                return re0Var.f(v1Var, this) == y50Var ? y50Var : obj2;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y02.Q(obj);
                        return obj2;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                x50 x50Var5 = (x50) this.l;
                df0 df0Var = (df0) this.m;
                ss0 ss0Var = df0Var.R;
                long jF = lp3.f(df0Var.S ? -1.0f : 1.0f, ((ae0) this.n).a);
                t02 t02Var = (t02) obj3;
                af0 af0Var = bf0.a;
                Float f = new Float(t02Var == t02.f ? lp3.c(jF) : lp3.b(jF));
                this.k = 1;
                return ss0Var.e(x50Var5, f, this) == y50Var ? y50Var : obj2;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                i93 i93Var2 = (i93) this.n;
                m33 m33Var = (m33) this.l;
                int i9 = this.k;
                if (i9 == 0) {
                    y02.Q(obj);
                    int iOrdinal = m33Var.ordinal();
                    if (iOrdinal == 0) {
                        fn0 fn0Var = (fn0) this.m;
                        this.l = null;
                        this.k = 1;
                        return fn0Var.a(i93Var2, this) == y50Var ? y50Var : obj2;
                    }
                    if (iOrdinal == 1) {
                        return obj2;
                    }
                    if (iOrdinal == 2) {
                        if (obj3 == r51.H1) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        i93Var2.i(obj3);
                        return obj2;
                    }
                    c.k();
                } else {
                    if (i9 == 1) {
                        y02.Q(obj);
                        return obj2;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                fn0 fn0Var2 = (fn0) this.n;
                i93 i93Var3 = (i93) obj3;
                int i10 = this.k;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            y02.Q(obj);
                        } else if (i10 != 3 && i10 != 4) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    y02.Q(obj);
                    return obj2;
                }
                y02.Q(obj);
                c93 c93Var = (c93) this.m;
                if (c93Var == n33.a) {
                    this.k = 1;
                    if (fn0Var2.a(i93Var3, this) != y50Var) {
                        return obj2;
                    }
                } else {
                    p40 p40Var = null;
                    if (c93Var == n33.b) {
                        va3 va3VarG = i93Var3.g();
                        eo0 eo0Var = new eo0(2, null);
                        this.k = 2;
                        if (lr.F(va3VarG, eo0Var, this) != y50Var) {
                        }
                    } else {
                        va3 va3VarG2 = i93Var3.g();
                        b93 b93Var = new b93(c93Var, null);
                        int i11 = ao0.a;
                        fn0 fn0VarY = lr.y(lr.y(new un0(new ss(b93Var, va3VarG2, li0.f, -2, jp.f), new l70(i3, p40Var, i3), r52)));
                        n9 n9Var = new n9(fn0Var2, i93Var3, this.l, p40Var, 5);
                        this.k = 4;
                        if (lr.s(fn0VarY, n9Var, this) != y50Var) {
                            return obj2;
                        }
                    }
                }
                return y50Var;
                this.k = 3;
                if (fn0Var2.a(i93Var3, this) != y50Var) {
                    return obj2;
                }
                return y50Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                int i12 = this.k;
                if (i12 == 0) {
                    y02.Q(obj);
                    x50 x50Var6 = (x50) this.l;
                    nk2 nk2Var3 = new nk2();
                    nk2Var3.f = 1.0f;
                    x50Var = x50Var6;
                    nk2Var = nk2Var3;
                    bd bdVar = new bd((os1) this.n, (f21) obj3, nk2Var, x50Var, 3);
                    nk2 nk2Var4 = nk2Var;
                    x50 x50Var7 = x50Var;
                    this.l = x50Var7;
                    this.m = nk2Var4;
                    this.k = 1;
                    if (i().m(f5.a0) != null) {
                    }
                } else if (i12 == 1) {
                    nk2Var2 = (nk2) this.m;
                    x50Var2 = (x50) this.l;
                    y02.Q(obj);
                    if (nk2Var2.f == 0.0f) {
                    }
                    nk2Var = nk2Var2;
                    x50Var = x50Var2;
                    bd bdVar2 = new bd((os1) this.n, (f21) obj3, nk2Var, x50Var, 3);
                    nk2 nk2Var42 = nk2Var;
                    x50 x50Var72 = x50Var;
                    this.l = x50Var72;
                    this.m = nk2Var42;
                    this.k = 1;
                    if (i().m(f5.a0) != null) {
                    }
                } else {
                    if (i12 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nk2Var2 = (nk2) this.m;
                    x50Var2 = (x50) this.l;
                    y02.Q(obj);
                    nk2Var = nk2Var2;
                    x50Var = x50Var2;
                    bd bdVar22 = new bd((os1) this.n, (f21) obj3, nk2Var, x50Var, 3);
                    nk2 nk2Var422 = nk2Var;
                    x50 x50Var722 = x50Var;
                    this.l = x50Var722;
                    this.m = nk2Var422;
                    this.k = 1;
                    if (i().m(f5.a0) != null) {
                        qn1.b();
                        return null;
                    }
                    if (lq.I(i()).a(bdVar22, this) == y50Var) {
                        return y50Var;
                    }
                    x50Var2 = x50Var722;
                    nk2Var2 = nk2Var422;
                    if (nk2Var2.f == 0.0f) {
                        p70 p70VarB = b32.B(new ja(17, x50Var2));
                        e21 e21Var = new e21(2, null);
                        this.l = x50Var2;
                        this.m = nk2Var2;
                        this.k = 2;
                        if (lr.F(p70VarB, e21Var, this) == y50Var) {
                            return y50Var;
                        }
                    }
                    nk2Var = nk2Var2;
                    x50Var = x50Var2;
                    bd bdVar222 = new bd((os1) this.n, (f21) obj3, nk2Var, x50Var, 3);
                    nk2 nk2Var4222 = nk2Var;
                    x50 x50Var7222 = x50Var;
                    this.l = x50Var7222;
                    this.m = nk2Var4222;
                    this.k = 1;
                    if (i().m(f5.a0) != null) {
                    }
                }
                break;
            case 8:
                os1 os1Var2 = (os1) this.n;
                int i13 = this.k;
                if (i13 == 0) {
                    y02.Q(obj);
                    if (((a42) this.m).g() < 0) {
                        return obj2;
                    }
                    if (!((List) os1Var2.getValue()).isEmpty()) {
                        ie1 ie1Var = (ie1) this.l;
                        int iC = vr.C((List) os1Var2.getValue());
                        this.k = 1;
                        ar2 ar2Var = ie1.x;
                        ie1Var.getClass();
                        Object objD = ie1Var.d(ts1.f, new wd1(ie1Var, iC, 0, (p40) null), this);
                        if (objD != y50Var) {
                            objD = obj2;
                        }
                        if (objD == y50Var) {
                            return y50Var;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                ((os1) obj3).setValue(Boolean.TRUE);
                return obj2;
            case vr.g /* 9 */:
                qt1 qt1Var = (qt1) this.n;
                it2 it2Var = (it2) this.m;
                int i14 = this.k;
                if (i14 != 0) {
                    if (i14 == 1 || i14 == 2) {
                        y02.Q(obj);
                        return obj2;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                x50 x50Var8 = (x50) this.l;
                d42 d42Var = it2Var.c;
                z32 z32Var = it2Var.i;
                p40 p40Var2 = null;
                if (s51.n(d42Var.getValue(), qt1Var)) {
                    long jLongValue = ((Number) ((gk3) obj3).m.getValue()).longValue() / 1000000;
                    float fG = z32Var.g();
                    zk3 zk3VarI = n92.I((int) (z32Var.g() * jLongValue), 6, null);
                    w1 w1Var = new w1(x50Var8, it2Var, qt1Var, 9);
                    this.k = 2;
                    if (t22.m(fG, 0.0f, zk3VarI, w1Var, this, 4) != y50Var) {
                        return obj2;
                    }
                } else {
                    this.k = 1;
                    gk3 gk3Var = it2Var.e;
                    if (gk3Var == null || (objA2 = at1.a(it2Var.l, new ct2(it2Var, qt1Var, gk3Var, p40Var2, 0), this)) != y50Var) {
                        objA2 = obj2;
                    }
                    if (objA2 != y50Var) {
                        return obj2;
                    }
                }
                return y50Var;
            case vr.h /* 10 */:
                int i15 = this.k;
                lg0 lg0Var = lg0.MILLISECONDS;
                try {
                    if (i15 == 0) {
                        y02.Q(obj);
                        c72Var = (c72) this.n;
                        dt1 dt1Var = c72Var.e;
                        this.l = dt1Var;
                        this.m = c72Var;
                        this.k = 1;
                        Object objF2 = dt1Var.f(this);
                        bt1Var = dt1Var;
                        if (objF2 != y50Var) {
                        }
                        return y50Var;
                    }
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 == 3) {
                                y02.Q(obj);
                                return obj;
                            }
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bt1 bt1Var3 = (bt1) this.l;
                        y02.Q(obj);
                        objQ = obj;
                        r52 = bt1Var3;
                        textClassifier = (TextClassifier) objQ;
                        r5 = r52;
                        ((dt1) r5).i(null);
                        zj zjVar = ig0.f;
                        long jU = vp.U(200L, lg0Var);
                        hd1 hd1Var = new hd1(textClassifier, (rs0) obj3, w83Var, c2);
                        this.l = null;
                        this.m = null;
                        this.k = 3;
                        objQ2 = t22.Q(jU, hd1Var, this);
                        if (objQ2 != y50Var) {
                            return objQ2;
                        }
                        return y50Var;
                    }
                    c72Var = (c72) this.m;
                    bt1 bt1Var4 = (bt1) this.l;
                    y02.Q(obj);
                    bt1Var = bt1Var4;
                    TextClassifier textClassifier = c72Var.f;
                    if (textClassifier != null) {
                        r5 = bt1Var;
                        if (!textClassifier.isDestroyed()) {
                            ((dt1) r5).i(null);
                            zj zjVar2 = ig0.f;
                            long jU2 = vp.U(200L, lg0Var);
                            hd1 hd1Var2 = new hd1(textClassifier, (rs0) obj3, w83Var, c2);
                            this.l = null;
                            this.m = null;
                            this.k = 3;
                            objQ2 = t22.Q(jU2, hd1Var2, this);
                            if (objQ2 != y50Var) {
                            }
                        }
                        return y50Var;
                    }
                    zj zjVar3 = ig0.f;
                    long jU3 = vp.U(300L, lg0Var);
                    hm hmVar = new hm(c72Var, w83Var, 7);
                    this.l = bt1Var;
                    this.m = null;
                    this.k = 2;
                    objQ = t22.Q(jU3, hmVar, this);
                    r52 = bt1Var;
                    if (objQ == y50Var) {
                        return y50Var;
                    }
                    textClassifier = (TextClassifier) objQ;
                    r5 = r52;
                    ((dt1) r5).i(null);
                    zj zjVar22 = ig0.f;
                    long jU22 = vp.U(200L, lg0Var);
                    hd1 hd1Var22 = new hd1(textClassifier, (rs0) obj3, w83Var, c2);
                    this.l = null;
                    this.m = null;
                    this.k = 3;
                    objQ2 = t22.Q(jU22, hd1Var22, this);
                    if (objQ2 != y50Var) {
                    }
                    return y50Var;
                } finally {
                }
            case 11:
                oa2 oa2Var = (oa2) this.n;
                Application application = oa2Var.b;
                int i16 = this.k;
                g82 g82Var = g82.g;
                if (i16 == 0) {
                    y02.Q(obj);
                    Uri uri = (Uri) obj3;
                    try {
                        i93Var = oa2Var.o;
                        application.getClass();
                        contentResolver = application.getContentResolver();
                        Cursor cursorQuery = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                                string = (columnIndex >= 0 && cursorQuery.moveToFirst()) ? cursorQuery.getString(columnIndex) : null;
                                cursorQuery.close();
                            } finally {
                            }
                        } else {
                            string = null;
                        }
                        break;
                    } catch (Throwable th2) {
                        qn2Var = new qn2(th2);
                    }
                    if (string != null && fa3.Y(string, ".splug", true)) {
                        inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                        if (inputStreamOpenInputStream != null) {
                            try {
                                i92 i92Var = new i92(f92.h);
                                i93Var.getClass();
                                i93Var.j(null, i92Var);
                                y92 y92Var = oa2Var.c;
                                this.l = null;
                                this.m = inputStreamOpenInputStream;
                                this.k = 1;
                                h01 h01Var = y92.i;
                                y92Var.getClass();
                                j90 j90Var = ac0.a;
                                objG = cl3.G(x80.h, new v92(y92Var, inputStreamOpenInputStream, string, null, null, null, null, null), this);
                                if (objG == y50Var) {
                                    return y50Var;
                                }
                                inputStream = inputStreamOpenInputStream;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                throw th;
                            }
                        }
                        qn2Var = new h82(g82Var);
                        thA = rn2.a(qn2Var);
                        Object h82Var = qn2Var;
                        if (thA != null) {
                            if (thA instanceof CancellationException) {
                                throw thA;
                            }
                            h82Var = new h82(g82Var);
                        }
                        oa2.e(oa2Var, (j82) h82Var);
                        return obj2;
                    }
                    application.getClass();
                    String string2 = application.getString(R.string.plugins_error_package_extension);
                    string2.getClass();
                    g92 g92Var = new g92(string2);
                    i93Var.getClass();
                    i93Var.j(null, g92Var);
                    return obj2;
                }
                if (i16 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                inputStream = (InputStream) this.m;
                try {
                    y02.Q(obj);
                    objG = obj;
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamOpenInputStream = inputStream;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        uq.l(inputStreamOpenInputStream, th);
                        throw th5;
                    }
                }
                j82 j82Var = (j82) objG;
                uq.l(inputStream, null);
                qn2Var = j82Var;
                if (j82Var == null) {
                    qn2Var = new h82(g82Var);
                }
                thA = rn2.a(qn2Var);
                Object h82Var2 = qn2Var;
                if (thA != null) {
                }
                oa2.e(oa2Var, (j82) h82Var2);
                return obj2;
            case vr.i /* 12 */:
                int i17 = this.k;
                String str = (String) this.m;
                es1 es1Var = (es1) this.l;
                y02.Q(obj);
                ec2 ec2Var = lf2.b;
                String str2 = (String) es1Var.c(ec2Var);
                if (str2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
                        if (jSONArrayOptJSONArray != null) {
                            int length = jSONArrayOptJSONArray.length();
                            while (true) {
                                if (i2 < length) {
                                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                                    if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.optInt("id") != i17) {
                                        i2++;
                                    } else {
                                        JSONObject jSONObject2 = new JSONObject();
                                        String str3 = (String) this.n;
                                        jSONObject2.put("id", i17);
                                        jSONObject2.put("label", str3);
                                        jSONObject2.put("text", (String) obj3);
                                        jSONArrayOptJSONArray.put(i2, jSONObject2);
                                        jSONObject.put(str, jSONArrayOptJSONArray);
                                        es1Var.d(ec2Var, jSONObject.toString());
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                return obj2;
            case 13:
                int i18 = this.k;
                try {
                    if (i18 == 0) {
                        y02.Q(obj);
                        dt1 dt1Var2 = (dt1) this.n;
                        l lVar2 = (l) obj3;
                        this.l = dt1Var2;
                        this.m = lVar2;
                        this.k = 1;
                        if (dt1Var2.f(this) != y50Var) {
                            bt1Var2 = dt1Var2;
                            lVar = lVar2;
                        }
                        return y50Var;
                    }
                    if (i18 != 1) {
                        if (i18 != 2) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bt1Var2 = (bt1) this.l;
                        y02.Q(obj);
                        return obj2;
                    }
                    lVar = (l) this.m;
                    bt1Var2 = (bt1) this.l;
                    y02.Q(obj);
                    cc2 cc2Var = new cc2(lVar, w83Var, i3);
                    this.l = bt1Var2;
                    this.m = null;
                    this.k = 2;
                } finally {
                }
                break;
            case 14:
                int i19 = this.k;
                if (i19 != 0) {
                    if (i19 == 1) {
                        y02.Q(obj);
                        return obj2;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                x50 x50Var9 = (x50) this.l;
                j90 j90Var2 = ac0.a;
                jx0 jx0Var = tl1.a.k;
                fd fdVar = new fd((gf1) this.m, (ff1) this.n, x50Var9, (l) obj3, null, 3);
                this.k = 1;
                return cl3.G(jx0Var, fdVar, this) == y50Var ? y50Var : obj2;
            case jo3.g /* 15 */:
                AtomicReference atomicReference = (AtomicReference) this.n;
                int i20 = this.k;
                try {
                    if (i20 == 0) {
                        y02.Q(obj);
                        x50 x50Var10 = (x50) this.l;
                        kz2 kz2Var3 = new kz2(lq.G(x50Var10.h()), ((ns0) this.m).h(x50Var10));
                        kz2 kz2Var4 = (kz2) atomicReference.getAndSet(kz2Var3);
                        kz2Var2 = kz2Var3;
                        if (kz2Var4 != null) {
                            j61 j61Var = kz2Var4.a;
                            this.l = kz2Var3;
                            this.k = 1;
                            j61Var.c(null);
                            Object objX = j61Var.x(this);
                            if (objX == y50Var) {
                                obj2 = objX;
                            }
                            if (obj2 == y50Var) {
                                return y50Var;
                            }
                            kz2Var = kz2Var3;
                        }
                        Object obj5 = kz2Var2.b;
                        this.l = kz2Var2;
                        this.k = 2;
                        objF = ((rs0) obj3).f(obj5, this);
                        r2 = kz2Var2;
                        if (objF == y50Var) {
                            return y50Var;
                        }
                        r3 = r2;
                        while (!atomicReference.compareAndSet(r3, null)) {
                        }
                        return objF;
                    }
                    if (i20 != 1) {
                        if (i20 != 2) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kz2 kz2Var5 = (kz2) this.l;
                        y02.Q(obj);
                        objF = obj;
                        r2 = kz2Var5;
                        r3 = r2;
                        while (!atomicReference.compareAndSet(r3, null) && atomicReference.get() == r3) {
                        }
                        return objF;
                    }
                    kz2 kz2Var6 = (kz2) this.l;
                    y02.Q(obj);
                    kz2Var = kz2Var6;
                    kz2Var2 = kz2Var;
                    Object obj52 = kz2Var2.b;
                    this.l = kz2Var2;
                    this.k = 2;
                    objF = ((rs0) obj3).f(obj52, this);
                    r2 = kz2Var2;
                    if (objF == y50Var) {
                    }
                    r3 = r2;
                    while (!atomicReference.compareAndSet(r3, null)) {
                    }
                    return objF;
                } catch (Throwable th6) {
                    while (!atomicReference.compareAndSet(r2, null) && atomicReference.get() == r2) {
                    }
                    throw th6;
                }
            case 16:
                int i21 = this.k;
                if (i21 == 0) {
                    y02.Q(obj);
                    lf2 lf2Var = (lf2) this.l;
                    String str4 = (String) this.m;
                    int i22 = ((cf2) this.n).a;
                    this.k = 1;
                    if (lf2Var.b(str4, i22, this) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i21 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                List list = p03.a;
                ((os1) obj3).setValue(null);
                return obj2;
            case 17:
                kb2 kb2Var = (kb2) this.n;
                int i23 = this.k;
                if (i23 == 0) {
                    y02.Q(obj);
                    xc3 xc3Var = new xc3((x50) this.l, new xc2(kb2Var), (ss0) obj3, (ns0) this.m, null);
                    this.k = 1;
                    return vp.t(kb2Var, xc3Var, this) == y50Var ? y50Var : obj2;
                }
                if (i23 == 1) {
                    y02.Q(obj);
                    return obj2;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                tj3 tj3Var2 = (tj3) obj3;
                int i24 = this.k;
                try {
                    if (i24 == 0) {
                        y02.Q(obj);
                        x50Var3 = (x50) this.l;
                    } else {
                        if (i24 == 1) {
                            ws2Var = (ws2) this.n;
                            tj3 tj3Var3 = (tj3) this.m;
                            x50 x50Var11 = (x50) this.l;
                            y02.Q(obj);
                            tj3Var = tj3Var3;
                            x50Var4 = x50Var11;
                            objG2 = obj;
                            this.l = x50Var4;
                            this.m = null;
                            this.n = null;
                            this.k = 2;
                            if (tj3.c(tj3Var, ws2Var, (rj3) objG2, this) != y50Var) {
                                x50Var3 = x50Var4;
                            }
                            return y50Var;
                        }
                        if (i24 != 2) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        x50Var3 = (x50) this.l;
                        y02.Q(obj);
                    }
                    if (!lq.L(x50Var3.h())) {
                        return obj2;
                    }
                    ws2 ws2Var2 = tj3Var2.a;
                    np npVar = tj3Var2.f;
                    this.l = x50Var3;
                    this.m = tj3Var2;
                    this.n = ws2Var2;
                    this.k = 1;
                    npVar.getClass();
                    objG2 = np.G(npVar, this);
                    if (objG2 == y50Var) {
                        return y50Var;
                    }
                    x50Var4 = x50Var3;
                    ws2Var = ws2Var2;
                    tj3Var = tj3Var2;
                    this.l = x50Var4;
                    this.m = null;
                    this.n = null;
                    this.k = 2;
                    if (tj3.c(tj3Var, ws2Var, (rj3) objG2, this) != y50Var) {
                    }
                    return y50Var;
                } finally {
                    tj3Var2.g = null;
                }
            default:
                eu3 eu3Var = (eu3) obj3;
                of1 of1Var = (of1) this.n;
                ek2 ek2Var = (ek2) this.m;
                int i25 = this.k;
                try {
                    if (i25 == 0) {
                        y02.Q(obj);
                        jq1 jq1Var = (jq1) ((qk2) this.l).f;
                        if (jq1Var != null) {
                            jq1Var.g = ur.c(ek2Var.x);
                        }
                        this.k = 1;
                        dk2 dk2Var = new dk2(ek2Var, null);
                        o50 o50Var = this.g;
                        o50Var.getClass();
                        Object objG3 = cl3.G(ek2Var.a, new m9(ek2Var, dk2Var, lq.I(o50Var), null, 10), this);
                        if (objG3 != y50Var) {
                            objG3 = obj2;
                        }
                        if (objG3 != y50Var) {
                            objG3 = obj2;
                        }
                        if (objG3 == y50Var) {
                            return y50Var;
                        }
                    } else {
                        if (i25 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    return obj2;
                } finally {
                    of1Var.getLifecycle().b(eu3Var);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(c93 c93Var, fn0 fn0Var, i93 i93Var, Object obj, p40 p40Var) {
        super(2, p40Var);
        this.j = 6;
        this.m = c93Var;
        this.n = fn0Var;
        this.o = i93Var;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(tj3 tj3Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 18;
        this.o = tj3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n9(Object obj, Object obj2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n9(Object obj, Object obj2, Object obj3, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n9(Object obj, Object obj2, Object obj3, Object obj4, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(kb2 kb2Var, ss0 ss0Var, ns0 ns0Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 17;
        this.n = kb2Var;
        this.o = ss0Var;
        this.m = ns0Var;
    }
}
