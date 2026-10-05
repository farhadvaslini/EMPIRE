package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kx1 extends y implements j61 {
    public static final kx1 g = new kx1(f5.b0);

    @Override // defpackage.j61
    public final boolean b() {
        return true;
    }

    @Override // defpackage.j61
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.j61
    public final mt j(q61 q61Var) {
        return lx1.f;
    }

    @Override // defpackage.j61
    public final CancellationException o() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.j61
    public final kc0 r(ns0 ns0Var) {
        return lx1.f;
    }

    @Override // defpackage.j61
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.j61
    public final Object x(q40 q40Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.j61
    public final kc0 z(boolean z, boolean z2, k kVar) {
        return lx1.f;
    }

    @Override // defpackage.j61, defpackage.js
    public final void c(CancellationException cancellationException) {
    }
}
