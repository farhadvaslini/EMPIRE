package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mz implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ xz g;

    public /* synthetic */ mz(xz xzVar, int i) {
        this.f = i;
        this.g = xzVar;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        xz xzVar = this.g;
        switch (i) {
            case 0:
                xzVar.reportFullyDrawn();
                return dm3.a;
            case 1:
                return xz.b(xzVar);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                sb0 sb0Var = new sb0();
                xzVar.getNavigationEventDispatcher().b(sb0Var);
                return sb0Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new xq2(xzVar.getApplication(), xzVar, xzVar.getIntent() != null ? xzVar.getIntent().getExtras() : null);
            default:
                xy1 xy1Var = new xy1(new lz(xzVar, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (s51.n(Looper.myLooper(), Looper.getMainLooper())) {
                        xzVar.f(xy1Var);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new a8(2, xzVar, xy1Var));
                    }
                }
                return xy1Var;
        }
    }
}
