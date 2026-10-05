package defpackage;

import top.th1nk.samp.MainActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hm extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hm(Object obj, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((hm) m(p40Var, x50Var)).o(dm3Var);
                return dm3Var;
            case 1:
                return ((hm) m(p40Var, x50Var)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((hm) m(p40Var, x50Var)).o(dm3Var);
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((hm) m(p40Var, x50Var)).o(dm3Var);
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((hm) m(p40Var, x50Var)).o(dm3Var);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ((hm) m(p40Var, x50Var)).o(dm3Var);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((hm) m(p40Var, x50Var)).o(dm3Var);
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((hm) m(p40Var, x50Var)).o(dm3Var);
            case 8:
                return ((hm) m(p40Var, x50Var)).o(dm3Var);
            case vr.g /* 9 */:
                return ((hm) m(p40Var, x50Var)).o(dm3Var);
            default:
                ((hm) m(p40Var, x50Var)).o(dm3Var);
                return dm3Var;
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                return new hm((jj3) obj2, p40Var, 0);
            case 1:
                return new hm((tw) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new hm((go3) obj2, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new hm((os1) obj2, p40Var, 3);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new hm((sa1) obj2, p40Var, 4);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new hm((String) obj2, p40Var, 5);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new hm((MainActivity) obj2, p40Var, 6);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return new hm((c72) obj2, p40Var, 7);
            case 8:
                return new hm((oa2) obj2, p40Var, 8);
            case vr.g /* 9 */:
                return new hm((sm2) obj2, p40Var, 9);
            default:
                return new hm((cs0) obj2, p40Var, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0311 A[Catch: all -> 0x030c, TRY_LEAVE, TryCatch #7 {all -> 0x030c, blocks: (B:124:0x02d6, B:126:0x02dc, B:129:0x02e9, B:132:0x02f6, B:134:0x0309, B:138:0x0311, B:141:0x0333, B:142:0x0338, B:143:0x0339, B:144:0x033e, B:145:0x033f, B:146:0x0356), top: B:199:0x02d6, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0333 A[Catch: all -> 0x030c, TRY_ENTER, TryCatch #7 {all -> 0x030c, blocks: (B:124:0x02d6, B:126:0x02dc, B:129:0x02e9, B:132:0x02f6, B:134:0x0309, B:138:0x0311, B:141:0x0333, B:142:0x0338, B:143:0x0339, B:144:0x033e, B:145:0x033f, B:146:0x0356), top: B:199:0x02d6, outer: #8 }] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm.o(java.lang.Object):java.lang.Object");
    }
}
