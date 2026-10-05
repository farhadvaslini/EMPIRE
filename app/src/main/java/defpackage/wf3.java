package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf3 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ua0 g;
    public final /* synthetic */ os1 h;

    public /* synthetic */ wf3(ua0 ua0Var, os1 os1Var, int i) {
        this.f = i;
        this.g = ua0Var;
        this.h = os1Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        os1 os1Var = this.h;
        ua0 ua0Var = this.g;
        switch (i) {
            case 0:
                rf rfVar = new rf((cs0) obj, 7);
                wf3 wf3Var = new wf3(ua0Var, os1Var, 1);
                if (sl1.a()) {
                    return sl1.a() ? new pl1(rfVar, wf3Var, Build.VERSION.SDK_INT == 28 ? t62.b : t62.c) : yp1.a;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                md0 md0Var = (md0) obj;
                os1Var.setValue(new p41((((long) ua0Var.p0(md0.a(md0Var.a))) & 4294967295L) | (((long) ua0Var.p0(md0.b(md0Var.a))) << 32)));
                return dm3.a;
        }
    }
}
