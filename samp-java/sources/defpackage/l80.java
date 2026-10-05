package defpackage;

import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l80 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l80(Object obj, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((l80) m(p40Var, x50Var)).o(dm3Var);
                break;
        }
        return ((l80) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new l80((m80) obj2, p40Var, 0);
            case 1:
                return new l80((on0) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new l80((wp0) obj2, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new l80((GameActivity) obj2, p40Var, 3);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new l80((a31) obj2, p40Var, 4);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new l80((rl1) obj2, p40Var, 5);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new l80((ip1) obj2, p40Var, 6);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return new l80((wq1) obj2, p40Var, 7);
            case 8:
                return new l80((oa2) obj2, p40Var, 8);
            case vr.g /* 9 */:
                return new l80((vg2) obj2, p40Var, 9);
            case vr.h /* 10 */:
                return new l80((sm2) obj2, p40Var, 10);
            case 11:
                return new l80((it2) obj2, p40Var, 11);
            case vr.i /* 12 */:
                return new l80((sz2) obj2, p40Var, 12);
            case 13:
                return new l80((sb3) obj2, p40Var, 13);
            case 14:
                return new l80((n60) obj2, p40Var, 14);
            case jo3.g /* 15 */:
                return new l80((ns0) obj2, p40Var, 15);
            case 16:
                return new l80((pg1) obj2, p40Var, 16);
            case 17:
                return new l80((ai3) obj2, p40Var, 17);
            default:
                return new l80((r70) obj2, p40Var, 18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x032b, code lost:
    
        if (defpackage.lq.I(r5).a(new defpackage.gw0(r1, r6), r14) == r8) goto L192;
     */
    /* JADX WARN: Path cross not found for [B:185:0x0305, B:188:0x030e], limit reached: 294 */
    /* JADX WARN: Path cross not found for [B:188:0x030e, B:185:0x0305], limit reached: 294 */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0312  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:189:0x0310 -> B:183:0x0301). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:191:0x032b -> B:194:0x032f). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l80.o(java.lang.Object):java.lang.Object");
    }
}
