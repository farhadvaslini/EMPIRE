package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.view.ScrollCaptureSession;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n9.o(java.lang.Object):java.lang.Object");
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
