package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class db0 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Serializable h;

    public db0(AssetManager assetManager, Executor executor, md2 md2Var, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.b = executor;
        this.c = md2Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = n92.T;
                    break;
                case 27:
                    bArr = n92.S;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = n92.R;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = n92.Q;
        }
        this.d = bArr;
    }

    public void a(bb1 bb1Var) {
        qk qkVar = (qk) this.g;
        if (qkVar == null || bb1Var != ((bb1) this.h) || qkVar.b()) {
            this.h = bb1Var;
            qkVar = new qk((af) this.b, (ua0) this.d, (zp0) this.e, n32.y((gh3) this.c, bb1Var), (List) this.f, this.a);
        }
        this.g = qkVar;
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((md2) this.c).f();
            return null;
        }
    }

    public void c(int i, Serializable serializable) {
        ((Executor) this.b).execute(new uz(i, 2, this, serializable));
    }

    public db0(af afVar, ua0 ua0Var, zp0 zp0Var, gh3 gh3Var, List list, boolean z) {
        this.b = afVar;
        this.c = gh3Var;
        this.a = z;
        this.d = ua0Var;
        this.e = zp0Var;
        this.f = list;
    }
}
