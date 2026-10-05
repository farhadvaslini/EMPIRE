package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class so3 implements ns0 {
    public final /* synthetic */ int f;

    public /* synthetic */ so3(int i) {
        this.f = i;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        switch (this.f) {
            case 0:
                re reVar = (re) obj;
                int iRound = Math.round(reVar.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(reVar.b);
                return new p41((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
            case 1:
                jk2 jk2Var = (jk2) obj;
                return new te(jk2Var.a, jk2Var.b, jk2Var.c, jk2Var.d);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                te teVar = (te) obj;
                return new jk2(teVar.a, teVar.b, teVar.c, teVar.d);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return Float.valueOf(((qe) obj).a);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((qt3) obj).f;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ((qt3) obj).c;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((qt3) obj).e;
            default:
                xt3 xt3Var = (xt3) obj;
                xt3Var.getClass();
                return xt3Var;
        }
    }
}
