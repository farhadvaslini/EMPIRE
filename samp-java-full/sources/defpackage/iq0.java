package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class iq0 implements mh0 {
    public final Context a;
    public final hq0 b;
    public final zj c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public vr h;

    public iq0(Context context, hq0 hq0Var) {
        jo3.h(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = hq0Var;
        this.c = jq0.d;
    }

    @Override // defpackage.mh0
    public final void a(vr vrVar) {
        synchronized (this.d) {
            this.h = vrVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new v20("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new v(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zq0 c() {
        try {
            zj zjVar = this.c;
            Context context = this.a;
            hq0 hq0Var = this.b;
            zjVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{hq0Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            s4 s4VarA = gq0.a(context, Collections.unmodifiableList(arrayList));
            int i = s4VarA.a;
            if (i != 0) {
                throw new RuntimeException(by1.h("fetchFonts failed (", ")", i));
            }
            zq0[] zq0VarArr = (zq0[]) ((List) s4VarA.b).get(0);
            if (zq0VarArr == null || zq0VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return zq0VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
