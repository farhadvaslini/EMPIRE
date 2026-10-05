package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class w62 {
    public static final w62 c = new w62(0, false);
    public final boolean a;
    public final int b;

    public w62() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w62)) {
            return false;
        }
        w62 w62Var = (w62) obj;
        return this.a == w62Var.a && this.b == w62Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ci0.a(this.b) + ")";
    }

    public w62(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
