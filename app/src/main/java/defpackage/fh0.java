package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fh0 {
    public final xh a;
    public int b;
    public int c;
    public int d;
    public int e;

    public fh0(af afVar, long j) {
        String str = afVar.g;
        xh xhVar = new xh();
        xhVar.d = str;
        xhVar.b = -1;
        xhVar.c = -1;
        this.a = xhVar;
        this.b = yg3.f(j);
        this.c = yg3.e(j);
        this.d = -1;
        this.e = -1;
        int iF = yg3.f(j);
        int iE = yg3.e(j);
        if (iF < 0 || iF > str.length()) {
            c.i(nc2.g(iF, str.length(), "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            c.i(nc2.g(iE, str.length(), "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        c.p(nc2.g(iF, iE, "Do not set reversed range: ", " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long jF = d32.f(i, i2);
        this.a.m(i, i2, "");
        long jU = lr.U(d32.f(this.b, this.c), jF);
        h(yg3.f(jU));
        g(yg3.e(jU));
        int i3 = this.d;
        if (i3 != -1) {
            long jU2 = lr.U(d32.f(i3, this.e), jF);
            if (yg3.c(jU2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = yg3.f(jU2);
                this.e = yg3.e(jU2);
            }
        }
    }

    public final char b(int i) {
        xh xhVar = this.a;
        lx lxVar = (lx) xhVar.e;
        if (lxVar == null) {
            return ((String) xhVar.d).charAt(i);
        }
        if (i < xhVar.b) {
            return ((String) xhVar.d).charAt(i);
        }
        int iB = lxVar.b - lxVar.b();
        int i2 = xhVar.b;
        if (i >= iB + i2) {
            return ((String) xhVar.d).charAt(i - ((iB - xhVar.c) + i2));
        }
        int i3 = i - i2;
        int i4 = lxVar.c;
        char[] cArr = (char[]) lxVar.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + lxVar.d];
    }

    public final yg3 c() {
        int i = this.d;
        if (i != -1) {
            return new yg3(d32.f(i, this.e));
        }
        return null;
    }

    public final void d(int i, int i2, String str) {
        xh xhVar = this.a;
        if (i < 0 || i > xhVar.c()) {
            c.i(nc2.g(i, xhVar.c(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > xhVar.c()) {
            c.i(nc2.g(i2, xhVar.c(), "end (", ") offset is outside of text region "));
            return;
        }
        if (i > i2) {
            c.p(nc2.g(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        xhVar.m(i, i2, str);
        h(str.length() + i);
        g(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void e(int i, int i2) {
        xh xhVar = this.a;
        if (i < 0 || i > xhVar.c()) {
            c.i(nc2.g(i, xhVar.c(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > xhVar.c()) {
            c.i(nc2.g(i2, xhVar.c(), "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            c.p(nc2.g(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void f(int i, int i2) {
        xh xhVar = this.a;
        if (i < 0 || i > xhVar.c()) {
            c.i(nc2.g(i, xhVar.c(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > xhVar.c()) {
            c.i(nc2.g(i2, xhVar.c(), "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            c.p(nc2.g(i, i2, "Do not set reversed range: ", " > "));
        } else {
            h(i);
            g(i2);
        }
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            n21.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            n21.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
