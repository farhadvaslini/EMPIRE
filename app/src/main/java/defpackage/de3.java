package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class de3 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Drawable g;

    public /* synthetic */ de3(Drawable drawable, int i) {
        this.f = i;
        this.g = drawable;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Drawable drawable = this.g;
        switch (i) {
            case 0:
                long j = ((wx) obj).a;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nv0Var.U();
                } else {
                    m22.w.i(drawable, nv0Var, 48);
                }
                break;
            default:
                long j2 = ((wx) obj).a;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    m22.w.i(drawable, nv0Var2, 48);
                }
                break;
        }
        return dm3Var;
    }
}
