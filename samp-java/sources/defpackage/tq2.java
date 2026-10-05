package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tq2 {
    public final vq2 a;
    public uf b;

    public tq2(vq2 vq2Var) {
        this.a = vq2Var;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        vq2 vq2Var = this.a;
        if (!vq2Var.g) {
            c.q("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = vq2Var.f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                jo3.q(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            vq2Var.f = null;
        }
        return bundle;
    }

    public final sq2 b(String str) {
        sq2 sq2Var;
        vq2 vq2Var = this.a;
        synchronized (vq2Var.c) {
            Iterator it = vq2Var.d.entrySet().iterator();
            do {
                sq2Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                sq2 sq2Var2 = (sq2) entry.getValue();
                if (s51.n(str2, str)) {
                    sq2Var = sq2Var2;
                }
            } while (sq2Var == null);
        }
        return sq2Var;
    }

    public final void c(String str, sq2 sq2Var) {
        sq2Var.getClass();
        vq2 vq2Var = this.a;
        synchronized (vq2Var.c) {
            if (vq2Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            vq2Var.d.put(str, sq2Var);
        }
    }

    public final void d() {
        if (!this.a.h) {
            c.q("Can not perform this action after onSaveInstanceState");
            return;
        }
        uf ufVar = this.b;
        if (ufVar == null) {
            ufVar = new uf(this);
        }
        this.b = ufVar;
        try {
            xe1.class.getDeclaredConstructor(null);
            uf ufVar2 = this.b;
            if (ufVar2 != null) {
                ((LinkedHashSet) ufVar2.b).add(xe1.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + xe1.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
