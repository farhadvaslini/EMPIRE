package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ke {
    public static final ke f;
    public static final ke g;
    public static final /* synthetic */ ke[] h;

    static {
        ke keVar = new ke("BoundReached", 0);
        f = keVar;
        ke keVar2 = new ke("Finished", 1);
        g = keVar2;
        h = new ke[]{keVar, keVar2};
    }

    public static ke valueOf(String str) {
        return (ke) Enum.valueOf(ke.class, str);
    }

    public static ke[] values() {
        return (ke[]) h.clone();
    }
}
