package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nm3 extends pm3 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nm3(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.pm3
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!qm3.g) {
                }
                break;
            default:
                if (!qm3.g) {
                }
                break;
        }
        return qm3.c(j, obj);
    }

    @Override // defpackage.pm3
    public final double d(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // defpackage.pm3
    public final float e(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // defpackage.pm3
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!qm3.g) {
                    qm3.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    qm3.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!qm3.g) {
                    qm3.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    qm3.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.pm3
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!qm3.g) {
                    qm3.l(obj, j, b);
                } else {
                    qm3.k(obj, j, b);
                }
                break;
            default:
                if (!qm3.g) {
                    qm3.l(obj, j, b);
                } else {
                    qm3.k(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.pm3
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.pm3
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                n(obj, j, Float.floatToIntBits(f));
                break;
            default:
                n(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.pm3
    public final boolean r() {
        switch (this.b) {
        }
        return false;
    }
}
