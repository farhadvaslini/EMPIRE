package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ua implements ns0 {
    public static final ua g = new ua(0);
    public static final ua h = new ua(1);
    public static final ua i = new ua(2);
    public static final ua j = new ua(3);
    public static final ua k = new ua(4);
    public final /* synthetic */ int f;

    public /* synthetic */ ua(int i2) {
        this.f = i2;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i2 = this.f;
        dm3 dm3Var = dm3.a;
        switch (i2) {
            case 0:
                return dm3Var;
            case 1:
                float[] fArr = ((wm1) obj).a;
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                float[] fArr2 = ((wm1) obj).a;
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((Number) obj).intValue();
                return null;
            default:
                if (s51.n(obj, Boolean.FALSE)) {
                    return new wx(wx.g);
                }
                obj.getClass();
                return new wx(vp.b(((Integer) obj).intValue()));
        }
    }
}
