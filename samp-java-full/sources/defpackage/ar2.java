package defpackage;

import android.app.Application;
import android.content.Intent;
import android.view.WindowInsetsAnimation;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import top.th1nk.samp.feature.update.UpdateForegroundService;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ar2 implements zq2, ad0, lt2 {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public ar2(int i) {
        this.f = i;
        switch (i) {
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                this.g = new ak2(15);
                this.h = new nl1(16);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                this.g = new qs1(new Reference[16]);
                this.h = new ReferenceQueue();
                break;
        }
    }

    @Override // defpackage.ad0
    public void a(File file) {
        file.getClass();
        go3 go3Var = (go3) this.g;
        i93 i93Var = go3Var.k;
        on3 on3Var = new on3(file);
        i93Var.getClass();
        i93Var.j(null, on3Var);
        go3Var.i((Application) this.h);
    }

    @Override // defpackage.lt2
    public int b(int i) {
        do {
            i = ((xh) this.h).l(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.g).charAt(i)));
        return i;
    }

    @Override // defpackage.lt2
    public int c(int i) {
        do {
            i = ((xh) this.h).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.g).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.zq2
    public Object d(Object obj) {
        return ((ns0) this.h).h(obj);
    }

    @Override // defpackage.ad0
    public void e(cd0 cd0Var) {
        i93 i93Var = ((go3) this.g).k;
        ln3 ln3Var = new ln3(cd0Var);
        i93Var.getClass();
        i93Var.j(null, ln3Var);
        String str = go3.e((go3) this.g, cd0Var.a) + " / " + go3.e((go3) this.g, cd0Var.b) + " · " + go3.e((go3) this.g, cd0Var.c) + "/s";
        long j = cd0Var.b;
        int i = j > 0 ? (int) ((cd0Var.a * 100) / j) : 0;
        if (((go3) this.g).o) {
            boolean z = UpdateForegroundService.f;
            Application application = (Application) this.h;
            application.getClass();
            if (UpdateForegroundService.f) {
                Intent intent = new Intent(application, (Class<?>) UpdateForegroundService.class);
                intent.setAction("top.th1nk.samp.update.UPDATE");
                intent.putExtra("content", str);
                intent.putExtra("progress", i);
                intent.putExtra("max", 100);
                try {
                    application.startService(intent);
                } catch (Exception e) {
                    ti tiVar = ui.a;
                    ui.c(ti.i, "UpdateService", by1.g("Failed to update notification: ", e.getMessage()), null);
                }
            }
        }
    }

    @Override // defpackage.ad0
    public void f(String str) {
        go3 go3Var = (go3) this.g;
        i93 i93Var = go3Var.k;
        mn3 mn3Var = new mn3(str);
        i93Var.getClass();
        i93Var.j(null, mn3Var);
        go3Var.i((Application) this.h);
    }

    @Override // defpackage.lt2
    public int g(int i) {
        CharSequence charSequence = (CharSequence) this.g;
        do {
            i = ((xh) this.h).j(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.lt2
    public int h(int i) {
        do {
            i = ((xh) this.h).l(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.g).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.zq2
    public Object i(cq2 cq2Var, Object obj) {
        return ((rs0) this.g).f(cq2Var, obj);
    }

    public String toString() {
        switch (this.f) {
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return "Bounds{lower=" + ((h31) this.g) + " upper=" + ((h31) this.h) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ar2(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public ar2(WindowInsetsAnimation.Bounds bounds) {
        this.f = 7;
        this.g = h31.c(bounds.getLowerBound());
        this.h = h31.c(bounds.getUpperBound());
    }
}
