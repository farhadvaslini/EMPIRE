package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cv2 {
    public final String a;
    public final rs0 b;
    public final boolean c;

    public /* synthetic */ cv2(String str) {
        this(str, new av2(1));
    }

    public final String toString() {
        return by1.g("AccessibilityKey: ", this.a);
    }

    public cv2(String str, rs0 rs0Var) {
        this.a = str;
        this.b = rs0Var;
    }

    public cv2(int i, String str) {
        this(str);
        this.c = true;
    }

    public cv2(String str, boolean z, rs0 rs0Var) {
        this(str, rs0Var);
        this.c = z;
    }
}
