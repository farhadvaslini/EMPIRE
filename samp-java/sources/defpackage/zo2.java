package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zo2 {
    public final m4 a;
    public final k71 b;
    public final ij2 c;
    public final boolean d;
    public final List e;
    public int f;
    public final ArrayList g;

    public zo2(m4 m4Var, k71 k71Var, ij2 ij2Var, boolean z) {
        List<Proxy> listSelect;
        List listK;
        k71Var.getClass();
        this.a = m4Var;
        this.b = k71Var;
        this.c = ij2Var;
        this.d = z;
        this.e = ni0.f;
        this.g = new ArrayList();
        i01 i01Var = m4Var.h;
        ij2Var.i.getClass();
        i01Var.getClass();
        URI uriI = i01Var.i();
        if (uriI.getHost() == null) {
            listK = lv3.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            try {
                listSelect = m4Var.g.select(uriI);
            } catch (IllegalArgumentException unused) {
                listSelect = null;
            }
            listK = (listSelect == null || listSelect.isEmpty()) ? lv3.k(new Proxy[]{Proxy.NO_PROXY}) : lv3.j(listSelect);
        }
        this.e = listK;
        this.f = 0;
        pj0 pj0Var = this.c.i;
        List list = this.e;
        pj0Var.getClass();
        list.getClass();
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.g.isEmpty();
    }
}
