package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jq1 implements iq1 {
    public final Context f;
    public n40 g;
    public final z32 h = new z32(1.0f);
    public w83 i;

    public jq1(Context context) {
        this.f = context;
    }

    @Override // defpackage.o50
    public final o50 k(o50 o50Var) {
        return pq.Q(this, o50Var);
    }

    @Override // defpackage.o50
    public final m50 m(n50 n50Var) {
        return pq.t(this, n50Var);
    }

    @Override // defpackage.o50
    public final Object p(rs0 rs0Var, Object obj) {
        return rs0Var.f(obj, this);
    }

    @Override // defpackage.o50
    public final o50 u(n50 n50Var) {
        return pq.M(this, n50Var);
    }

    @Override // defpackage.iq1
    public final float v() {
        int i;
        p40 p40Var;
        g93 g93Var;
        if (this.i == null) {
            Context context = this.f;
            is1 is1Var = gu3.a;
            synchronized (is1Var) {
                try {
                    Object objG = is1Var.g(context);
                    i = 6;
                    p40Var = null;
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        np npVarA = lr.a(-1, 6, null);
                        p70 p70Var = new p70(3, new e51(contentResolver, uriFor, new fu3(npVarA, vp.z(Looper.getMainLooper())), npVarA, context, null));
                        xa3 xa3VarF = jo3.f();
                        j90 j90Var = ac0.a;
                        objG = lr.R(p70Var, new n40(pq.Q(xa3VarF, tl1.a)), new c93(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        is1Var.m(context, objG);
                    }
                    g93Var = (g93) objG;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.h.h(((Number) g93Var.getValue()).floatValue());
            n40 n40Var = this.g;
            if (n40Var == null) {
                c.q("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.i = cl3.t(n40Var, null, new hd1(g93Var, this, p40Var, i), 3);
        }
        return this.h.g();
    }
}
