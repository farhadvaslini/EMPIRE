package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class eg0 implements nv2, fg0 {
    public final /* synthetic */ int a;
    public final nv2 b;
    public final int c;

    public eg0(nv2 nv2Var, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = nv2Var;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                c.e(i, 46, "count must be non-negative, but was ");
                throw null;
            default:
                nv2Var.getClass();
                this.b = nv2Var;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                c.e(i, 46, "count must be non-negative, but was ");
                throw null;
        }
    }

    @Override // defpackage.fg0
    public final nv2 a(int i) {
        int i2 = this.a;
        nv2 nv2Var = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new eg0(this, i, 1) : new oa3(nv2Var, i3, i4);
            default:
                return i >= i3 ? this : new eg0(nv2Var, i, 1);
        }
    }

    @Override // defpackage.fg0
    public final nv2 b(int i) {
        int i2 = this.a;
        nv2 nv2Var = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new eg0(this, i, 0) : new eg0(nv2Var, i4, 0);
            default:
                return i >= i3 ? ri0.a : new oa3(nv2Var, i, i3);
        }
    }

    @Override // defpackage.nv2
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new dg0(this);
            default:
                return new dg0(this, (byte) 0);
        }
    }
}
