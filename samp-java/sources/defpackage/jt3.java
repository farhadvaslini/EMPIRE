package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class jt3 {
    public static final mt3 b;
    public final mt3 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new zs3() : i >= 35 ? new ys3() : i >= 34 ? new xs3() : i >= 31 ? new ws3() : i >= 30 ? new vs3() : i >= 29 ? new us3() : new ts3()).b().a.a().a.b().a.c();
    }

    public jt3(mt3 mt3Var) {
        this.a = mt3Var;
    }

    public mt3 a() {
        return this.a;
    }

    public mt3 b() {
        return this.a;
    }

    public mt3 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt3)) {
            return false;
        }
        jt3 jt3Var = (jt3) obj;
        return t() == jt3Var.t() && s() == jt3Var.s() && Objects.equals(n(), jt3Var.n()) && Objects.equals(l(), jt3Var.l()) && Objects.equals(h(), jt3Var.h());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public cc0 h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public h31 i(int i) {
        return h31.e;
    }

    public h31 j(int i) {
        if ((i & 8) == 0) {
            return h31.e;
        }
        c.p("Unable to query the maximum insets for IME");
        return null;
    }

    public h31 k() {
        return n();
    }

    public h31 l() {
        return h31.e;
    }

    public h31 m() {
        return n();
    }

    public h31 n() {
        return h31.e;
    }

    public h31 o() {
        return n();
    }

    public mt3 r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void q() {
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(mt3 mt3Var) {
    }

    public void p(View view) {
    }

    public void v(ec0 ec0Var) {
    }

    public void w(h31[] h31VarArr) {
    }

    public void x(h31 h31Var) {
    }

    public void y(mt3 mt3Var) {
    }

    public void z(h31 h31Var) {
    }
}
