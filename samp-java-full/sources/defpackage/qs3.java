package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qs3 extends rs3 {
    public final WindowInsetsAnimation e;

    public qs3(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.rs3
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.rs3
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.rs3
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.rs3
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.rs3
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
