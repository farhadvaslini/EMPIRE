package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cj implements dn1 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final Map d;
    public final ns0 e;
    public final /* synthetic */ ns0 f;
    public final /* synthetic */ en1 g;

    public /* synthetic */ cj(int i, int i2, Map map, ns0 ns0Var, ns0 ns0Var2, en1 en1Var, int i3) {
        this.a = i3;
        this.f = ns0Var2;
        this.g = en1Var;
        this.b = i;
        this.c = i2;
        this.d = map;
        this.e = ns0Var;
    }

    @Override // defpackage.dn1
    public final void a() {
        int i = this.a;
        en1 en1Var = this.g;
        ns0 ns0Var = this.f;
        switch (i) {
            case 0:
                ns0Var.h(((dj) en1Var).f.u);
                break;
            default:
                ns0Var.h(((al1) en1Var).u);
                break;
        }
    }

    @Override // defpackage.dn1
    public final Map c() {
        switch (this.a) {
        }
        return this.d;
    }

    @Override // defpackage.dn1
    public final int d() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.dn1
    public final ns0 e() {
        switch (this.a) {
        }
        return this.e;
    }

    @Override // defpackage.dn1
    public final int g() {
        switch (this.a) {
        }
        return this.b;
    }
}
