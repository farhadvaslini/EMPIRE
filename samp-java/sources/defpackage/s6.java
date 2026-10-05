package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class s6 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ h7 g;

    public /* synthetic */ s6(h7 h7Var, int i) {
        this.f = i;
        this.g = h7Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        int i2 = 0;
        h7 h7Var = this.g;
        switch (i) {
            case 0:
                zc zcVar = h7Var.S;
                if (zcVar != null) {
                    int childCount = zcVar.getChildCount();
                    while (i2 < childCount) {
                        View childAt = zcVar.getChildAt(i2);
                        tc tcVar = childAt instanceof tc ? (tc) childAt : null;
                        if (tcVar != null && tcVar.isLayoutRequested()) {
                            tcVar.layout(tcVar.getLeft(), tcVar.getTop(), tcVar.getRight(), tcVar.getBottom());
                        }
                        i2++;
                    }
                }
                return dm3.a;
            case 1:
                if (Build.VERSION.SDK_INT > 28 && h7Var.isAttachedToWindow()) {
                    if (h7.R0 == null) {
                        y6 y6Var = new y6(0);
                        h7.R0 = y6Var;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (h7.N0 == null) {
                                h7.N0 = Class.forName("android.os.SystemProperties");
                            }
                            if (h7.P0 == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = h7.N0;
                                h7.P0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                            }
                            Method method = h7.P0;
                            if (method != null) {
                                method.invoke(null, y6Var);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    as1 as1Var = h7.Q0;
                    synchronized (as1Var) {
                        as1Var.b(h7Var);
                    }
                }
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                Boolean bool = (Boolean) h7Var.u.getValue();
                bool.getClass();
                return bool;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                LocaleList locales = h7Var.getConfiguration().getLocales();
                rj1 rj1Var = new rj1(new sj1(locales));
                if (locales.isEmpty()) {
                    rj1Var = new rj1(new sj1(LocaleList.getDefault()));
                }
                sj1 sj1Var = rj1Var.a;
                int size = sj1Var.a.size();
                ArrayList arrayList = new ArrayList(size);
                while (i2 < size) {
                    Locale locale = sj1Var.a.get(i2);
                    locale.getClass();
                    arrayList.add(new pj1(locale));
                    i2++;
                }
                return new qj1(arrayList);
            default:
                MotionEvent motionEvent = h7Var.s0;
                if (motionEvent != null) {
                    boolean zContains = vr.L(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = h7Var.s0;
                    boolean z = motionEvent2 != null && motionEvent2.getButtonState() == 0;
                    if (zContains && z) {
                        h7Var.t0 = SystemClock.uptimeMillis();
                        h7Var.post(h7Var.A0);
                    }
                }
                h7Var.G0.a();
                return dm3.a;
        }
    }
}
