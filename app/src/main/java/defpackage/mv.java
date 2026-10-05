package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mv implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ vl1 g;

    public /* synthetic */ mv(vl1 vl1Var, int i) {
        this.f = i;
        this.g = vl1Var;
    }

    @Override // defpackage.cs0
    public final Object a() throws Exception {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        vl1 vl1Var = this.g;
        switch (i) {
            case 0:
                vl1Var.a(new String[]{"application/zip", "application/octet-stream", "*/*"});
                break;
            case 1:
                vl1Var.a(new String[]{"application/zip", "application/octet-stream", "application/vnd.th1nk.samp-plugin"});
                break;
            default:
                vl1Var.a(new String[]{"application/zip", "application/x-zip-compressed"});
                break;
        }
        return dm3Var;
    }
}
