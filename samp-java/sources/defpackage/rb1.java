package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rb1 {
    public static final rb1 f;
    public static final rb1 g;
    public static final rb1 h;
    public static final /* synthetic */ rb1[] i;

    static {
        rb1 rb1Var = new rb1("InMeasureBlock", 0);
        f = rb1Var;
        rb1 rb1Var2 = new rb1("InLayoutBlock", 1);
        g = rb1Var2;
        rb1 rb1Var3 = new rb1("NotUsed", 2);
        h = rb1Var3;
        i = new rb1[]{rb1Var, rb1Var2, rb1Var3};
    }

    public static rb1 valueOf(String str) {
        return (rb1) Enum.valueOf(rb1.class, str);
    }

    public static rb1[] values() {
        return (rb1[]) i.clone();
    }
}
