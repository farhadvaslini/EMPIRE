package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final Object o(Object obj) {
        ad2 ad2Var;
        os1 os1Var;
        zc2 zc2Var;
        int i = this.j;
        long j = this.l;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        Object obj2 = this.n;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                qr1 qr1Var = (qr1) obj3;
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    if (((j61) obj2).x(this) != y50Var) {
                    }
                    return y50Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            y02.Q(obj);
                            return dm3Var;
                        }
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ad2Var = (ad2) this.m;
                    y02.Q(obj);
                    this.m = null;
                    this.k = 3;
                    if (qr1Var.b(ad2Var, this) != y50Var) {
                        return dm3Var;
                    }
                    return y50Var;
                }
                y02.Q(obj);
                zc2 zc2Var2 = new zc2(j);
                ad2 ad2Var2 = new ad2(zc2Var2);
                this.m = ad2Var2;
                this.k = 2;
                if (qr1Var.b(zc2Var2, this) != y50Var) {
                    ad2Var = ad2Var2;
                    this.m = null;
                    this.k = 3;
                    if (qr1Var.b(ad2Var, this) != y50Var) {
                    }
                }
                return y50Var;
            case 1:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    TextClassifier textClassifier = (TextClassifier) this.m;
                    this.k = 1;
                    return c72.a((c72) obj2, (CharSequence) obj3, this.l, textClassifier, this) == y50Var ? y50Var : dm3Var;
                }
                if (i3 == 1) {
                    y02.Q(obj);
                    return dm3Var;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ws2 ws2Var = (ws2) obj2;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y02.Q(obj);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                us2 us2Var = (us2) this.m;
                float fH = ws2Var.h(j);
                w1 w1Var = new w1((nk2) obj3, ws2Var, us2Var, 13);
                this.k = 1;
                return t22.m(0.0f, fH, null, w1Var, this, 12) == y50Var ? y50Var : dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int i5 = this.k;
                if (i5 == 0) {
                    y02.Q(obj);
                    mf3 mf3Var = ((ce3) this.m).v;
                    if (mf3Var != null) {
                        this.k = 1;
                        if (new mf3(mf3Var.l, this, 0).o(dm3Var) != y50Var) {
                        }
                    }
                    return y50Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        y02.Q(obj);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                this.k = 2;
                if (((ge3) obj2).a((be3) obj3, this) != y50Var) {
                    return dm3Var;
                }
                return y50Var;
            default:
                qr1 qr1Var2 = (qr1) obj3;
                os1 os1Var2 = (os1) obj2;
                int i6 = this.k;
                if (i6 == 0) {
                    y02.Q(obj);
                    zc2 zc2Var3 = (zc2) os1Var2.getValue();
                    if (zc2Var3 == null) {
                        zc2Var = new zc2(j);
                        if (qr1Var2 != null) {
                            this.m = zc2Var;
                            this.k = 2;
                            break;
                        }
                        os1Var2.setValue(zc2Var);
                        return dm3Var;
                    }
                    yc2 yc2Var = new yc2(zc2Var3);
                    if (qr1Var2 != null) {
                        this.m = os1Var2;
                        this.k = 1;
                    }
                    os1Var = os1Var2;
                    break;
                    return y50Var;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zc2Var = (zc2) this.m;
                    y02.Q(obj);
                    os1Var2.setValue(zc2Var);
                    return dm3Var;
                }
                os1Var = (os1) this.m;
                y02.Q(obj);
                os1Var.setValue(null);
                zc2Var = new zc2(j);
                if (qr1Var2 != null) {
                }
                os1Var2.setValue(zc2Var);
                return dm3Var;
        }
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
