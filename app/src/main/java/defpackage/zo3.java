package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public interface zo3 {
    boolean a();

    long b(ue ueVar, ue ueVar2, ue ueVar3);

    ue l(long j, ue ueVar, ue ueVar2, ue ueVar3);

    ue p(long j, ue ueVar, ue ueVar2, ue ueVar3);

    default ue q(ue ueVar, ue ueVar2, ue ueVar3) {
        return l(b(ueVar, ueVar2, ueVar3), ueVar, ueVar2, ueVar3);
    }
}
