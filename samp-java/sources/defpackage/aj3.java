package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class aj3 extends t22 {
    public final /* synthetic */ int c;
    public boolean d;
    public int e;
    public final /* synthetic */ Object f;

    public aj3(fr3 fr3Var) {
        this.c = 1;
        this.f = fr3Var;
        this.d = false;
        this.e = 0;
    }

    @Override // defpackage.gr3
    public final void a() {
        int i = this.c;
        Object obj = this.f;
        switch (i) {
            case 0:
                if (!this.d) {
                    ((bj3) obj).a.setVisibility(this.e);
                }
                break;
            default:
                int i2 = this.e + 1;
                this.e = i2;
                fr3 fr3Var = (fr3) obj;
                if (i2 == fr3Var.a.size()) {
                    gr3 gr3Var = fr3Var.d;
                    if (gr3Var != null) {
                        gr3Var.a();
                    }
                    this.e = 0;
                    this.d = false;
                    fr3Var.e = false;
                }
                break;
        }
    }

    @Override // defpackage.t22, defpackage.gr3
    public void b() {
        switch (this.c) {
            case 0:
                this.d = true;
                break;
        }
    }

    @Override // defpackage.t22, defpackage.gr3
    public final void c() {
        int i = this.c;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((bj3) obj).a.setVisibility(0);
                break;
            default:
                if (!this.d) {
                    this.d = true;
                    gr3 gr3Var = ((fr3) obj).d;
                    if (gr3Var != null) {
                        gr3Var.c();
                    }
                    break;
                }
                break;
        }
    }

    public aj3(bj3 bj3Var, int i) {
        this.c = 0;
        this.f = bj3Var;
        this.e = i;
        this.d = false;
    }
}
