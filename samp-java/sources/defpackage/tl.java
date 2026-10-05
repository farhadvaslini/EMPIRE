package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tl implements ge3 {
    public final d00 a;
    public final zs1 b = new zs1();
    public final d42 c = b32.w(null);

    public tl(d00 d00Var) {
        this.a = d00Var;
    }

    @Override // defpackage.ge3
    public final Object a(yd3 yd3Var, mb3 mb3Var) {
        p40 p40Var = null;
        x5 x5Var = new x5(this, new sl(yd3Var), p40Var, 2);
        zs1 zs1Var = this.b;
        zs1Var.getClass();
        Object objW = ur.w(new e51(ts1.f, zs1Var, x5Var, p40Var, 1), mb3Var);
        return objW == y50.f ? objW : dm3.a;
    }

    public final void b(final cs0 cs0Var, nv0 nv0Var, final int i) {
        final cs0 cs0Var2;
        nv0 nv0Var2;
        nv0Var.b0(723898654);
        int i2 = (nv0Var.f(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            sl slVar = (sl) this.c.getValue();
            if (slVar == null) {
                xj2 xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    xj2VarT.d = new rs0(this, cs0Var, i, i3) { // from class: rl
                        public final /* synthetic */ int f;
                        public final /* synthetic */ tl g;
                        public final /* synthetic */ cs0 h;

                        {
                            this.f = i3;
                            this.g = this;
                        }

                        @Override // defpackage.rs0
                        public final Object f(Object obj, Object obj2) {
                            int i5 = this.f;
                            dm3 dm3Var = dm3.a;
                            cs0 cs0Var3 = this.h;
                            tl tlVar = this.g;
                            nv0 nv0Var3 = (nv0) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    tlVar.b(cs0Var3, nv0Var3, jo3.y(7));
                                    break;
                                default:
                                    tlVar.b(cs0Var3, nv0Var3, jo3.y(7));
                                    break;
                            }
                            return dm3Var;
                        }
                    };
                    return;
                }
                return;
            }
            cs0Var2 = cs0Var;
            nv0Var2 = nv0Var;
            this.a.j(slVar, slVar.a, cs0Var2, nv0Var2, 384);
        } else {
            cs0Var2 = cs0Var;
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT2 = nv0Var2.t();
        if (xj2VarT2 != null) {
            xj2VarT2.d = new rs0(this, cs0Var2, i, i4) { // from class: rl
                public final /* synthetic */ int f;
                public final /* synthetic */ tl g;
                public final /* synthetic */ cs0 h;

                {
                    this.f = i4;
                    this.g = this;
                }

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    int i5 = this.f;
                    dm3 dm3Var = dm3.a;
                    cs0 cs0Var3 = this.h;
                    tl tlVar = this.g;
                    nv0 nv0Var3 = (nv0) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            tlVar.b(cs0Var3, nv0Var3, jo3.y(7));
                            break;
                        default:
                            tlVar.b(cs0Var3, nv0Var3, jo3.y(7));
                            break;
                    }
                    return dm3Var;
                }
            };
        }
    }
}
