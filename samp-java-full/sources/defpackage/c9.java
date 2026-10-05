package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c9 implements y62 {
    public final int f;

    public c9(int i) {
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9) && this.f == ((c9) obj).f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f);
    }

    public final String toString() {
        return by1.h("AndroidFontResolveInterceptor(fontWeightAdjustment=", ")", this.f);
    }
}
