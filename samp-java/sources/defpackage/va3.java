package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class va3 extends s23 implements g93 {
    @Override // defpackage.g93
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.m;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.n + ((long) ((int) ((o() + ((long) this.p)) - this.n)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.m;
            objArr.getClass();
            q(Integer.valueOf(((Number) objArr[((int) ((this.n + ((long) ((int) ((o() + ((long) this.p)) - this.n)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
