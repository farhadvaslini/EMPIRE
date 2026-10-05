package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ew implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ew(int i, Object obj, boolean z) {
        this.f = i;
        this.g = z;
        this.h = obj;
    }

    @Override // defpackage.cs0
    public final Object a() {
        ms1 ms1VarI;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj = this.h;
        boolean z = this.g;
        switch (i) {
            case 0:
                os1 os1Var = (os1) obj;
                if (!z) {
                    os1Var.setValue(null);
                }
                break;
            case 1:
                o9 o9Var = (o9) obj;
                if (z && (ms1VarI = o9Var.i()) != null) {
                    ((s23) ms1VarI).q(dm3Var);
                }
                break;
            default:
                ip0 ip0Var = (ip0) obj;
                if (z) {
                    ip0.a(ip0Var);
                }
                break;
        }
        return dm3Var;
    }
}
