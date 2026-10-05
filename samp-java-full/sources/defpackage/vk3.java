package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vk3 extends uk3 {
    public final /* synthetic */ int i;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.i) {
            case 0:
                int i = this.h;
                this.h = i + 2;
                Object[] objArr = this.f;
                return new gm1(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.h;
                this.h = i2 + 2;
                return this.f[i2];
            default:
                int i3 = this.h;
                this.h = i3 + 2;
                return this.f[i3 + 1];
        }
    }
}
