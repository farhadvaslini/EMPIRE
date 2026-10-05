package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class yd2 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ yd2(float f, Object obj, int i, int i2) {
        this.f = i2;
        this.g = f;
        this.i = obj;
        this.h = i;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.h;
        Object obj2 = this.i;
        float f = this.g;
        switch (i) {
            case 0:
                ex exVar = (ex) obj2;
                bv2.h((dv2) obj, new qd2(((Number) y02.j(Float.valueOf(f), exVar)).floatValue(), exVar, i2));
                break;
            default:
                uw0 uw0Var = (uw0) obj;
                uw0Var.getClass();
                uw0Var.k((f * ((es2) obj2).a.g()) / i2);
                break;
        }
        return dm3Var;
    }
}
