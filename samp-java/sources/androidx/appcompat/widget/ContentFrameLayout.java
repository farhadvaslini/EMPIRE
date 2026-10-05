package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.bj3;
import defpackage.er3;
import defpackage.lg;
import defpackage.nn1;
import defpackage.u30;
import defpackage.v2;
import defpackage.vg;
import defpackage.z2;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue f;
    public TypedValue g;
    public TypedValue h;
    public TypedValue i;
    public TypedValue j;
    public TypedValue k;
    public final Rect l;
    public u30 m;

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.j == null) {
            this.j = new TypedValue();
        }
        return this.j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.k == null) {
            this.k = new TypedValue();
        }
        return this.k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.i == null) {
            this.i = new TypedValue();
        }
        return this.i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.g == null) {
            this.g = new TypedValue();
        }
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u30 u30Var = this.m;
        if (u30Var != null) {
            u30Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        z2 z2Var;
        super.onDetachedFromWindow();
        u30 u30Var = this.m;
        if (u30Var != null) {
            vg vgVar = ((lg) u30Var).g;
            ActionBarOverlayLayout actionBarOverlayLayout = vgVar.v;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((bj3) actionBarOverlayLayout.j).a.f;
                if (actionMenuView != null && (z2Var = actionMenuView.y) != null) {
                    z2Var.c();
                    v2 v2Var = z2Var.y;
                    if (v2Var != null && v2Var.b()) {
                        v2Var.i.dismiss();
                    }
                }
            }
            if (vgVar.A != null) {
                vgVar.q.getDecorView().removeCallbacks(vgVar.B);
                if (vgVar.A.isShowing()) {
                    try {
                        vgVar.A.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                vgVar.A = null;
            }
            er3 er3Var = vgVar.C;
            if (er3Var != null) {
                er3Var.b();
            }
            nn1 nn1Var = vgVar.A(0).h;
            if (nn1Var != null) {
                nn1Var.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(u30 u30Var) {
        this.m = u30Var;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }
}
