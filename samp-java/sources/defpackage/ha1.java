package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ha1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ sa1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha1(sa1 sa1Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = sa1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((ha1) m(p40Var, bool)).o(dm3Var);
                break;
            case 1:
                ((ha1) m(p40Var, bool)).o(dm3Var);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((ha1) m(p40Var, bool)).o(dm3Var);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((ha1) m(p40Var, bool)).o(dm3Var);
                break;
            default:
                ((ha1) m(p40Var, bool)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        sa1 sa1Var = this.l;
        switch (i) {
            case 0:
                ha1 ha1Var = new ha1(sa1Var, p40Var, 0);
                ha1Var.k = ((Boolean) obj).booleanValue();
                return ha1Var;
            case 1:
                ha1 ha1Var2 = new ha1(sa1Var, p40Var, 1);
                ha1Var2.k = ((Boolean) obj).booleanValue();
                return ha1Var2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ha1 ha1Var3 = new ha1(sa1Var, p40Var, 2);
                ha1Var3.k = ((Boolean) obj).booleanValue();
                return ha1Var3;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ha1 ha1Var4 = new ha1(sa1Var, p40Var, 3);
                ha1Var4.k = ((Boolean) obj).booleanValue();
                return ha1Var4;
            default:
                ha1 ha1Var5 = new ha1(sa1Var, p40Var, 4);
                ha1Var5.k = ((Boolean) obj).booleanValue();
                return ha1Var5;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        sa1 sa1Var = this.l;
        boolean z = this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                i93 i93Var = sa1Var.B;
                Boolean boolValueOf = Boolean.valueOf(z);
                i93Var.getClass();
                i93Var.j(null, boolValueOf);
                break;
            case 1:
                y02.Q(obj);
                i93 i93Var2 = sa1Var.D;
                Boolean boolValueOf2 = Boolean.valueOf(z);
                i93Var2.getClass();
                i93Var2.j(null, boolValueOf2);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y02.Q(obj);
                i93 i93Var3 = sa1Var.G;
                Boolean boolValueOf3 = Boolean.valueOf(z);
                i93Var3.getClass();
                i93Var3.j(null, boolValueOf3);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                y02.Q(obj);
                i93 i93Var4 = sa1Var.H;
                Boolean boolValueOf4 = Boolean.valueOf(z);
                i93Var4.getClass();
                i93Var4.j(null, boolValueOf4);
                break;
            default:
                y02.Q(obj);
                i93 i93Var5 = sa1Var.y;
                Boolean boolValueOf5 = Boolean.valueOf(z);
                i93Var5.getClass();
                i93Var5.j(null, boolValueOf5);
                break;
        }
        return dm3Var;
    }
}
