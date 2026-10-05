package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cj0 extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ ns0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj0(ns0 ns0Var, int i) {
        super(1);
        this.g = i;
        this.h = ns0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.g;
        ns0 ns0Var = this.h;
        switch (i) {
        }
        return new i41(((long) ((Number) ns0Var.h(Integer.valueOf((int) (((p41) obj).a >> 32)))).intValue()) << 32);
    }
}
