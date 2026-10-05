package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ye implements Appendable {
    public final StringBuilder f;
    public final ArrayList g;
    public final ArrayList h;

    public ye() {
        this.f = new StringBuilder(16);
        this.g = new ArrayList();
        this.h = new ArrayList();
        new ArrayList();
    }

    public final void a(af afVar) {
        StringBuilder sb = this.f;
        int length = sb.length();
        sb.append(afVar.g);
        List list = afVar.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ze zeVar = (ze) list.get(i);
                this.h.add(new xe(zeVar.a, zeVar.b + length, zeVar.c + length, zeVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof af;
        StringBuilder sb = this.f;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        af afVar = (af) charSequence;
        int length = sb.length();
        sb.append((CharSequence) afVar.g, i, i2);
        List listA = bf.a(afVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                ze zeVar = (ze) listA.get(i3);
                this.h.add(new xe(zeVar.a, zeVar.b + length, zeVar.c + length, zeVar.d));
            }
        }
        return this;
    }

    public final void b(int i) {
        ArrayList arrayList = this.g;
        if (i >= arrayList.size()) {
            n21.b(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            if (arrayList.isEmpty()) {
                n21.b("Nothing to pop.");
            }
            ((xe) arrayList.remove(arrayList.size() - 1)).c = this.f.length();
        }
    }

    public final int c(h83 h83Var) {
        xe xeVar = new xe(h83Var, this.f.length(), 0, 12);
        this.g.add(xeVar);
        this.h.add(xeVar);
        return r5.size() - 1;
    }

    public final af d() {
        StringBuilder sb = this.f;
        String string = sb.toString();
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((xe) arrayList.get(i)).a(sb.length()));
        }
        return new af(string, arrayList2);
    }

    public ye(af afVar) {
        this();
        a(afVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof af) {
            a((af) charSequence);
            return this;
        }
        this.f.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f.append(c);
        return this;
    }
}
