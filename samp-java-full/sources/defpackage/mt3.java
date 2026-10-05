package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mt3 {
    public static final mt3 b;
    public final jt3 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = ht3.x;
        } else if (i >= 30) {
            b = ft3.w;
        } else {
            b = jt3.b;
        }
    }

    public mt3(mt3 mt3Var) {
        if (mt3Var == null) {
            this.a = new jt3(this);
            return;
        }
        jt3 jt3Var = mt3Var.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (jt3Var instanceof it3)) {
            this.a = new it3(this, (it3) jt3Var);
        } else if (i >= 34 && (jt3Var instanceof ht3)) {
            this.a = new ht3(this, (ht3) jt3Var);
        } else if (i >= 31 && (jt3Var instanceof gt3)) {
            this.a = new gt3(this, (gt3) jt3Var);
        } else if (i >= 30 && (jt3Var instanceof ft3)) {
            this.a = new ft3(this, (ft3) jt3Var);
        } else if (i >= 29 && (jt3Var instanceof et3)) {
            this.a = new et3(this, (et3) jt3Var);
        } else if (i >= 28 && (jt3Var instanceof dt3)) {
            this.a = new dt3(this, (dt3) jt3Var);
        } else if (jt3Var instanceof ct3) {
            this.a = new ct3(this, (ct3) jt3Var);
        } else if (jt3Var instanceof bt3) {
            this.a = new bt3(this, (bt3) jt3Var);
        } else {
            this.a = new jt3(this);
        }
        jt3Var.e(this);
    }

    public static h31 a(h31 h31Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, h31Var.a - i);
        int iMax2 = Math.max(0, h31Var.b - i2);
        int iMax3 = Math.max(0, h31Var.c - i3);
        int iMax4 = Math.max(0, h31Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? h31Var : h31.b(iMax, iMax2, iMax3, iMax4);
    }

    public static mt3 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        mt3 mt3Var = new mt3(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = mq3.a;
            mt3 mt3VarA = gq3.a(view);
            jt3 jt3Var = mt3Var.a;
            jt3Var.y(mt3VarA);
            View rootView = view.getRootView();
            jt3Var.d(rootView);
            jt3Var.p(rootView);
            jt3Var.q();
            jt3Var.A(view.getWindowSystemUiVisibility());
        }
        return mt3Var;
    }

    public final WindowInsets b() {
        jt3 jt3Var = this.a;
        if (jt3Var instanceof bt3) {
            return ((bt3) jt3Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mt3) {
            return Objects.equals(this.a, ((mt3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        jt3 jt3Var = this.a;
        if (jt3Var == null) {
            return 0;
        }
        return jt3Var.hashCode();
    }

    public mt3(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new it3(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new ht3(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new gt3(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new ft3(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new et3(this, windowInsets);
        } else if (i >= 28) {
            this.a = new dt3(this, windowInsets);
        } else {
            this.a = new ct3(this, windowInsets);
        }
    }
}
