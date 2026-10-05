package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jq2 implements gq2, wq2 {
    public final /* synthetic */ hq2 f;
    public rf1 g;
    public uq2 h;

    public jq2(hq2 hq2Var) {
        this.f = hq2Var;
        Object objD = hq2Var.d("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objD instanceof Bundle ? (Bundle) objD : null;
        if (bundle != null && this.h == null) {
            uq2 uq2Var = new uq2(new vq2(this, new it1(14, this)));
            this.h = uq2Var;
            uq2Var.a(bundle);
        }
        hq2Var.a("androidx.savedstate.SavedStateRegistry", new it1(12, this));
    }

    @Override // defpackage.gq2
    public final fq2 a(String str, cs0 cs0Var) {
        return this.f.a(str, cs0Var);
    }

    @Override // defpackage.gq2
    public final boolean b(Object obj) {
        return this.f.b(obj);
    }

    @Override // defpackage.gq2
    public final Map c() {
        return this.f.c();
    }

    @Override // defpackage.gq2
    public final Object d(String str) {
        return this.f.d(str);
    }

    @Override // defpackage.of1
    public final gf1 getLifecycle() {
        rf1 rf1Var = this.g;
        if (rf1Var != null) {
            return rf1Var;
        }
        rf1 rf1Var2 = new rf1(this, false);
        this.g = rf1Var2;
        return rf1Var2;
    }

    @Override // defpackage.wq2
    public final tq2 getSavedStateRegistry() {
        uq2 uq2Var = this.h;
        if (uq2Var == null) {
            uq2 uq2Var2 = new uq2(new vq2(this, new it1(14, this)));
            this.h = uq2Var2;
            uq2Var2.a(null);
            uq2Var = uq2Var2;
        }
        return uq2Var.b;
    }
}
