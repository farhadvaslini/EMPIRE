package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qh0 implements mh0 {
    public final Context a;

    public qh0(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context;
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                context.getClass();
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    @Override // defpackage.mh0
    public void a(vr vrVar) {
        v20 v20Var = new v20("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), v20Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new vb(this, vrVar, threadPoolExecutor, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110 A[Catch: Exception -> 0x011e, LOOP:0: B:50:0x010a->B:52:0x0110, LOOP_END, TryCatch #0 {Exception -> 0x011e, blocks: (B:49:0x00c5, B:50:0x010a, B:52:0x0110, B:55:0x0120), top: B:62:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(File file, q40 q40Var) {
        rn3 rn3Var;
        int i;
        long longVersionCode;
        String str;
        String packageName;
        Iterator<T> it;
        ti tiVar = ti.i;
        u31 u31Var = u31.a;
        Context context = this.a;
        if (q40Var instanceof rn3) {
            rn3Var = (rn3) q40Var;
            int i2 = rn3Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rn3Var.l = i2 - Integer.MIN_VALUE;
            } else {
                rn3Var = new rn3(this, q40Var);
            }
        }
        Object objG = rn3Var.j;
        y50 y50Var = y50.f;
        int i3 = rn3Var.l;
        PackageInfo packageInfo = null;
        Object[] objArr = 0;
        try {
            if (i3 == 0) {
                y02.Q(objG);
                j90 j90Var = ac0.a;
                x80 x80Var = x80.h;
                pw pwVar = new pw(this, file, objArr == true ? 1 : 0, 17);
                rn3Var.i = file;
                rn3Var.l = 1;
                objG = cl3.G(x80Var, pwVar, rn3Var);
                if (objG == y50Var) {
                    return y50Var;
                }
            } else {
                if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                file = rn3Var.i;
                y02.Q(objG);
            }
            packageInfo = (PackageInfo) objG;
        } catch (Exception e) {
            ti tiVar2 = ui.a;
            ui.c(tiVar, "UpdateInstaller", "Failed to inspect update package", e);
        }
        if (packageInfo != null) {
            try {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 33) {
                    PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                    packageInfo2.getClass();
                    if (i4 >= 28) {
                        longVersionCode = packageInfo2.getLongVersionCode();
                        str = packageInfo.packageName;
                        str.getClass();
                        long longVersionCode2 = i4 < 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                        packageName = context.getPackageName();
                        packageName.getClass();
                        if (str.equals(packageName) && longVersionCode2 > longVersionCode) {
                            try {
                                Uri uriD = FileProvider.d(context, context.getPackageName() + ".fileprovider", file);
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setDataAndType(uriD, "application/vnd.android.package-archive");
                                intent.setClipData(ClipData.newRawUri("update_apk", uriD));
                                intent.addFlags(268435456);
                                intent.addFlags(1);
                                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
                                listQueryIntentActivities.getClass();
                                it = listQueryIntentActivities.iterator();
                                while (it.hasNext()) {
                                    context.grantUriPermission(((ResolveInfo) it.next()).activityInfo.packageName, uriD, 1);
                                }
                                context.startActivity(intent);
                                ti tiVar3 = ui.a;
                                ui.a("UpdateInstaller", "System installer launched for " + file.getName());
                                return v31.a;
                            } catch (Exception e2) {
                                ti tiVar4 = ui.a;
                                ui.c(tiVar, "UpdateInstaller", "Failed to launch system installer", e2);
                                return new t31(e2.getMessage());
                            }
                        }
                    } else {
                        i = packageInfo2.versionCode;
                        longVersionCode = i;
                        str = packageInfo.packageName;
                        str.getClass();
                        if (i4 < 28) {
                        }
                        packageName = context.getPackageName();
                        packageName.getClass();
                        if (str.equals(packageName)) {
                            Uri uriD2 = FileProvider.d(context, context.getPackageName() + ".fileprovider", file);
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setDataAndType(uriD2, "application/vnd.android.package-archive");
                            intent2.setClipData(ClipData.newRawUri("update_apk", uriD2));
                            intent2.addFlags(268435456);
                            intent2.addFlags(1);
                            List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent2, 0);
                            listQueryIntentActivities2.getClass();
                            it = listQueryIntentActivities2.iterator();
                            while (it.hasNext()) {
                            }
                            context.startActivity(intent2);
                            ti tiVar32 = ui.a;
                            ui.a("UpdateInstaller", "System installer launched for " + file.getName());
                            return v31.a;
                        }
                    }
                } else {
                    PackageInfo packageInfo3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    packageInfo3.getClass();
                    if (i4 >= 28) {
                        longVersionCode = packageInfo3.getLongVersionCode();
                        str = packageInfo.packageName;
                        str.getClass();
                        if (i4 < 28) {
                        }
                        packageName = context.getPackageName();
                        packageName.getClass();
                        if (str.equals(packageName)) {
                        }
                    } else {
                        i = packageInfo3.versionCode;
                        longVersionCode = i;
                        str = packageInfo.packageName;
                        str.getClass();
                        if (i4 < 28) {
                        }
                        packageName = context.getPackageName();
                        packageName.getClass();
                        if (str.equals(packageName)) {
                        }
                    }
                }
            } catch (Exception e3) {
                ti tiVar5 = ui.a;
                ui.c(tiVar, "UpdateInstaller", "Failed to inspect installed package", e3);
                return u31Var;
            }
        }
        return u31Var;
    }
}
