package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ca0 extends u71 implements cs0 {
    public static final ca0 h;
    public static final ca0 i;
    public static final ca0 j;
    public final /* synthetic */ int g;

    static {
        int i2 = 0;
        h = new ca0(i2, 0);
        i = new ca0(i2, 1);
        j = new ca0(i2, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca0(int i2, int i3) {
        super(i2);
        this.g = i3;
    }

    @Override // defpackage.cs0
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.g) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            default:
                return null;
        }
    }
}
