package defpackage;

import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mu0 {
    public final TextView a;
    public final TextView b;
    public final TextView c;

    public mu0(TextView textView, TextView textView2, TextView textView3) {
        this.a = textView;
        this.b = textView2;
        this.c = textView3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu0)) {
            return false;
        }
        mu0 mu0Var = (mu0) obj;
        return this.a.equals(mu0Var.a) && this.b.equals(mu0Var.b) && this.c.equals(mu0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DlModelProgressRow(type=" + this.a + ", id=" + this.b + ", progress=" + this.c + ")";
    }
}
