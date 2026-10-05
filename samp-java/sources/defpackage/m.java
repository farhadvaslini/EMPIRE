package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class m extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ long l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ce3 ce3Var, long j, ge3 ge3Var, be3 be3Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 3;
        this.m = ce3Var;
        this.l = j;
        this.n = ge3Var;
        this.o = be3Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((m) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 1:
                return ((m) m((p40) obj2, (TextClassifier) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((m) m((p40) obj2, (us2) obj)).o(dm3Var);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return ((m) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((m) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                return new m((j61) obj3, this.l, (qr1) obj2, p40Var, 0);
            case 1:
                m mVar = new m(this.l, p40Var, (c72) obj3, (CharSequence) obj2);
                mVar.m = obj;
                return mVar;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                m mVar2 = new m((ws2) obj3, this.l, (nk2) obj2, p40Var, 2);
                mVar2.m = obj;
                return mVar2;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new m((ce3) this.m, this.l, (ge3) obj3, (be3) obj2, p40Var);
            default:
                return new m((os1) obj3, this.l, (qr1) obj2, p40Var, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r10.b(r5, r13) == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r10.b(r0, r13) == r7) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j, p40 p40Var, c72 c72Var, CharSequence charSequence) {
        super(2, p40Var);
        this.j = 1;
        this.n = c72Var;
        this.o = charSequence;
        this.l = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, long j, Object obj2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.n = obj;
        this.l = j;
        this.o = obj2;
    }
}
