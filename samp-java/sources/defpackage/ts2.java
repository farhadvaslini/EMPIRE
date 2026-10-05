package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ts2 implements cs2 {
    public final /* synthetic */ ws2 a;
    public final /* synthetic */ us2 b;

    public ts2(ws2 ws2Var, us2 us2Var) {
        this.a = ws2Var;
        this.b = us2Var;
    }

    @Override // defpackage.cs2
    public final float a(float f) {
        float fAbs = Math.abs(f);
        ws2 ws2Var = this.a;
        if (fAbs != 0.0f && !((Boolean) ws2Var.h.a()).booleanValue()) {
            throw new um0(0, "The fling animation was cancelled");
        }
        return ws2Var.e(ws2Var.h(this.b.a(2, ws2Var.f(ws2Var.i(f)))));
    }
}
