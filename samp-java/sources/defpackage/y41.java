package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class y41 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ a51 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y41(a51 a51Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = a51Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((y41) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        a51 a51Var = this.l;
        switch (i) {
            case 0:
                return new y41(a51Var, p40Var, 0);
            case 1:
                return new y41(a51Var, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new y41(a51Var, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new y41(a51Var, p40Var, 3);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new y41(a51Var, p40Var, 4);
            default:
                return new y41(a51Var, p40Var, 5);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        a51 a51Var = this.l;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    ed edVar = a51Var.c;
                    Float f = new Float(1.0f);
                    s83 s83Var = new s83(0.5f, 300.0f, new Float(0.001f));
                    this.k = 1;
                    if (ed.c(edVar, f, s83Var, null, this, 12) == y50Var) {
                    }
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case 1:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    ed edVar2 = a51Var.d;
                    gy1 gy1Var = new gy1(a51Var.e);
                    this.k = 1;
                    if (edVar2.f(this, gy1Var) == y50Var) {
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    ed edVar3 = a51Var.c;
                    Float f2 = new Float(0.0f);
                    s83 s83Var2 = new s83(0.5f, 300.0f, new Float(0.001f));
                    this.k = 1;
                    if (ed.c(edVar3, f2, s83Var2, null, this, 12) == y50Var) {
                    }
                } else if (i4 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int i5 = this.k;
                if (i5 == 0) {
                    y02.Q(obj);
                    ed edVar4 = a51Var.d;
                    gy1 gy1Var2 = new gy1(a51Var.e);
                    s83 s83Var3 = new s83(0.5f, 300.0f, new gy1((4294967295L & ((long) Float.floatToRawIntBits(1.0f))) | (Float.floatToRawIntBits(1.0f) << 32)));
                    this.k = 1;
                    if (ed.c(edVar4, gy1Var2, s83Var3, null, this, 12) == y50Var) {
                    }
                } else if (i5 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                int i6 = this.k;
                if (i6 == 0) {
                    y02.Q(obj);
                    ed edVar5 = a51Var.c;
                    Float f3 = new Float(0.0f);
                    s83 s83Var4 = new s83(0.5f, 300.0f, new Float(0.001f));
                    this.k = 1;
                    if (ed.c(edVar5, f3, s83Var4, null, this, 12) == y50Var) {
                    }
                } else if (i6 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            default:
                int i7 = this.k;
                if (i7 == 0) {
                    y02.Q(obj);
                    ed edVar6 = a51Var.d;
                    gy1 gy1Var3 = new gy1(a51Var.e);
                    s83 s83Var5 = new s83(0.5f, 300.0f, new gy1((4294967295L & ((long) Float.floatToRawIntBits(1.0f))) | (Float.floatToRawIntBits(1.0f) << 32)));
                    this.k = 1;
                    if (ed.c(edVar6, gy1Var3, s83Var5, null, this, 12) == y50Var) {
                    }
                } else if (i7 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
        }
        return y50Var;
    }
}
