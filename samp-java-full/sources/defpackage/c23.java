package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c23 implements z13 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c23(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    @Override // defpackage.z13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vr a(long j, bb1 bb1Var, ua0 ua0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bb1Var.getClass();
                ua0Var.getClass();
                d23 d23Var = (d23) obj;
                z13 z13Var = (z13) ((cs0) d23Var.c).a();
                if (!s51.n((z13) d23Var.d, z13Var)) {
                    d23Var.d = z13Var;
                    d23Var.e = null;
                }
                if (((vr) d23Var.e) != null && h43.a(d23Var.b, j) && d23Var.a == bb1Var) {
                    Float f = (Float) d23Var.f;
                    float fH = ua0Var.h();
                    if (f == null || f.floatValue() != fH) {
                    }
                } else {
                    d23Var.b = j;
                    d23Var.a = bb1Var;
                    d23Var.f = Float.valueOf(ua0Var.h());
                    d23Var.e = z13Var.a(j, bb1Var, ua0Var);
                }
                vr vrVar = (vr) d23Var.e;
                vrVar.getClass();
                return vrVar;
            default:
                return new v02((da) obj);
        }
    }
}
