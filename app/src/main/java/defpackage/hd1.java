package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.textclassifier.TextClassifier;
import java.io.File;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import top.th1nk.samp.R;
import top.th1nk.samp.feature.download.DownloadForegroundService;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hd1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd1(Object obj, Object obj2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) throws Throwable {
        int i = this.j;
        y50 y50Var = y50.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 1:
                ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
                return y50Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
                return y50Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 8:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.g /* 9 */:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.h /* 10 */:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 11:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.i /* 12 */:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 13:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 14:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case jo3.g /* 15 */:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 16:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 17:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 18:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 19:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 20:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 21:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 22:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 23:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 24:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 25:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 26:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 27:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 28:
                return ((hd1) m((p40) obj2, obj)).o(dm3Var);
            default:
                return ((hd1) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new hd1((kb2) this.l, (i32) obj2, p40Var, 0);
            case 1:
                return new hd1((te1) this.l, (n9) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new hd1((ed) this.l, (gy1) obj2, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new hd1((os1) this.l, (z60) obj2, p40Var, 3);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new hd1((z32) this.l, (z60) obj2, p40Var, 4);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new hd1((ie1) this.l, (os1) obj2, p40Var, 5);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new hd1((g93) this.l, (jq1) obj2, p40Var, 6);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                hd1 hd1Var = new hd1((wq1) obj2, p40Var, 7);
                hd1Var.l = obj;
                return hd1Var;
            case 8:
                return new hd1((nx1) this.l, (rs0) obj2, p40Var, 8);
            case vr.g /* 9 */:
                hd1 hd1Var2 = new hd1((js) obj2, p40Var, 9);
                hd1Var2.l = obj;
                return hd1Var2;
            case vr.h /* 10 */:
                return new hd1((TextClassifier) this.l, (rs0) obj2, p40Var, 10);
            case 11:
                return new hd1((qy2) this.l, (Application) obj2, p40Var, 11);
            case vr.i /* 12 */:
                return new hd1((vg2) this.l, (String) obj2, p40Var, 12);
            case 13:
                return new hd1((vi2) this.l, (vg2) obj2, p40Var, 13);
            case 14:
                return new hd1((lf2) this.l, (vi2) obj2, p40Var, 14);
            case jo3.g /* 15 */:
                return new hd1((sm2) this.l, (String) obj2, p40Var, 15);
            case 16:
                return new hd1((sm2) this.l, (bm2) obj2, p40Var, 16);
            case 17:
                return new hd1((sm2) this.l, (File) obj2, p40Var, 17);
            case 18:
                hd1 hd1Var3 = new hd1((cb) obj2, p40Var, 18);
                hd1Var3.l = obj;
                return hd1Var3;
            case 19:
                return new hd1((ae0) this.l, (ps2) obj2, p40Var, 19);
            case 20:
                return new hd1((t41) this.l, (a42) obj2, p40Var, 20);
            case 21:
                return new hd1((m23) this.l, (s83) obj2, p40Var, 21);
            case 22:
                return new hd1((pl) obj2, p40Var, 22);
            case 23:
                return new hd1((qr1) this.l, (l73) obj2, p40Var, 23);
            case 24:
                return new hd1((h53) this.l, (n9) obj2, p40Var, 24);
            case 25:
                return new hd1((z53) this.l, (h1) obj2, p40Var, 25);
            case 26:
                return new hd1((ot) this.l, (oe) obj2, p40Var, 26);
            case 27:
                return new hd1((j61) this.l, (xc2) obj2, p40Var, 27);
            case 28:
                hd1 hd1Var4 = new hd1((gn0) obj2, p40Var, 28);
                hd1Var4.l = obj;
                return hd1Var4;
            default:
                return new hd1((ek2) this.l, (View) obj2, p40Var, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x023d, code lost:
    
        if (r2.f(r3, r23) != r1) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        if (r1.t(r23) == r0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0235 A[PHI: r2 r3
      0x0235: PHI (r2v72 j) = (r2v78 j), (r2v85 j) binds: [B:125:0x0232, B:121:0x01f9] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r3v62 java.lang.Object) = (r3v65 java.lang.Object), (r3v66 java.lang.Object) binds: [B:125:0x0232, B:121:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, vi2] */
    /* JADX WARN: Type inference failed for: r0v28, types: [vi2] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    /* JADX WARN: Type inference failed for: r1v36, types: [j61] */
    /* JADX WARN: Type inference failed for: r1v40, types: [j61] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x023d -> B:130:0x0241). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:363:0x06da -> B:355:0x06a2). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        x50 x50Var;
        Object objG;
        float fT;
        float fT2;
        ws2 ws2Var;
        Object objE;
        Object obj2;
        i01 i01VarA;
        Object objG2;
        j jVar;
        long j;
        int i = 4;
        int i2 = 0;
        int i3 = 3;
        int i4 = 2;
        int i5 = 1;
        ?? r12 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        switch (this.j) {
            case 0:
                y50 y50Var = y50.f;
                int i6 = this.k;
                if (i6 == 0) {
                    y02.Q(obj);
                    kb2 kb2Var = (kb2) this.l;
                    om omVar = new om(this.m, (p40) (z ? 1 : 0), i5);
                    this.k = 1;
                    if (vp.t(kb2Var, omVar, this) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i6 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 1:
                y50 y50Var2 = y50.f;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    c.d();
                    return null;
                }
                y02.Q(obj);
                te1 te1Var = (te1) this.l;
                n9 n9Var = (n9) this.m;
                this.k = 1;
                i72.a(te1Var, n9Var, this);
                return y50Var2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y50 y50Var3 = y50.f;
                int i8 = this.k;
                if (i8 == 0) {
                    y02.Q(obj);
                    ed edVar = (ed) this.l;
                    Float f = new Float(Float.intBitsToFloat((int) (((gy1) this.m).a >> 32)) + ((Number) edVar.d()).floatValue());
                    this.k = 1;
                    if (edVar.f(this, f) == y50Var3) {
                        return y50Var3;
                    }
                } else {
                    if (i8 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                y50 y50Var4 = y50.f;
                int i9 = this.k;
                if (i9 == 0) {
                    y02.Q(obj);
                    p70 p70VarB = b32.B(new yb((os1) this.l, 19));
                    rh1 rh1Var = new rh1((z60) this.m, z2 ? 1 : 0, i2);
                    this.k = 1;
                    if (lr.s(p70VarB, rh1Var, this) == y50Var4) {
                        return y50Var4;
                    }
                } else {
                    if (i9 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                y50 y50Var5 = y50.f;
                int i10 = this.k;
                if (i10 == 0) {
                    y02.Q(obj);
                    p70 p70VarB2 = b32.B(new ja(26, (z32) this.l));
                    rh1 rh1Var2 = new rh1((z60) this.m, z3 ? 1 : 0, i5);
                    this.k = 1;
                    if (lr.s(p70VarB2, rh1Var2, this) == y50Var5) {
                        return y50Var5;
                    }
                } else {
                    if (i10 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                dm3 dm3Var = dm3.a;
                os1 os1Var = (os1) this.m;
                y50 y50Var6 = y50.f;
                int i11 = this.k;
                if (i11 == 0) {
                    y02.Q(obj);
                    uc2 uc2Var = (uc2) os1Var.getValue();
                    if (uc2Var != null) {
                        ie1 ie1Var = (ie1) this.l;
                        int i12 = uc2Var.a;
                        int i13 = uc2Var.b;
                        this.k = 1;
                        ie1Var.getClass();
                        Object objD = ie1Var.d(ts1.f, new wd1(ie1Var, i12, i13, (p40) null), this);
                        if (objD != y50Var6) {
                            objD = dm3Var;
                        }
                        if (objD == y50Var6) {
                            return y50Var6;
                        }
                    }
                    return dm3Var;
                }
                if (i11 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                os1Var.setValue(null);
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                y50 y50Var7 = y50.f;
                int i14 = this.k;
                if (i14 == 0) {
                    y02.Q(obj);
                    g93 g93Var = (g93) this.l;
                    k9 k9Var = new k9(i3, (jq1) this.m);
                    this.k = 1;
                    if (g93Var.a(k9Var, this) == y50Var7) {
                        return y50Var7;
                    }
                } else {
                    if (i14 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                c.d();
                return null;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                wq1 wq1Var = (wq1) this.m;
                y50 y50Var8 = y50.f;
                int i15 = this.k;
                try {
                    if (i15 == 0) {
                        y02.Q(obj);
                        x50Var = (x50) this.l;
                    } else {
                        if (i15 == 1) {
                            x50Var = (x50) this.l;
                            y02.Q(obj);
                            objG = obj;
                            x50 x50Var2 = x50Var;
                            fT = wq1Var.c.T(6.0f);
                            fT2 = wq1Var.c.T(1.0f);
                            ws2Var = wq1Var.a;
                            this.l = x50Var2;
                            this.k = 2;
                            if (wq1.c(wq1Var, ws2Var, (sq1) objG, fT, fT2, this) != y50Var8) {
                                x50Var = x50Var2;
                            }
                            return y50Var8;
                        }
                        if (i15 != 2) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        x50Var = (x50) this.l;
                        y02.Q(obj);
                    }
                    if (!lq.L(x50Var.h())) {
                        wq1Var.h = null;
                        return dm3.a;
                    }
                    np npVar = wq1Var.g;
                    this.l = x50Var;
                    this.k = 1;
                    npVar.getClass();
                    objG = np.G(npVar, this);
                    if (objG != y50Var8) {
                        x50 x50Var22 = x50Var;
                        fT = wq1Var.c.T(6.0f);
                        fT2 = wq1Var.c.T(1.0f);
                        ws2Var = wq1Var.a;
                        this.l = x50Var22;
                        this.k = 2;
                        if (wq1.c(wq1Var, ws2Var, (sq1) objG, fT, fT2, this) != y50Var8) {
                        }
                    }
                    return y50Var8;
                } catch (Throwable th) {
                    wq1Var.h = null;
                    throw th;
                }
            case 8:
                y50 y50Var9 = y50.f;
                int i16 = this.k;
                if (i16 == 0) {
                    y02.Q(obj);
                    ws2 ws2Var2 = ((nx1) this.l).a;
                    ts1 ts1Var = ts1.g;
                    rs0 rs0Var = (rs0) this.m;
                    this.k = 1;
                    if (ws2Var2.g(ts1Var, rs0Var, this) == y50Var9) {
                        return y50Var9;
                    }
                } else {
                    if (i16 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case vr.g /* 9 */:
                y50 y50Var10 = y50.f;
                ?? r1 = this.k;
                try {
                    if (r1 == 0) {
                        y02.Q(obj);
                        w83 w83VarT = cl3.t((x50) this.l, null, new ox1(i4, z4 ? 1 : 0), 3);
                        js jsVar = (js) this.m;
                        this.l = w83VarT;
                        this.k = 1;
                        objE = jsVar.e(this);
                        r1 = w83VarT;
                        if (objE == y50Var10) {
                            return y50Var10;
                        }
                    } else {
                        if (r1 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j61 j61Var = (j61) this.l;
                        y02.Q(obj);
                        objE = obj;
                        r1 = j61Var;
                    }
                    r1.c(null);
                    r12 = objE;
                    return r12;
                } catch (Throwable th2) {
                    r1.c(r12);
                    throw th2;
                }
            case vr.h /* 10 */:
                y50 y50Var11 = y50.f;
                int i17 = this.k;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y02.Q(obj);
                        return obj;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                TextClassifier textClassifier = (TextClassifier) this.l;
                if (textClassifier == null) {
                    return null;
                }
                rs0 rs0Var2 = (rs0) this.m;
                this.k = 1;
                Object objF = rs0Var2.f(textClassifier, this);
                return objF == y50Var11 ? y50Var11 : objF;
            case 11:
                y50 y50Var12 = y50.f;
                int i18 = this.k;
                try {
                    if (i18 == 0) {
                        y02.Q(obj);
                        go0 go0Var = new go0(dh2.c, ((qy2) this.l).t, new zg2(3, null));
                        b6 b6Var = new b6(i3, (p40) (z5 ? 1 : 0), i5);
                        int i19 = ao0.a;
                        ss ssVar = new ss(b6Var, go0Var, li0.f, -2, jp.f);
                        k9 k9Var2 = new k9(i, (Application) this.m);
                        this.k = 1;
                        if (ssVar.a(k9Var2, this) == y50Var12) {
                            return y50Var12;
                        }
                    } else {
                        if (i18 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    ti tiVar = ui.a;
                    ui.c(ti.i, "RaksampInstanceManager", "RAKSAMP notification observation stopped", e2);
                }
                return dm3.a;
            case vr.i /* 12 */:
                y50 y50Var13 = y50.f;
                int i20 = this.k;
                if (i20 == 0) {
                    y02.Q(obj);
                    ih2 ih2Var = dh2.e;
                    if (ih2Var != null) {
                        vg2 vg2Var = (vg2) this.l;
                        String str = vg2Var.b;
                        int i21 = vg2Var.c;
                        String str2 = vg2Var.d;
                        xy2 xy2Var = vg2Var.e;
                        String str3 = (String) this.m;
                        this.k = 1;
                        if (ih2Var.c(str, i21, str2, xy2Var, str3, this) == y50Var13) {
                            return y50Var13;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 13:
                y50 y50Var14 = y50.f;
                int i22 = this.k;
                if (i22 == 0) {
                    y02.Q(obj);
                    vi2 vi2Var = (vi2) this.l;
                    vg2 vg2Var2 = (vg2) this.m;
                    String str4 = vg2Var2.b;
                    int i23 = vg2Var2.c;
                    String str5 = vg2Var2.d;
                    xy2 xy2Var2 = vg2Var2.e;
                    String str6 = vg2Var2.f;
                    this.k = 1;
                    if (vi2Var.g(str4, i23, str5, xy2Var2, str6, this) == y50Var14) {
                        return y50Var14;
                    }
                } else {
                    if (i22 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 14:
                ?? r0 = (vi2) this.m;
                y50 y50Var15 = y50.f;
                int i24 = this.k;
                try {
                    if (i24 == 0) {
                        y02.Q(obj);
                        lf2 lf2Var = (lf2) this.l;
                        String str7 = r0.L;
                        str7.getClass();
                        int i25 = 5;
                        qn0 qn0Var = new qn0(lf2Var.a.b(), str7, i25);
                        k9 k9Var3 = new k9(i25, r0);
                        this.k = 1;
                        Object objA = qn0Var.a(k9Var3, this);
                        r0 = objA;
                        if (objA == y50Var15) {
                            return y50Var15;
                        }
                    } else {
                        if (i24 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                        r0 = r0;
                    }
                    break;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception unused) {
                    i93 i93Var = r0.H;
                    ni0 ni0Var = ni0.f;
                    i93Var.getClass();
                    i93Var.j(null, ni0Var);
                }
                return dm3.a;
            case jo3.g /* 15 */:
                y50 y50Var16 = y50.f;
                int i26 = this.k;
                if (i26 == 0) {
                    y02.Q(obj);
                    a31 a31Var = ((sm2) this.l).c;
                    String str8 = (String) this.m;
                    this.k = 1;
                    Object objQ = a31Var.q(str8, this);
                    if (objQ == y50Var16) {
                        return y50Var16;
                    }
                    obj2 = objQ;
                } else {
                    if (i26 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    obj2 = ((rn2) obj).f;
                }
                return new rn2(obj2);
            case 16:
                dm3 dm3Var2 = dm3.a;
                bm2 bm2Var = (bm2) this.m;
                sm2 sm2Var = (sm2) this.l;
                i93 i93Var2 = sm2Var.p;
                y50 y50Var17 = y50.f;
                int i27 = this.k;
                if (i27 == 0) {
                    y02.Q(obj);
                    sm2Var.j = 0L;
                    File fileR = sm2Var.c.r();
                    String str9 = bm2Var.b;
                    try {
                        g01 g01Var = new g01();
                        g01Var.c(null, str9);
                        i01VarA = g01Var.a();
                    } catch (IllegalArgumentException unused2) {
                        i01VarA = null;
                    }
                    String str10 = i01VarA != null ? (String) qx.z0(i01VarA.f) : null;
                    String str11 = str10 != null ? str10 : "";
                    StringBuilder sb = new StringBuilder();
                    int length = str11.length();
                    while (i2 < length) {
                        char cCharAt = str11.charAt(i2);
                        if (Character.isLetterOrDigit(cCharAt) || cCharAt == '.' || cCharAt == '-' || cCharAt == '_') {
                            sb.append(cCharAt);
                        }
                        i2++;
                    }
                    String strF0 = y93.F0(120, sb.toString());
                    if (y93.q0(strF0) || strF0.equals(".") || strF0.equals("..")) {
                        strF0 = null;
                    }
                    if (strF0 == null) {
                        strF0 = "resource.zip";
                    }
                    File file = new File(fileR, strF0);
                    ed0 ed0Var = new ed0(bm2Var, new cd0(0L, bm2Var.c, 0L));
                    i93Var2.getClass();
                    i93Var2.j(null, ed0Var);
                    Application application = sm2Var.b;
                    application.getClass();
                    try {
                        int i28 = DownloadForegroundService.g;
                        String str12 = bm2Var.a;
                        Intent intent = new Intent(application, (Class<?>) DownloadForegroundService.class);
                        intent.setAction("top.th1nk.samp.download.START");
                        intent.putExtra("title", str12);
                        application.startForegroundService(intent);
                        j90 j90Var = ac0.a;
                        x80 x80Var = x80.h;
                        f50 f50Var = new f50(sm2Var, (bm2) this.m, file, application, null, 1);
                        this.k = 1;
                        if (cl3.G(x80Var, f50Var, this) == y50Var17) {
                            return y50Var17;
                        }
                    } catch (Exception e4) {
                        String message = e4.getMessage();
                        if (message == null) {
                            message = application.getString(R.string.download_error_start_service);
                            message.getClass();
                        }
                        fd0 fd0Var = new fd0(message, bm2Var);
                        i93Var2.getClass();
                        i93Var2.j(null, fd0Var);
                    }
                    break;
                } else {
                    if (i27 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3Var2;
            case 17:
                sm2 sm2Var2 = (sm2) this.l;
                y50 y50Var18 = y50.f;
                int i29 = this.k;
                if (i29 == 0) {
                    y02.Q(obj);
                    sm2Var2.k = 0L;
                    File fileR2 = sm2Var2.c.r();
                    i93 i93Var3 = sm2Var2.r;
                    xk0 xk0Var = new xk0(new vk0(0, 0, ""));
                    i93Var3.getClass();
                    i93Var3.j(null, xk0Var);
                    j90 j90Var2 = ac0.a;
                    x80 x80Var2 = x80.h;
                    qm2 qm2Var = new qm2(sm2Var2, (File) this.m, fileR2, null, 1);
                    this.k = 1;
                    if (cl3.G(x80Var2, qm2Var, this) == y50Var18) {
                        return y50Var18;
                    }
                } else {
                    if (i29 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 18:
                cb cbVar = (cb) this.m;
                y50 y50Var19 = y50.f;
                int i30 = this.k;
                if (i30 == 0) {
                    y02.Q(obj);
                    x50 x50Var3 = (x50) this.l;
                    fn0 fn0VarA = cbVar.t.a();
                    yn0 yn0Var = new yn0(11, cbVar, x50Var3);
                    this.k = 1;
                    if (fn0VarA.a(yn0Var, this) == y50Var19) {
                        return y50Var19;
                    }
                } else {
                    if (i30 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 19:
                y50 y50Var20 = y50.f;
                int i31 = this.k;
                if (i31 == 0) {
                    y02.Q(obj);
                    ae0 ae0Var = (ae0) this.l;
                    float f2 = ae0Var.b ? -1.0f : 1.0f;
                    ws2 ws2Var3 = ((ps2) this.m).W;
                    long jF = lp3.f(f2, ae0Var.a);
                    this.k = 1;
                    if (ws2Var3.c(jF, false, this) == y50Var20) {
                        return y50Var20;
                    }
                } else {
                    if (i31 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 20:
                y50 y50Var21 = y50.f;
                int i32 = this.k;
                if (i32 == 0) {
                    y02.Q(obj);
                    fn0 fn0VarA2 = ((t41) this.l).a();
                    k9 k9Var4 = new k9(7, (a42) this.m);
                    this.k = 1;
                    if (fn0VarA2.a(k9Var4, this) == y50Var21) {
                        return y50Var21;
                    }
                } else {
                    if (i32 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 21:
                y50 y50Var22 = y50.f;
                int i33 = this.k;
                if (i33 == 0) {
                    y02.Q(obj);
                    ed edVar2 = ((m23) this.l).f;
                    gy1 gy1Var = new gy1(0L);
                    s83 s83Var = (s83) this.m;
                    this.k = 1;
                    if (ed.c(edVar2, gy1Var, s83Var, null, this, 12) == y50Var22) {
                        return y50Var22;
                    }
                } else {
                    if (i33 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 22:
                pl plVar = (pl) this.m;
                y50 y50Var23 = y50.f;
                int i34 = this.k;
                if (i34 == 0) {
                    y02.Q(obj);
                    if (((AtomicInteger) ((yl1) plVar.j).g).get() <= 0) {
                        c.q("Check failed.");
                        return null;
                    }
                    lq.r(((x50) plVar.g).h());
                    jVar = (j) plVar.h;
                    np npVar2 = (np) plVar.i;
                    this.l = jVar;
                    this.k = 1;
                    npVar2.getClass();
                    objG2 = np.G(npVar2, this);
                    if (objG2 != y50Var23) {
                    }
                    return y50Var23;
                }
                if (i34 != 1) {
                    if (i34 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    if (((AtomicInteger) ((yl1) plVar.j).g).decrementAndGet() == 0) {
                        return dm3.a;
                    }
                    lq.r(((x50) plVar.g).h());
                    jVar = (j) plVar.h;
                    np npVar22 = (np) plVar.i;
                    this.l = jVar;
                    this.k = 1;
                    npVar22.getClass();
                    objG2 = np.G(npVar22, this);
                    if (objG2 != y50Var23) {
                        this.l = null;
                        this.k = 2;
                        break;
                    }
                    return y50Var23;
                }
                jVar = (j) this.l;
                y02.Q(obj);
                objG2 = obj;
                this.l = null;
                this.k = 2;
                break;
                break;
            case 23:
                y50 y50Var24 = y50.f;
                int i35 = this.k;
                if (i35 != 0) {
                    if (i35 == 1) {
                        y02.Q(obj);
                        return dm3.a;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                s23 s23Var = ((qr1) this.l).a;
                yp ypVar = new yp((l73) this.m, i);
                this.k = 1;
                s23Var.a(ypVar, this);
                return y50Var24;
            case 24:
                h53 h53Var = (h53) this.l;
                d42 d42Var = h53Var.s;
                y50 y50Var25 = y50.f;
                int i36 = this.k;
                if (i36 == 0) {
                    y02.Q(obj);
                    d42Var.setValue(Boolean.TRUE);
                    zs1 zs1Var = h53Var.x;
                    c6 c6Var = h53Var.w;
                    ts1 ts1Var2 = ts1.g;
                    n9 n9Var2 = (n9) this.m;
                    this.k = 1;
                    zs1Var.getClass();
                    if (ur.w(new ys1(ts1Var2, zs1Var, n9Var2, c6Var, (p40) null), this) == y50Var25) {
                        return y50Var25;
                    }
                } else {
                    if (i36 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                d42Var.setValue(Boolean.FALSE);
                return dm3.a;
            case 25:
                z53 z53Var = (z53) this.l;
                y50 y50Var26 = y50.f;
                int i37 = this.k;
                if (i37 == 0) {
                    y02.Q(obj);
                    if (z53Var != null) {
                        r53 r53Var = z53Var.a.b;
                        h1 h1Var = (h1) this.m;
                        int iOrdinal = r53Var.ordinal();
                        long j2 = Long.MAX_VALUE;
                        if (iOrdinal == 0) {
                            j = 4000;
                        } else if (iOrdinal == 1) {
                            j = 10000;
                        } else {
                            if (iOrdinal != 2) {
                                c.k();
                                return null;
                            }
                            j = Long.MAX_VALUE;
                        }
                        if (h1Var == null) {
                            j2 = j;
                            this.k = 1;
                            if (ur.A(j2, this) == y50Var26) {
                                return y50Var26;
                            }
                        } else {
                            AccessibilityManager accessibilityManager = ((j6) h1Var).a;
                            if (j < 2147483647L && Build.VERSION.SDK_INT >= 29) {
                                int iC = gf.c(accessibilityManager, (int) j, 3);
                                if (iC != Integer.MAX_VALUE) {
                                    j2 = iC;
                                }
                            }
                            this.k = 1;
                            if (ur.A(j2, this) == y50Var26) {
                            }
                        }
                    }
                    return dm3.a;
                }
                if (i37 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                jr jrVar = z53Var.b;
                if (jrVar.r() instanceof qx1) {
                    jrVar.t(j63.f);
                }
                return dm3.a;
            case 26:
                y50 y50Var27 = y50.f;
                int i38 = this.k;
                if (i38 == 0) {
                    y02.Q(obj);
                    ed edVar3 = (ed) ((ot) this.l).c;
                    Float f3 = new Float(0.0f);
                    oe oeVar = (oe) this.m;
                    this.k = 1;
                    if (ed.c(edVar3, f3, oeVar, null, this, 12) == y50Var27) {
                        return y50Var27;
                    }
                } else {
                    if (i38 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 27:
                y50 y50Var28 = y50.f;
                int i39 = this.k;
                if (i39 == 0) {
                    y02.Q(obj);
                    j61 j61Var2 = (j61) this.l;
                    this.k = 1;
                    if (j61Var2.x(this) != y50Var28) {
                    }
                    return y50Var28;
                }
                if (i39 != 1) {
                    if (i39 == 2) {
                        y02.Q(obj);
                        return dm3.a;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                xc2 xc2Var = (xc2) this.m;
                this.k = 2;
                break;
            case 28:
                Object obj3 = this.l;
                y50 y50Var29 = y50.f;
                int i40 = this.k;
                if (i40 == 0) {
                    y02.Q(obj);
                    gn0 gn0Var = (gn0) this.m;
                    this.l = null;
                    this.k = 1;
                    if (gn0Var.k(obj3, this) == y50Var29) {
                        return y50Var29;
                    }
                } else {
                    if (i40 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            default:
                dm3 dm3Var3 = dm3.a;
                ek2 ek2Var = (ek2) this.l;
                View view = (View) this.m;
                y50 y50Var30 = y50.f;
                int i41 = this.k;
                try {
                    if (i41 == 0) {
                        y02.Q(obj);
                        this.k = 1;
                        Object objF2 = lr.F(ek2Var.u, new l70(i4, z6 ? 1 : 0, i5), this);
                        if (objF2 != y50Var30) {
                            objF2 = dm3Var3;
                        }
                        if (objF2 == y50Var30) {
                            return y50Var30;
                        }
                    } else {
                        if (i41 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    if (gu3.a(view) == ek2Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    return dm3Var3;
                } finally {
                    if (gu3.a(view) == ek2Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd1(Object obj, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
    }
}
