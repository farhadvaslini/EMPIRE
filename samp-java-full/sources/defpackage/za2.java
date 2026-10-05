package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class za2 {
    public final List a;
    public final g51 b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public za2(List list, g51 g51Var) {
        MotionEvent motionEventA;
        this.a = list;
        this.b = g51Var;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.c = (i < 29 || (motionEventA = a()) == null) ? 0 : motionEventA.getClassification();
        MotionEvent motionEventA2 = a();
        this.d = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        MotionEvent motionEventA3 = a();
        this.e = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            boolean z = i >= 34 && motionEventA4.getClassification() == 3;
            boolean z2 = i >= 34 && motionEventA4.getClassification() == 5;
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked == 0) {
                if (!z) {
                    if (z2 && !z2) {
                        i2 = 7;
                    }
                }
                i2 = 10;
            } else if (actionMasked == 1) {
                if (!z) {
                    if (z2 && !z2) {
                        i2 = 9;
                    }
                }
                i2 = 12;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        if (!z) {
                            if (!z2) {
                                i2 = !z2 ? 1 : 8;
                            }
                            i2 = 7;
                        }
                        i2 = 10;
                        break;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!z) {
                            if (!z2) {
                                if (!z2) {
                                    i2 = 2;
                                    break;
                                }
                            }
                            i2 = 9;
                        }
                        i2 = 12;
                        break;
                    case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (z) {
                            i2 = 11;
                            break;
                        } else if (!z2) {
                            i2 = 3;
                            break;
                        }
                        break;
                    case 8:
                        i2 = 6;
                        break;
                    case vr.g /* 9 */:
                        i2 = 4;
                        break;
                    case vr.h /* 10 */:
                        i2 = 5;
                        break;
                }
            }
        } else {
            int size = list.size();
            while (i2 < size) {
                gb2 gb2Var = (gb2) list.get(i2);
                if (w22.n(gb2Var)) {
                    i2 = 2;
                } else if (!w22.l(gb2Var)) {
                    i2++;
                }
            }
            i2 = 3;
        }
        this.f = i2;
    }

    public final MotionEvent a() {
        g51 g51Var = this.b;
        if (g51Var != null) {
            return (MotionEvent) ((a31) g51Var.d).h;
        }
        return null;
    }
}
