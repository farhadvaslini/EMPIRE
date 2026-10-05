package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mp3 {
    public static final mp3 f;
    public static final mp3 g;
    public static final /* synthetic */ mp3[] h;

    static {
        mp3 mp3Var = new mp3("Lsq2", 0);
        f = mp3Var;
        mp3 mp3Var2 = new mp3("Impulse", 1);
        g = mp3Var2;
        h = new mp3[]{mp3Var, mp3Var2};
    }

    public static mp3 valueOf(String str) {
        return (mp3) Enum.valueOf(mp3.class, str);
    }

    public static mp3[] values() {
        return (mp3[]) h.clone();
    }
}
