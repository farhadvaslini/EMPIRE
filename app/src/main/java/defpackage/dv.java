package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dv {
    public static final dv f;
    public static final dv g;
    public static final dv h;
    public static final dv i;
    public static final dv j;
    public static final dv k;
    public static final dv l;
    public static final dv m;
    public static final dv n;
    public static final dv o;
    public static final /* synthetic */ dv[] p;

    static {
        dv dvVar = new dv("InvalidExtension", 0);
        f = dvVar;
        dv dvVar2 = new dv("CannotRead", 1);
        g = dvVar2;
        dv dvVar3 = new dv("ScriptTooLarge", 2);
        h = dvVar3;
        dv dvVar4 = new dv("PackageTooLarge", 3);
        i = dvVar4;
        dv dvVar5 = new dv("InvalidArchive", 4);
        j = dvVar5;
        dv dvVar6 = new dv("NoScripts", 5);
        k = dvVar6;
        dv dvVar7 = new dv("UnsafePath", 6);
        l = dvVar7;
        dv dvVar8 = new dv("FileConflict", 7);
        m = dvVar8;
        dv dvVar9 = new dv("InvalidScriptKind", 8);
        n = dvVar9;
        dv dvVar10 = new dv("Unknown", 9);
        o = dvVar10;
        p = new dv[]{dvVar, dvVar2, dvVar3, dvVar4, dvVar5, dvVar6, dvVar7, dvVar8, dvVar9, dvVar10};
    }

    public static dv valueOf(String str) {
        return (dv) Enum.valueOf(dv.class, str);
    }

    public static dv[] values() {
        return (dv[]) p.clone();
    }
}
