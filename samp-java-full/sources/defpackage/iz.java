package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class iz implements p40 {
    public static final iz g = new iz(0);
    public static final iz h = new iz(1);
    public final /* synthetic */ int f;

    public /* synthetic */ iz(int i) {
        this.f = i;
    }

    @Override // defpackage.p40
    public final o50 i() {
        switch (this.f) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return li0.f;
        }
    }

    @Override // defpackage.p40
    public final void t(Object obj) {
        switch (this.f) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.f) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
