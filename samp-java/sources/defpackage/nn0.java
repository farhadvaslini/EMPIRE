package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nn0 extends q40 {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ on0 k;
    public gn0 l;
    public Serializable m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn0(on0 on0Var, p40 p40Var) {
        super(p40Var);
        this.k = on0Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
