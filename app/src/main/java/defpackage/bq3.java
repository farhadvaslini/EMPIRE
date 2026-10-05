package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bq3 extends bm1 {
    public final /* synthetic */ int j;

    public bq3(int i, Class cls, int i2, int i3, int i4) {
        this.j = i4;
        this.f = i;
        this.i = cls;
        this.h = i2;
        this.g = i3;
    }

    @Override // defpackage.bm1
    public final Object c(View view) {
        switch (this.j) {
            case 0:
                return Boolean.valueOf(hq3.c(view));
            case 1:
                return hq3.a(view);
            default:
                return Boolean.valueOf(hq3.b(view));
        }
    }

    @Override // defpackage.bm1
    public final void d(View view, Object obj) {
        switch (this.j) {
            case 0:
                hq3.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                hq3.e(view, (CharSequence) obj);
                break;
            default:
                hq3.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.bm1
    public final boolean g(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
