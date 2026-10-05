package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class lh extends er0 {
    public final /* synthetic */ sh o;
    public final /* synthetic */ vh p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(vh vhVar, vh vhVar2, sh shVar) {
        super(vhVar2);
        this.p = vhVar;
        this.o = shVar;
    }

    @Override // defpackage.er0
    public final v33 b() {
        return this.o;
    }

    @Override // defpackage.er0
    public final boolean c() {
        vh vhVar = this.p;
        if (vhVar.getInternalPopup().a()) {
            return true;
        }
        vhVar.k.m(vhVar.getTextDirection(), vhVar.getTextAlignment());
        return true;
    }
}
