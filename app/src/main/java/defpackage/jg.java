package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class jg {
    public static final hg f = new hg(new ig());
    public static final int g = -100;
    public static rj1 h = null;
    public static rj1 i = null;
    public static Boolean j = null;
    public static boolean k = false;
    public static final tj l = new tj(0);
    public static final Object m = new Object();
    public static final Object n = new Object();

    public static boolean c(Context context) {
        if (j == null) {
            try {
                int i2 = si.f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) si.class), ri.a() | 128).metaData;
                if (bundle != null) {
                    j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                j = Boolean.FALSE;
            }
        }
        return j.booleanValue();
    }

    public static void f(vg vgVar) {
        synchronized (m) {
            try {
                tj tjVar = l;
                tjVar.getClass();
                oj ojVar = new oj(tjVar);
                while (ojVar.hasNext()) {
                    jg jgVar = (jg) ((WeakReference) ojVar.next()).get();
                    if (jgVar == vgVar || jgVar == null) {
                        ojVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean h(int i2);

    public abstract void i(int i2);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract e3 n(d3 d3Var);
}
