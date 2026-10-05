package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class tr3 extends rr3 {
    private static final int MAX_GAME_PADS = 4;
    public final sr3[] GamePads = new sr3[4];

    public static float s(float f) {
        if (Math.abs(f) < 0.25f) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float GetGamepadAxis(int r2, int r3) {
        /*
            r1 = this;
            if (r2 < 0) goto Lb
            sr3[] r1 = r1.GamePads
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto Lb
        L8:
            r1 = r1[r2]
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L19
            if (r3 < 0) goto L19
            float[] r1 = r1.a
            int r2 = r1.length
            if (r3 < r2) goto L16
            goto L19
        L16:
            r1 = r1[r3]
            return r1
        L19:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr3.GetGamepadAxis(int, int):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int GetGamepadButtons(int r2) {
        /*
            r1 = this;
            if (r2 < 0) goto Lb
            sr3[] r1 = r1.GamePads
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto Lb
        L8:
            r1 = r1[r2]
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 != 0) goto L10
            r1 = 0
            return r1
        L10:
            int r1 = r1.b
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr3.GetGamepadButtons(int):int");
    }

    public final int GetGamepadTrack(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int GetGamepadType(int r2) {
        /*
            r1 = this;
            if (r2 < 0) goto Lb
            sr3[] r1 = r1.GamePads
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto Lb
        L8:
            r1 = r1[r2]
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 != 0) goto L10
            r1 = -1
            return r1
        L10:
            int r1 = r1.c
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr3.GetGamepadType(int):int");
    }

    public final int InitMogaController(int i) {
        return -1;
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity, defpackage.lr0, defpackage.xz, defpackage.wz, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 0;
        while (true) {
            sr3[] sr3VarArr = this.GamePads;
            if (i >= sr3VarArr.length) {
                super.onCreate(bundle);
                return;
            } else {
                sr3VarArr[i] = new sr3();
                i++;
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        sr3 sr3VarT;
        if (motionEvent != null) {
            int source = motionEvent.getSource();
            if (((source & 1025) == 1025 || (source & 16777232) == 16777232) && (sr3VarT = t(motionEvent.getDeviceId())) != null) {
                float[] fArr = sr3VarT.a;
                fArr[0] = s(motionEvent.getAxisValue(0));
                fArr[1] = s(motionEvent.getAxisValue(1));
                fArr[2] = s(motionEvent.getAxisValue(11));
                fArr[3] = s(motionEvent.getAxisValue(14));
                fArr[4] = s(motionEvent.getAxisValue(17));
                fArr[5] = s(motionEvent.getAxisValue(18));
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        u(i, keyEvent, true);
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        u(i, keyEvent, false);
        return super.onKeyUp(i, keyEvent);
    }

    public final sr3 t(int i) {
        for (sr3 sr3Var : this.GamePads) {
            if (sr3Var.d && sr3Var.e == i) {
                return sr3Var;
            }
        }
        for (sr3 sr3Var2 : this.GamePads) {
            if (!sr3Var2.d) {
                sr3Var2.d = true;
                sr3Var2.e = i;
                sr3Var2.c = 5;
                return sr3Var2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(int r4, android.view.KeyEvent r5, boolean r6) {
        /*
            r3 = this;
            if (r5 == 0) goto L74
            int r0 = r5.getSource()
            r1 = r0 & 1025(0x401, float:1.436E-42)
            r2 = 1025(0x401, float:1.436E-42)
            if (r1 == r2) goto L14
            r1 = 16777232(0x1000010, float:2.3509932E-38)
            r0 = r0 & r1
            if (r0 != r1) goto L13
            goto L14
        L13:
            return
        L14:
            r0 = 4
            if (r4 == r0) goto L58
            r1 = 96
            if (r4 == r1) goto L56
            r1 = 97
            if (r4 == r1) goto L54
            r1 = 99
            if (r4 == r1) goto L5a
            r0 = 100
            if (r4 == r0) goto L51
            r0 = 102(0x66, float:1.43E-43)
            if (r4 == r0) goto L4e
            r0 = 103(0x67, float:1.44E-43)
            if (r4 == r0) goto L4b
            r0 = 108(0x6c, float:1.51E-43)
            if (r4 == r0) goto L48
            r0 = 109(0x6d, float:1.53E-43)
            if (r4 == r0) goto L58
            switch(r4) {
                case 19: goto L45;
                case 20: goto L42;
                case 21: goto L3f;
                case 22: goto L3c;
                default: goto L3a;
            }
        L3a:
            r0 = 0
            goto L5a
        L3c:
            r0 = 2048(0x800, float:2.87E-42)
            goto L5a
        L3f:
            r0 = 1024(0x400, float:1.435E-42)
            goto L5a
        L42:
            r0 = 512(0x200, float:7.17E-43)
            goto L5a
        L45:
            r0 = 256(0x100, float:3.59E-43)
            goto L5a
        L48:
            r0 = 16
            goto L5a
        L4b:
            r0 = 128(0x80, float:1.8E-43)
            goto L5a
        L4e:
            r0 = 64
            goto L5a
        L51:
            r0 = 8
            goto L5a
        L54:
            r0 = 2
            goto L5a
        L56:
            r0 = 1
            goto L5a
        L58:
            r0 = 32
        L5a:
            if (r0 != 0) goto L5d
            goto L74
        L5d:
            int r4 = r5.getDeviceId()
            sr3 r3 = r3.t(r4)
            if (r3 != 0) goto L68
            goto L74
        L68:
            int r4 = r3.b
            if (r6 == 0) goto L70
            r4 = r4 | r0
            r3.b = r4
            return
        L70:
            int r5 = ~r0
            r4 = r4 & r5
            r3.b = r4
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr3.u(int, android.view.KeyEvent, boolean):void");
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity
    public final void GamepadReportSurfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // defpackage.qr3
    public final void SetGamepad(String str) {
    }

    public final void SetReportPS3As360(boolean z) {
    }

    public final void TouchpadEvent(int i, int i2, int i3, int i4, int i5, int i6) {
    }
}
