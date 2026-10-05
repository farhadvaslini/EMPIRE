package defpackage;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class q83 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final h80 a(nv0 nv0Var) {
        ua0 ua0Var = (ua0) nv0Var.j(s20.h);
        boolean zC = nv0Var.c(ua0Var.h());
        Object objO = nv0Var.O();
        if (zC || objO == c20.a) {
            objO = new h80(new k71(ua0Var));
            nv0Var.j0(objO);
        }
        return (h80) objO;
    }
}
