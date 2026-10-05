package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sa0 implements nv2 {
    public final CharSequence a;
    public final int b;
    public final rs0 c;

    public sa0(CharSequence charSequence, int i, rs0 rs0Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = rs0Var;
    }

    @Override // defpackage.nv2
    public final Iterator iterator() {
        return new ra0(this);
    }
}
