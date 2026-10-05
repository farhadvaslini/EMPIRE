package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ri2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri2(String str, lf2 lf2Var, os1 os1Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 6;
        this.n = str;
        this.l = lf2Var;
        this.m = os1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 1:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return ((ri2) m((p40) obj2, (us2) obj)).o(dm3Var);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((ri2) m((p40) obj2, (cs2) obj)).o(dm3Var);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((ri2) m((p40) obj2, (jd2) obj)).o(dm3Var);
            case 8:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.g /* 9 */:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.h /* 10 */:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 11:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((ri2) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                return new ri2((vi2) this.l, (vg2) this.m, (String) obj2, p40Var, 0);
            case 1:
                ri2 ri2Var = new ri2((dk2) this.m, (ic) obj2, p40Var, 1);
                ri2Var.l = obj;
                return ri2Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new ri2((ak2) this.l, (sv2) this.m, (xy2) obj2, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ri2 ri2Var2 = new ri2((re0) this.m, (ws2) obj2, p40Var, 3);
                ri2Var2.l = obj;
                return ri2Var2;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ri2 ri2Var3 = new ri2((ws2) this.m, (rs0) obj2, p40Var, 4);
                ri2Var3.l = obj;
                return ri2Var3;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ri2 ri2Var4 = new ri2((e93) this.m, (ed) obj2, p40Var, 5);
                ri2Var4.l = obj;
                return ri2Var4;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new ri2((String) obj2, (lf2) this.l, (os1) this.m, p40Var);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                ri2 ri2Var5 = new ri2((o50) this.m, (fn0) obj2, p40Var, 7);
                ri2Var5.l = obj;
                return ri2Var5;
            case 8:
                return new ri2((hf3) this.l, (xc2) this.m, (gb2) obj2, p40Var, 8);
            case vr.g /* 9 */:
                ri2 ri2Var6 = new ri2((j61) this.m, (rs0) obj2, p40Var, 9);
                ri2Var6.l = obj;
                return ri2Var6;
            case vr.h /* 10 */:
                return new ri2((me3) this.m, (ge3) obj2, p40Var, 10);
            case 11:
                return new ri2((u10) obj2, p40Var);
            default:
                return new ri2((go3) this.m, (File) obj2, p40Var, 12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c6, code lost:
    
        if (r15.f(r1, r14) == r0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0240, code lost:
    
        if (r0.a(r1, r14) == r6) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024e, code lost:
    
        if (defpackage.cl3.G(r1, r3, r14) == r6) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02d5, code lost:
    
        if (r2.a(r15, r14) == r8) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0172, code lost:
    
        if (r6 == r8) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri2.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri2(Object obj, Object obj2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri2(Object obj, Object obj2, Object obj3, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri2(u10 u10Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 11;
        this.n = u10Var;
    }
}
