package defpackage;

import android.app.Application;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd1.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd1(Object obj, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
    }
}
