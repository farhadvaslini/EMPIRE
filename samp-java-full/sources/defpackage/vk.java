package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vk extends vp {
    public final Object g;
    public final long h;

    public vk(long j, Object obj) {
        this.g = obj;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk)) {
            return false;
        }
        vk vkVar = (vk) obj;
        return this.g.equals(vkVar.g) && this.h == vkVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.g + ", compositeKey=" + this.h + ')';
    }
}
