package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tv0 implements vo1 {
    public static final tv0 b = new tv0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ tv0(int i) {
        this.a = i;
    }

    @Override // defpackage.vo1
    public final yi2 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!wv0.class.isAssignableFrom(cls)) {
                    c.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (yi2) wv0.d(cls.asSubclass(wv0.class)).c(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.vo1
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return wv0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
