package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ev {
    public static final ev f;
    public static final ev g;
    public static final ev h;
    public static final ev i;
    public static final /* synthetic */ ev[] j;

    static {
        ev evVar = new ev("Importing", 0);
        f = evVar;
        ev evVar2 = new ev("Downloading", 1);
        g = evVar2;
        ev evVar3 = new ev("Installing", 2);
        h = evVar3;
        ev evVar4 = new ev("Deleting", 3);
        i = evVar4;
        j = new ev[]{evVar, evVar2, evVar3, evVar4};
    }

    public static ev valueOf(String str) {
        return (ev) Enum.valueOf(ev.class, str);
    }

    public static ev[] values() {
        return (ev[]) j.clone();
    }
}
