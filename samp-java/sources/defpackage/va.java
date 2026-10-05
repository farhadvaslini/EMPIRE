package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class va implements ns0 {
    public final /* synthetic */ int f;
    public Object g;

    public /* synthetic */ va(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        switch (this.f) {
            case 0:
                h62.F((h62) obj, (i62) this.g, 0, 0);
                break;
            case 1:
                ((mr) this.g).cancel();
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ij2 ij2Var = ((ul2) this.g).c;
                if (ij2Var != null) {
                    ij2Var.d();
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((a42) this.g).h(((Number) obj).intValue());
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                mb2 mb2Var = (mb2) this.g;
                if (mb2Var != null) {
                    mb2Var.c = zBooleanValue;
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                Throwable th = (Throwable) obj;
                rb3 rb3Var = (rb3) this.g;
                jr jrVar = rb3Var.h;
                if (jrVar != null) {
                    jrVar.C(th);
                }
                rb3Var.h = null;
                break;
            default:
                float[] fArr = ((wm1) obj).a;
                ab1 ab1Var = (ab1) this.g;
                if (ab1Var.t0()) {
                    vr.y(ab1Var).b0(ab1Var, fArr);
                }
                break;
        }
        return dm3.a;
    }

    public /* synthetic */ va() {
        this.f = 4;
    }
}
