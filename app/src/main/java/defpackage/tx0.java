package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tx0 {
    public final ArrayList a;

    public tx0(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList(32);
                break;
            default:
                this.a = new ArrayList(20);
                break;
        }
    }

    public void a(float f, float f2, float f3, float f4, boolean z) {
        this.a.add(new u42(f, f2, 0.0f, false, z, f3, f4));
    }

    public ux0 b() {
        return new ux0((String[]) this.a.toArray(new String[0]));
    }

    public void c() {
        this.a.add(m42.c);
    }

    public void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new n42(f, f2, f3, f4, f5, f6));
    }

    public void e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new v42(f, f2, f3, f4, f5, f6));
    }

    public void f(float f) {
        this.a.add(new o42(f));
    }

    public void g(float f) {
        this.a.add(new w42(f));
    }

    public void h(float f, float f2) {
        this.a.add(new p42(f, f2));
    }

    public void i(float f, float f2) {
        this.a.add(new x42(f, f2));
    }

    public void j(float f, float f2) {
        this.a.add(new q42(f, f2));
    }

    public void k(float f, float f2, float f3, float f4) {
        this.a.add(new s42(f, f2, f3, f4));
    }

    public void l(float f, float f2, float f3, float f4) {
        this.a.add(new a52(f, f2, f3, f4));
    }

    public void m(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void n(float f) {
        this.a.add(new d52(f));
    }

    public void o(float f) {
        this.a.add(new c52(f));
    }
}
