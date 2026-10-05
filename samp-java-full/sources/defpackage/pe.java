package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pe implements e93 {
    public final bl3 f;
    public final d42 g;
    public ue h;
    public long i;
    public long j;
    public boolean k;

    public pe(bl3 bl3Var, Object obj, ue ueVar, long j, long j2, boolean z) {
        ue ueVarY;
        this.f = bl3Var;
        this.g = b32.w(obj);
        if (ueVar != null) {
            ueVarY = gv3.y(ueVar);
        } else {
            ueVarY = (ue) bl3Var.a.h(obj);
            ueVarY.d();
        }
        this.h = ueVarY;
        this.i = j;
        this.j = j2;
        this.k = z;
    }

    public final Object a() {
        return this.f.b.h(this.h);
    }

    @Override // defpackage.e93
    public final Object getValue() {
        return this.g.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.g.getValue() + ", velocity=" + a() + ", isRunning=" + this.k + ", lastFrameTimeNanos=" + this.i + ", finishedTimeNanos=" + this.j + ")";
    }

    public /* synthetic */ pe(bl3 bl3Var, Object obj, ue ueVar, int i) {
        this(bl3Var, obj, (i & 4) != 0 ? null : ueVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
