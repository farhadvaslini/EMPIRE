package defpackage;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class q6 implements ax {
    public final a31 a;

    public q6(a31 a31Var) {
        this.a = a31Var;
    }

    public final void a(zw zwVar) {
        a31 a31Var = this.a;
        if (zwVar != null) {
            a31Var.s().setPrimaryClip(zwVar.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a31Var.s().clearPrimaryClip();
        } else {
            a31Var.s().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
