package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class t62 implements r62 {
    public static final t62 b = new t62(0);
    public static final t62 c = new t62(1);
    public final /* synthetic */ int a;

    public /* synthetic */ t62(int i) {
        this.a = i;
    }

    @Override // defpackage.r62
    public final boolean a() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.r62
    public final q62 b(View view, ua0 ua0Var) {
        switch (this.a) {
            case 0:
                return new s62(new Magnifier(view));
            default:
                return new u62(new Magnifier(view));
        }
    }
}
