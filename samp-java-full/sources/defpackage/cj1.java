package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cj1 implements AccessibilityManager.AccessibilityStateChangeListener, e93 {
    public final boolean f;
    public final boolean g;
    public final d42 h = b32.w(Boolean.FALSE);
    public final bj1 i;
    public final aj1 j;

    public cj1(boolean z, boolean z2, boolean z3) {
        this.f = z2;
        this.g = z3;
        aj1 aj1Var = null;
        this.i = z ? new bj1() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            aj1Var = new aj1(this);
        }
        this.j = aj1Var;
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && y93.h0(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && y93.h0(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // defpackage.e93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getValue() {
        boolean z;
        if (((Boolean) this.h.getValue()).booleanValue()) {
            z = true;
            bj1 bj1Var = this.i;
            if (bj1Var == null || !((Boolean) bj1Var.f.getValue()).booleanValue()) {
                boolean z2 = this.f;
                aj1 aj1Var = this.j;
                if ((!z2 || aj1Var == null || !((Boolean) aj1Var.a.getValue()).booleanValue()) && (!this.g || aj1Var == null || !((Boolean) aj1Var.b.getValue()).booleanValue())) {
                    z = false;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }
}
